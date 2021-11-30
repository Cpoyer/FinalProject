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

        } else if(choice1.equals("Basement")) {

        } else if(choice1.equals("Kitchen")) {

        } else {
            throw new InvalidChoiceException("Select again!");
        }
    }
    public void studyStory() {
        System.out.println("You see a table with a book, a candle, and a knife on it.");
        System.out.println("What do you touch?");
        String studyChoice = scnr.nextLine();
        if(studyChoice.equals("Book")) {
            System.out.println("You start reading, failing to notice a ghost appearing behind you.");
        }
    }
    public void basementStory() {
        
    }
    public void kitchenStory() {
        
    }
}
