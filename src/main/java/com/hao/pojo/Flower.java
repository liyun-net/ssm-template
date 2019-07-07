package com.hao.pojo;

public class Flower {
    private Integer id;
    private String name;
    private Float price;
    private String production;
    private Integer country;

    public Flower(Integer id, String name, Float price, String production, Integer country) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
        this.country = country;
    }

    public Flower() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", production='" + production + '\'' +
                ", country=" + country +
                '}';
    }
}
