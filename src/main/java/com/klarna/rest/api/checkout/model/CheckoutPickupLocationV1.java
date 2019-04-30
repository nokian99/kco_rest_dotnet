/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.checkout.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.checkout.model.CheckoutAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutPickupLocationV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:22:48.232Z")
public class CheckoutPickupLocationV1 {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private CheckoutAddress address = null;

  public CheckoutPickupLocationV1 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutPickupLocationV1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the location
   * @return name
  **/
  @ApiModelProperty(value = "Name of the location")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckoutPickupLocationV1 address(CheckoutAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Location adress
   * @return address
  **/
  @ApiModelProperty(value = "Location adress")
  public CheckoutAddress getAddress() {
    return address;
  }

  public void setAddress(CheckoutAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutPickupLocationV1 pickupLocationV1 = (CheckoutPickupLocationV1) o;
    return Objects.equals(this.id, pickupLocationV1.id) &&
        Objects.equals(this.name, pickupLocationV1.name) &&
        Objects.equals(this.address, pickupLocationV1.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutPickupLocationV1 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

