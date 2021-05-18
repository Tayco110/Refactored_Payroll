package functionalities;
import java.util.ArrayList;

import employee.Commissioned;
import employee.Hourly;
import employee.Salaried;

public class Functionalities_Employee 
{
    public State salariedState;
    public State commissionedState;
    public State hourlyState;

    State state;

    public Functionalities_Employee()
    {
        salariedState = new SalariedState();
        commissionedState = new CommissionedState();
        hourlyState = new HourlyState();
    }

    private void setState(String type) 
    {
        if(type.equals("salaried"))
        {
            state = salariedState;
        }
        else if(type.equals("commissioned"))
        {
            state = commissionedState;
        }
        else if(type.equals("hourly"))
        {
            state = hourlyState;
        }
        else
        {
            System.out.println("Invalid employee type!!");
        }   
    }

    public void Register_employee(String type,int id)
    {
        setState(type);
        state.Register_employee(id);
    }
    public void Remove_employee(String type,int id) 
    {
        setState(type);
        state.Remove_employee(id);
    }
    public void Change_employee(String type,int id)
    {
        setState(type);
        state.Change_employee(id);
    }
    public void Add_service(String type,int id)
    {
        setState(type);
        state.Add_service(id);
    }
    public void Add_sale(String type,int id,int day)
    {
        setState(type);
        state.Add_sale(id,day);
    }
    public void Add_timecard(String type,int id,int day)
    {
        setState(type);
        state.Add_timecard(id,day);
    }

    public ArrayList<Salaried>  getSalariedsState() 
    {
        setState("salaried");
        return (ArrayList<Salaried>)state.getEmployee();
    }
    public ArrayList<Hourly> getHourlyState()
    {
        setState("hourly");
        return (ArrayList<Hourly>)state.getEmployee();
    }
    public ArrayList<Commissioned> getCommissionedState()
    {
        setState("commissioned");
        return (ArrayList<Commissioned>)state.getEmployee();
    }

}
