package com.etherna.game.beans;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class County {
   // private String name;
    private String owner;
    private boolean castle;
    private HashMap<String, Integer> units = new HashMap<String, Integer>();

    public County( String owner, boolean castle, HashMap<String, Integer> units) {
     //   this.name = name;
        this.owner = owner;
        this.castle = castle;
        this.units = units;
    }

    public County() {
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isCastle() {
        return castle;
    }

    public void setCastle(boolean castle) {
        this.castle = castle;
    }

    public HashMap<String, Integer> getUnits() {
        return units;
    }

    public void setUnits(HashMap<String, Integer> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "County{" +
                "owner='" + owner + '\'' +
                ", castle=" + castle +
                ", units=" + units +
                '}';
    }
}
