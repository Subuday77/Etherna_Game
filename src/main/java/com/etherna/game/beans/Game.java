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
        NEIGHBORS[2][0]=NEIGHBORS[2][1]=NEIGHBORS[2][3]=NEIGHBORS[2][6]=NEIGHBORS[2][7]=true;
        NEIGHBORS[3][2]=NEIGHBORS[3][4]=NEIGHBORS[3][5]=NEIGHBORS[3][6]=true;
        NEIGHBORS[4][3]=NEIGHBORS[4][5]=true;
        NEIGHBORS[5][3]=NEIGHBORS[5][4]=NEIGHBORS[5][6]=NEIGHBORS[5][13]=NEIGHBORS[5][42]=true;
        NEIGHBORS[6][2]=NEIGHBORS[6][3]=NEIGHBORS[6][5]=NEIGHBORS[6][7]=NEIGHBORS[6][12]=NEIGHBORS[6][15]=true;
        NEIGHBORS[7][1]=NEIGHBORS[7][2]=NEIGHBORS[7][6]=NEIGHBORS[7][8]=NEIGHBORS[7][10]=true;
        NEIGHBORS[8][1]=NEIGHBORS[8][7]=NEIGHBORS[8][9]=NEIGHBORS[8][10]=true;
        NEIGHBORS[9][8]=NEIGHBORS[9][10]=NEIGHBORS[9][11]=true;
        NEIGHBORS[10][7]=NEIGHBORS[10][8]=NEIGHBORS[10][9]=NEIGHBORS[10][11]=NEIGHBORS[10][15]=NEIGHBORS[10][16]=true;
        NEIGHBORS[11][9]=NEIGHBORS[11][10]=NEIGHBORS[11][16]=true;
        NEIGHBORS[12][6]=NEIGHBORS[12][13]=NEIGHBORS[12][14]=NEIGHBORS[12][15]=true;
        NEIGHBORS[13][5]=NEIGHBORS[13][12]=NEIGHBORS[13][14]=NEIGHBORS[13][43]=true;
        NEIGHBORS[14][12]=NEIGHBORS[14][13]=NEIGHBORS[14][15]=NEIGHBORS[14][18]=NEIGHBORS[14][19]=true;
        NEIGHBORS[15][6]=NEIGHBORS[15][10]=NEIGHBORS[15][12]=NEIGHBORS[15][14]=NEIGHBORS[15][16]=NEIGHBORS[15][17]=NEIGHBORS[15][18]=true;
        NEIGHBORS[16][10]=NEIGHBORS[16][11]=NEIGHBORS[16][15]=NEIGHBORS[16][17]=NEIGHBORS[16][22]=true;
        NEIGHBORS[17][15]=NEIGHBORS[17][16]=NEIGHBORS[17][18]=NEIGHBORS[17][20]=NEIGHBORS[17][22]=true;
        NEIGHBORS[18][14]=NEIGHBORS[18][15]=NEIGHBORS[18][17]=NEIGHBORS[18][19]=NEIGHBORS[18][20]=true;
        NEIGHBORS[19][14]=NEIGHBORS[19][18]=NEIGHBORS[19][20]=NEIGHBORS[19][36]=NEIGHBORS[19][37]=NEIGHBORS[19][43]=NEIGHBORS[19][51]=true;
        NEIGHBORS[20][17]=NEIGHBORS[20][18]=NEIGHBORS[20][19]=NEIGHBORS[20][21]=NEIGHBORS[20][22]=NEIGHBORS[20][49]=true;
        NEIGHBORS[21][20]=NEIGHBORS[21][22]=NEIGHBORS[21][26]=NEIGHBORS[21][27]=NEIGHBORS[21][44]=true;
        NEIGHBORS[22][16]=NEIGHBORS[22][17]=NEIGHBORS[22][20]=NEIGHBORS[22][21]=NEIGHBORS[22][23]=NEIGHBORS[22][26]=true;
        NEIGHBORS[23][22]=NEIGHBORS[23][24]=NEIGHBORS[23][25]=NEIGHBORS[23][26]=true;
        NEIGHBORS[24][23]=NEIGHBORS[24][25]=NEIGHBORS[24][29]=true;
        NEIGHBORS[25][23]=NEIGHBORS[25][24]=NEIGHBORS[25][26]=NEIGHBORS[25][27]=NEIGHBORS[25][28]=NEIGHBORS[25][29]=true;
        NEIGHBORS[26][21]=NEIGHBORS[26][22]=NEIGHBORS[26][23]=NEIGHBORS[26][25]=NEIGHBORS[26][27]=true;
        NEIGHBORS[27][21]=NEIGHBORS[27][25]=NEIGHBORS[27][26]=NEIGHBORS[27][28]=NEIGHBORS[27][31]=NEIGHBORS[27][32]=NEIGHBORS[27][45]=true;
        NEIGHBORS[28][25]=NEIGHBORS[28][27]=NEIGHBORS[28][29]=NEIGHBORS[28][30]=NEIGHBORS[28][31]=true;
        NEIGHBORS[29][24]=NEIGHBORS[29][25]=NEIGHBORS[29][28]=NEIGHBORS[29][30]=true;
        NEIGHBORS[30][28]=NEIGHBORS[30][29]=NEIGHBORS[30][31]=true;
        NEIGHBORS[31][27]=NEIGHBORS[31][28]=NEIGHBORS[31][30]=NEIGHBORS[31][32]=NEIGHBORS[31][33]=true;
        NEIGHBORS[32][27]=NEIGHBORS[32][31]=NEIGHBORS[32][33]=NEIGHBORS[32][34]=NEIGHBORS[32][46]=true;
        NEIGHBORS[33][31]=NEIGHBORS[33][32]=NEIGHBORS[33][34]=true;
        NEIGHBORS[34][32]=NEIGHBORS[34][33]=NEIGHBORS[34][46]=true;
        NEIGHBORS[35][36]=NEIGHBORS[35][38]=true;
        NEIGHBORS[36][19]=NEIGHBORS[36][35]=NEIGHBORS[36][37]=NEIGHBORS[36][38]=NEIGHBORS[36][51]=true;
        NEIGHBORS[37][19]=NEIGHBORS[37][36]=NEIGHBORS[37][38]=NEIGHBORS[37][40]=NEIGHBORS[37][41]=NEIGHBORS[37][43]=true;
        NEIGHBORS[38][35]=NEIGHBORS[38][36]=NEIGHBORS[38][37]=NEIGHBORS[38][39]=true;
        NEIGHBORS[39][38]=NEIGHBORS[39][40]=true;
        NEIGHBORS[40][37]=NEIGHBORS[40][39]=NEIGHBORS[40][41]=true;
        NEIGHBORS[41][37]=NEIGHBORS[41][40]=NEIGHBORS[41][42]=NEIGHBORS[41][43]=true;
        NEIGHBORS[42][5]=NEIGHBORS[42][41]=true;
        NEIGHBORS[43][13]=NEIGHBORS[43][19]=NEIGHBORS[43][37]=NEIGHBORS[43][41]=true;
        NEIGHBORS[44][21]=NEIGHBORS[44][45]=NEIGHBORS[44][49]=true;
        NEIGHBORS[45][27]=NEIGHBORS[45][44]=NEIGHBORS[45][46]=NEIGHBORS[45][48]=true;
        NEIGHBORS[46][32]=NEIGHBORS[46][34]=NEIGHBORS[46][45]=NEIGHBORS[46][46]=NEIGHBORS[46][47]=true;
        NEIGHBORS[47][46]=NEIGHBORS[47][48]=NEIGHBORS[47][53]=true;
        NEIGHBORS[48][45]=NEIGHBORS[48][47]=NEIGHBORS[48][49]=NEIGHBORS[48][50]=NEIGHBORS[48][53]=true;
        NEIGHBORS[49][20]=NEIGHBORS[49][44]=NEIGHBORS[49][48]=NEIGHBORS[49][50]=NEIGHBORS[49][51]=true;
        NEIGHBORS[50][48]=NEIGHBORS[50][49]=NEIGHBORS[50][51]=NEIGHBORS[50][52]=NEIGHBORS[50][53]=true;
        NEIGHBORS[51][19]=NEIGHBORS[51][35]=NEIGHBORS[51][36]=NEIGHBORS[51][49]=NEIGHBORS[51][50]=NEIGHBORS[51][52]=true;
        NEIGHBORS[52][50]=NEIGHBORS[52][51]=NEIGHBORS[52][53]=true;
        NEIGHBORS[53][47]=NEIGHBORS[53][48]=NEIGHBORS[53][50]=NEIGHBORS[53][52]=true;



        System.out.println(INDEX_COUNTY.get(1));
        for(int i=0; i<NEIGHBORS[1].length;++i){
            if (NEIGHBORS[1][i]){
                System.out.println(INDEX_COUNTY.get(i));
            }
        }
    }

}
