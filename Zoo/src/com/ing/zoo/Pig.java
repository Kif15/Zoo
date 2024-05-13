package com.ing.zoo;

import java.util.Random;

/**
 * This class represents Pigs,who can perform a trick
 */

public class Pig extends Animal implements  PerformTrick {

    private String trick;

    public Pig(String name)
    {
        super(name);
        super.helloText = "splash";
        super.eatText = "munch munch oink";
    }

    @Override
    public void sayHello()
    {

        System.out.println(helloText);
    }

    /**
     * This method prints when a pig eats leaves
     */

    public void eatLeaves()
    {

        System.out.println(eatText);
    }

    /**
     * This method prints when a pig eats meat
     */
    public void eatMeat()
    {

        System.out.println(eatText + " thx");
    }

    /**
     * This method prints a trick that a pig does
     */
    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }
}
