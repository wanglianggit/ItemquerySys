package com.ys.entity;

public class AckBlotter {
    private String fId;

    private String proCode;

    private int ackAmt;

    private String orderDate;

    private String investor;

    private String fundAccount;

    private String ackDate;

    private String seatno;

    private String advInvestor;

    private String advFundAccount;

    public String getFundAccount() {
        return fundAccount;
    }

    public void setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount;
    }

    public String getAdvFundAccount() {
        return advFundAccount;
    }

    public void setAdvFundAccount(String advFundAccount) {
        this.advFundAccount = advFundAccount;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public int getAckAmt() {
        return ackAmt;
    }

    public void setAckAmt(int ackAmt) {
        this.ackAmt = ackAmt;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    public String getAckDate() {
        return ackDate;
    }

    public void setAckDate(String ackDate) {
        this.ackDate = ackDate;
    }

    public String getSeatno() {
        return seatno;
    }

    public void setSeatno(String seatno) {
        this.seatno = seatno;
    }

    public String getAdvInvestor() {
        return advInvestor;
    }

    public void setAdvInvestor(String advInvestor) {
        this.advInvestor = advInvestor;
    }

    @Override
    public String toString() {
        return "AckBlotter{" +
                "fId='" + fId + '\'' +
                ", proCode='" + proCode + '\'' +
                ", ackAmt=" + ackAmt +
                ", orderDate='" + orderDate + '\'' +
                ", investor='" + investor + '\'' +
                ", fundAccount='" + fundAccount + '\'' +
                ", ackDate='" + ackDate + '\'' +
                ", seatno='" + seatno + '\'' +
                ", advInvestor='" + advInvestor + '\'' +
                ", advFundAccount='" + advFundAccount + '\'' +
                '}';
    }
}
