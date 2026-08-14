package com.app.level.wincondition;

/**
 * The win condition class
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public abstract class Win {
    
    /**
     * The description of the win condition
     */
    private final String description;

    /**
     * The win constructor that takes as an argument its description
     * @param description The description of the win condition
     */
    public Win(String description){
        this.description = description;
    }

    /**
     * Returns the description of the win condition
     * @return the description of the win condition
     */
    public String description(){
        return this.description;
    }
    
}