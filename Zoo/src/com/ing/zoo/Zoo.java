package com.ing.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        ArrayList<Animal> animals = getAnimals();

        // Read the users input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        commandResponse(input, commands, animals);
    }

    private static ArrayList<Animal> getAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();

        Animal henk = new Lion("henk");
        animals.add(henk);

        Animal elsa = new Hippo("elsa");
        animals.add(elsa);

        Animal dora = new Pig("dora");
        animals.add(dora);

        Animal wally = new Tiger("wally");
        animals.add(wally);

        Animal mystic = new Elephant("mystic");
        animals.add(mystic);

        Animal hawk = new Eagle("hawk");
        animals.add(hawk);


        Animal marty = new Zebra("marty");
        animals.add(marty);
        return animals;
    }

    /**
     * This method responds to the commands given by the user.
     * @param input : user's input commands
     * @param commands : commands that trigger responds
     * @param animals : Animals that respond to the commands
     */
    private static void commandResponse(String input, String[] commands, ArrayList<Animal> animals) {
        // Split the users words by spaces
        String[] parts = input.split(" ");

        // Check if name exists
        String name = (parts.length > 1) ? parts[1] : null;

        // If no name given, concat every animals' greetings
        StringBuilder helloAll = new StringBuilder();

        // If No name is given, all animals say hello
        if(parts[0].equalsIgnoreCase(commands[0]) && name == null){
            for (Animal animal : animals) {
                helloAll.append("hello ").append(animal.name).append("\n");
            }
            System.out.println(helloAll);
        }
        // If a name of an animal is, then only that animal greets
        else if(parts[0].equalsIgnoreCase(commands[0]) ) {
            for (Animal animal : animals) {
                if (animal.name.equals(name)) {
                    animal.sayHello();
                    break;
                }
            }
        }
        // If "give leaves" is run, then all herbivores get leaves
        else if (input.equalsIgnoreCase(commands[1])) {
            for (Animal animal : animals) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();

                }
            }
        }
        // If "give meat" is run, then all carnivores get meat
        else if (input.equalsIgnoreCase(commands[2])) {
            for (Animal animal : animals) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();

                }
            }
        }
        // If "perform trick" is run, then all that can performs a trick
        else if (input.equalsIgnoreCase(commands[3])) {
            for (Animal animal: animals){

                if (animal instanceof Pig) {
                    ((Pig) animal).performTrick();
                } else if (animal instanceof Tiger) {
                    ((Tiger) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
