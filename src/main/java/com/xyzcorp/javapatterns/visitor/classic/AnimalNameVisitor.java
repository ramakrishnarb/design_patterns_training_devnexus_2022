package com.xyzcorp.javapatterns.visitor.classic;

/**
 * @author John Ericksen
 */
public class AnimalNameVisitor implements AnimalVisitor {
    public void visit(Lion lion) {
        System.out.println("Lion");
    }

    public void visit(Elephant elephant) {
        System.out.println("Elephant");
    }

    public void visit(Zebra zebra) {
        System.out.println("Zebra");
    }

    public void visit(Bear bear) {
        System.out.println("Bear");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Monkey");
    }
}
