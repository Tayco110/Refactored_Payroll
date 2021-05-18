package employee;

public class Sale {
    
    private double sales_of_the_day;
    
    public Sale(){
        this.sales_of_the_day = 0;
    }

    public void setSales_of_the_day(double sales_of_the_day) 
    {
        this.sales_of_the_day += sales_of_the_day;
    }
    public double getSales_of_the_day() 
    {
        return sales_of_the_day;
    }
}
