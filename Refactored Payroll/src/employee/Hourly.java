package employee;


public class Hourly extends Employee {

    private double salaryperhour;
    private int index;
    private Timecard timecards[] = new Timecard[31];

    public Hourly(String name,String address,String type,String paymentmethod,String schedule,int id,int sindicate_id,int is_sindicate,double union_fee,double salaryperhour)
    {
        super(name,address,type,paymentmethod,schedule,id,sindicate_id,is_sindicate,union_fee);
        setSalaryperhour(salaryperhour);
        setTimecards(timecards);
    }

    public double getSalaryperhour() 
    {
        return salaryperhour;
    }
    public void setSalaryperhour(double salaryperhour) 
    {
        this.salaryperhour = salaryperhour;
    }
    public Timecard getTimecards(int day) 
    {
        return timecards[day-1];
    }
    
    public void setTimecards_in(int hour,int min,int day) 
    {
        timecards[day-1].setIn_hour(hour);
        timecards[day-1].setIn_min(min);
    }
    public void setTimecards_out(int hour,int min,int day) 
    {
        timecards[day-1].setOut_hour(hour);
        timecards[day-1].setOut_min(min);
    }
    private void setTimecards(Timecard timecards[]) 
    {
        for(index=0;index<31;index++)
        {
            timecards[index] = new Timecard();
        }        
    }
    public int getIn_hour(int day) 
    {
        return timecards[day-1].getIn_hour();
    }
    public int getIn_min(int day) 
    {
        return timecards[day-1].getIn_min();
    }
    public int getOut_hour(int day) 
    {
        return timecards[day-1].getOut_hour();
    }
    public int getOut_min(int day) 
    {
        return timecards[day-1].getOut_min();
    }
    public void setWorkedours(int workedours,int day)
    {
        timecards[day-1].setWorkedours(workedours);
    }
    public int getWorkedours(int day) 
    {
        return timecards[day-1].getWorkedours();    
    }
    public int getExtra_hour(int day) 
    {
        return timecards[day-1].getExtra_hour();
    }
    public void setExtra_hour(int extra_hour,int day) 
    {
        timecards[day-1].setExtra_hour(extra_hour);    
    }
    
}
