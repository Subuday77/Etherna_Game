package com.etherna.game.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;

import static com.etherna.game.beans.Constants.*;

@Component
public class Game {
    public static boolean win = false;
    private HashMap<String, County> counties = new HashMap<String, County>();

    public Game(HashMap<String, County> counties) {
        this.counties = counties;
    }

    public Game() {
    }

    public HashMap<String, County> getCounties() {
        return counties;
    }

    public void setCounties(HashMap<String, County> counties) {
        this.counties = counties;
    }

    @Override
    public String toString() {
        return "Game{" +
                "counties=" + counties +
                '}';
    }

    @PostConstruct
    private void init() {
        for (String name : COUNTY_NAMES) {
            if (CASTLES.contains("-"+name+"-")) {
                counties.put(name, new County(String.valueOf(OWNER.Neutral), true, new HashMap<String, Integer>()));
            } else {
                counties.put(name, new County(String.valueOf(OWNER.Neutral), false, new HashMap<String, Integer>()));
            }
        }
        for (int i = 0; i< COUNTY_NAMES.length; ++i){
            COUNTY_INDEX.put(COUNTY_NAMES[i],i);
            INDEX_COUNTY.put(i,COUNTY_NAMES[i]);
        }
        Arrays.stream(NEIGHBORS).forEach(a -> Arrays.fill(a,false));
        NEIGHBORS[0][1]=NEIGHBORS[0][2]=true;
        NEIGHBORS[1][0]=NEIGHBORS[1][2]=NEIGHBORS[1][7]=NEIGHBORS[1][8]=true;

        System.out.println(INDEX_COUNTY.get(1));
        for(int i=0; i<NEIGHBORS[1].length;++i){
            if (NEIGHBORS[1][i]){
                System.out.println(INDEX_COUNTY.get(i));
            }
        }
    }

}
