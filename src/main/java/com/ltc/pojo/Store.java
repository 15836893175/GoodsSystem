package com.ltc.pojo;

public class Store {

    private Integer ids;
    private String names;
    private String address;
    private String manager;

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Store{" +
                "ids=" + ids +
                ", names='" + names + '\'' +
                ", address='" + address + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}
