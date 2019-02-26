package com.mateacademy.classes;

import java.util.Date;

public final class Immutable implements Cloneable {      //class declared as final
    private final String name;                           //all fields are final and private
    private final int age;
    private final Date date;

    Immutable(String name, int age, Date date){
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getName() {                             //there's no setters
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDate() {                             //Objects types will clone before return
        return (Date) date.clone();
    }
}
