package com.app.usable;

import com.app.level.Level;

/**
 * The triggerable interface that will be implemented by the usables are supposed to be triggered automatically under a certain condition
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public interface Triggerable {
    
    /**
     * Checks if the usable should be triggered
     * @param level The level where the player belongs
     * @return true if the usable should be triggered, false otherwise
     */
    boolean shouldTrigger(Level level);

}