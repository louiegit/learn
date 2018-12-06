package com.java.com.java.learn.mapstruct.invoce;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-11-14 11:19 AM
 */
public class Invoce {

  private static final long serialVersionUID = -7286188188507748493L;
  private String invoiceId;
  private String invoiceCode;
  private String invoiceNo;
  private Long kdtId;
  private String invoiceAssetId;
  private Boolean redInvoice;
  private Integer invoiceType;
  private String blueInvoiceId;
  private Boolean auto;
  private Integer status;
  private boolean invalid;
  private String bizNo;
  private Date createTime;
  private Date updateTime;
  private String invoiceDetailType;
  private Date invoiceSuccessDate;
  private String invoiceFileStream;
  private Date expiresDate;
  private String errorMsg;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

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

  public Boolean getRedInvoice() {
    return redInvoice;
  }

  public void setRedInvoice(Boolean redInvoice) {
    this.redInvoice = redInvoice;
  }

  public Integer getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
  }

  public String getBlueInvoiceId() {
    return blueInvoiceId;
  }

  public void setBlueInvoiceId(String blueInvoiceId) {
    this.blueInvoiceId = blueInvoiceId;
  }

  public Boolean getAuto() {
    return auto;
  }

  public void setAuto(Boolean auto) {
    this.auto = auto;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public boolean isInvalid() {
    return invalid;
  }

  public void setInvalid(boolean invalid) {
    this.invalid = invalid;
  }

  public String getBizNo() {
    return bizNo;
  }

  public void setBizNo(String bizNo) {
    this.bizNo = bizNo;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public String getInvoiceDetailType() {
    return invoiceDetailType;
  }

  public void setInvoiceDetailType(String invoiceDetailType) {
    this.invoiceDetailType = invoiceDetailType;
  }

  public Date getInvoiceSuccessDate() {
    return invoiceSuccessDate;
  }

  public void setInvoiceSuccessDate(Date invoiceSuccessDate) {
    this.invoiceSuccessDate = invoiceSuccessDate;
  }

  public String getInvoiceFileStream() {
    return invoiceFileStream;
  }

  public void setInvoiceFileStream(String invoiceFileStream) {
    this.invoiceFileStream = invoiceFileStream;
  }

  public Date getExpiresDate() {
    return expiresDate;
  }

  public void setExpiresDate(Date expiresDate) {
    this.expiresDate = expiresDate;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }
}
