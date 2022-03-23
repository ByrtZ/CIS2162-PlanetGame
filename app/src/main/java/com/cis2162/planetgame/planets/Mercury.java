package com.cis2162.planetgame.planets;

public class Mercury extends Planet {

    public Mercury() {
        this.planetName = "Mercury";
        this.planetColour = "Grey";
        this.planetSize = "2439.7km"; // Radius
        this.planetDistFromSun = "0.4au";
        this.planetDayLength = "58d 15h 30m";
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
