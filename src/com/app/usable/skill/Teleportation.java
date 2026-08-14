package com.app.usable.skill;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.app.cell.Coordinates;
import com.app.entity.Player;
import com.app.level.Level;

/**
 * The teleportation skill class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Teleportation extends Skill {

    /**
     * The name of the teleportation skill
     */
    private static final String NAME = "Teleportation";

    /**
     * The teleportation skill constructor
     */
    public Teleportation(){
        super(NAME);
    }

    /**
     * Initiates the action of the player using the teleportation skill
     * @param level The level where the player is located
     */
    public void use(Level level){
        int height = level.getHeight();
        int width = level.getWidth();

        List<Coordinates> empty = new ArrayList<>();

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(level.isEmptyCell(i,j)){
                    empty.add(new Coordinates(i,j));
                }
            }
        }

        if(empty.isEmpty()){
            return ;
        }

        int randomIndex = ThreadLocalRandom.current().nextInt(0,empty.size());

        Coordinates randomCoordinates = empty.get(randomIndex);

        level.movePlayer(randomCoordinates.getLine(),randomCoordinates.getColumn());
    }

    /**
     * Checks if the condition to unlock the teleportation skill is checked
     * @param player The player of the level
     * @return true if the condition to unlock the teleportation skill is checked, or false otherwise
     */
    public boolean conditionToUnlock(Player player){
        return player.getNumberOfKills() >= 3;
    }

}