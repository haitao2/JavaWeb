package com.lht.studay.domain;

import java.io.Serializable;

public class Test implements Serializable {
    private int id;
    private int age;
    private int score3;
    private int score5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public int getScore5() {
        return score5;
    }

    public void setScore5(int score5) {
        this.score5 = score5;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", age=" + age +
                ", score3=" + score3 +
                ", score5=" + score5 +
                '}';
    }
}
