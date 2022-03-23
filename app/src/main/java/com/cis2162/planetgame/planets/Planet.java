package com.cis2162.planetgame.planets;

public abstract class Planet {
    String planetName = "";
    String planetColour = "";
    String planetSize = "";
    String planetDistFromSun = "";
    String planetDayLength = "";

    abstract String getPlanetName();
    abstract String getPlanetColour();
    abstract String getPlanetSize();
    abstract String getPlanetDistFromSun();
    abstract String getPlanetDayLength();
}
