package com.ing.zoo;

/**
 * @author Kifleyesus Musgun
 *
 * This class represents Elephants
 */

public class Elephant extends Herbivore {

    public Elephant(String name) {
        super(name);
        super.helloText = "hello";
        super.eatText = "yummy grass";
    }

    @Override
    public void sayHello(){
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }
}
