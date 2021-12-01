import java.util.Scanner;
/**
 * Write a description of class Project5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project5
{
    // instance variables - replace the example below with your own
    Scanner scnr = new Scanner(System.in);

    public Project5() throws InvalidChoiceException {
        System.out.println("You find yourself outside of a spooky mansion!");
        System.out.println("You enter the mansion and see three paths.");
        System.out.println("You can enter the study, the basement, or the kitchen.");
        System.out.println("Where would you like to go?");
        String choice1 = scnr.nextLine();

        if(choice1.equals("Study")) {
         return studyStory;
        } else if(choice1.equals("Basement")) {
         return basementStory;
        } else if(choice1.equals("Kitchen")) {
         return kitchenStory;
        } else {
            throw new InvalidChoiceException("You died! Try again!");
        }
    }
    public void studyStory() {
        System.out.println("You see a table with a book and a candle on it.");
        System.out.println("What do you touch?");
        String studyChoice = scnr.nextLine();
        if(studyChoice.equals("Book")) {
            System.out.println("You start reading, failing to notice a ghost appearing behind you.");
            System.out.println("It spooks you!");
            //throw exception
        } else if(studyChoice.equals("Candle")) {
            System.out.println("You pick up the candle, using it to illuminate the room.");
            System.out.println("You find a really cool statue hidden in the corner.");
            
        }
    }
    public void basementStory() {
        System.out.println("You stumble into the basement, seeing nothing in the dark.");
        System.out.println("You can either reach to your right, or your left.");
        System.out.println("What direction to you reach towards?");
        String basementChoice = scnr.nextLine();
        if(basementChoice.equals("Right")) {
            System.out.println("You reach towards your right, and brush up against a cobweb!");
            System.out.println("You are deathly afraid of spiders, so you start to freak out!");
            //throw exception
        }
        if(basementChoice.equals("Left")) {
            System.out.println("You reach towards your left, bumping into a light switch.");
            System.out.println("You turn on the light, illuminating the room.");
            System.out.println("You find yourself in a slightly dusty wine celler.");
            System.out.println("You decide to take several of the bottles, selling them on Ebay and making a fortune.");
        }
    }
    public void kitchenStory() {
        System.out.println("You walk into the old kitchen, finding yourself very hungry.");
        System.out.println("You decide to make yourself a snack with what,s available.");
        System.out.println("You can make a sandwich, some soup, or some cereal.");
        System.out.println("What do you make?");
        String kitchenChoice = scnr.nextLine();
        if(kitchenChoice.equals("Sandwich")) {
            System.out.println("You start to make yourself a peanut butter and jelly sandwich.");
            System.out.println("However, you fail to see that the bread you use is moldy.");
            System.out.println("Fifteen minutes later, you die due to accute food poisoning.");
            //throw exception
        }
        if(kitchenChoice.equals("Soup")) {
            System.out.println("You reheat some tomato soup you find in a cabinet.");
            System.out.println("You wish that the soup was chicken noodle.");
            System.out.println("But free food is free food, so you don't complain.");
            System.out.println("All in all, you enjoy your meal.");
        }
        if(kitchenChoice.equals("Cereal")) {
            System.out.println("You find a box of raisin bran in the cabinet.");
            System.out.println("Searching around, however, you fail to find any milk.");
            System.out.println("You decide to rough it and eat the cereal raw.");
            System.out.println("After breaking your teeth on the stale bran, you regret your decision.");
            //throw exception
        }
    }
}
