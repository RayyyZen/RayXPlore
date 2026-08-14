package com.app.usable.item.equipable;

import java.util.ArrayList;
import java.util.List;

import com.app.cell.Coordinates;
import com.app.level.Level;
import com.app.usable.Weapon;

/**
 * The sword item class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class Sword extends Equipable implements Weapon {

    /**
     * The sword item name
     */
    private static final String NAME = "Sword";

    /**
     * The sword item symbol
     */
    private static final String SYMBOL = "🗡 ";

    /**
     * The amount of damage caused by the sword item
     */
    private static final int DAMAGE = -1;

    /**
     * The damaged enemies from the sword item
     */
    private List<String> damagedEnemies;

    /**
     * The sword item constructor
     */
    public Sword(){
        super(NAME,SYMBOL);
        this.damagedEnemies = new ArrayList<>();
    }

    /**
     * Checks if the sword item should be triggered
     * @param level The level where the player belongs
     * @return true if the sword item should be triggered, false otherwise
     */
    @Override
    public boolean shouldTrigger(Level level) {
        return level.playerEnemyCollision();
    }

    /**
     * Initiates the action of the player using the sword item
     * @param level The level where the player is located
     */
    @Override
    public void use(Level level) {
        int line = level.getPlayerLine();
        int column = level.getPlayerColumn();

        this.damagedEnemies = level.damageEnemiesOnCoordinates(new Coordinates(line,column),DAMAGE);

        level.incrementPlayerNumberOfUsedSwords();
    }

    /**
     * Returns the damaged enemies
     * @return the damaged enemies
     */
    public List<String> getDamagedEnemies(){
        return this.damagedEnemies;
    }

}