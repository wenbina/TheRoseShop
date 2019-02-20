package com.nf.theroseshop.entity;

public class Rose {
    private int rose_id;
    private  String rose_code;
    private String rose_name;
    private String rose_content;
    private double rose_price;
    private  String rose_reason;
    private  String rose_composition;
    private  String rose_story;
    private  String rose_explain;
    private  int rose_stock;
    private int rose_sale;

    public Rose() {
    }

    public Rose(int rose_id, String rose_code, String rose_name, String rose_content, double rose_price, String rose_reason, String rose_composition, String rose_story, String rose_explain, int rose_stock, int rose_sale) {
        this.rose_id = rose_id;
        this.rose_code = rose_code;
        this.rose_name = rose_name;
        this.rose_content = rose_content;
        this.rose_price = rose_price;
        this.rose_reason = rose_reason;
        this.rose_composition = rose_composition;
        this.rose_story = rose_story;
        this.rose_explain = rose_explain;
        this.rose_stock = rose_stock;
        this.rose_sale = rose_sale;
    }

    public int getRose_id() {
        return rose_id;
    }

    public void setRose_id(int rose_id) {
        this.rose_id = rose_id;
    }

    public String getRose_code() {
        return rose_code;
    }

    public void setRose_code(String rose_code) {
        this.rose_code = rose_code;
    }

    public String getRose_name() {
        return rose_name;
    }

    public void setRose_name(String rose_name) {
        this.rose_name = rose_name;
    }

    public String getRose_content() {
        return rose_content;
    }

    public void setRose_content(String rose_content) {
        this.rose_content = rose_content;
    }

    public double getRose_price() {
        return rose_price;
    }

    public void setRose_price(double rose_price) {
        this.rose_price = rose_price;
    }

    public String getRose_reason() {
        return rose_reason;
    }

    public void setRose_reason(String rose_reason) {
        this.rose_reason = rose_reason;
    }

    public String getRose_composition() {
        return rose_composition;
    }

    public void setRose_composition(String rose_composition) {
        this.rose_composition = rose_composition;
    }

    public String getRose_story() {
        return rose_story;
    }

    public void setRose_story(String rose_story) {
        this.rose_story = rose_story;
    }

    public String getRose_explain() {
        return rose_explain;
    }

    public void setRose_explain(String rose_explain) {
        this.rose_explain = rose_explain;
    }

    public int getRose_stock() {
        return rose_stock;
    }

    public void setRose_stock(int rose_stock) {
        this.rose_stock = rose_stock;
    }

    public int getRose_sale() {
        return rose_sale;
    }

    public void setRose_sale(int rose_sale) {
        this.rose_sale = rose_sale;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "rose_id=" + rose_id +
                ", rose_code='" + rose_code + '\'' +
                ", rose_name='" + rose_name + '\'' +
                ", rose_content='" + rose_content + '\'' +
                ", rose_price=" + rose_price +
                ", rose_reason='" + rose_reason + '\'' +
                ", rose_composition='" + rose_composition + '\'' +
                ", rose_story='" + rose_story + '\'' +
                ", rose_explain='" + rose_explain + '\'' +
                ", rose_stock=" + rose_stock +
                ", rose_sale=" + rose_sale +
                '}';
    }
}

