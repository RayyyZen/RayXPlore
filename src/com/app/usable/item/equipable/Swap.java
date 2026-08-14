package com.app.usable.item.equipable;

import com.app.level.Level;

/**
 * The swap item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Swap extends Equipable {

    /**
     * The swap item name
     */
    private static final String NAME = "Swap";
    
    /**
     * The swap item symbol
     */
    private static final String SYMBOL = "🎭";

    /**
     * The swap item constructor
     */
    public Swap(){
        super(NAME,SYMBOL);
    }

    /**
     * Initiates the action of the player using the swap item
     * @param level The level where the player is located
     */
    public void use(Level level) {
        level.swapWithRandomEnemy();
    }

}