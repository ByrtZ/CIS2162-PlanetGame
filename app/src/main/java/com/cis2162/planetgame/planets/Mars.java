package com.cis2162.planetgame.planets;

public class Mars extends Planet {

    public Mars() {
        this.planetName = "Mars";
        this.planetColour = "Dusty Red";
        this.planetSize = "3396.2km";
        this.planetDistFromSun = "1.5au";
        this.planetDayLength = "1d 0h 37m";
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
