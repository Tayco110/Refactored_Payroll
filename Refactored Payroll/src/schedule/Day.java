package schedule;

import java.util.ArrayList;

public class Day {
    
    private String name;
    public ArrayList<String> schedules_of_the_day = new ArrayList<>();

    public Day(int day_controll){
        if(day_controll == 1)
        {
            setName("sunday");
        }
        else if(day_controll == 2)
        {
            setName("monday");
        }
        else if(day_controll == 3)
        {
            setName("tuesday");
        }
        else if(day_controll == 4)
        {
            setName("wednesday");
        }
        else if(day_controll == 5)
        {
            setName("thursday");
        }
        else if(day_controll == 6)
        {
            setName("friday");
        }
        else if(day_controll == 7)
        {
            setName("saturday");
        }
    }

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public ArrayList<String> getSchedules() 
    {
        return schedules_of_the_day;
    }
    public void setSchedules(String schedule) 
    {
        schedules_of_the_day.add(schedule);
    }
}
