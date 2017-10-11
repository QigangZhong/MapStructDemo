package com.qigang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private Long sysno;

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

    private Integer lastupdateusersysno;

    private Date lastupdatetime;

    private Integer auditusersysno;

    private Date audittime;

    private Integer outusersysno;

    private Date outtime;

    private Integer outstockstatus;

    private String remark;

    private Integer shippricedosysno;

    private Integer islocked;

    private Date locktime;

    private Integer soissign;

    private Date sosigntime;

    private Date abandontime;

    private Integer isautocreatedo;

    private Integer isprintsoprice;

    private Integer isautoaudit;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Order(Long sysno, String outorderid, Integer sosource, Integer status, Integer deliverystatus, Integer invoicestatus, Integer paystatus, Date paytime, String buyerid, Date orderdate, Date deliverydate, Integer shiptype, BigDecimal shipprice, Integer paytype, BigDecimal soamt, BigDecimal discountamt, BigDecimal couponamt, BigDecimal pointamt, BigDecimal cashpayamt, String receivename, String receivephone, String receivemobile, String receiveaddress, Integer freightusersysno, Integer lastupdateusersysno, Date lastupdatetime, Integer auditusersysno, Date audittime, Integer outusersysno, Date outtime, Integer outstockstatus, String remark, Integer shippricedosysno, Integer islocked, Date locktime, Integer soissign, Date sosigntime, Date abandontime, Integer isautocreatedo, Integer isprintsoprice, Integer isautoaudit, Date createtime) {
        this.sysno = sysno;
        this.outorderid = outorderid;
        this.sosource = sosource;
        this.status = status;
        this.deliverystatus = deliverystatus;
        this.invoicestatus = invoicestatus;
        this.paystatus = paystatus;
        this.paytime = paytime;
        this.buyerid = buyerid;
        this.orderdate = orderdate;
        this.deliverydate = deliverydate;
        this.shiptype = shiptype;
        this.shipprice = shipprice;
        this.paytype = paytype;
        this.soamt = soamt;
        this.discountamt = discountamt;
        this.couponamt = couponamt;
        this.pointamt = pointamt;
        this.cashpayamt = cashpayamt;
        this.receivename = receivename;
        this.receivephone = receivephone;
        this.receivemobile = receivemobile;
        this.receiveaddress = receiveaddress;
        this.freightusersysno = freightusersysno;
        this.lastupdateusersysno = lastupdateusersysno;
        this.lastupdatetime = lastupdatetime;
        this.auditusersysno = auditusersysno;
        this.audittime = audittime;
        this.outusersysno = outusersysno;
        this.outtime = outtime;
        this.outstockstatus = outstockstatus;
        this.remark = remark;
        this.shippricedosysno = shippricedosysno;
        this.islocked = islocked;
        this.locktime = locktime;
        this.soissign = soissign;
        this.sosigntime = sosigntime;
        this.abandontime = abandontime;
        this.isautocreatedo = isautocreatedo;
        this.isprintsoprice = isprintsoprice;
        this.isautoaudit = isautoaudit;
        this.createtime = createtime;
    }

    public Order() {
        this.status = 0;
        this.deliverystatus = 0;
        this.invoicestatus = 0;
        this.paystatus = 0;
        this.freightusersysno = 0;
        this.lastupdateusersysno = 0;
        this.auditusersysno = 0;
        this.outusersysno = 0;
        this.outstockstatus = 0;
        this.shippricedosysno = 0;
        this.islocked = 0;
        this.soissign = 0;
        this.isautocreatedo = 0;
        this.isprintsoprice = 0;
        this.isautoaudit = 0;
    }

    public Long getSysno() {
        return sysno;
    }

    public void setSysno(Long sysno) {
        this.sysno = sysno;
    }

    public String getOutorderid() {
        return outorderid;
    }

    public void setOutorderid(String outorderid) {
        this.outorderid = outorderid == null ? null : outorderid.trim();
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
        this.buyerid = buyerid == null ? null : buyerid.trim();
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
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getReceivephone() {
        return receivephone;
    }

    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone == null ? null : receivephone.trim();
    }

    public String getReceivemobile() {
        return receivemobile;
    }

    public void setReceivemobile(String receivemobile) {
        this.receivemobile = receivemobile == null ? null : receivemobile.trim();
    }

    public String getReceiveaddress() {
        return receiveaddress;
    }

    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress == null ? null : receiveaddress.trim();
    }

    public Integer getFreightusersysno() {
        return freightusersysno;
    }

    public void setFreightusersysno(Integer freightusersysno) {
        this.freightusersysno = freightusersysno;
    }

    public Integer getLastupdateusersysno() {
        return lastupdateusersysno;
    }

    public void setLastupdateusersysno(Integer lastupdateusersysno) {
        this.lastupdateusersysno = lastupdateusersysno;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getAuditusersysno() {
        return auditusersysno;
    }

    public void setAuditusersysno(Integer auditusersysno) {
        this.auditusersysno = auditusersysno;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Integer getOutusersysno() {
        return outusersysno;
    }

    public void setOutusersysno(Integer outusersysno) {
        this.outusersysno = outusersysno;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Integer getOutstockstatus() {
        return outstockstatus;
    }

    public void setOutstockstatus(Integer outstockstatus) {
        this.outstockstatus = outstockstatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getShippricedosysno() {
        return shippricedosysno;
    }

    public void setShippricedosysno(Integer shippricedosysno) {
        this.shippricedosysno = shippricedosysno;
    }

    public Integer getIslocked() {
        return islocked;
    }

    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    public Date getLocktime() {
        return locktime;
    }

    public void setLocktime(Date locktime) {
        this.locktime = locktime;
    }

    public Integer getSoissign() {
        return soissign;
    }

    public void setSoissign(Integer soissign) {
        this.soissign = soissign;
    }

    public Date getSosigntime() {
        return sosigntime;
    }

    public void setSosigntime(Date sosigntime) {
        this.sosigntime = sosigntime;
    }

    public Date getAbandontime() {
        return abandontime;
    }

    public void setAbandontime(Date abandontime) {
        this.abandontime = abandontime;
    }

    public Integer getIsautocreatedo() {
        return isautocreatedo;
    }

    public void setIsautocreatedo(Integer isautocreatedo) {
        this.isautocreatedo = isautocreatedo;
    }

    public Integer getIsprintsoprice() {
        return isprintsoprice;
    }

    public void setIsprintsoprice(Integer isprintsoprice) {
        this.isprintsoprice = isprintsoprice;
    }

    public Integer getIsautoaudit() {
        return isautoaudit;
    }

    public void setIsautoaudit(Integer isautoaudit) {
        this.isautoaudit = isautoaudit;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}