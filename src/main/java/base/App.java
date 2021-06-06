/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.util.Scanner;

/*
Example Output

How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.

Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and calculate how many full pizzas you need to purchase.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int people = numOfPeople();
        int pizza = numOfPizza();
        int slices = numOfSlices();
        int totalSlices = numOfTotalSlices(people, pizza);
        int slicesPerPerson = numOfSlicesPerPerson(people, totalSlices);
        int leftovers = numOfLeftovers(people, slicesPerPerson, totalSlices);
    }

    private static int numOfLeftovers(int people, int slicesPerPerson, int totalSlices) {
        int leftovers = totalSlices - (people * slicesPerPerson);
        System.out.print("There are " + leftovers + " leftover pieces.");
        return 0;
    }

    private static int numOfSlicesPerPerson(int people, int totalSlices) {
        int slicesPerPerson = totalSlices/people;
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        return slicesPerPerson;
    }

    private static int numOfTotalSlices(int people, int pizza) {
        int total = people * pizza;
        System.out.println(String.format("%d people with %d pizzas (%d slices)", people, pizza, total));
        return total;
    }

    private static int numOfSlices() {
        System.out.print("How many slices per pizza? ");
        return in.nextInt();
    }

    private static int numOfPizza() {
        System.out.print("How many pizzas do you have? ");
        return in.nextInt();
    }

    private static int numOfPeople() {
        System.out.print("How many people? ");
        return in.nextInt();
    }
}
