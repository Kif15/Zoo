package com.ing.zoo;

/**
 * This class represents Zebras
 */
public class Zebra extends Herbivore {

    private String trick;

    public Zebra(String name)
    {
        super(name);
        super.helloText = "zebra zebra";
        super.eatText = "munch munch zank yee bra";
    }

    /**
     * This prints when Zebra says hello
     */
    @Override
    public void sayHello()
    {

        System.out.println(helloText);
    }

    /**
     * This prints when the Zebra eats leaves
     */
    public void eatLeaves()
    {

        System.out.println(eatText);
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }
}
