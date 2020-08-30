package com.etherna.game.rest;

import com.etherna.game.beans.County;
import com.etherna.game.beans.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

import static com.etherna.game.beans.Constants.UNIT_TYPE;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/game")
public class GameController {
    @Autowired
    Game game;
    @Autowired
    County county;

    int counter = 0;

    @PostMapping("/setupmap")
    public void setupMap(@RequestBody Map<String, Object> beggin) {


//        for (int i = 0; i < beggin.size(); ++i) {
//            County c = createCounty(beggin.get(i));
//            game.getCounties().put(c.getName(), c);
//        }
    }
//    @PostMapping("/try")
//    public ResponseEntity<?> trying ()  {
//
//        counter ++;
//        if (counter > 3) Game.win=true;
//        System.out.println(Game.win);
//        return  new ResponseEntity<String>("Works "+counter, HttpStatus.OK);
//    }

//    private static County createCounty(Map<String, Object> countyPattern) {
//        County county = new County();
//        county.setName(String.valueOf(countyPattern.get("name")));
//        county.setOwner(String.valueOf(countyPattern.get("owner")));
//        int i = Integer.parseInt(String.valueOf(countyPattern.get(UNIT_TYPE.Infantry)));
//        int c = Integer.parseInt(String.valueOf(countyPattern.get(UNIT_TYPE.Cavalry)));
//        int a = Integer.parseInt(String.valueOf(countyPattern.get(UNIT_TYPE.Artillery)));
//        while (i > 0) {
//            county.getUnits().put(String.valueOf(UNIT_TYPE.Infantry) + " " + i, 10);
//            --i;
//        }
//        while (c > 0) {
//            county.getUnits().put(String.valueOf(UNIT_TYPE.Cavalry) + " " + c, 10);
//            --i;
//        }
//        while (a > 0) {
//            county.getUnits().put(String.valueOf(UNIT_TYPE.Artillery) + " " + a, 10);
//            --i;
//        }
//        return county;
//    }


}
