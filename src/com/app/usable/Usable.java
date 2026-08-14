package com.app.usable;

import com.app.level.Level;

/**
 * The usable interface that will be implemented by the items and the skills
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public interface Usable {

    /**
     * Returns the name of the usable
     * @return the name of the usable
     */
    String getName();
    
    /**
     * Initiates the action of the player using a usable
     * @param level The level where the player is located
     */
    void use(Level level);

}