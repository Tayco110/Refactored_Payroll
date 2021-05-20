import schedule.Schedule;
import functionalities.Functionalities_Schedule;
import java.util.Scanner;
import functionalities.Functionalities_Employee;

public class Main 
{
    public static void main(String[] args) {

        int controll;
        int idnumber = 0,month = 1,day = 1,id_controll;
        String employeetype,scheduletype,daycontroll;        
       
        Scanner input = new Scanner(System.in);
        Schedule schedule = new Schedule();
        
        Functionalities_Employee employee_Functionalities = new Functionalities_Employee();
        Functionalities_Schedule shedule_Functionalities = new Functionalities_Schedule();

        shedule_Functionalities.create_schedule(schedule,"monthly","friday");
        shedule_Functionalities.create_schedule(schedule,"biweekly","friday");
        shedule_Functionalities.create_schedule(schedule,"weekly","friday");

        do
        {
            System.out.println("**********************************************************************");
            System.out.println("                        PAYROLL MANAGEMENT MENU                       ");
            System.out.println("**********************************************************************");
            System.out.println("[1] - Add an employee");
            System.out.println("[2] - Remove an employee");
            System.out.println("[3] - Add time card");
            System.out.println("[4] - Add sale result");
            System.out.println("[5] - Add service fee");
            System.out.println("[6] - Change an employee's details");
            System.out.println("[7] - Start payroll (advances one day on the calendar!!)");
            System.out.println("[8] - Undo/Redo");
            System.out.println("[9] - Payment Schedule menu");
            System.out.println("[10] - Create new payment schedule");
            System.out.println("[11] - End payroll management menu (ALL DATA WILL BE LOST!!)");
            do
            {
                System.out.println("Enter a valid task: ");
                controll = input.nextInt();
                System.out.println();
            }while(controll < 1 || controll > 11);
            input.nextLine();

            if(controll == 1)
            {
                System.out.println("**********************************************************************");
                System.out.println("                           Add an employee                            ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter the employee type: ===");
                System.out.println("    -> salaried");
                System.out.println("    -> commissioned");
                System.out.println("    -> hourly");
                employeetype = input.nextLine();
                employee_Functionalities.Register_employee(employeetype,idnumber);
                idnumber++;
            }
            else if(controll == 2)
            {
                System.out.println("**********************************************************************");
                System.out.println("                          Remove an employee                          ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter the employee type: ===");
                System.out.println("    -> salaried");
                System.out.println("    -> commissioned");
                System.out.println("    -> hourly");
                employeetype = input.next();
                System.out.printf("Enter the employee id: ");
                id_controll = input.nextInt();
                input.nextLine();
                employee_Functionalities.Remove_employee(employeetype,id_controll);
            }
            else if(controll == 3)//only avaliable to employee's type hourly and to check out need check in first
            {
                System.out.println("**********************************************************************");
                System.out.println("                             Add time card                            ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter the employee type: ===");
                System.out.println("    -> salaried");
                System.out.println("    -> commissioned");
                System.out.println("    -> hourly");
                employeetype = input.nextLine();
                System.out.printf("Enter the employee id: ");
                id_controll = input.nextInt();
                input.nextLine();
                employee_Functionalities.Add_timecard(employeetype,id_controll,day);
            }
            else if(controll == 4)//only avaliable to emploee's type commissioned. the sail will bem aplied to the current day
            {
                System.out.println("**********************************************************************");
                System.out.println("                             Add sale result                          ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter the employee type: ===");
                System.out.println("    -> salaried");
                System.out.println("    -> commissioned");
                System.out.println("    -> hourly");
                employeetype = input.nextLine();
                System.out.printf("Enter the employee id: ");
                id_controll = input.nextInt();
                input.nextLine();
                employee_Functionalities.Add_sale(employeetype,id_controll,day);
            }
            else if(controll == 5)//only avaliable if the employee are part of the union
            {
                System.out.println("**********************************************************************");
                System.out.println("                            Add service fee                           ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter the employee type: ===");
                System.out.println("    -> salaried");
                System.out.println("    -> commissioned");
                System.out.println("    -> hourly");
                employeetype = input.nextLine();
                System.out.printf("Enter the employee id: ");
                id_controll = input.nextInt();
                input.nextLine();
                employee_Functionalities.Add_service(employeetype,id_controll);
            }
            else if(controll == 6)//change an employee information only if he can be finded in the arraylist
            {
                System.out.println("**********************************************************************");
                System.out.println("                       Change employee's information                  ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter the employee type: ===");
                System.out.println("    -> salaried");
                System.out.println("    -> commissioned");
                System.out.println("    -> hourly");
                employeetype = input.next();
                System.out.printf("Enter the employee id: ");
                id_controll = input.nextInt();
                input.nextLine();
                employee_Functionalities.Change_employee(employeetype,id_controll);
            }
            else if(controll == 7)//print all the employees who need to be paid in the current day. the prited salary value is for 30 days but the calculated value depends on the schedule
            {
                System.out.println("**********************************************************************");
                System.out.println("                          Today's payments                            ");
                System.out.println("**********************************************************************");
                shedule_Functionalities.Payment(employee_Functionalities.getHourlies(),employee_Functionalities.getCommissioneds(),employee_Functionalities.getSalarieds(),schedule,day,month);
                day++;
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                {
                    if(day > 31)
                    {
                        day = 1;
                        month++;
                        if(month > 12)
                        {
                            month = 1; 
                        }
                    }
                }
                else if(month == 4 || month == 6 || month == 9 || month == 11 )
                {
                    if(day > 30)
                     {
                        day = 1;
                        month++;
                        if(month > 12)
                        {
                            month = 1;
                        }
                    }
                }
                else if(month == 2)
                {
                    if(day > 28)
                    {
                        day = 1;
                        month++;
                        if(month > 12)
                        {
                            month = 1;
                        }
                    }
                }     
            }
            else if(controll == 8)//does not work at all!!
            {
                System.out.println("Functionality not available!!");
            }
            else if(controll == 9)// print the schedules avaliable. if is possible, change the current schedule of a specific employee 
            {
                System.out.println("**********************************************************************");
                System.out.println("                       Payment Schedule menu                          ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter a valid option: ===");
                System.out.println("    -> show current schedules ");
                System.out.println("    -> change an employee's schedule");
                scheduletype = input.nextLine();
                if(scheduletype.equals("show current schedules"))
                {
                    System.out.println("=== current schdules: ===");
                    shedule_Functionalities.show_current_schedules(schedule);
                }
                else if(scheduletype.equals("change an employee's schedule"))
                {
                    System.out.println("=== Enter the employee type: ===");
                    System.out.println("    -> salaried");
                    System.out.println("    -> commissioned");
                    System.out.println("    -> hourly");
                    employeetype = input.next();
                    System.out.printf("Enter the employee id: ");
                    id_controll = input.nextInt();
                    input.nextLine();
                    if(employeetype.equals("salaried"))
                    {
                        shedule_Functionalities.change_Salaried_schedule(employee_Functionalities.getSalarieds(),schedule,id_controll);
                    }
                    else if(employeetype.equals("commissioned"))
                    {
                        shedule_Functionalities.change_Commissioned_schedule(employee_Functionalities.getCommissioneds(),schedule,id_controll);
                    }
                    else if(employeetype.equals("hourly"))
                    {
                        shedule_Functionalities.change_Hourly_schedule(employee_Functionalities.getHourlies(),schedule,id_controll);
                    }
                    else
                    {
                        System.out.println("Invalid employee type!!");
                    }
                }
                else
                {
                    System.out.println("Invalid option!!");
                }
            }
            else if(controll == 10)// create a new schedule. only the types: biweekly 'day', weekly 'day' and monthly 'day' are avaliable
            {
                System.out.println("**********************************************************************");
                System.out.println("                    Create new payment schedule                       ");
                System.out.println("**********************************************************************");
                System.out.println("=== Enter the schedule type: ===");
                System.out.println("    -> monthly");
                System.out.println("    -> biweekly");
                System.out.println("    -> weekly");
                scheduletype = input.nextLine();
                System.out.println("=== enter the day of the week on which the payment will be made(business days only): ===");
                daycontroll = input.nextLine();
                if(scheduletype.equals("monthly"))
                {
                    System.out.println("The last "+daycontroll+" in the month will become a payday");
                    shedule_Functionalities.create_schedule(schedule, scheduletype, daycontroll);
                }
                else if(scheduletype.equals("biweekly"))
                {
                    System.out.println("Every two weeks, "+daycontroll+" will be a payday");
                    shedule_Functionalities.create_schedule(schedule, scheduletype, daycontroll);
                }
                else if(scheduletype.equals("weekly"))
                {
                    System.out.println("Every week, "+daycontroll+" will be a payday");
                    shedule_Functionalities.create_schedule(schedule, scheduletype, daycontroll);
                }
                else
                {
                    System.out.println("Invalid schedule type!!");
                }        
            }
            System.out.println(); 
        }while(controll != 11);
    }
}
