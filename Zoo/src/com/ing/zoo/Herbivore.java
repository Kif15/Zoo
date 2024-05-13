package com.ing.zoo;

/**
 * @author Kifleyesus Musgun
 *
 * This class represents Herbivore animals, that eat plants
 */
public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    public abstract void eatLeaves();
}
