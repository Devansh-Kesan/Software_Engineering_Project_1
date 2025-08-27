package org.example;

import java.util.Scanner;

/**
 * Main class
 * Asks user for a shape type and then draws the shape.
 */

public class ShapeDrawer {

    /**
     * The main entry point.
     * @param args command-line arguments.
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int choice;

        System.out.println("== Shape Drawer ===");
        System.out.println("Choose a shape to draw:");
        System.out.println("0. Circle");
        System.out.println("1. Rectangle");
        System.out.println("2. Traingle");
        System.out.print("Enter choice: ");

        choice = sc.nextInt();

        final Shape shape;
        if (choice == 0) {
            shape = new Circle();
        } else if (choice == 1) {
            shape = new Rectangle();
        } else if (choice == 2) {
            shape = new Triangle();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        shape.draw();
        sc.close();


    }
}