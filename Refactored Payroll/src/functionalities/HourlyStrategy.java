package functionalities;

import java.util.ArrayList;
import employee.Hourly;
import java.util.Scanner;

public class HourlyStrategy implements Strategy 
{
    private ArrayList<Hourly> hourlies = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    private Hourly hourly_employee;
    private String name,address,paymentmethod,sindicate_controll,option;
    private double salaryperhour,union_fee,service;
    private int is_sindicate,sindicate_id,index_out,change_controll,tc_in_h,tc_in_m,tc_out_h,tc_out_m; 

    public HourlyStrategy()
    {

    }

    public ArrayList<Hourly> getEmployee() 
    {
        return hourlies;
    }
    private int SearchEmployee(int id)
    {
        int index,index_in = -1;
        for(index = 0;index < hourlies.size();index++)
        {
            hourly_employee = hourlies.get(index);
            if(hourly_employee.getId() == id)
            {
                index_in = index;
                break;
            }
        }
        return index_in;
    }
    private void Check_In(int index,int day)
    {
        System.out.println("==== check in ====");
        System.out.println("Enter the hours and minutes: ");
        System.out.printf("Hours: ");
        tc_in_h = input.nextInt();
        input.nextLine();
        System.out.printf("Minutes: ");
        tc_in_m = input.nextInt();
        input.nextLine();
        hourly_employee = hourlies.get(index);
        if((hourly_employee.getIn_hour(day) == 0) && (hourly_employee.getOut_hour(day) == 0))//check in pode ser feito se e somente se o empregado ainda n registrou entrada na empresa
        {
            hourly_employee.setTimecards_in((tc_in_h*60), tc_in_m, day);
            hourlies.remove(index);
            hourlies.add(index, hourly_employee);
            System.out.println("Successful check-in!!");
        }
        else
        {
            System.out.println("Cannot check in!!");
        }   
    }
    private void Check_Out(int index,int day)
    {
        System.out.println("==== check out ====");
        System.out.println("Enter the hours and minutes: ");
        System.out.printf("Hours: ");
        tc_out_h = input.nextInt();
        input.nextLine();
        System.out.printf("Minutes: ");
        tc_out_m = input.nextInt(); 
        input.nextLine();
        hourly_employee = hourlies.get(index);
        if((hourly_employee.getOut_hour(day) == 0) && (hourly_employee.getIn_hour(day) != 0))//check out só pode ser feito se e somente se o empregado já registrou entrada
        {
            hourly_employee.setTimecards_out((tc_out_h*60), tc_out_m, day);
            hourly_employee.setWorkedours(((hourly_employee.getOut_hour(day)+hourly_employee.getOut_min(day))-(hourly_employee.getIn_hour(day)+hourly_employee.getIn_min(day))), day);
            if(hourly_employee.getWorkedours(day) > 480)//calcula as horas trabalhadas e extras em minutos. 
            {
                hourly_employee.setExtra_hour((hourly_employee.getWorkedours(day) - 480),day);
                hourly_employee.setWorkedours(((hourly_employee.getOut_hour(day)+hourly_employee.getOut_min(day))-(hourly_employee.getIn_hour(day)+hourly_employee.getIn_min(day))-hourly_employee.getExtra_hour(day)), day);
            }
            hourlies.remove(index);
            hourlies.add(index,hourly_employee);
            System.out.println("Successful check-out!!");
        }
        else
        {
            System.out.println("Cannot check out!!");
        }
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
        System.out.println("Enter the employer's SALARY PER HOUR: ");
        salaryperhour = input.nextDouble();
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
            sindicate_id = -1;
            is_sindicate = 0;
            union_fee = 0;
        }
        hourly_employee = new Hourly(name,address,"Hourly",paymentmethod,"weekly friday",id,sindicate_id,is_sindicate, union_fee, salaryperhour);
        hourlies.add(hourly_employee);
        System.out.println("employee Hourly with id = "+id+" added to the system!!");
    }
    public void Remove_employee(int id) 
    {
        index_out = SearchEmployee(id);
        if(index_out != -1)
        {
            hourlies.remove(index_out);
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
                    hourly_employee = hourlies.get(index_out);
                    hourly_employee.setName(name);
                    hourlies.remove(index_out);
                    hourlies.add(index_out,hourly_employee);
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
                    hourly_employee = hourlies.get(index_out);
                    hourly_employee.setAddress(address);
                    hourlies.remove(index_out);
                    hourlies.add(index_out,hourly_employee);
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
                    hourly_employee = hourlies.get(index_out);
                    hourly_employee.setPaymentmethod(paymentmethod);
                    hourlies.remove(index_out);
                    hourlies.add(index_out,hourly_employee);
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
                    hourly_employee = hourlies.get(index_out);
                    if(hourly_employee.getIs_sindicate() == 0)
                    {
                        hourly_employee.setIs_sindicate(1);
                        hourlies.remove(index_out);
                        hourlies.add(index_out,hourly_employee);
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
                    hourly_employee = hourlies.get(index_out);
                    if(hourly_employee.getIs_sindicate() == 1)
                    {
                        hourly_employee.setIs_sindicate(0);
                        hourlies.remove(index_out);
                        hourlies.add(index_out,hourly_employee);
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
                    hourly_employee = hourlies.get(index_out);
                    if(hourly_employee.getSindicate_id() != -1)
                    {
                        hourly_employee.setSindicate_id(hourly_employee.getSindicate_id()+7);
                        hourlies.remove(index_out);
                        hourlies.add(index_out,hourly_employee);
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
                    hourly_employee = hourlies.get(index_out);
                    if(hourly_employee.getIs_sindicate() == 1)
                    {
                        System.out.printf("Enter the new union fee value: ");
                        union_fee = input.nextDouble();
                        input.nextLine();
                        hourly_employee.setUnion_fee(union_fee);
                        hourlies.remove(index_out);
                        hourlies.add(index_out,hourly_employee);
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
            hourly_employee = hourlies.get(index_out);
            if(hourly_employee.getIs_sindicate() == 1)
            {
                hourly_employee.setService(service);
                hourlies.remove(index_out);
                hourlies.add(index_out,hourly_employee);
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
        index_out = SearchEmployee(id);
        if(index_out != -1)
        {
            System.out.println("==== What do you want? ====");
            System.out.println("    -> check in");
            System.out.println("    -> check out");
            System.out.printf("option: ");
            option = input.nextLine();
            if(option.equals("check in"))
            {
                Check_In(index_out,day);
            }
            else if(option.equals("check out"))
            {
                Check_Out(index_out,day);
            }
            else
            {
                System.out.println("invalid opition!!");
            }
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    

}
