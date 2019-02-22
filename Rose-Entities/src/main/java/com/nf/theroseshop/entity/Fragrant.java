package com.nf.theroseshop.entity;

public class Fragrant {
    private int Fragrant_id;
    private String Fragrant_code;
    private  int Fragrant_type;
    private  String Fragrant_name;
    private  String Fragrant_content;
    private  double  Fragrant_price;
    private  String Fragrant_reason;
    private String Fragrant_composition;
    private  String Fragrant_story;
    private  String Fragrant_explain;
    private  int Fragrant_Stock;
    private  int Fragrant_sale;
    private  int Fragrant_supplier;

    public Fragrant() {
    }

    public Fragrant(int fragrant_id, String fragrant_code, int fragrant_type, String fragrant_name, String fragrant_content, double fragrant_price, String fragrant_reason, String fragrant_composition, String fragrant_story, String fragrant_explain, int fragrant_Stock, int fragrant_sale, int fragrant_supplier) {
        Fragrant_id = fragrant_id;
        Fragrant_code = fragrant_code;
        Fragrant_type = fragrant_type;
        Fragrant_name = fragrant_name;
        Fragrant_content = fragrant_content;
        Fragrant_price = fragrant_price;
        Fragrant_reason = fragrant_reason;
        Fragrant_composition = fragrant_composition;
        Fragrant_story = fragrant_story;
        Fragrant_explain = fragrant_explain;
        Fragrant_Stock = fragrant_Stock;
        Fragrant_sale = fragrant_sale;
        Fragrant_supplier = fragrant_supplier;
    }

    public int getFragrant_id() {
        return Fragrant_id;
    }

    public void setFragrant_id(int fragrant_id) {
        Fragrant_id = fragrant_id;
    }

    public String getFragrant_code() {
        return Fragrant_code;
    }

    public void setFragrant_code(String fragrant_code) {
        Fragrant_code = fragrant_code;
    }

    public int getFragrant_type() {
        return Fragrant_type;
    }

    public void setFragrant_type(int fragrant_type) {
        Fragrant_type = fragrant_type;
    }

    public String getFragrant_name() {
        return Fragrant_name;
    }

    public void setFragrant_name(String fragrant_name) {
        Fragrant_name = fragrant_name;
    }

    public String getFragrant_content() {
        return Fragrant_content;
    }

    public void setFragrant_content(String fragrant_content) {
        Fragrant_content = fragrant_content;
    }

    public double getFragrant_price() {
        return Fragrant_price;
    }

    public void setFragrant_price(double fragrant_price) {
        Fragrant_price = fragrant_price;
    }

    public String getFragrant_reason() {
        return Fragrant_reason;
    }

    public void setFragrant_reason(String fragrant_reason) {
        Fragrant_reason = fragrant_reason;
    }

    public String getFragrant_composition() {
        return Fragrant_composition;
    }

    public void setFragrant_composition(String fragrant_composition) {
        Fragrant_composition = fragrant_composition;
    }

    public String getFragrant_story() {
        return Fragrant_story;
    }

    public void setFragrant_story(String fragrant_story) {
        Fragrant_story = fragrant_story;
    }

    public String getFragrant_explain() {
        return Fragrant_explain;
    }

    public void setFragrant_explain(String fragrant_explain) {
        Fragrant_explain = fragrant_explain;
    }

    public int getFragrant_Stock() {
        return Fragrant_Stock;
    }

    public void setFragrant_Stock(int fragrant_Stock) {
        Fragrant_Stock = fragrant_Stock;
    }

    public int getFragrant_sale() {
        return Fragrant_sale;
    }

    public void setFragrant_sale(int fragrant_sale) {
        Fragrant_sale = fragrant_sale;
    }

    public int getFragrant_supplier() {
        return Fragrant_supplier;
    }

    public void setFragrant_supplier(int fragrant_supplier) {
        Fragrant_supplier = fragrant_supplier;
    }

    @Override
    public String toString() {
        return "Fragrant{" +
                "Fragrant_id=" + Fragrant_id +
                ", Fragrant_code='" + Fragrant_code + '\'' +
                ", Fragrant_type=" + Fragrant_type +
                ", Fragrant_name='" + Fragrant_name + '\'' +
                ", Fragrant_content='" + Fragrant_content + '\'' +
                ", Fragrant_price=" + Fragrant_price +
                ", Fragrant_reason='" + Fragrant_reason + '\'' +
                ", Fragrant_composition='" + Fragrant_composition + '\'' +
                ", Fragrant_story='" + Fragrant_story + '\'' +
                ", Fragrant_explain='" + Fragrant_explain + '\'' +
                ", Fragrant_Stock=" + Fragrant_Stock +
                ", Fragrant_sale=" + Fragrant_sale +
                ", Fragrant_supplier=" + Fragrant_supplier +
                '}';
    }


}




