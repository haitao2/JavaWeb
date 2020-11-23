package com.lht.studay.domain;

import java.io.Serializable;

public class Test implements Serializable {
    private int id;
    private int uid;
    private int score3;
    private int score5;

    public Test() {
    }

    public Test(int id, int age, int score3, int score5) {
        this.id = id;
        this.uid = age;
        this.score3 = score3;
        this.score5 = score5;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return uid;
    }

    public void setAge(int uid) {
        this.uid = uid;
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
                ", uid=" + uid +
                ", score3=" + score3 +
                ", score5=" + score5 +
                '}';
    }
}
