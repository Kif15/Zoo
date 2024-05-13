package com.ing.zoo;

/**
 * This class represents Hippo
 */
public class Hippo extends Herbivore  {


    public Hippo(String name)
    {
        super(name);
        super.helloText = "splash";
        super.eatText = "munch munch lovely";
    }

    /**
     * This method prints text when a Hippo says hello
     */
    @Override
    public void sayHello()
    {

        System.out.println(helloText);
    }


    /**
     * This method prints, how a hippo would sound when eating leaves
     */
    @Override
    public void eatLeaves()
    {

        System.out.println(eatText);
    }




}
