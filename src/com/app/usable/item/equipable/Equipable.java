package com.app.usable.item.equipable;

import com.app.level.Level;
import com.app.usable.Triggerable;
import com.app.usable.item.Item;

/**
 * The equipable item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public abstract class Equipable extends Item implements Triggerable {
    
    /**
     * The equipable item constructor that takes as arguments its name and symbol
     * @param name The name of the equipable item
     * @param symbol The symbol of the equipable item
     */
    public Equipable(String name, String symbol) {
        super(name,symbol);
    }

    /**
     * Checks if the equipable item should be triggered
     * @param level The level where the player belongs
     * @return true if the equipable item should be triggered, false otherwise
     */
    public boolean shouldTrigger(Level level){
        return false;
    }

}