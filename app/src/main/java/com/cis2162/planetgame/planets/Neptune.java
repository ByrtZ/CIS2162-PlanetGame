package com.cis2162.planetgame.planets;

public class Neptune extends Planet {

    public Neptune() {
        this.planetName = "Neptune";
        this.planetColour = "Opaque Blue";
        this.planetSize = "24764.0km";
        this.planetDistFromSun = "30.1";
        this.planetDayLength = "0d 16h 6m";
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
    String getPlanetSize() {
        return this.planetSize;
    }

    @Override
    String getPlanetDistFromSun() {
        return this.planetDistFromSun;
    }

    @Override
    String getPlanetDayLength() {
        return this.planetDayLength;
    }
}
