package com.ing.zoo;

/**
 * @author Kifleyesus Musgun:
 *
 * This class is a parent class with common Animal attributes
 */

abstract public class Animal {

     String name;
     String helloText;
     String eatText;


     public Animal(String name) {
          this.name = name;
     }


     abstract void sayHello();


}
