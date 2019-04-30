/*
 * HPP
 * Hosted Payment Page
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.hosted_payment_page.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.hosted_payment_page.model.HPPBackgroundImageV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * HPPOptionsV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:49:10.959Z")
public class HPPOptionsV1 {
  @JsonProperty("background_images")
  private List<HPPBackgroundImageV1> backgroundImages = null;

  @JsonProperty("logo_url")
  private String logoUrl = null;

  @JsonProperty("page_title")
  private String pageTitle = null;

  @JsonProperty("payment_fallback")
  private Boolean paymentFallback = null;

  /**
   * Gets or Sets paymentMethodCategories
   */
  public enum PaymentMethodCategoriesEnum {
    DIRECT_DEBIT("DIRECT_DEBIT"),
    
    DIRECT_BANK_TRANSFER("DIRECT_BANK_TRANSFER"),
    
    PAY_NOW("PAY_NOW"),
    
    PAY_LATER("PAY_LATER"),
    
    PAY_OVER_TIME("PAY_OVER_TIME");

    private String value;

    PaymentMethodCategoriesEnum(String value) {
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
    public static PaymentMethodCategoriesEnum fromValue(String text) {
      for (PaymentMethodCategoriesEnum b : PaymentMethodCategoriesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("payment_method_categories")
  private List<PaymentMethodCategoriesEnum> paymentMethodCategories = null;

  /**
   * Payment Method Category to show on the Payment Page. All available categories will be given to the customer if none is specified using payment_method_category or payment_method_categories. Ignored field for KCO Orders.
   */
  public enum PaymentMethodCategoryEnum {
    DIRECT_DEBIT("DIRECT_DEBIT"),
    
    DIRECT_BANK_TRANSFER("DIRECT_BANK_TRANSFER"),
    
    PAY_NOW("PAY_NOW"),
    
    PAY_LATER("PAY_LATER"),
    
    PAY_OVER_TIME("PAY_OVER_TIME");

    private String value;

    PaymentMethodCategoryEnum(String value) {
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
    public static PaymentMethodCategoryEnum fromValue(String text) {
      for (PaymentMethodCategoryEnum b : PaymentMethodCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("payment_method_category")
  private PaymentMethodCategoryEnum paymentMethodCategory = null;

  /**
   * The type of this purchase
   */
  public enum PurchaseTypeEnum {
    BUY("BUY"),
    
    RENT("RENT"),
    
    BOOK("BOOK"),
    
    SUBSCRIBE("SUBSCRIBE"),
    
    DOWNLOAD("DOWNLOAD"),
    
    ORDER("ORDER"),
    
    CONTINUE("CONTINUE");

    private String value;

    PurchaseTypeEnum(String value) {
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
    public static PurchaseTypeEnum fromValue(String text) {
      for (PurchaseTypeEnum b : PurchaseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("purchase_type")
  private PurchaseTypeEnum purchaseType = null;

  public HPPOptionsV1 backgroundImages(List<HPPBackgroundImageV1> backgroundImages) {
    this.backgroundImages = backgroundImages;
    return this;
  }

  public HPPOptionsV1 addBackgroundImagesItem(HPPBackgroundImageV1 backgroundImagesItem) {
    if (this.backgroundImages == null) {
      this.backgroundImages = new ArrayList<HPPBackgroundImageV1>();
    }
    this.backgroundImages.add(backgroundImagesItem);
    return this;
  }

   /**
   * Array of Images to use for the background. Best matching resolution will be used.
   * @return backgroundImages
  **/
  @ApiModelProperty(value = "Array of Images to use for the background. Best matching resolution will be used.")
  public List<HPPBackgroundImageV1> getBackgroundImages() {
    return backgroundImages;
  }

  public void setBackgroundImages(List<HPPBackgroundImageV1> backgroundImages) {
    this.backgroundImages = backgroundImages;
  }

  public HPPOptionsV1 logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * URL of the logo to be displayed
   * @return logoUrl
  **/
  @ApiModelProperty(example = "https://example.com/logo.jpg", value = "URL of the logo to be displayed")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public HPPOptionsV1 pageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

   /**
   * Title for the Payment Page
   * @return pageTitle
  **/
  @ApiModelProperty(example = "Complete your purchase", value = "Title for the Payment Page")
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }

  public HPPOptionsV1 paymentFallback(Boolean paymentFallback) {
    this.paymentFallback = paymentFallback;
    return this;
  }

   /**
   * Whether or not the Payment Page will show fallback payment methods to the Consumer if the the specified payment methods fail. Ignored field for KCO Orders.
   * @return paymentFallback
  **/
  @ApiModelProperty(example = "true", value = "Whether or not the Payment Page will show fallback payment methods to the Consumer if the the specified payment methods fail. Ignored field for KCO Orders.")
  public Boolean isPaymentFallback() {
    return paymentFallback;
  }

  public void setPaymentFallback(Boolean paymentFallback) {
    this.paymentFallback = paymentFallback;
  }

  public HPPOptionsV1 paymentMethodCategories(List<PaymentMethodCategoriesEnum> paymentMethodCategories) {
    this.paymentMethodCategories = paymentMethodCategories;
    return this;
  }

  public HPPOptionsV1 addPaymentMethodCategoriesItem(PaymentMethodCategoriesEnum paymentMethodCategoriesItem) {
    if (this.paymentMethodCategories == null) {
      this.paymentMethodCategories = new ArrayList<PaymentMethodCategoriesEnum>();
    }
    this.paymentMethodCategories.add(paymentMethodCategoriesItem);
    return this;
  }

   /**
   * Payment Method Categories to show on the Payment Page. All available categories will be given to the customer if none is specified using payment_method_category or payment_method_categories. Ignored field for KCO Orders.
   * @return paymentMethodCategories
  **/
  @ApiModelProperty(example = "\"pay_later\"", value = "Payment Method Categories to show on the Payment Page. All available categories will be given to the customer if none is specified using payment_method_category or payment_method_categories. Ignored field for KCO Orders.")
  public List<PaymentMethodCategoriesEnum> getPaymentMethodCategories() {
    return paymentMethodCategories;
  }

  public void setPaymentMethodCategories(List<PaymentMethodCategoriesEnum> paymentMethodCategories) {
    this.paymentMethodCategories = paymentMethodCategories;
  }

  public HPPOptionsV1 paymentMethodCategory(PaymentMethodCategoryEnum paymentMethodCategory) {
    this.paymentMethodCategory = paymentMethodCategory;
    return this;
  }

   /**
   * Payment Method Category to show on the Payment Page. All available categories will be given to the customer if none is specified using payment_method_category or payment_method_categories. Ignored field for KCO Orders.
   * @return paymentMethodCategory
  **/
  @ApiModelProperty(example = "pay_later", value = "Payment Method Category to show on the Payment Page. All available categories will be given to the customer if none is specified using payment_method_category or payment_method_categories. Ignored field for KCO Orders.")
  public PaymentMethodCategoryEnum getPaymentMethodCategory() {
    return paymentMethodCategory;
  }

  public void setPaymentMethodCategory(PaymentMethodCategoryEnum paymentMethodCategory) {
    this.paymentMethodCategory = paymentMethodCategory;
  }

  public HPPOptionsV1 purchaseType(PurchaseTypeEnum purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

   /**
   * The type of this purchase
   * @return purchaseType
  **/
  @ApiModelProperty(example = "buy", value = "The type of this purchase")
  public PurchaseTypeEnum getPurchaseType() {
    return purchaseType;
  }

  public void setPurchaseType(PurchaseTypeEnum purchaseType) {
    this.purchaseType = purchaseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HPPOptionsV1 optionsV1 = (HPPOptionsV1) o;
    return Objects.equals(this.backgroundImages, optionsV1.backgroundImages) &&
        Objects.equals(this.logoUrl, optionsV1.logoUrl) &&
        Objects.equals(this.pageTitle, optionsV1.pageTitle) &&
        Objects.equals(this.paymentFallback, optionsV1.paymentFallback) &&
        Objects.equals(this.paymentMethodCategories, optionsV1.paymentMethodCategories) &&
        Objects.equals(this.paymentMethodCategory, optionsV1.paymentMethodCategory) &&
        Objects.equals(this.purchaseType, optionsV1.purchaseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImages, logoUrl, pageTitle, paymentFallback, paymentMethodCategories, paymentMethodCategory, purchaseType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HPPOptionsV1 {\n");
    
    sb.append("    backgroundImages: ").append(toIndentedString(backgroundImages)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    paymentFallback: ").append(toIndentedString(paymentFallback)).append("\n");
    sb.append("    paymentMethodCategories: ").append(toIndentedString(paymentMethodCategories)).append("\n");
    sb.append("    paymentMethodCategory: ").append(toIndentedString(paymentMethodCategory)).append("\n");
    sb.append("    purchaseType: ").append(toIndentedString(purchaseType)).append("\n");
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

