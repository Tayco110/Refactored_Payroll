package functionalities;

import employee.Hourly;
import employee.Salaried;
import employee.Commissioned;
import schedule.Schedule;
import schedule.Day;
import java.util.ArrayList;
import java.util.Scanner;

public class Functionalities_Schedule {
    private int index,index_employee,index_to_hour,day_count = 0,finded = 0,finded_e = 0;
    private double salary = 0,extra = 0,liquid_salary = 0;
    private String current_schedule;
    private Scanner input = new Scanner(System.in);
    private Commissioned commissioned;
    private Salaried salaried;
    private Hourly hourly;
    private Day current_day;
    
    //constructor method
    public Functionalities_Schedule(){

    }

    ///CREATE SCHEDULE METHOD///
    public void create_schedule(Schedule schedule,String type,String day) 
    {
        if(type.equals("monthly"))
        {
            schedule.setSchedules("monthly "+day);
                
            for(index = 1;index<=31;index++)
            {   
                if(schedule.getJanuary_day(index).equals(day))
                {
                    if((index + 7)>31)
                    {
                        schedule.setSchedule_January(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=28;index++)
            {
                if(schedule.getFerbruary_day(index).equals(day))
                {
                    if((index + 7) > 28)
                    {
                        schedule.setSchedule_Ferbruary(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMarch_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_March(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getApril_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_April(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMay_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_May(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getJune_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_June(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJuly_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_July(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getAugust_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_August(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getSeptember_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_September(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getOctober_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_October(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getNovember_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_November(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getDecember_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_December(index, "monthly "+day);
                        break;
                    }
                }
            }
        }
        else if(type.equals("biweekly"))
        {
            schedule.setSchedules("biweekly "+day);
            
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJanuary_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_January(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=28;index++)
            {
                if(schedule.getFerbruary_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_Ferbruary(index, "biweekly "+day);
                        day_count = 0;
                    }
                }

            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMarch_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_March(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getApril_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_April(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMay_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_May(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getJune_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_June(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJuly_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_July(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getAugust_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_August(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getSeptember_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_September(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getOctober_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_October(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getNovember_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_November(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getDecember_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_December(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
        }
        else if(type.equals("weekly"))
        {
            schedule.setSchedules("weekly "+day);
            
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJanuary_day(index).equals(day))
                {
                    schedule.setSchedule_January(index,"weekly "+day);
                }
            }
            for(index = 1;index<=28;index++)
            {
                if(schedule.getFerbruary_day(index).equals(day))
                {
                    schedule.setSchedule_Ferbruary(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMarch_day(index).equals(day))
                {
                    schedule.setSchedule_March(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getApril_day(index).equals(day))
                {
                    schedule.setSchedule_April(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMay_day(index).equals(day))
                {
                    schedule.setSchedule_May(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getJune_day(index).equals(day))
                {
                    schedule.setSchedule_June(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJuly_day(index).equals(day))
                {
                    schedule.setSchedule_July(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getAugust_day(index).equals(day))
                {
                    schedule.setSchedule_August(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getSeptember_day(index).equals(day))
                {
                    schedule.setSchedule_September(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getOctober_day(index).equals(day))
                {
                    schedule.setSchedule_October(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getNovember_day(index).equals(day))
                {
                    schedule.setSchedule_November(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getDecember_day(index).equals(day))
                {
                    schedule.setSchedule_December(index,"weekly "+day);
                }
            }
        }    
    }
    //END CREATE SCHEDULE METHOD///
    ///SCHEDULE MENU///
    public void show_current_schedules(Schedule schedule) //print all the existing schedules 
    {
        for(index = 0;index<schedule.schedules.size();index++)
        {
            current_schedule = schedule.schedules.get(index);
            System.out.println("    -> "+current_schedule);
        }
    }
    //if the schedule exists, will be applied to a parameterized employee. parameters defined in the Main func
    public void change_Salaried_schedule(ArrayList<Salaried> salarieds,Schedule schedule,int id) 
    {
        System.out.println("Enter with an valid schedule(type and day): ");
        current_schedule = input.nextLine();
        for(index=0;index<schedule.schedules.size();index++)
        {
            if(schedule.schedules.get(index).equals(current_schedule))
            {
                finded = 1;
            }
        }
        if(finded == 1)
        {
            for(index=0;index<salarieds.size();index++)
            {
                salaried = salarieds.get(index);
                if(salaried.getId() == id)
                {
                    salaried.setSchedule(current_schedule);
                    salarieds.remove(index);
                    salarieds.add(index,salaried);
                    System.out.println("New schedule successfully applied!!");
                    finded_e = 1;
                }
            }
            if(finded_e != 1)
            {
                System.out.println("Employee not found!!");
            }
        }
        else
        {
            System.out.println("The typed schedule does not exist!!");
        }
        finded = 0;
        finded_e = 0;
    }
    public void change_Commissioned_schedule(ArrayList<Commissioned> commissioneds,Schedule schedule,int id) 
    {
        System.out.println("Enter with an valid schedule(type and day): ");
        current_schedule = input.nextLine();
        for(index=0;index<schedule.schedules.size();index++)
        {
            if(schedule.schedules.get(index).equals(current_schedule))
            {
                finded = 1;
            }
        }
        if(finded == 1)
        {
            for(index=0;index<commissioneds.size();index++)
            {
                commissioned = commissioneds.get(index);
                if(commissioned.getId() == id)
                {
                    commissioned.setSchedule(current_schedule);
                    commissioneds.remove(index);
                    commissioneds.add(index,commissioned);
                    System.out.println("New schedule successfully applied!!");
                    finded_e = 1;
                }
            }
            if(finded_e != 1)
            {
                System.out.println("Employee not found!!");
            }
        }
        else
        {
            System.out.println("The typed schedule does not exist!!");
        }
        finded = 0;
        finded_e = 0;
    }
    public void change_Hourly_schedule(ArrayList<Hourly> hourlies,Schedule schedule,int id) 
    {
        System.out.println("Enter with an valid schedule(type and day): ");
        current_schedule = input.nextLine();
        for(index=0;index<schedule.schedules.size();index++)
        {
            if(schedule.schedules.get(index).equals(current_schedule))
            {
                finded = 1;
            }
        }
        if(finded == 1)
        {
            for(index=0;index<hourlies.size();index++)
            {
                hourly = hourlies.get(index);
                if(hourly.getId() == id)
                {
                    hourly.setSchedule(current_schedule);
                    hourlies.remove(index);
                    hourlies.add(index, hourly);
                    System.out.println("New schedule successfully applied!!");
                    finded_e = 1;
                }
            }
            if(finded_e != 1)
            {
                System.out.println("Employee not found!!");
            }
        }
        else
        {
            System.out.println("The typed schedule does not exist!!");
        }
        finded = 0;
        finded_e = 0;
    }
    ///END SCHEDULE MENU///
    ///PAYMENT METHOD///
    //find in the current day all the schdules and all the employees who needs to be paid in the correspondent schedule
    public void Payment(ArrayList<Hourly> hourlies,ArrayList<Commissioned> commissioneds,ArrayList<Salaried> salarieds,Schedule schedule,int day,int month) 
    {
        if(month == 1)
        {
            current_day = schedule.January[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 2)
        {
            current_day = schedule.Ferbruary[day-1];
            
            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 3)
        {
            current_day = schedule.March[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 4)
        {
            current_day = schedule.April[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 5)
        {
            current_day = schedule.May[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 6)
        {
            current_day = schedule.June[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 7)
        {
            current_day = schedule.July[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 8)
        {
            current_day = schedule.August[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 9)
        {
            current_day = schedule.September[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 10)
        {
            current_day = schedule.October[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 11)
        {
            current_day = schedule.November[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
        else if(month == 12)
        {
            current_day = schedule.December[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        if(salaried.getSchedule().contains("monthly"))
                        {
                            salary = (salaried.getSalary()-salaried.getService()-salaried.getUnion_fee());
                            liquid_salary = salaried.getSalary();
                        }
                        else if(salaried.getSchedule().contains("biweekly"))
                        {
                            salary = (((salaried.getSalary()/2)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/2);
                        }
                        else if(salaried.getSchedule().contains("weekly"))
                        {
                            salary = (((salaried.getSalary()/4)-salaried.getService()-salaried.getUnion_fee()));
                            liquid_salary = (salaried.getSalary()/4);
                        }
                        System.out.println("Name: "+salaried.getName());
                        System.out.println("Type: "+salaried.getType());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Address: "+salaried.getAddress());
                        System.out.println("Payment method: "+salaried.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Service fee: -"+salaried.getService());
                        System.out.println("Union fee:   -"+salaried.getUnion_fee());
                        System.out.printf("Total =        "+salary);
                        System.out.println();
                        salary = 0;
                        liquid_salary = 0;
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            salary += ((hourly.getWorkedours(index_to_hour)/60)*hourly.getSalaryperhour());
                            hourly.setWorkedours(0, index_to_hour);
                            extra += ((hourly.getExtra_hour(index_to_hour)/60)*(hourly.getSalaryperhour()*1.5));
                            hourly.setExtra_hour(0,index_to_hour);
                        }
                        System.out.println("Name: "+hourly.getName());
                        System.out.println("Type: "+hourly.getType());
                        System.out.println("ID: "+hourly.getId());
                        System.out.println("Address: "+hourly.getAddress());
                        System.out.println("Payment method: "+hourly.getPaymentmethod());
                        System.out.println("Salary:       "+salary);
                        System.out.println("Extra:        "+extra);
                        System.out.println("Service fee: -"+hourly.getService());
                        System.out.println("Union fee:   -"+hourly.getUnion_fee());
                        System.out.println("Total =       "+((salary+extra)-hourly.getService()-hourly.getUnion_fee()));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                    }
                }
                for(index_employee = 0;index_employee<commissioneds.size();index_employee++)
                {
                    commissioned = commissioneds.get(index_employee);
                    if(commissioned.getSchedule().equals(current_schedule))
                    {
                        for(index_to_hour=1;index_to_hour<=day;index_to_hour++)
                        {
                            extra += (commissioned.getSales(index_to_hour)*(commissioned.getCommission()/100));
                            commissioned.setSales(0, index_to_hour);
                        }
                        if(commissioned.getSchedule().contains("monthly"))
                        {
                            salary = (commissioned.getSalary()-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = commissioned.getSalary();
                        }
                        else if(commissioned.getSchedule().contains("biweekly"))
                        {
                            salary = ((commissioned.getSalary()/2)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/2);
                        }
                        else if(commissioned.getSchedule().contains("weekly"))
                        {
                            salary = ((commissioned.getSalary()/4)-commissioned.getUnion_fee()-commissioned.getService());
                            liquid_salary = (commissioned.getSalary()/4);
                        }
                        System.out.println("Name: "+commissioned.getName());
                        System.out.println("Type: "+commissioned.getType());
                        System.out.println("ID: "+commissioned.getId());
                        System.out.println("Address: "+commissioned.getAddress());
                        System.out.println("Payment method: "+commissioned.getPaymentmethod());
                        System.out.println("Salary:       "+liquid_salary);
                        System.out.println("Commission:   "+extra);
                        System.out.println("Service fee: -"+commissioned.getService());
                        System.out.println("Union fee:   -"+commissioned.getUnion_fee());
                        System.out.println("Total =      "+(salary+extra));
                        System.out.println();
                        salary = 0;
                        extra = 0;
                        liquid_salary = 0;
                    }
                }
            }
        }
    }
    ///END PAYMENT METHOD///
}
