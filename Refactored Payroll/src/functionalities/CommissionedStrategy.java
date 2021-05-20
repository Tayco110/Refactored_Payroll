package functionalities;

import java.util.ArrayList;
import employee.Commissioned;
import java.util.Scanner;

public class CommissionedStrategy implements Strategy 
{
    private ArrayList<Commissioned> commissioneds = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    private Commissioned commissioned_employee;
    private String name,address,paymentmethod,sindicate_controll;
    private double salary,union_fee,service,commission,sale_value;
    private int is_sindicate,sindicate_id,index_out,change_controll; 

    public CommissionedStrategy()
    {

    }

    public ArrayList<Commissioned> getEmployee() 
    {
        return commissioneds;
    }
    private int SearchEmployee(int id)
    {
        int index,index_in = -1;
        for(index = 0;index < commissioneds.size();index++)
        {
            commissioned_employee = commissioneds.get(index);
            if(commissioned_employee.getId() == id)
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
        System.out.printf("Enter the employer's commission: ");
        commission = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    -> yes");
        System.out.println("    -> no");
        sindicate_controll = input.nextLine();
        if(sindicate_controll.equals("yes"))
        {
            is_sindicate = 1;
            sindicate_id = (id+24);
            System.out.println("Enter the monthly union fee value: ");
            union_fee = input.nextDouble();
            input.nextLine();
        }
        else
        {
            is_sindicate = 0;
            sindicate_id = -1;
            union_fee = 0;
        }
        commissioned_employee = new Commissioned(name,address,"Commissioned",paymentmethod,"biweekly friday",id,sindicate_id,is_sindicate,union_fee,salary,commission);
        commissioneds.add(commissioned_employee);
        System.out.println("employee Commissioned with id = "+id+" added to the system!!");
    }
    public void Remove_employee(int id) 
    {
        index_out = SearchEmployee(id);
        if(index_out != -1)
        {
            commissioneds.remove(index_out);
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
                    commissioned_employee = commissioneds.get(index_out);
                    commissioned_employee.setName(name);
                    commissioneds.remove(index_out);
                    commissioneds.add(index_out,commissioned_employee);
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
                    commissioned_employee = commissioneds.get(index_out);
                    commissioned_employee.setAddress(address);
                    commissioneds.remove(index_out);
                    commissioneds.add(index_out,commissioned_employee);
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
                    commissioned_employee = commissioneds.get(index_out);
                    commissioned_employee.setPaymentmethod(paymentmethod);
                    commissioneds.remove(index_out);
                    commissioneds.add(index_out,commissioned_employee);
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
                    commissioned_employee = commissioneds.get(index_out);
                    if(commissioned_employee.getIs_sindicate() == 0)
                    {
                        commissioned_employee.setIs_sindicate(1);
                        commissioneds.remove(index_out);
                        commissioneds.add(index_out,commissioned_employee);
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
                    commissioned_employee = commissioneds.get(index_out);
                    if(commissioned_employee.getIs_sindicate() == 1)
                    {
                        commissioned_employee.setIs_sindicate(0);
                        commissioneds.remove(index_out);
                        commissioneds.add(index_out,commissioned_employee);
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
                    commissioned_employee = commissioneds.get(index_out);
                    if(commissioned_employee.getSindicate_id() != -1)
                    {
                        commissioned_employee.setSindicate_id(commissioned_employee.getSindicate_id()+7);
                        commissioneds.remove(index_out);
                        commissioneds.add(index_out,commissioned_employee);
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
                    commissioned_employee = commissioneds.get(index_out);
                    if(commissioned_employee.getIs_sindicate() == 1)
                    {
                        System.out.printf("Enter the new union fee value: ");
                        union_fee = input.nextDouble();
                        input.nextLine();
                        commissioned_employee.setUnion_fee(union_fee);
                        commissioneds.remove(index_out);
                        commissioneds.add(index_out,commissioned_employee);
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
            commissioned_employee = commissioneds.get(index_out);
            if(commissioned_employee.getIs_sindicate() == 1)
            {
                commissioned_employee.setService(service);
                commissioneds.remove(index_out);
                commissioneds.add(index_out,commissioned_employee);
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
        System.out.printf("Enter the sale value: ");
        sale_value = input.nextDouble();
        input.nextLine();
        index_out = SearchEmployee(id);
        if(index_out != -1)
        {
            commissioned_employee = commissioneds.get(index_out);
            commissioned_employee.setSales(sale_value, day);
            commissioneds.remove(index_out);
            commissioneds.add(index_out,commissioned_employee);
            System.out.println("Successful sale attribution!!");
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    public void Add_timecard(int id,int day)
    {
        System.out.println("Invalid employee type!!");
    }    
}
