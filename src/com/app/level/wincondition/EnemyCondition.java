package com.app.level.wincondition;

import com.app.level.Level;

/**
 * The enemy condition class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class EnemyCondition extends Win implements WinCondition {

    /**
     * The description of the enemy win condition
     */
    private static final String DESCRIPTION = "Eliminate all the enemies to finish the level ☠  !";

    /**
     * The enemy win condition constructor
     */
    public EnemyCondition(){
        super(DESCRIPTION);
    }
    
    /**
     * Checks if the player achieved the win condition of a level
     * @param level The level that will be checked
     * @return True if the player achieved the win condition of the level, or false otherwise
     */
    public boolean win(Level level){
        return level.getNumberOfEnemies() == 0;
    }

}