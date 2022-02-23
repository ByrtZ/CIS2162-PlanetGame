package com.cis2162.planetgame.planets;

public abstract class Planet {
    String planetName = "";
    String planetColour = "";
    int planetSize = 0;
    int planetWeight = 0;
    double planetGravity = 0;

    abstract String getPlanetName();
    abstract String getPlanetColour();
    abstract int getPlanetSize();
    abstract int getPlanetWeight();
    abstract double getPlanetGravity();
}
