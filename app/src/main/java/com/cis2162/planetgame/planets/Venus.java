package com.cis2162.planetgame.planets;

public class Venus extends Planet{

    public Venus() {
        this.planetName = "Venus";
        this.planetColour = "Yellow/White";
        this.planetSize = "6051.8km"; // Radius
        this.planetDistFromSun = "0.7au";
        this.planetDayLength = "116d 18h 0m";
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
