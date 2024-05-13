package com.ing.zoo;

import java.util.Random;

/**
 * This class represents Tigers,who can perform a trick
 */
public class Tiger extends Carnivore implements PerformTrick {

    private String trick;

    public Tiger(String name)
    {
        super(name);
        super.helloText = "rraaarww";
        super.eatText = "nomnomnom oink wubalubadubdub";
    }

    /**
     * This prints when a tiger says hello
     */
    @Override
    public void sayHello()
    {
        System.out.println(helloText);
    }

    /**
     * This prints when the tiger eats meat
     */
    @Override
    public void eatMeat()
    {

        System.out.println(eatText);
    }

    /**
     * This prints when a tiger performs a trick
     */
    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            this.trick = "jumps in tree";
        }
        else
        {
            this.trick = "scratches ears";
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
