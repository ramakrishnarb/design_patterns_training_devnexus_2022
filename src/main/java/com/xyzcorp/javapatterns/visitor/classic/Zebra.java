package com.xyzcorp.javapatterns.visitor.classic;

/**
 * @author John Ericksen
 */
public class Zebra implements Animal {

    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void feed(Hay hay) {
        System.out.println("Chomp Chomp");
    }
}
