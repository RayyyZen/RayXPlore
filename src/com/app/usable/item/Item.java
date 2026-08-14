package com.app.usable.item;

import com.app.level.Level;
import com.app.usable.Usable;

/**
 * The item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public abstract class Item implements Usable, Comparable<Item> {
    
    /**
     * The name of the item
     */
    private final String name;

    /**
     * The symbol of the item
     */
    private final String symbol;

    /**
     * The item constructor that takes as arguments its name and symbol
     * @param name The name of the item
     * @param symbol The symbol of the item
     */
    public Item(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * Returns the name of the item
     * @return the name of the item
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns the symbol of the item
     * @return the symbol of the item
     */
    public String getItemSymbol(){
        return this.symbol;
    }

    /**
     * Initiates the action of the player using an item
     * @param level The level where the player is located
     */
    public abstract void use(Level level);

    /**
     * Compares the item to an other one based on their names
     * @return -1 if the item comes before the other one, 0 if they are the same, 1 if the first item comes after the other one
     */
    @Override
    public int compareTo(Item other){
        return this.name.compareTo(other.name);
    }

}