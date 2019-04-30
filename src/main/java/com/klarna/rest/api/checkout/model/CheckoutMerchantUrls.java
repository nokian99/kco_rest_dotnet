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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutMerchantUrls
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:22:48.232Z")
public class CheckoutMerchantUrls {
  @JsonProperty("terms")
  private String terms = null;

  @JsonProperty("cancellation_terms")
  private String cancellationTerms = null;

  @JsonProperty("checkout")
  private String checkout = null;

  @JsonProperty("confirmation")
  private String confirmation = null;

  @JsonProperty("push")
  private String push = null;

  @JsonProperty("validation")
  private String validation = null;

  @JsonProperty("shipping_option_update")
  private String shippingOptionUpdate = null;

  @JsonProperty("address_update")
  private String addressUpdate = null;

  @JsonProperty("notification")
  private String notification = null;

  @JsonProperty("country_change")
  private String countryChange = null;

  public CheckoutMerchantUrls terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * URL of merchant terms and conditions. Should be different than checkout, confirmation and push URLs.(max 2000 characters)
   * @return terms
  **/
  @ApiModelProperty(example = "https://www.estore.com/terms.html", required = true, value = "URL of merchant terms and conditions. Should be different than checkout, confirmation and push URLs.(max 2000 characters)")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public CheckoutMerchantUrls cancellationTerms(String cancellationTerms) {
    this.cancellationTerms = cancellationTerms;
    return this;
  }

   /**
   * URL of merchant cancellation terms.(max 2000 characters)
   * @return cancellationTerms
  **/
  @ApiModelProperty(example = "https://www.estore.com/terms/cancellation.html", value = "URL of merchant cancellation terms.(max 2000 characters)")
  public String getCancellationTerms() {
    return cancellationTerms;
  }

  public void setCancellationTerms(String cancellationTerms) {
    this.cancellationTerms = cancellationTerms;
  }

  public CheckoutMerchantUrls checkout(String checkout) {
    this.checkout = checkout;
    return this;
  }

   /**
   * URL of merchant checkout page. Should be different than terms, confirmation and push URLs. (max 2000 characters)
   * @return checkout
  **/
  @ApiModelProperty(example = "https://www.estore.com/checkout.html", required = true, value = "URL of merchant checkout page. Should be different than terms, confirmation and push URLs. (max 2000 characters)")
  public String getCheckout() {
    return checkout;
  }

  public void setCheckout(String checkout) {
    this.checkout = checkout;
  }

  public CheckoutMerchantUrls confirmation(String confirmation) {
    this.confirmation = confirmation;
    return this;
  }

   /**
   * URL of merchant confirmation page. Should be different than checkout and confirmation URLs. (max 2000 characters)
   * @return confirmation
  **/
  @ApiModelProperty(example = "https://www.estore.com/confirmation.html", required = true, value = "URL of merchant confirmation page. Should be different than checkout and confirmation URLs. (max 2000 characters)")
  public String getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }

  public CheckoutMerchantUrls push(String push) {
    this.push = push;
    return this;
  }

   /**
   * URL that will be requested when an order is completed. Should be different than checkout and confirmation URLs. (max 2000 characters)
   * @return push
  **/
  @ApiModelProperty(example = "https://www.estore.com/api/push", required = true, value = "URL that will be requested when an order is completed. Should be different than checkout and confirmation URLs. (max 2000 characters)")
  public String getPush() {
    return push;
  }

  public void setPush(String push) {
    this.push = push;
  }

  public CheckoutMerchantUrls validation(String validation) {
    this.validation = validation;
    return this;
  }

   /**
   * URL that will be requested for final merchant validation. (must be https, max 2000 characters)
   * @return validation
  **/
  @ApiModelProperty(example = "https://www.estore.com/api/validation", value = "URL that will be requested for final merchant validation. (must be https, max 2000 characters)")
  public String getValidation() {
    return validation;
  }

  public void setValidation(String validation) {
    this.validation = validation;
  }

  public CheckoutMerchantUrls shippingOptionUpdate(String shippingOptionUpdate) {
    this.shippingOptionUpdate = shippingOptionUpdate;
    return this;
  }

   /**
   * URL for shipping option update. (must be https, max 2000 characters)
   * @return shippingOptionUpdate
  **/
  @ApiModelProperty(example = "https://www.estore.com/api/shipment", value = "URL for shipping option update. (must be https, max 2000 characters)")
  public String getShippingOptionUpdate() {
    return shippingOptionUpdate;
  }

  public void setShippingOptionUpdate(String shippingOptionUpdate) {
    this.shippingOptionUpdate = shippingOptionUpdate;
  }

  public CheckoutMerchantUrls addressUpdate(String addressUpdate) {
    this.addressUpdate = addressUpdate;
    return this;
  }

   /**
   * URL for shipping, tax and purchase currency updates. Will be called on address changes. (must be https, max 2000 characters)
   * @return addressUpdate
  **/
  @ApiModelProperty(example = "https://www.estore.com/api/address", value = "URL for shipping, tax and purchase currency updates. Will be called on address changes. (must be https, max 2000 characters)")
  public String getAddressUpdate() {
    return addressUpdate;
  }

  public void setAddressUpdate(String addressUpdate) {
    this.addressUpdate = addressUpdate;
  }

  public CheckoutMerchantUrls notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * URL for notifications on pending orders. (max 2000 characters)
   * @return notification
  **/
  @ApiModelProperty(example = "https://www.estore.com/api/pending", value = "URL for notifications on pending orders. (max 2000 characters)")
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public CheckoutMerchantUrls countryChange(String countryChange) {
    this.countryChange = countryChange;
    return this;
  }

   /**
   * URL for shipping, tax and purchase currency updates. Will be called on purchase country changes. (must be https, max 2000 characters)
   * @return countryChange
  **/
  @ApiModelProperty(example = "https://www.estore.com/api/country", value = "URL for shipping, tax and purchase currency updates. Will be called on purchase country changes. (must be https, max 2000 characters)")
  public String getCountryChange() {
    return countryChange;
  }

  public void setCountryChange(String countryChange) {
    this.countryChange = countryChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutMerchantUrls merchantUrls = (CheckoutMerchantUrls) o;
    return Objects.equals(this.terms, merchantUrls.terms) &&
        Objects.equals(this.cancellationTerms, merchantUrls.cancellationTerms) &&
        Objects.equals(this.checkout, merchantUrls.checkout) &&
        Objects.equals(this.confirmation, merchantUrls.confirmation) &&
        Objects.equals(this.push, merchantUrls.push) &&
        Objects.equals(this.validation, merchantUrls.validation) &&
        Objects.equals(this.shippingOptionUpdate, merchantUrls.shippingOptionUpdate) &&
        Objects.equals(this.addressUpdate, merchantUrls.addressUpdate) &&
        Objects.equals(this.notification, merchantUrls.notification) &&
        Objects.equals(this.countryChange, merchantUrls.countryChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, cancellationTerms, checkout, confirmation, push, validation, shippingOptionUpdate, addressUpdate, notification, countryChange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutMerchantUrls {\n");
    
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    cancellationTerms: ").append(toIndentedString(cancellationTerms)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    shippingOptionUpdate: ").append(toIndentedString(shippingOptionUpdate)).append("\n");
    sb.append("    addressUpdate: ").append(toIndentedString(addressUpdate)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    countryChange: ").append(toIndentedString(countryChange)).append("\n");
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

