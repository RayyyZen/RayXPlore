package com.app.usable.item.consumable;

import com.app.level.Level;

/**
 * The coin item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Coin extends Consumable {

    /**
     * The coin item name
     */
    private static final String NAME = "Coin";
    
    /**
     * Number of points (score) that the player gains from picking up a coin
     */
    private static final int COIN = 90;

    /**
     * The emoji symbol that represents each coin
     */
    private static final String SYMBOL = "📀";

    /**
     * The coin item constructor
     */
    public Coin(){
        super(NAME,SYMBOL);
    }

    /**
     * Initiates the action of the player using the coin item
     * @param level The level where the player is located
     */
    public void use(Level level){
        level.removeCoin();
        level.modifyPlayerScore(COIN);
    }
    
}