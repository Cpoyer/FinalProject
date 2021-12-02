import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Project5Final here.
 *
 * @author Cpoyer
 * @version 2021
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
        study.setStory("You enter the study, noticing a book on the table.\nYou start reading.\nHow many pages do you read?\nYou can select one, two, or three pages");
        
        StoryPath study1 = new StoryPath("One");
        study.setStory("You decide to read one page.\nIt's quite boring, and the plot doesn't make much sense.\nYou are so bored, you decide to leave the mansion and don't look back.");
        StoryPath study2 = new StoryPath("Two");
        study.setStory("You decide to read two pages.\nThe first page is a gripping narrative, but as you turn the second page, you notice that the rest of the book is blank.\n Angry, you throw the book away and leave the room.\nStill upset, you decide to leave the mansion.");
        StoryPath study3 = new StoryPath("Three");
        study.setStory("You decide to read three pages.\nThe first page is the start of a thrilling horror story.\nThe second page is even scarier, putting you on the edge of your seat.\nSuddenly fearful, you hesitate to flip to the third page...");
        
        StoryPath basement = new StoryPath("Basement");
        basement.setStory("You stumble into the basement, seeing nothing in the dark.\nYou can either reach to your right (1), or your left (2).\nWhat direction to you reach towards?");

        StoryPath basement1 = new StoryPath("Right");
        basement1.setStory("You reach to your right, brushing against a cobweb in the shadows.\nYou start to freak out, as you are afraid of spiders.");
        StoryPath basement2 = new StoryPath("Left");
        basement.setStory("You reach to your left, bumping into a light switch.\nYou turn on the light, illuminating the dark.\nYou find yourself in a dusty wine cellar.\nYou decide to take several of the bottles, selling them on Ebay later."); 

        StoryPath kitchen = new StoryPath("Kitchen");
        kitchen.setStory("You walk into the old kitchen, finding yourself very hungry.\nYou decide to make yourself a snack with what's available.\nYou can make a sandwich (1), some soup (2), or some cereal (3).\nWhat do you make?");

        StoryPath kitchen1 = new StoryPath("Sandwich");
        kitchen1.setStory("You start to make yourself a peanut butter and jelly sandwich.\nHowever, you fail to see that the bread you use is moldy.\nFifteen minutes later, you die due to accute food poisoning.");
        StoryPath kitchen2 = new StoryPath("Soup");
        kitchen2.setStory("You reheat some tomato soup you find in a cabinet.\nYou wish that the soup was chicken noodle.\nBut free food is free food, so you don't complain.\nAll in all, you enjoy your meal.");
        StoryPath kitchen3 = new StoryPath("Cereal");
        kitchen3.setStory("You find a box of raisin bran in the cabinet.\nSearching around, however, you fail to find any milk.\nYou decide to rough it and eat the cereal plain.\nAfter breaking your teeth on the stale bran, you regret your decision.");
        
        stories.add(study);
        stories.add(basement);
        stories.add(kitchen);

        study.setBranch(study1);
        study.setBranch(study2);
        study.setBranch(study3);
        
        basement.setBranch(basement1);
        basement.setBranch(basement2);
    
        kitchen.setBranch(kitchen1);
        kitchen.setBranch(kitchen2);
        kitchen.setBranch(kitchen3);
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
