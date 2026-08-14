package com.app.level.wincondition;

import com.app.level.Level;

/**
 * The item condition class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class ItemCondition extends Win implements WinCondition {

    /**
     * The description of the item win condition
     */
    private static final String DESCRIPTION = "Collect the end item 🔮 !";

    /**
     * Indicates if the game must end
     */
    private boolean endGame = false;

    /**
     * The item win condition constructor
     */
    public ItemCondition(){
        super(DESCRIPTION);
    }

    /**
     * Ends the game (in case the end item was collected)
     */
    public void end(){
        this.endGame = true;
    }
    
    /**
     * Checks if the player achieved the win condition of a level
     * @param level The level that will be checked
     * @return True if the player achieved the win condition of the level, or false otherwise
     */
    public boolean win(Level level){
        return this.endGame;
    }

}