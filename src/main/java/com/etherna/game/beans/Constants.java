package com.etherna.game.beans;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class Constants {

    public static final String[] COUNTY_NAMES = {"V1", "V2", "V3", "V4", "V5", "V6", "V7", "V8", "V9", "V10", "V11",
            "V12", "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10", "G11", "B1", "B2", "B3", "B4", "B5",
            "B6", "B7", "B8", "B9", "B10", "B11", "B12", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "O1",
            "O2", "O3", "O4", "O5", "O6", "O7", "O8", "O9", "O10"};

    public static final String CASTLES = "-V8-V10-R7-G6-G8-O7-B3-B10-";
    public static final LinkedHashMap<String, Integer> COUNTY_INDEX = new LinkedHashMap<>();
    public static final LinkedHashMap<Integer, String> INDEX_COUNTY = new LinkedHashMap<>();


    public static final boolean[][] NEIGHBORS = new boolean[COUNTY_NAMES.length][COUNTY_NAMES.length];


    public enum OWNER {
        Red, Blue, Neutral
    }

    ;

    public enum UNIT_TYPE {
        Infantry, Cavalry, Artillery
    }

    ;
    public static final double HEALTH = 100;
    public static final double castleIndex = 0.7;
    public static final double supportIndex = 0.5;
    public static final double ATTACK = 10;
}
