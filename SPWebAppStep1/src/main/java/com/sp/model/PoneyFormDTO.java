package com.sp.model;

public class PoneyFormDTO {

    private String color;
    private String superPower;
    private String name;
    private String imgUrl;

    public PoneyFormDTO() {
        this.color = "";
        this.superPower = "";
        this.name = "";
        this.imgUrl="";
    }
    public PoneyFormDTO(String name,String color,String superPower, String imgUrl) {
        this.color = color;
        this.superPower = superPower;
        this.name = name;
        this.imgUrl=imgUrl;
    }

    // GETTER

    public String getColor() {
        return color;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    // SETTER


    public void setColor(String color) {
        this.color = color;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
