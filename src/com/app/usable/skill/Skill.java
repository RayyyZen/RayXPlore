package com.app.usable.skill;

import com.app.entity.Player;
import com.app.level.Level;
import com.app.usable.Triggerable;
import com.app.usable.Usable;

/**
 * The skill class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public abstract class Skill implements Usable, Triggerable, Comparable<Skill> {

    /**
     * The name of the skill
     */
    private final String name;

    /**
     * The skill constructor that takes as an argument its name
     * @param name The name of the skill
     */
    public Skill(String name){
        this.name = name;
    }

    /**
     * Returns the skill's name
     * @return the skill's name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Checks if the skill should be triggered
     * @param level The level where the player belongs
     * @return true if the skill should be triggered, false otherwise
     */
    public boolean shouldTrigger(Level level){
        return false;
    }

    /**
     * Checks if the condition to unlock the skill is checked
     * @param player The player of the level
     * @return true if the condition to unlock the skill is checked, or false otherwise
     */
    public abstract boolean conditionToUnlock(Player player);

    /**
     * Compares the skill to an other one based on its their names
     * @return -1 if the skill comes before the other one, 0 if they are the same, 1 if the first skill comes after the other one
     */
    @Override
    public int compareTo(Skill other){
        return this.name.compareTo(other.name);
    }

}