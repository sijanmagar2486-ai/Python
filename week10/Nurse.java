package week7.workshop.week8.week9.week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends person
{
    private int shift;
    public String extraAllowance;
    
    public Nurse(int id,String name,int shift,String extraAllowance)
    {
        super(id,name);
        this.extraAllowance=extraAllowance;
    }
    
    public int getShift()
    {
        return shift;
    }
    
    public void setShift(int shift)
    {
        this.shift=shift;
    }
    
    public String ExtraAllowance()
    {
        return extraAllowance;
    }
    
    public void setExtraAllowance(String extraAllowance)
    {
        this.extraAllowance=extraAllowance;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Shift" +shift;
    }
}