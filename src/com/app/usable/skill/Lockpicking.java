package com.app.usable.skill;

import com.app.entity.Player;
import com.app.level.Level;

/**
 * The lockpicking skill class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Lockpicking extends Skill {

    /**
     * The lockpicking skill name
     */
    private static final String NAME = "Lockpicking";

    /**
     * Indicates if the lockpicking skill is already used
     */
    private boolean used = false;

    /**
     * The lockpicking constructor
     */
    public Lockpicking(){
        super(NAME);
    }

    /**
     * Initiates the action of the player using the lockpicking skill
     * @param level The level where the player is located
     */
    public void use(Level level){
        level.playerCanLockpick();
        this.used = true;
    }

    /**
     * Checks if the condition to unlock the lockpicking skill is checked
     * @param player The player of the level
     * @return true if the condition to unlock the lockpicking skill is checked, or false otherwise
     */
    public boolean conditionToUnlock(Player player){
        return player.getScore() >= 100;
    }

    /**
     * Checks if the lockpicking skill should be triggered
     * @param level The level where the player belongs
     * @return true if the lockpicking skill should be triggered, false otherwise
     */
    @Override
    public boolean shouldTrigger(Level level) {
        return !this.used;
    }

}