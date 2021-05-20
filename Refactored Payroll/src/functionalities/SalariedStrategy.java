package functionalities;

import java.util.ArrayList;
import employee.Salaried;
import java.util.Scanner;

public class SalariedStrategy implements Strategy
{
    private ArrayList<Salaried> salarieds = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    private Salaried salaried_employee;
    private String name,address,paymentmethod,sindicate_controll;
    private double salary,union_fee,service;
    private int is_sindicate,sindicate_id,index_out,change_controll; 

    public SalariedStrategy()
    {
        
    }
    
    public ArrayList<Salaried> getEmployee() 
    {
        return salarieds;
    }
    private int SearchEmployee(int id)
    {
        int index,index_in = -1;
        for(index = 0;index < salarieds.size();index++)
        {
            salaried_employee = salarieds.get(index);
            if(salaried_employee.getId() == id)
            {
                index_in = index;
                break;
            }
        }
        return index_in;
    }

    public void Register_employee(int id)
    {
        System.out.printf("Enter the employer's name: ");
        name = input.nextLine();
        System.out.printf("Enter the employer's address: ");
        address = input.nextLine();
        System.out.println("Enter the employer's payment method: ");
        System.out.println("    -> mail");
        System.out.println("    -> in hands");
        System.out.println("    -> bank acount");
        System.out.printf("Payment method: ");
        paymentmethod = input.nextLine();
        System.out.printf("Enter the employer's FIXED VALUE of salary: ");
        salary = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    -> yes");
        System.out.println("    -> no");
        sindicate_controll = input.nextLine();
        if(sindicate_controll.equals("yes"))
        {
            is_sindicate = 1;
            sindicate_id = (id+24);
            System.out.printf("Enter the monthly union fee value: ");
            union_fee = input.nextDouble();
            input.nextLine();
        }
        else
        {
            is_sindicate = 0;
            sindicate_id = -1;
            union_fee = 0;
        }
        salaried_employee = new Salaried(name,address,"Salaried",paymentmethod,"monthly friday",id,sindicate_id,is_sindicate,union_fee,salary);
        salarieds.add(salaried_employee);
        System.out.println("employee Salaried with id = "+id+" added to the system!!");
    }
    public void Remove_employee(int id) 
    {
        index_out = SearchEmployee(id);
        if(index_out != -1)
        {
            salarieds.remove(index_out);
            System.out.println("Employee removed!!");
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    public void Change_employee(int id)
    {
        while(true)
        {
            System.out.println("=== What do you want to change: ===");
            System.out.println("    (1) Name");
            System.out.println("    (2) Address");
            System.out.println("    (3) Payment method");
            System.out.println("    (4) Associate employee to union");
            System.out.println("    (5) Disassociate employee from the union");
            System.out.println("    (6) Union ID");
            System.out.println("    (7) Union fee value");
            do 
            {
                System.out.println("===  Enter a valid task  ===");
                change_controll = input.nextInt();
                System.out.println();
            }while(change_controll < 1 || change_controll > 7);
            input.nextLine();

            if(change_controll == 1)
            {
                System.out.println("Enter the new name: ");
                name = input.nextLine();
                index_out = SearchEmployee(id);
                if(index_out != -1)
                {
                    salaried_employee = salarieds.get(index_out);
                    salaried_employee.setName(name);
                    salarieds.remove(index_out);
                    salarieds.add(index_out,salaried_employee);
                }
                else
                {
                    System.out.println("Employee not found!!");
                }
                break;
            }
            else if(change_controll == 2)
            {
                System.out.println("Enter the new address: ");
                address = input.nextLine();
                index_out = SearchEmployee(id);
                if(index_out != 1)
                {
                    salaried_employee = salarieds.get(index_out);
                    salaried_employee.setAddress(address);
                    salarieds.remove(index_out);
                    salarieds.add(index_out,salaried_employee);
                }
                else
                {
                    System.out.println("Employee not found!!");
                }
                break;
            }
            else if(change_controll == 3)
            {
                System.out.println("Enter the new payment method: ");
                System.out.println("    -> mail");
                System.out.println("    -> in hands");
                System.out.println("    -> bank acount");
                paymentmethod = input.nextLine();
                index_out = SearchEmployee(id);
                if(index_out != -1)
                {
                    salaried_employee = salarieds.get(index_out);
                    salaried_employee.setPaymentmethod(paymentmethod);
                    salarieds.remove(index_out);
                    salarieds.add(index_out,salaried_employee);
                }
                else
                {
                    System.out.println("Employee not found!!");
                }
                break;
            }
            else if(change_controll == 4)
            {
                index_out = SearchEmployee(id);
                if(index_out != -1)
                {
                    salaried_employee = salarieds.get(index_out);
                    if(salaried_employee.getIs_sindicate() == 0)
                    {
                        salaried_employee.setIs_sindicate(1);
                        salarieds.remove(index_out);
                        salarieds.add(index_out,salaried_employee);
                    }
                    else
                    {
                        System.out.println("Employee is already part of the union!!");
                    }
                }
                else
                {
                    System.out.println("Employee not found!!");
                }
                break;
            }
            else if(change_controll == 5)
            {
                index_out =SearchEmployee(id);
                if(index_out != -1)
                {
                    salaried_employee = salarieds.get(index_out);
                    if(salaried_employee.getIs_sindicate() == 1)
                    {
                        salaried_employee.setIs_sindicate(0);
                        salarieds.remove(index_out);
                        salarieds.add(index_out,salaried_employee);
                    }
                    else
                    {
                        System.out.println("employee is already out of the the union!!");
                    }
                }
                else
                {
                    System.out.println("Employee not found!!");
                }
                break;
            }
            else if(change_controll == 6)
            {
                index_out = SearchEmployee(id);
                if(index_out != -1)
                {
                    salaried_employee = salarieds.get(index_out);
                    if(salaried_employee.getSindicate_id() != -1)
                    {
                        salaried_employee.setSindicate_id(salaried_employee.getSindicate_id()+7);
                        salarieds.remove(index_out);
                        salarieds.add(index_out,salaried_employee);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                else
                {
                    System.out.println("Employee not found!!");
                }
                break;
            }
            else if(change_controll == 7)
            {
                index_out = SearchEmployee(id);
                if(index_out != -1)
                {
                    salaried_employee = salarieds.get(index_out);
                    if(salaried_employee.getIs_sindicate() == 1)
                    {
                        System.out.printf("Enter the new union fee value: ");
                        union_fee = input.nextDouble();
                        input.nextLine();
                        salaried_employee.setUnion_fee(union_fee);
                        salarieds.remove(index_out);
                        salarieds.add(index_out,salaried_employee);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                else
                {
                    System.out.println("Employee note found!!");
                }
                break;
            }
        }
    }
    public void Add_service(int id)
    {
        System.out.printf("Enter the service fee value: ");
        service = input.nextDouble();
        input.nextLine();
        index_out = SearchEmployee(id);
        if(index_out != -1)
        {
            salaried_employee = salarieds.get(index_out);
            if(salaried_employee.getIs_sindicate() == 1)
            {
                salaried_employee.setService(service);
                salarieds.remove(index_out);
                salarieds.add(index_out,salaried_employee);
                System.out.println("Successful service fee attribution!!");  
            }
            else
            {
                System.out.println("Cant aply service fee to this employee!!");
            }  
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    public void Add_sale(int id,int day)
    {
        System.out.println("Invalid employee type!!");
    }
    public void Add_timecard(int id,int day)
    {
        System.out.println("Invalid employee type!!");
    }  
}
