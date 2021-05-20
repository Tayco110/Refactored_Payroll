package schedule;

import java.util.ArrayList;

public class Schedule {
    
    public Day January[] = new Day[31];
    public Day Ferbruary[] = new Day[28];
    public Day March[] = new Day[31];
    public Day April[] = new Day[30];
    public Day May[] = new Day[31];
    public Day June[] = new Day[30];
    public Day July[] = new Day[31];
    public Day August[] = new Day[31];
    public Day September[] = new Day[30];
    public Day October[] = new Day[31];
    public Day November[] = new Day[30];
    public Day December[] = new Day[31];
    
    private int index,day_controll;
    public ArrayList<String> schedules = new ArrayList<>();

    public Schedule()
    {
        setJanuary(January);
        setFerbruary(Ferbruary);
        setMarch(March);
        setApril(April);
        setMay(May);
        setJune(June);
        setJuly(July);
        setAugust(August);
        setSeptember(September);
        setOctober(October);
        setNovember(November);
        setDecember(December);
    }

    public ArrayList<String> getSchedules() 
    {
        return schedules;
    }
    public void setSchedules(String schedule) 
    {
        schedules.add(schedule);    
    }

    public void setSchedule_January(int index,String schedule) 
    {
        January[index-1].setSchedules(schedule);
    }
    public void setSchedule_Ferbruary(int index,String schedule) 
    {
        Ferbruary[index-1].setSchedules(schedule);
    }
    public void setSchedule_March(int index,String schedule) 
    {
        March[index-1].setSchedules(schedule);
    }
    public void setSchedule_April(int index,String schedule) 
    {
        April[index-1].setSchedules(schedule);
    }
    public void setSchedule_May(int index,String schedule) 
    {
        May[index-1].setSchedules(schedule);
    }
    public void setSchedule_June(int index,String schedule) 
    {
        June[index-1].setSchedules(schedule);
    }
    public void setSchedule_July(int index,String schedule) 
    {
        July[index-1].setSchedules(schedule);
    }
    public void setSchedule_August(int index,String schedule) 
    {
        August[index-1].setSchedules(schedule);
    }
    public void setSchedule_September(int index,String schedule) 
    {
        September[index-1].setSchedules(schedule);
    }
    public void setSchedule_October(int index,String schedule) 
    {
        October[index-1].setSchedules(schedule);   
    }
    public void setSchedule_November(int index,String schedule) 
    {
        November[index-1].setSchedules(schedule);
    }
    public void setSchedule_December(int index,String schedule) 
    {
        December[index-1].setSchedules(schedule);
    }
    
    public String getJanuary_day(int index) 
    {
        return January[index-1].getName();
    }
    public String getFerbruary_day(int index) 
    {
        return Ferbruary[index-1].getName();
    }
    public String getMarch_day(int index) 
    {
        return March[index-1].getName();
    }
    public String getApril_day(int index) 
    {
        return April[index-1].getName();
    }
    public String getMay_day(int index) 
    {
        return May[index-1].getName();
    }
    public String getJune_day(int index) 
    {
        return June[index-1].getName();
    }
    public String getJuly_day(int index) 
    {
        return July[index-1].getName();
    }
    public String getAugust_day(int index) 
    {
        return August[index-1].getName();
    }
    public String getSeptember_day(int index) 
    {
        return September[index-1].getName();
    }
    public String getOctober_day(int index) 
    {
        return October[index-1].getName();
    }
    public String getNovember_day(int index) 
    {
        return November[index-1].getName();
    }
    public String getDecember_day(int index) 
    {
        return December[index-1].getName();
    }

    public void setJanuary(Day[] january) 
    {
        day_controll = 6;
        for(index=0;index<31;index++)
        {
            january[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setFerbruary(Day[] ferbruary) 
    {
        day_controll = 2;
        for(index=0;index<28;index++)
        {
            ferbruary[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setMarch(Day[] march) 
    {   
        day_controll = 2;
        for(index=0;index<31;index++)
        {
            march[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }    
        }
    }
    public void setApril(Day[] april) 
    {
        day_controll = 5;
        for(index=0;index<30;index++)
        {
            april[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }    
        }
    }
    public void setMay(Day[] may) 
    {
        day_controll = 7;
        for(index=0;index<31;index++)
        {
            may[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }    
        }
    }
    public void setJune(Day[] june) 
    {
        day_controll = 3;
        for(index=0;index<30;index++)
        {
            june[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setJuly(Day[] july) 
    {
        day_controll = 5;
        for(index=0;index<31;index++)
        {
            july[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setAugust(Day[] august) 
    {
        day_controll = 1;
        for(index=0;index<31;index++)
        {
            august[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setSeptember(Day[] september) 
    {
        day_controll = 4;
        for(index=0;index<30;index++)
        {
            september[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setOctober(Day[] october) 
    {
        day_controll = 6;
        for(index=0;index<31;index++)
        {
            october[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setNovember(Day[] november) 
    {
        day_controll = 2;
        for(index=0;index<30;index++)
        {
            november[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
    public void setDecember(Day[] december) 
    {
        day_controll = 4;
        for(index=0;index<31;index++)
        {
            december[index] = new Day(day_controll);
            day_controll++;
            if(day_controll > 7)
            {
                day_controll = 1;
            }
        }
    }
}
