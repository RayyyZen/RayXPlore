package com.app.usable.item.consumable;

import com.app.usable.item.Item;

/**
 * The consumable item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public abstract class Consumable extends Item {
    
    /**
     * The consumable item constructor that takes as arguments its name and symbol
     * @param name The name of the consumable item
     * @param symbol The symbol of the consumable item
     */
    public Consumable(String name, String symbol){
        super(name,symbol);
    }

}