package com.totoro.study_01_creational_patterns.study_05_prototype_pattern;

import java.io.*;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class Phone implements Serializable {
    //序列化版本号
    private static final long serialVersionUID = 123456789L;

    //品牌
    private String band;
    //颜色
    private String color;
    //型号
    private String type;

    private Owner owner;

    public Phone(String band, String color, String type, Owner owner) {
        this.band = band;
        this.color = color;
        this.type = type;
        this.owner = owner;
    }

    @Override
    protected Object clone(){
        Phone phone = null;
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            phone = (Phone) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "band='" + band + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", owner=" + owner +
                '}';
    }
}
