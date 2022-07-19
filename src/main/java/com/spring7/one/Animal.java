package com.spring7.one;

import org.springframework.beans.factory.annotation.Autowired;

public class Animal {
private Cat cats;

    public Animal(Cat cats) {
        this.cats = cats;
    }

    public Cat getCats() {
        return cats;
    }

    public void setCats(Cat cats) {
        this.cats = cats;
    }

    public Animal() {
    }

    public void display()
    {
        cats.catDisplay();
        System.out.println("this is animal");
    }
}
