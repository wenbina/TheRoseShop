package com.nf.theroseshop.entity;

public class FragrantType {
    private  int FragrantType_id;
    private  String FragrantType_name;

    public FragrantType() {
    }

    public FragrantType(int fragrantType_id, String fragrantType_name) {
        FragrantType_id = fragrantType_id;
        FragrantType_name = fragrantType_name;
    }

    public int getFragrantType_id() {
        return FragrantType_id;
    }

    public void setFragrantType_id(int fragrantType_id) {
        FragrantType_id = fragrantType_id;
    }

    public String getFragrantType_name() {
        return FragrantType_name;
    }

    public void setFragrantType_name(String fragrantType_name) {
        FragrantType_name = fragrantType_name;
    }

    @Override
    public String toString() {
        return "FragrantType{" +
                "FragrantType_id=" + FragrantType_id +
                ", FragrantType_name='" + FragrantType_name + '\'' +
                '}';
    }
}


