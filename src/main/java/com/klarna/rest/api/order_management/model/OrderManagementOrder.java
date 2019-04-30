/*
 * Klarna Order Managment API
 * API to handle order lifecycle
 *
 * OpenAPI spec version: 1.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.order_management.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.order_management.model.OrderManagementAddress;
import com.klarna.rest.api.order_management.model.OrderManagementCapture;
import com.klarna.rest.api.order_management.model.OrderManagementCustomer;
import com.klarna.rest.api.order_management.model.OrderManagementInitialPaymentMethodDto;
import com.klarna.rest.api.order_management.model.OrderManagementOrderLine;
import com.klarna.rest.api.order_management.model.OrderManagementRefund;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * OrderManagementOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T10:02:16.667Z")
public class OrderManagementOrder {
  @JsonProperty("order_id")
  private String orderId = null;

  /**
   * The order status.
   */
  public enum StatusEnum {
    AUTHORIZED("AUTHORIZED"),
    
    PART_CAPTURED("PART_CAPTURED"),
    
    CAPTURED("CAPTURED"),
    
    CANCELLED("CANCELLED"),
    
    EXPIRED("EXPIRED"),
    
    CLOSED("CLOSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("fraud_status")
  private String fraudStatus = null;

  @JsonProperty("order_amount")
  private Long orderAmount = null;

  @JsonProperty("original_order_amount")
  private Long originalOrderAmount = null;

  @JsonProperty("captured_amount")
  private Long capturedAmount = null;

  @JsonProperty("refunded_amount")
  private Long refundedAmount = null;

  @JsonProperty("remaining_authorized_amount")
  private Long remainingAuthorizedAmount = null;

  @JsonProperty("purchase_currency")
  private String purchaseCurrency = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("order_lines")
  private List<OrderManagementOrderLine> orderLines = null;

  @JsonProperty("merchant_reference1")
  private String merchantReference1 = null;

  @JsonProperty("merchant_reference2")
  private String merchantReference2 = null;

  @JsonProperty("klarna_reference")
  private String klarnaReference = null;

  @JsonProperty("customer")
  private OrderManagementCustomer customer = null;

  @JsonProperty("billing_address")
  private OrderManagementAddress billingAddress = null;

  @JsonProperty("shipping_address")
  private OrderManagementAddress shippingAddress = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("purchase_country")
  private String purchaseCountry = null;

  @JsonProperty("expires_at")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("captures")
  private List<OrderManagementCapture> captures = null;

  @JsonProperty("refunds")
  private List<OrderManagementRefund> refunds = null;

  @JsonProperty("merchant_data")
  private String merchantData = null;

  @JsonProperty("initial_payment_method")
  private OrderManagementInitialPaymentMethodDto initialPaymentMethod = null;

  public OrderManagementOrder orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The unique order ID. Cannot be longer than 255 characters.
   * @return orderId
  **/
  @ApiModelProperty(example = "f3392f8b-6116-4073-ab96-e330819e2c07", value = "The unique order ID. Cannot be longer than 255 characters.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderManagementOrder status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The order status.
   * @return status
  **/
  @ApiModelProperty(example = "AUTHORIZED", value = "The order status.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OrderManagementOrder fraudStatus(String fraudStatus) {
    this.fraudStatus = fraudStatus;
    return this;
  }

   /**
   * Fraud status for the order. Either ACCEPTED, PENDING or REJECTED.
   * @return fraudStatus
  **/
  @ApiModelProperty(example = "ACCEPTED", value = "Fraud status for the order. Either ACCEPTED, PENDING or REJECTED.")
  public String getFraudStatus() {
    return fraudStatus;
  }

  public void setFraudStatus(String fraudStatus) {
    this.fraudStatus = fraudStatus;
  }

  public OrderManagementOrder orderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * The order amount in minor units. That is the smallest currency unit available such as cent or penny.
   * @return orderAmount
  **/
  @ApiModelProperty(value = "The order amount in minor units. That is the smallest currency unit available such as cent or penny.")
  public Long getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
  }

  public OrderManagementOrder originalOrderAmount(Long originalOrderAmount) {
    this.originalOrderAmount = originalOrderAmount;
    return this;
  }

   /**
   * The original order amount. In minor units.
   * @return originalOrderAmount
  **/
  @ApiModelProperty(value = "The original order amount. In minor units.")
  public Long getOriginalOrderAmount() {
    return originalOrderAmount;
  }

  public void setOriginalOrderAmount(Long originalOrderAmount) {
    this.originalOrderAmount = originalOrderAmount;
  }

  public OrderManagementOrder capturedAmount(Long capturedAmount) {
    this.capturedAmount = capturedAmount;
    return this;
  }

   /**
   * The total amount of all captures. In minor units.
   * @return capturedAmount
  **/
  @ApiModelProperty(example = "0", value = "The total amount of all captures. In minor units.")
  public Long getCapturedAmount() {
    return capturedAmount;
  }

  public void setCapturedAmount(Long capturedAmount) {
    this.capturedAmount = capturedAmount;
  }

  public OrderManagementOrder refundedAmount(Long refundedAmount) {
    this.refundedAmount = refundedAmount;
    return this;
  }

   /**
   * The total amount of refunded for this order. In minor units.
   * @return refundedAmount
  **/
  @ApiModelProperty(example = "0", value = "The total amount of refunded for this order. In minor units.")
  public Long getRefundedAmount() {
    return refundedAmount;
  }

  public void setRefundedAmount(Long refundedAmount) {
    this.refundedAmount = refundedAmount;
  }

  public OrderManagementOrder remainingAuthorizedAmount(Long remainingAuthorizedAmount) {
    this.remainingAuthorizedAmount = remainingAuthorizedAmount;
    return this;
  }

   /**
   * The remaining authorized amount for this order. To increase the &#x60;remaining_authorized_amount&#x60; the &#x60;order_amount&#x60; needs to be increased.
   * @return remainingAuthorizedAmount
  **/
  @ApiModelProperty(example = "0", value = "The remaining authorized amount for this order. To increase the `remaining_authorized_amount` the `order_amount` needs to be increased.")
  public Long getRemainingAuthorizedAmount() {
    return remainingAuthorizedAmount;
  }

  public void setRemainingAuthorizedAmount(Long remainingAuthorizedAmount) {
    this.remainingAuthorizedAmount = remainingAuthorizedAmount;
  }

  public OrderManagementOrder purchaseCurrency(String purchaseCurrency) {
    this.purchaseCurrency = purchaseCurrency;
    return this;
  }

   /**
   * The currency for this order. Specified in ISO 4217 format.
   * @return purchaseCurrency
  **/
  @ApiModelProperty(example = "usd", value = "The currency for this order. Specified in ISO 4217 format.")
  public String getPurchaseCurrency() {
    return purchaseCurrency;
  }

  public void setPurchaseCurrency(String purchaseCurrency) {
    this.purchaseCurrency = purchaseCurrency;
  }

  public OrderManagementOrder locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The customers locale. Specified according to RFC 1766.
   * @return locale
  **/
  @ApiModelProperty(example = "en-us", value = "The customers locale. Specified according to RFC 1766.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public OrderManagementOrder orderLines(List<OrderManagementOrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public OrderManagementOrder addOrderLinesItem(OrderManagementOrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<OrderManagementOrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * An array of order_line objects. Each line represents one item in the cart.
   * @return orderLines
  **/
  @ApiModelProperty(value = "An array of order_line objects. Each line represents one item in the cart.")
  public List<OrderManagementOrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderManagementOrderLine> orderLines) {
    this.orderLines = orderLines;
  }

  public OrderManagementOrder merchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
    return this;
  }

   /**
   * The order number that the merchant should assign to the order. This is how a customer would reference the purchase they made. If supplied, it is labeled as the Order Number within post purchase communications as well as the Klarna App.
   * @return merchantReference1
  **/
  @ApiModelProperty(example = "10001", value = "The order number that the merchant should assign to the order. This is how a customer would reference the purchase they made. If supplied, it is labeled as the Order Number within post purchase communications as well as the Klarna App.")
  public String getMerchantReference1() {
    return merchantReference1;
  }

  public void setMerchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
  }

  public OrderManagementOrder merchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
    return this;
  }

   /**
   * Can be used to store your internal reference to the order. This is generally an internal reference number that merchants use as alternate identifier that matches their internal ERP or Order Management system.
   * @return merchantReference2
  **/
  @ApiModelProperty(example = "501", value = "Can be used to store your internal reference to the order. This is generally an internal reference number that merchants use as alternate identifier that matches their internal ERP or Order Management system.")
  public String getMerchantReference2() {
    return merchantReference2;
  }

  public void setMerchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
  }

  public OrderManagementOrder klarnaReference(String klarnaReference) {
    this.klarnaReference = klarnaReference;
    return this;
  }

   /**
   * A Klarna generated reference that is shorter than the Klarna Order Id and is used as a customer friendly reference. It is most often used as a reference when Klarna is communicating with the customer with regard to payment statuses.
   * @return klarnaReference
  **/
  @ApiModelProperty(example = "K4MADNY", value = "A Klarna generated reference that is shorter than the Klarna Order Id and is used as a customer friendly reference. It is most often used as a reference when Klarna is communicating with the customer with regard to payment statuses.")
  public String getKlarnaReference() {
    return klarnaReference;
  }

  public void setKlarnaReference(String klarnaReference) {
    this.klarnaReference = klarnaReference;
  }

  public OrderManagementOrder customer(OrderManagementCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Information about the customer placing the order.
   * @return customer
  **/
  @ApiModelProperty(value = "Information about the customer placing the order.")
  public OrderManagementCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(OrderManagementCustomer customer) {
    this.customer = customer;
  }

  public OrderManagementOrder billingAddress(OrderManagementAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Customer billing address.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "Customer billing address.")
  public OrderManagementAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(OrderManagementAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public OrderManagementOrder shippingAddress(OrderManagementAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Customer shipping address.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "Customer shipping address.")
  public OrderManagementAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(OrderManagementAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public OrderManagementOrder createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time for the purchase. Formatted according to ISO 8601.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2015-11-29T10:25:40.000Z", value = "The time for the purchase. Formatted according to ISO 8601.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OrderManagementOrder purchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
    return this;
  }

   /**
   * The purchase country. Formatted according to ISO 3166-1 alpha-2.
   * @return purchaseCountry
  **/
  @ApiModelProperty(example = "us", value = "The purchase country. Formatted according to ISO 3166-1 alpha-2.")
  public String getPurchaseCountry() {
    return purchaseCountry;
  }

  public void setPurchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
  }

  public OrderManagementOrder expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Order expiration time. The order can only be captured until this time. Formatted according to ISO 8601.
   * @return expiresAt
  **/
  @ApiModelProperty(example = "2015-12-04T10:26:06.000Z", value = "Order expiration time. The order can only be captured until this time. Formatted according to ISO 8601.")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public OrderManagementOrder captures(List<OrderManagementCapture> captures) {
    this.captures = captures;
    return this;
  }

  public OrderManagementOrder addCapturesItem(OrderManagementCapture capturesItem) {
    if (this.captures == null) {
      this.captures = new ArrayList<OrderManagementCapture>();
    }
    this.captures.add(capturesItem);
    return this;
  }

   /**
   * List of captures for this order.
   * @return captures
  **/
  @ApiModelProperty(value = "List of captures for this order.")
  public List<OrderManagementCapture> getCaptures() {
    return captures;
  }

  public void setCaptures(List<OrderManagementCapture> captures) {
    this.captures = captures;
  }

  public OrderManagementOrder refunds(List<OrderManagementRefund> refunds) {
    this.refunds = refunds;
    return this;
  }

  public OrderManagementOrder addRefundsItem(OrderManagementRefund refundsItem) {
    if (this.refunds == null) {
      this.refunds = new ArrayList<OrderManagementRefund>();
    }
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * List of refunds for this order.
   * @return refunds
  **/
  @ApiModelProperty(value = "List of refunds for this order.")
  public List<OrderManagementRefund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<OrderManagementRefund> refunds) {
    this.refunds = refunds;
  }

  public OrderManagementOrder merchantData(String merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Text field for storing data about the order. Set at order creation.
   * @return merchantData
  **/
  @ApiModelProperty(example = "Order metadata", value = "Text field for storing data about the order. Set at order creation.")
  public String getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }

  public OrderManagementOrder initialPaymentMethod(OrderManagementInitialPaymentMethodDto initialPaymentMethod) {
    this.initialPaymentMethod = initialPaymentMethod;
    return this;
  }

   /**
   * Initial payment method for this order
   * @return initialPaymentMethod
  **/
  @ApiModelProperty(value = "Initial payment method for this order")
  public OrderManagementInitialPaymentMethodDto getInitialPaymentMethod() {
    return initialPaymentMethod;
  }

  public void setInitialPaymentMethod(OrderManagementInitialPaymentMethodDto initialPaymentMethod) {
    this.initialPaymentMethod = initialPaymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderManagementOrder order = (OrderManagementOrder) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.fraudStatus, order.fraudStatus) &&
        Objects.equals(this.orderAmount, order.orderAmount) &&
        Objects.equals(this.originalOrderAmount, order.originalOrderAmount) &&
        Objects.equals(this.capturedAmount, order.capturedAmount) &&
        Objects.equals(this.refundedAmount, order.refundedAmount) &&
        Objects.equals(this.remainingAuthorizedAmount, order.remainingAuthorizedAmount) &&
        Objects.equals(this.purchaseCurrency, order.purchaseCurrency) &&
        Objects.equals(this.locale, order.locale) &&
        Objects.equals(this.orderLines, order.orderLines) &&
        Objects.equals(this.merchantReference1, order.merchantReference1) &&
        Objects.equals(this.merchantReference2, order.merchantReference2) &&
        Objects.equals(this.klarnaReference, order.klarnaReference) &&
        Objects.equals(this.customer, order.customer) &&
        Objects.equals(this.billingAddress, order.billingAddress) &&
        Objects.equals(this.shippingAddress, order.shippingAddress) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        Objects.equals(this.purchaseCountry, order.purchaseCountry) &&
        Objects.equals(this.expiresAt, order.expiresAt) &&
        Objects.equals(this.captures, order.captures) &&
        Objects.equals(this.refunds, order.refunds) &&
        Objects.equals(this.merchantData, order.merchantData) &&
        Objects.equals(this.initialPaymentMethod, order.initialPaymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, status, fraudStatus, orderAmount, originalOrderAmount, capturedAmount, refundedAmount, remainingAuthorizedAmount, purchaseCurrency, locale, orderLines, merchantReference1, merchantReference2, klarnaReference, customer, billingAddress, shippingAddress, createdAt, purchaseCountry, expiresAt, captures, refunds, merchantData, initialPaymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fraudStatus: ").append(toIndentedString(fraudStatus)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    originalOrderAmount: ").append(toIndentedString(originalOrderAmount)).append("\n");
    sb.append("    capturedAmount: ").append(toIndentedString(capturedAmount)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    remainingAuthorizedAmount: ").append(toIndentedString(remainingAuthorizedAmount)).append("\n");
    sb.append("    purchaseCurrency: ").append(toIndentedString(purchaseCurrency)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    merchantReference1: ").append(toIndentedString(merchantReference1)).append("\n");
    sb.append("    merchantReference2: ").append(toIndentedString(merchantReference2)).append("\n");
    sb.append("    klarnaReference: ").append(toIndentedString(klarnaReference)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    purchaseCountry: ").append(toIndentedString(purchaseCountry)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    captures: ").append(toIndentedString(captures)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    initialPaymentMethod: ").append(toIndentedString(initialPaymentMethod)).append("\n");
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

