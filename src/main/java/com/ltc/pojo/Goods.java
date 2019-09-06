package com.ltc.pojo;

public class Goods {
    private Integer ids;
    private String amount;
    private String goodname;
    private String nm;
    private String units;
    private Integer storeid;

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "ids=" + ids +
                ", amount='" + amount + '\'' +
                ", goodname='" + goodname + '\'' +
                ", nm='" + nm + '\'' +
                ", units='" + units + '\'' +
                ", storeid=" + storeid +
                '}';
    }
}
