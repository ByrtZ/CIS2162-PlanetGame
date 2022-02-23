package com.cis2162.planetgame.planets;

public class Mars extends Planet {

    public Mars() {
        this.planetName = "Mars";
        this.planetColour = "Dusty Red";
        this.planetSize = 0;
        this.planetWeight = 0;
        this.planetGravity = 9.8;
    }

    @Override
    String getPlanetName() {
        return this.planetName;
    }

    @Override
    String getPlanetColour() {
        return this.planetColour;
    }

    @Override
    int getPlanetSize() {
        return this.planetSize;
    }

    @Override
    int getPlanetWeight() {
        return this.planetWeight;
    }

    @Override
    double getPlanetGravity() {
        return this.planetGravity;
    }
}
