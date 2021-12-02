import java.util.ArrayList;
/**
 * Write a description of class StoryPath here.
 *
 * @author Cpoyer
 * @version 2021
 */
public class StoryPath
{
    //instance variables
    //everything I need to build this story
    private String path;
    private ArrayList<StoryPath> branch;
    private String story;
    //basic StoryPath that is going to be called and overwritten
    public StoryPath(String n)
    {
        this.path = n;
        this.branch = new ArrayList<StoryPath>();
        
    }
    //gets the story that is written in main code
    public String getStory()
    {
        return this.story;
    }
    //sets the story -- changes due to user input
    public void setStory(String n)
    {
        this.story = n;
    }
    //adds the branching path to the story path
    public ArrayList<StoryPath> getBranch()
    {
        return this.branch;
    }
    //sets the branch every time it changes
    public void setBranch(StoryPath branch)
    {
        this.branch.add(branch);
    }
    //gets the initial story path
    public String getPath()
    {
        return this.path;
    }
    //sets the initial story path
    public void setPath(String n)
    {
        this.path = n;
    }
    }
