package com.entity;

public class UserEntity {
    private Integer uid;
    private String uname;
    private Integer age;
    private CarEntity carEntity;
    private String img;

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", carEntity=" + carEntity +
                ", img='" + img + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
