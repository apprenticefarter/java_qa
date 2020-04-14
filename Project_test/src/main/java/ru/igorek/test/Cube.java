package ru.igorek.test;

public class Cube {
    public double len;


    public Cube(double l) {
        this.len = l;
    }

    public double cube() {
        return this.len * this.len;
    }
}
