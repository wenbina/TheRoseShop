package com.nf.theroseshop.entity;

import java.util.List;

public class Collectiones {
    private int CollectionUserid;
    private String CollectionCode;
    private List<Usertable> usertableList;

    public int getCollectionUserid() {
        return CollectionUserid;
    }

    public void setCollectionUserid(int collectionUserid) {
        CollectionUserid = collectionUserid;
    }

    public String getCollectionCode() {
        return CollectionCode;
    }

    public void setCollectionCode(String collectionCode) {
        CollectionCode = collectionCode;
    }

    public List<Usertable> getUsertableList() {
        return usertableList;
    }

    public void setUsertableList(List<Usertable> usertableList) {
        this.usertableList = usertableList;
    }

    public Collectiones() {
    }

    public Collectiones(int collectionUserid, String collectionCode) {
        CollectionUserid = collectionUserid;
        CollectionCode = collectionCode;
    }

    public Collectiones(int collectionUserid, String collectionCode, List<Usertable> usertableList) {
        CollectionUserid = collectionUserid;
        CollectionCode = collectionCode;
        this.usertableList = usertableList;
    }

    @Override
    public String toString() {
        return "Collectiones{" +
                "CollectionUserid=" + CollectionUserid +
                ", CollectionCode='" + CollectionCode + '\'' +
                ", usertableList=" + usertableList +
                '}';
    }
}
