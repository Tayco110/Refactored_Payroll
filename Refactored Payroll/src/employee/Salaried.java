package employee;

public class Salaried extends Employee {

    private double salary;

    public Salaried(String name, String address, String type,String paymentmethod,String schedule,int id,int sindicate_id,int is_sindicate,double union_fee,double salary)
    {
        super(name, address, type,paymentmethod,schedule,id,sindicate_id,is_sindicate,union_fee);
        setSalary(salary);
    }

    public double getSalary() 
    {
        return salary;
    }
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    
}
