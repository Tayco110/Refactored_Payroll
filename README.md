# Refactored Payroll

 ## Strategy
 
  This pattern was applied in [`Functionalities_Employee.java`](https://github.com/Tayco110/Payroll/blob/main/Payroll/src/functionalities/Functionalities_Employee.java), to solve    the problem of multiple methods, with the same purpose, accumulated in the same class. Enabling the system to be swapped between Salaried, Commissioned and Hourly methods. Lastly, decrease the amount of conditional functions in the [`Main.java`](https://github.com/Tayco110/Payroll/blob/main/Payroll/src/Main.java).
  
 ## Extract Method
 
  This pattern was applied to the following code fragment:
  ```java
  for(index = 0;index < 'employetypeArrayList'.size();index++)
  {
       'employeetype' = 'employeetypeArrayList'.get(index);
       if(employee.getId() == id)
       {
         ...
       }
  }
  ```
  Who was present in the following methods of the class [`Functionalities_Employee.java`](https://github.com/Tayco110/Payroll/blob/main/Payroll/src/functionalities/Functionalities_Employee.java):
  ```java
  public void Remove_employee(int id)
  public void Change_employee(int id)
  public void Add_service(int id)
  public void Add_sale(int id,int day)
  public void Add_timecard(int id,int day)
  ```
  To group this fragments of code and turn them in a method called: `private int SearchEmployee(int id)`.
  ```java
  private int SearchEmployee(int id)
   {
       int index,index_in = -1;
       for(index = 0;index < 'employeetypeArraylist'.size();index++)
       {
           'employeetype' = 'employeetypeArraylist'.get(index);
           if('employeetype'.getId() == id)
           {
               index_in = index;
               break;
           }
       }
       return index_in;
  }
  ```
  This new method is present in [`CommissionedStrategy.java`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/CommissionedStrategy.java), [`HourlyStrategy.java`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/HourlyStrategy.java) and [`SalariedStrategy.java`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/SalariedStrategy.java). So we can simple invoke this method when we need to search an employee.
  
  ## Move Accumulation to Collecting Parameters
  
  This pattern was applied in [`public void add_timecard(ArrayList<Hourly> hourlies, int id, int day)`](https://github.com/Tayco110/Payroll/blob/main/Payroll/src/functionalities/Functionalities_Employee.java#L809) to turn this method into a smaller and simple one,[`public void Add_timecard(int id,int day)`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/HourlyStrategy.java#L347), who can simple invoke two new created methods: [`private void Check_In(int index,int day)`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/HourlyStrategy.java#L40) and [`private void Check_Out(int index,int day)`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/HourlyStrategy.java#L63).
