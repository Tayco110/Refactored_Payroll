package functionalities;

import java.util.ArrayList;

public interface Strategy 
{
    public void Register_employee(int id);
    public void Remove_employee(int id);
    public void Change_employee(int id);
    public void Add_service(int id);
    public void Add_sale(int id,int day);
    public void Add_timecard(int id,int day);
    public ArrayList getEmployee();
}
