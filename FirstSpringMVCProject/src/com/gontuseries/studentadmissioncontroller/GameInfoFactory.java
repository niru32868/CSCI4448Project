package com.gontuseries.studentadmissioncontroller;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
// help from https://refactoring.guru/design-patterns/flyweight/java/example

public class GameInfoFactory { // FLYWEIGHT CREATION
    static Map<String, GameInfo> GameInfos = new HashMap<>();

    public static GameInfo getGameInfo(String GameName) {
        GameInfo result = GameInfos.get(GameName);
        if (result == null) {
        	
            result = new GameInfo(GameName);
            GameInfos.put(GameName, result);
        }
        return result;
    }
 
}
