
package icetask_1;

public class IceTask_1 {

  
    public static void main(String[] args) {
        //QUESTION1
        Q1 q1 = new Q1();
        Q1 q2 = new Q1();
        Q1 q3 = new Q1();
        
       System.out.println("The number objects are : "+ Q1.getCount());
       
       //QUESTION2
       int sum = Q2.add(5,10);
       System.out.println("The sum of a and b is : " + sum);
       
       //QUESTION3
       Q3 Vehicle = new Q3();
       Vehicle.drive();
       
       Q3_1 car = new Q3_1();
       car.drive();
       
       //QUESTION4
       Q4 work = new Q4();
       work.work();
       
       System.out.println("The Salary is : " + work.getSalary());
       
       Q4_1 q4 = new Q4_1();
       q4.work();
       q4.addEmployee();
       
      
    }
    
}
