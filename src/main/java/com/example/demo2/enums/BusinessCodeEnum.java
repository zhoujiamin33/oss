package com.example.demo2.enums;

public enum BusinessCodeEnum {
    ENT_MEMBER("用户编号", 12, "U"),
    ;

    private String name;
    private Integer length;
    private String prefix;

    private BusinessCodeEnum(String name, Integer length, String prefix) {
        this.name = name;
        this.length = length;
        this.prefix = prefix;
    }

    public String getName() {
        return this.name;
    }

    public Integer getLength() {
        return this.length;
    }

    public String getPrefix() {
        return this.prefix;
    }
}
