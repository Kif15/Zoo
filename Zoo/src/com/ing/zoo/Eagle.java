package com.ing.zoo;

/**
 * @author Kifleysus Musgun
 *
 * This class represents Eagles
 */
public class Eagle extends Carnivore {

    public Eagle(String name) {
        super(name);
        super.helloText = "SCREEEE";
        super.eatText = "delicious";
    }

    @Override
    void sayHello() {
        System.out.println(helloText);
    }

    @Override
    void eatMeat() {
        System.out.println(eatText);
    }
}
