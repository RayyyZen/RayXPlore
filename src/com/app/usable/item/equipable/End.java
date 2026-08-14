package com.app.usable.item.equipable;

import com.app.level.Level;

/**
 * The end item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class End extends Equipable {

    /**
     * The end item name
     */
    private static final String NAME = "End";
    
    /**
     * The end item symbol
     */
    private static final String SYMBOL = "🔮";

    /**
     * The end item constructor
     */
    public End(){
        super(NAME,SYMBOL);
    }

    /**
     * Checks if the end item should be triggered
     * The end item should always be triggered whenever the player has it in his inventory
     * @param level The level where the player belongs
     * @return true if the equipable item should be triggered, false otherwise
     */
    @Override
    public boolean shouldTrigger(Level level){
        return true;
    }

    /**
     * Initiates the action of the player using the end item
     * @param level The level where the player is located
     */
    public void use(Level level) {
        level.endItemWinCondition();
    }

}