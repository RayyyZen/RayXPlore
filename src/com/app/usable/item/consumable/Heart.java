package com.app.usable.item.consumable;

import com.app.level.Level;

/**
 * The heart item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Heart extends Consumable {

    /**
     * The heart item name
     */
    private static final String NAME = "HEART";
    
    /**
     * Number of hearts that the player gains from picking up a heart
     */
    private static final int HEARTS = 1;

    /**
     * The emoji symbol that represents each heart
     */
    private static final String SYMBOL = "❤ ";

    /**
     * The heart item constructor
     */
    public Heart(){
        super(NAME,SYMBOL);
    }

    /**
     * Initiates the action of the player using the heart item
     * @param level The level where the player is located
     */
    public void use(Level level){
        level.modifyPlayerHearts(HEARTS);
    }

}