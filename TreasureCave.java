//Jason Lu
import java.util.Scanner;

public class TreasureCave {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        // Stores the final outcome of the adventure
        String treasureFound = "nothing";

        System.out.println("Welcome to the Treasure Hunt Adventure!");
        System.out.println("You are at the entrance of a dark cave. Do you go 'left' or 'right'?");
        String choice = key.next();

        //All possible ending for left
        if (choice.equalsIgnoreCase("left")) {
            System.out.println("You reach an underground river. Do you 'swim' across or 'walk' along the bank?");
            choice = key.next();

            if (choice.equalsIgnoreCase("swim")) {
                System.out.println("The current is strong! How many seconds can you hold your breath?");
                int breathTime = key.nextInt();
                key.nextLine();
                
                // Numeric comparison: survival depends on breath-holding time
                if (breathTime >= 30) {
                    System.out.println("You swim across safely. Do you take the 'narrow' tunnel or the 'wide' tunnel?");
                    choice = key.next();

                    if (choice.equalsIgnoreCase("narrow")) {
                        treasureFound = "a hidden chest of gold";
                    } else if (choice.equalsIgnoreCase("wide")) {
                        treasureFound = "a deadly trap";
                    } else {
                        treasureFound = "lost in the tunnels";
                    }
                } else {
                    treasureFound = "drowned in the river";
                }

            } else if (choice.equalsIgnoreCase("walk")) {
                System.out.println("You walk along the river and find a small cave. Do you go 'inside' or keep 'walking'?");
                choice = key.next();

                if (choice.equalsIgnoreCase("inside")) {
                    treasureFound = "a pile of silver coins";
                } else {
                    treasureFound = "an empty dead-end";
                }

            } else {
                treasureFound = "stuck at the river until nightfall";
            }
            
            //All possible ending for right
        } else if (choice.equalsIgnoreCase("right")) {
            System.out.println("You see three doors ahead: 'red', 'blue', and 'green'. Which one do you choose?");
            choice = key.next();

            if (choice.equalsIgnoreCase("red") || choice.equalsIgnoreCase("blue")) {
                treasureFound = "an empty dusty room";
            } else if (choice.equalsIgnoreCase("green")) {
                System.out.println("You find a sleeping dragon! Do you 'sneak' or 'attack'?");
                choice = key.next();
                
                // String comparison: checks user input against words
                if (choice.equalsIgnoreCase("sneak")) {
                    treasureFound = "a rare jewel hidden behind the dragon";
                } else {
                    treasureFound = "burned by dragon fire";
                }
            }
        }

        System.out.println("Your adventure ends. You found: " + treasureFound);

    }
}
