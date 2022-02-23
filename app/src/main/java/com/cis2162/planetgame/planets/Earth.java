package com.cis2162.planetgame.planets;

public class Earth extends Planet {

    public Earth() {
        this.planetName = "Earth";
        this.planetColour = "Blue/Green";
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
