package com.ing.zoo;

/**
 * @author Kifleyesus Musgun
 *
 * This class represents carnivore animals, that eat meat.
 */

public abstract class Carnivore extends Animal {

    public Carnivore(String name) {
        super(name);
    }

    abstract void eatMeat();
}
