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
import com.klarna.rest.api.checkout.model.CheckoutPickupLocationV1;
import com.klarna.rest.api.checkout.model.CheckoutProductV1;
import com.klarna.rest.api.checkout.model.CheckoutTimeslotV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutDeliveryDetailsV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:22:48.232Z")
public class CheckoutDeliveryDetailsV1 {
  @JsonProperty("carrier")
  private String carrier = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("product")
  private CheckoutProductV1 product = null;

  @JsonProperty("pickup_location")
  private CheckoutPickupLocationV1 pickupLocation = null;

  @JsonProperty("timeslot")
  private CheckoutTimeslotV1 timeslot = null;

  public CheckoutDeliveryDetailsV1 carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Carrier product name
   * @return carrier
  **/
  @ApiModelProperty(value = "Carrier product name")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public CheckoutDeliveryDetailsV1 propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Type of shipping class
   * @return propertyClass
  **/
  @ApiModelProperty(value = "Type of shipping class")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public CheckoutDeliveryDetailsV1 product(CheckoutProductV1 product) {
    this.product = product;
    return this;
  }

   /**
   * Upstream carrier product
   * @return product
  **/
  @ApiModelProperty(value = "Upstream carrier product")
  public CheckoutProductV1 getProduct() {
    return product;
  }

  public void setProduct(CheckoutProductV1 product) {
    this.product = product;
  }

  public CheckoutDeliveryDetailsV1 pickupLocation(CheckoutPickupLocationV1 pickupLocation) {
    this.pickupLocation = pickupLocation;
    return this;
  }

   /**
   * The selected location for this shipping option
   * @return pickupLocation
  **/
  @ApiModelProperty(value = "The selected location for this shipping option")
  public CheckoutPickupLocationV1 getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(CheckoutPickupLocationV1 pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public CheckoutDeliveryDetailsV1 timeslot(CheckoutTimeslotV1 timeslot) {
    this.timeslot = timeslot;
    return this;
  }

   /**
   * The selected timeslot for this shipping option
   * @return timeslot
  **/
  @ApiModelProperty(value = "The selected timeslot for this shipping option")
  public CheckoutTimeslotV1 getTimeslot() {
    return timeslot;
  }

  public void setTimeslot(CheckoutTimeslotV1 timeslot) {
    this.timeslot = timeslot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutDeliveryDetailsV1 deliveryDetailsV1 = (CheckoutDeliveryDetailsV1) o;
    return Objects.equals(this.carrier, deliveryDetailsV1.carrier) &&
        Objects.equals(this.propertyClass, deliveryDetailsV1.propertyClass) &&
        Objects.equals(this.product, deliveryDetailsV1.product) &&
        Objects.equals(this.pickupLocation, deliveryDetailsV1.pickupLocation) &&
        Objects.equals(this.timeslot, deliveryDetailsV1.timeslot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, propertyClass, product, pickupLocation, timeslot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutDeliveryDetailsV1 {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    pickupLocation: ").append(toIndentedString(pickupLocation)).append("\n");
    sb.append("    timeslot: ").append(toIndentedString(timeslot)).append("\n");
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

