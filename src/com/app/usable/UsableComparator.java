package com.app.usable;

import java.util.Comparator;

import com.app.usable.item.Item;
import com.app.usable.skill.Skill;

/**
 * The usable comparator class that sorts usables
 * @version 5.0 (Fifth world)
 * @since 5.0 (Fifth world)
 * @author Rayane
 */
public class UsableComparator implements Comparator<Usable> {

    /**
     * The usable comparator constructor
     */
    public UsableComparator(){}

    /**
     * Compares 2 usables
     * @return -1 if the first usable comes before the second one, 0 if they are the same, 1 if the first usable comes after the second one
     */
    @Override
    public int compare(Usable usable1, Usable usable2) {

        if(usable1 instanceof Item && usable2 instanceof Skill){
            return -1;

        } else if(usable1 instanceof Skill && usable2 instanceof Item) {
            return 1;

        } else {
            //Both are the same
            if(usable1 instanceof Item){
                return ((Item)usable1).compareTo((Item)usable2);

            } else {
                return ((Skill)usable1).compareTo((Skill)usable2);
            }
        }
        
    }
    
}