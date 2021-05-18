package employee;

public abstract class Employee {
    
    private String name,address,type,paymentmethod,schedule;
    private int id,sindicate_id,is_sindicate;
    private double union_fee, service;
    
    //constructor method
    public Employee(String name, String address, String type,String paymentmethod,String schedule,int id,int sindicate_id,int is_sindicate,double union_fee)
    {
        setName(name);
        setAddress(address);
        setType(type);
        setPaymentmethod(paymentmethod);
        setSchedule(schedule);
        setId(id);
        setSindicate_id(sindicate_id);
        setIs_sindicate(is_sindicate);
        setUnion_fee(union_fee);
        this.service = 0;        
    }

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public String getType() 
    {
        return type;
    }
    public void setType(String type) 
    {
        this.type = type;
    }
    public String getPaymentmethod() 
    {
        return paymentmethod;
    }
    public void setPaymentmethod(String paymentmethod) 
    {
        this.paymentmethod = paymentmethod;
    }
    public String getSchedule() 
    {
        return schedule;
    }
    public void setSchedule(String schedule) 
    {
        this.schedule = schedule;
    }
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public int getSindicate_id() 
    {
        return sindicate_id;
    }
    public void setSindicate_id(int sindicate_id) 
    {
        this.sindicate_id = sindicate_id;
    }
    public int getIs_sindicate() 
    {
        return is_sindicate;
    }
    public void setIs_sindicate(int is_sindicate) 
    {
        this.is_sindicate = is_sindicate;
    }
    public double getUnion_fee() 
    {
        return union_fee;
    }
    public void setUnion_fee(double union_fee) 
    {
        this.union_fee = union_fee;
    }
    public double getService() 
    {
        return service;
    }
    public void setService(double service) 
    {
        this.service += service;
    }
}
