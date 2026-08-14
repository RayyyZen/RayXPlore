package com.app.usable.item.equipable;

import com.app.level.Level;

/**
 * The hourglass item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Hourglass extends Equipable {

    /**
     * The hourglass item name
     */
    private static final String NAME = "Hourglass";
    
    /**
     * The hourglass item symbol
     */
    private static final String SYMBOL = "⏱ ";

    /**
     * The number of movements that the enemies are frozen for if the item is activated
     */
    private static final int NUMBEROFMOVEMENTS = 10;

    /**
     * The hourglass item constructor
     */
    public Hourglass(){
        super(NAME,SYMBOL);
    }

    /**
     * Initiates the action of the player using the hourglass item
     * @param level The level where the player is located
     */
    public void use(Level level) {
        level.blockEnemies(NUMBEROFMOVEMENTS);
    }

}