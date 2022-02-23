package com.cis2162.planetgame.planets;

public class Jupiter extends Planet {

    public Jupiter() {
        this.planetName = "Jupiter";
        this.planetColour = "Beige with red/brown belt";
        this.planetSize = 0;
        this.planetWeight = 0;
        this.planetGravity = 0;
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
