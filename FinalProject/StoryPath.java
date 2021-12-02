import java.util.ArrayList;
/**
 * Write a description of class StoryPath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoryPath
{
    // instance variables - replace the example below with your own
    private String path;
    private ArrayList<StoryPath> branch;
    private String story;
    public StoryPath(String n)
    {
        this.path = n;
        this.branch = new ArrayList<StoryPath>();
        
    }
    public String getStory()
    {
        return this.story;
    }
    public void setStory(String n)
    {
        this.story = n;
    }
    public ArrayList<StoryPath> getBranch()
    {
        return this.branch;
    }
    public void setBranch(StoryPath branch)
    {
        this.branch.add(branch);
    }
    public String getPath()
    {
        return this.path;
    }
    public void setPath(String n)
    {
        this.path = n;
    }
    }
