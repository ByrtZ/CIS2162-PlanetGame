package com.cis2162.planetgame.planets;

public class Earth extends Planet {

    public Earth() {
        this.planetName = "Earth";
        this.planetColour = "Blue/Green";
        this.planetSize = "6378.1km"; // Radius
        this.planetDistFromSun = "1au";
        this.planetDayLength = "1d 0h 0m";
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
