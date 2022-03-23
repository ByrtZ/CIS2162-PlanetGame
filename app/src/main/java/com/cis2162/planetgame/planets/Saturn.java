package com.cis2162.planetgame.planets;

public class Saturn extends Planet {

    public Saturn() {
        this.planetName = "Saturn";
        this.planetColour = "Beige with red/brown belt";
        this.planetSize = "60268.0km";
        this.planetDistFromSun = "9.5au";
        this.planetDayLength = "0d 10h 42m";
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
