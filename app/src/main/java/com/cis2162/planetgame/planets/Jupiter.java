package com.cis2162.planetgame.planets;

public class Jupiter extends Planet {

    public Jupiter() {
        this.planetName = "Jupiter";
        this.planetColour = "Beige with red/brown belt";
        this.planetSize = "71492.0km";
        this.planetDistFromSun = "5.2au";
        this.planetDayLength = "0d 9h 56m";
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
