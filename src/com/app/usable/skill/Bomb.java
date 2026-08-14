package com.app.usable.skill;

import com.app.entity.Player;
import com.app.level.Level;
import com.app.usable.Weapon;

import java.util.ArrayList;
import java.util.List;

import com.app.cell.Coordinates;

/**
 * The bomb skill class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Bomb extends Skill implements Weapon {

    /**
     * The name of the bomb skill
     */
    private static final String NAME = "Bomb";

    /**
     * The amount of damage that the bomb skill deals
     */
    private static final int DAMAGE = -1;

    /**
     * The damaged enemies by the bomb skill
     */
    private List<String> damagedEnemies;

    /**
     * The minimum number of used swords required to unlock the bomb skill
     */
    private static final int NUMBER_OF_USED_SWORDS_TO_UNLOCK = 5;

    /**
     * The bomb skill constructor
     */
    public Bomb(){
        super(NAME);
        this.damagedEnemies = new ArrayList<>();
    }

    /**
     * Returns the minimum between 2 integers
     * @param a An integer
     * @param b An integer
     * @return the minimum between 2 integers
     */
    private int min(int a, int b){
        return a < b ? a : b;
    }

    /**
     * Returns the maximum between 2 integers
     * @param a An integer
     * @param b An integer
     * @return the maximum between 2 integers
     */
    private int max(int a, int b){
        return a > b ? a : b;
    }

    /**
     * Initiates the action of the player using the bomb skill
     * @param level The level where the player is located
     */
    public void use(Level level){
        int height = level.getHeight();
        int width = level.getWidth();

        int line = level.getPlayerLine();
        int column = level.getPlayerColumn();

        int x1 = max(line - 1, 0);
        int x2 = min(line + 1, height - 1);
        int y1 = max(column - 1, 0);
        int y2 = min(column + 1, width - 1);

        this.damagedEnemies = new ArrayList<>();

        for(int i = x1; i <= x2; i++){
            for(int j = y1; j <= y2; j++){
                List<String> damagedEnemies = level.damageEnemiesOnCoordinates(new Coordinates(i,j),DAMAGE);
                if(!damagedEnemies.isEmpty()){
                    this.damagedEnemies.addAll(damagedEnemies);
                }
            }
        }
    }

    /**
     * Checks if the condition to unlock the bomb skill is checked
     * @param player The player of the level
     * @return true if the condition to unlock the bomb skill is checked, or false otherwise
     */
    public boolean conditionToUnlock(Player player){
        return player.getNumberOfUsedSwords() >= NUMBER_OF_USED_SWORDS_TO_UNLOCK;
    }

    /**
     * Returns the damaged enemies
     * @return the damaged enemies
     */
    public List<String> getDamagedEnemies(){
        return this.damagedEnemies;
    }

}