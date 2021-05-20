# Refactored Payroll

 ## Strategy
 
  This pattern was applied in [`Functionalities_Employee.java`](https://github.com/Tayco110/Payroll/blob/main/Payroll/src/functionalities/Functionalities_Employee.java), to solve    the problem of multiple methods, with the same purpose, accumulated in the same class. Enabling the system to be swapped between Salaried, Commissioned and Hourly methods. Lastly, decrease the amount of conditional functions in the [`Main.java`](https://github.com/Tayco110/Payroll/blob/main/Payroll/src/Main.java).
  
 ## Extract Method
 
  This patter was applied to the following code fragment:
  ```
  for(index = 0;index < employees.size();index++)
  {
       employee = employees.get(index);
       if(employee.getId() == id)
       {
         ...
       }
  }
  ```
  Who was present in:
  ```
  public void Remove_employee(int id)
  public void Change_employee(int id)
  public void Add_service(int id)
  public void Add_sale(int id,int day)
  public void Add_timecard(int id,int day)
  ```
  To group this fragments of code and turn them in a method called: `private int SearchEmployee(int id)`.
  
  ## Move Accumulation to Collecting Parameters
  
  This pattern was applied in [`public void Add_timecard(int id,int day)`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/HourlyStrategy.java#L347) to turn this method into a smaller and simple one, creating two new methods [`private void Check_In(int index,int day)`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/HourlyStrategy.java#L40) and [`private void Check_Out(int index,int day)`](https://github.com/Tayco110/Refactored_Payroll/blob/main/Refactored%20Payroll/src/functionalities/HourlyStrategy.java#L63).
  
 
 
