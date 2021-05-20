package employee;

public class Timecard {

    private int in_hour,in_min;
    private int out_hour,out_min;
    private int workedours,extra_hour;
    
    public Timecard()
    {
        setIn_hour(0);
        setIn_min(0);
        setOut_hour(0);
        setOut_min(0);
        setWorkedours(0);
        setExtra_hour(0);
    }
    
    public int getIn_hour() 
    {
        return in_hour;
    }
    public void setIn_hour(int in_hour) 
    {
        this.in_hour = in_hour;
    }
    public int getIn_min() 
    {
        return in_min;
    }
    public void setIn_min(int in_min) 
    {
        this.in_min = in_min;
    }
    public int getOut_hour() 
    {
        return out_hour;
    }
    public void setOut_hour(int out_hour) 
    {
        this.out_hour = out_hour;
    }
    public int getOut_min() 
    {
        return out_min;
    }
    public void setOut_min(int out_min) 
    {
        this.out_min = out_min;
    }
    public int getWorkedours() 
    {
        return workedours;
    }
    public void setWorkedours(int workedours) 
    {
        this.workedours = workedours;
    }
    public int getExtra_hour() 
    {
        return extra_hour;
    }
    public void setExtra_hour(int extra_hour) 
    {
        this.extra_hour = extra_hour;
    }
    
}
