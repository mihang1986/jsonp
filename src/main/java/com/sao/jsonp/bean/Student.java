package com.sao.jsonp.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by navia on 2015/4/3.
 */
@Component
public class Student {
    private String id;
    private String name;
    private Date birthday;

    public Student() {
    }

    public Student(String id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
