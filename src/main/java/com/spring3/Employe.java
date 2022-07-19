package com.spring3;

public class Employe {
    private int id;
    private String name;
    private PermanateEmployee pe;

    public Employe(int id, String name,PermanateEmployee pe) {
        this.id = id;
        this.name = name;
        this.pe=pe;
    }

    public Employe() {
    }

    public Employe(PermanateEmployee pe) {
        this.pe = pe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PermanateEmployee getPe() {
        return pe;
    }

    public void setPe(PermanateEmployee pe) {
        this.pe = pe;
    }
}
