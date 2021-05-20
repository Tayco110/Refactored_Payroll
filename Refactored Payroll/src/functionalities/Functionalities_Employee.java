package functionalities;

import java.util.ArrayList;
import employee.Commissioned;
import employee.Hourly;
import employee.Salaried;

public class Functionalities_Employee 
{
    private Strategy salariedStrategy;
    private Strategy commissionedStrategy;
    private Strategy hourlyStrategy;

    private Strategy strategy;

    public Functionalities_Employee()
    {
        salariedStrategy = new SalariedStrategy();
        commissionedStrategy = new CommissionedStrategy();
        hourlyStrategy = new HourlyStrategy();
    }
    
    private void setStrategy(String type) 
    {
        if(type.equals("salaried"))
        {
            strategy = salariedStrategy;
        }
        else if(type.equals("commissioned"))
        {
            strategy = commissionedStrategy;
        }
        else if(type.equals("hourly"))
        {
            strategy = hourlyStrategy;
        }
        else
        {
            System.out.println("Invalid employee type!!");
        }   
    }

    public void Register_employee(String type,int id)
    {
        setStrategy(type);
        strategy.Register_employee(id);
    }
    public void Remove_employee(String type,int id) 
    {
        setStrategy(type);
        strategy.Remove_employee(id);
    }
    public void Change_employee(String type,int id)
    {
        setStrategy(type);
        strategy.Change_employee(id);
    }
    public void Add_service(String type,int id)
    {
        setStrategy(type);
        strategy.Add_service(id);
    }
    public void Add_sale(String type,int id,int day)
    {
        setStrategy(type);
        strategy.Add_sale(id,day);
    }
    public void Add_timecard(String type,int id,int day)
    {
        setStrategy(type);
        strategy.Add_timecard(id,day);
    }

    public ArrayList<Salaried> getSalarieds() 
    {
        setStrategy("salaried");
        return (ArrayList<Salaried>)strategy.getEmployee();
    }
    public ArrayList<Hourly> getHourlies()
    {
        setStrategy("hourly");
        return (ArrayList<Hourly>)strategy.getEmployee();
    }
    public ArrayList<Commissioned> getCommissioneds()
    {
        setStrategy("commissioned");
        return (ArrayList<Commissioned>)strategy.getEmployee();
    }

}
