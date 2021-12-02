import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Project5Final here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project5Final
{

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("You find yourself outside of a spooky mansion!");
        System.out.println("You enter the mansion and see three paths.");
        System.out.println("You can enter one of three paths.");

        ArrayList<StoryPath> stories = new ArrayList<StoryPath>();
        StoryPath study = new StoryPath("Study");
        study.setStory("You start reading, failing to notice a ghost appearing behind you.");
        study.setStory("How many pages do you read?");
        study.setStory("You can select 1, 2, or 3 pages");

        StoryPath basement = new StoryPath("Basement");
        basement.setStory("You stumble into the basement, seeing nothing in the dark.\nYou can either reach to your right (1), or your left (2).\nWhat direction to you reach towards?");

        StoryPath basement1 = new StoryPath("Right");
        basement1.setStory("You reach to your right, brushing against a cobweb in the shadows. \nYou start to freak out, as you are afraid of spiders.");
        StoryPath basement2 = new StoryPath("Left");
        basement.setStory("You reach to your left, bumping into a light switch.\nYou turn on the light, illuminating the dark.\nYou find yourself in a dusty wine cellar.\nYou decide to take several of the bottles, selling them on Ebay later."); 

        StoryPath kitchen = new StoryPath("Kitchen");
        kitchen.setStory("You walk into the old kitchen, finding yourself very hungry.");
        kitchen.setStory("You decide to make yourself a snack with what,s available.");
        kitchen.setStory("You can make a sandwich, some soup, or some cereal.");
        kitchen.setStory("What do you make?");

        stories.add(study);
        stories.add(basement);
        stories.add(kitchen);

        basement.setBranch(basement1);
        basement.setBranch(basement2);
        for(int i = 0; i < stories.size(); i++) {
            System.out.print(i + 1 + " ");
            System.out.println(stories.get(i).getPath());
        }
        System.out.println("Where would you like to go?");

        System.out.println("Enter a number between 1 and 3:");
        int choice1;
        while(true) {
            choice1 = scnr.nextInt();
            try{
                StoryPath chosen = stories.get(choice1-1);
                System.out.println(chosen.getStory());
                stories = chosen.getBranch();
                for(int i = 0; i < stories.size(); i++) {
                    System.out.print(i + 1 + " ");
                    System.out.println(stories.get(i).getPath());
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Try Again!");
            }
        }
    }
}
