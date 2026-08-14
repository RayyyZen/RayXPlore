package com.app.usable;

import java.util.List;

/**
 * The weapon interface that will be implemented by the usables that deals damage
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public interface Weapon {
    
    /**
     * Returns the damaged enemies
     * @return the damaged enemies
     */
    List<String> getDamagedEnemies();

}