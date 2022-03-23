package com.cis2162.planetgame.planets;

public class Uranus extends Planet {

    public Uranus() {
        this.planetName = "Uranus";
        this.planetColour = "Opaque Blue";
        this.planetSize = "25559.0km";
        this.planetDistFromSun = "19.8au";
        this.planetDayLength = "0d 17h 14km";
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
