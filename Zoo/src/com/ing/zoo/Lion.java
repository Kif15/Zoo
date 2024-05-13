package com.ing.zoo;

/**
 * This class represents Lions
 */
public class Lion extends Carnivore {

    public Lion(String name)
    {
        super(name);
        super.helloText = "roooaoaaaaar";
        super.eatText = "nomnomnom thx mate";
    }

    /**
     * This method prints text when a Lion says hello
     */
    @Override
    public void sayHello()
    {
        System.out.println(helloText);
    }

    /**
     * @author Kifleyesus Musgun
     *
     * This method prints when a lion eats
     */
    @Override
    public void eatMeat()
    {
        System.out.println(eatText);
    }
}
