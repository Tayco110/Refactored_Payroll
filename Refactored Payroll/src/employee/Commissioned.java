package employee;

public class Commissioned extends Employee {
    
    private double salary,commission;
    private int index = 0;
    private Sale sales[] = new Sale[31];

    public Commissioned(String name,String address,String type,String paymentmethod,String schedule,int id,int sindicate_id,int is_sindicate,double union_fee,double salary,double commission)
    {
        super(name,address,type,paymentmethod,schedule,id,sindicate_id,is_sindicate,union_fee);
        setSalary(salary);
        setCommission(commission);
        set_sales_of_the_day(sales);
    }

    public double getCommission() 
    {
        return commission;
    }
    public void setCommission(double commission) 
    {
        this.commission = commission;
    }
    public double getSalary() 
    {
        return salary;
    }
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    public void setSales(double sale_value,int day)
    {
        sales[day-1].setSales_of_the_day(sale_value);
    }
    public Double getSales(int day) 
    {
        return sales[day-1].getSales_of_the_day();
    }
    private void set_sales_of_the_day(Sale sales[])
    {
        for(index = 0;index<31;index++)
        {
            sales[index] = new Sale();
        }
    }
}
