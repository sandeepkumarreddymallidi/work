package com.spring10;

import java.beans.ConstructorProperties;

public class Values {
private String name,age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Values( String name,String age){
   this.name=name;
    this.age=age;
    }
}
