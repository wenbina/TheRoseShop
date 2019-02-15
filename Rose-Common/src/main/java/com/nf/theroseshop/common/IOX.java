package com.nf.theroseshop.common;

public class IOX {
//     "code": res.status, //解析接口状态
//            "msg": res.message, //解析提示文本
//            "count": res.total, //解析数据长度
//            "data": res.data.item //解析数据列表
     public int code;
     public String msg;
     public Object data;

    @Override
    public String toString() {
        return "X{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
