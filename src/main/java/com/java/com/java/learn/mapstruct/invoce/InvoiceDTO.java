package com.java.com.java.learn.mapstruct.invoce;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-11-14 11:18 AM
 */
public class InvoiceDTO implements Serializable {

  /**
   * 开票记录id
   */
  private String invoiceId;

  /**
   * 发票代码
   */
  private String invoiceCode;

  /**
   * 发票号码
   */
  private String invoiceNo;

  /**
   * 销售方id(店铺id)
   */
  private Long kdtId;

  /**
   * 商家发票资产id
   */
  private String invoiceAssetId;

  /**
   * 开票状态描述
   *
   */
  private Integer status;

  /**
   * 是否补开发票，true是，false否
   */
  private Boolean isAllowInvoice;

  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public String getInvoiceCode() {
    return invoiceCode;
  }

  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }

  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public Long getKdtId() {
    return kdtId;
  }

  public void setKdtId(Long kdtId) {
    this.kdtId = kdtId;
  }

  public String getInvoiceAssetId() {
    return invoiceAssetId;
  }

  public void setInvoiceAssetId(String invoiceAssetId) {
    this.invoiceAssetId = invoiceAssetId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Boolean getAllowInvoice() {
    return isAllowInvoice;
  }

  public void setAllowInvoice(Boolean allowInvoice) {
    isAllowInvoice = allowInvoice;
  }
}
