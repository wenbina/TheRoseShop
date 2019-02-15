package com.nf.theroseshop.common;

import java.util.ArrayList;

public class List {

    private static java.util.List list = new ArrayList();

    public static void add(java.util.List arr){
        list.add(arr);
    }

    public static java.util.List getList() {
        return list;
    }

    public static void setList(java.util.List list) {
        List.list = list;
    }

    public List() {
    }
}