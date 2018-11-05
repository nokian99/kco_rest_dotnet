/*
 * Copyright 2018 Klarna AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klarna.rest.model;

import com.klarna.rest.api.DefaultMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.Status.Family;

import java.io.IOException;

import java.util.*;

import static javax.ws.rs.core.Response.Status.Family.SUCCESSFUL;

/**
 * General HTTP response instance.
 */
public class ApiResponse {
    /**
     * HTTP response Status code
     */
    private int status;

    /**
     * HTTP Response headers
     */
    private Map<String, List<String>> headers;

    /**
     * HTTP body binary payout
     */
    private byte[] body = null;

    /**
     * Sets HTTP Status code.
     *
     * @param status HTTP status
     * @return self
     */
    public ApiResponse setStatus(int status) {
        this.status = status;
        return this;
    }

    /**
     * Gets HTTP Status code.
     *
     * @return Status code
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Sets binary body payout.
     *
     * @param body Payout
     * @return self
     */
    public ApiResponse setBody(byte[] body) {
        this.body = body;
        return this;
    }

    /**
     * Gets binary body payout.
     *
     * @return Payout
     */
    public byte[] getBody() {
        return this.body;
    }

    /**
     * Sets HTTP headers map
     *
     * @param headers Headers
     * @return self
     */
    public ApiResponse setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Sets single HTTP header value.
     *
     * @param name Header name
     * @param values Header values
     * @return self
     */
    public ApiResponse setHeader(String name, List<String> values) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(name, values);
        return this;
    }

    /**
     * Gets HTTP Headers map
     *
     * @return Headers
     */
    public Map getHeaders() {
        return this.headers;
    }

    /**
     * Gets single header value
     *
     * @param name Header name
     * @return Header values
     */
    public List<String> getHeader(String name) {
        if (this.headers == null) {
            return null;
        }
        return this.headers.get(name);
    }

    /**
     * Checks if current ApiResponse is successful (response code &gt;=200 and &lt;300)
     *
     * @return true if successful
     */
    public Boolean isSuccessful() {
        Status status = Status.fromStatusCode(this.getStatus());
        return (status != null && status.getFamily().equals(SUCCESSFUL));
    }

    /**
     * Sets status code expectation.
     *
     * @param expected Expected HTTP status code.
     * @return self
     * @throws ProtocolException if status code does not match the expectation
     */
    public ApiResponse expectStatusCode(final Status expected) throws ProtocolException {
        if (expected.getStatusCode() == this.getStatus()) {
            return this;
        }

        throw ProtocolException.unexpectedStatus(this.getStatus());
    }

    /**
     * Sets status code expectation.
     *
     * @param expected Expected HTTP status codes.
     * @return self
     * @throws ProtocolException if status code does not match the expectations
     */
    public ApiResponse expectStatusCode(final Status... expected) throws ProtocolException {
        List<Status> statuses = Arrays.asList(expected);
        Status status = Status.fromStatusCode(this.getStatus());

        if (statuses.contains(status)) {
            return this;
        }

        throw ProtocolException.unexpectedStatus(
                this.getStatus());
    }

    /**
     * Sets content-type expectation.
     *
     * @param value expected Content Type
     * @return self
     * @throws ContentTypeException if content type does not match the expectation
     */
    public ApiResponse expectContentType(final String value) throws ContentTypeException {
        List<String> contentType = this.getHeader("Content-Type");
        if (contentType != null) {
            if (contentType.contains(value)) {
                return this;
            }

            for (String type : contentType) {
                if (type.startsWith(value)) {
                    return this;
                }
            }

            throw ContentTypeException.unexpectedType(contentType.toString());
        }

        throw ContentTypeException.unexpectedType("Content-Type header is missing");
    }

    /**
     * Checks if response is successful or fetches the ErrorMessage otherwise.
     *
     * @return self
     * @throws ApiException if response is not successful and payout contains ErrorMessage
     * @see ErrorMessage
     */
    public ApiResponse expectSuccessful() throws ApiException {
        Family family = Status.fromStatusCode(this.getStatus()).getFamily();

        if (family.equals(SUCCESSFUL)) {
            return this;
        }

        ErrorMessage message = new ErrorMessage();
        ObjectMapper objectMapper = new DefaultMapper();
        try {
            byte[] body = this.getBody();
            if (body != null) {
                message = objectMapper.readValue(this.getBody(), ErrorMessage.class);
            }
            throw new ApiException(this.getStatus(), message);

        } catch (IOException e) {
            throw new ApiException(this.getStatus(), new String(this.getBody()));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiResponse {\n");

        sb.append("     status: ").append(this.getStatus()).append("\n");
        sb.append("    headers: ").append(this.getHeaders()).append("\n");
        if (this.getBody() == null) {
            sb.append("       body: ").append("null").append("\n");
        } else {
            sb.append("       body: ").append(new String(this.getBody())).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
