package com.qigang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderDto implements Serializable{
    private String outorderid;

    private Integer sosource;

    private Integer status;

    private Integer deliverystatus;

    private Integer invoicestatus;

    private Integer paystatus;

    private Date paytime;

    private String buyerid;

    private Date orderdate;

    private Date deliverydate;

    private Integer shiptype;

    private BigDecimal shipprice;

    private Integer paytype;

    private BigDecimal soamt;

    private BigDecimal discountamt;

    private BigDecimal couponamt;

    private BigDecimal pointamt;

    private BigDecimal cashpayamt;

    private String receivename;

    private String receivephone;

    private String receivemobile;

    private String receiveaddress;

    private Integer freightusersysno;

    public String getOutorderid() {
        return outorderid;
    }

    public void setOutorderid(String outorderid) {
        this.outorderid = outorderid;
    }

    public Integer getSosource() {
        return sosource;
    }

    public void setSosource(Integer sosource) {
        this.sosource = sosource;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeliverystatus() {
        return deliverystatus;
    }

    public void setDeliverystatus(Integer deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public Integer getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(Integer invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Integer getShiptype() {
        return shiptype;
    }

    public void setShiptype(Integer shiptype) {
        this.shiptype = shiptype;
    }

    public BigDecimal getShipprice() {
        return shipprice;
    }

    public void setShipprice(BigDecimal shipprice) {
        this.shipprice = shipprice;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getSoamt() {
        return soamt;
    }

    public void setSoamt(BigDecimal soamt) {
        this.soamt = soamt;
    }

    public BigDecimal getDiscountamt() {
        return discountamt;
    }

    public void setDiscountamt(BigDecimal discountamt) {
        this.discountamt = discountamt;
    }

    public BigDecimal getCouponamt() {
        return couponamt;
    }

    public void setCouponamt(BigDecimal couponamt) {
        this.couponamt = couponamt;
    }

    public BigDecimal getPointamt() {
        return pointamt;
    }

    public void setPointamt(BigDecimal pointamt) {
        this.pointamt = pointamt;
    }

    public BigDecimal getCashpayamt() {
        return cashpayamt;
    }

    public void setCashpayamt(BigDecimal cashpayamt) {
        this.cashpayamt = cashpayamt;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename;
    }

    public String getReceivephone() {
        return receivephone;
    }

    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone;
    }

    public String getReceivemobile() {
        return receivemobile;
    }

    public void setReceivemobile(String receivemobile) {
        this.receivemobile = receivemobile;
    }

    public String getReceiveaddress() {
        return receiveaddress;
    }

    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress;
    }

    public Integer getFreightusersysno() {
        return freightusersysno;
    }

    public void setFreightusersysno(Integer freightusersysno) {
        this.freightusersysno = freightusersysno;
    }

}
