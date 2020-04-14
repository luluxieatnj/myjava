package com.xll.threadtest.tltest;

public class GamePic {
    private Integer id;

    private String name = "LOL";

    public GamePic(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GamePic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
