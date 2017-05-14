
package school;

import static java.lang.System.out;


public class employee {
    
    String name ; 
    String position;
    double salary;

    
    public void setName (String name) {
        this.name = name ;
    }
    public void setPosition (String position){
        this.position = position ; 
    }
    public void setPayroll (Double payroll) {
        this.salary = payroll ; 
    }   
    
     public String getName() {
        return name; 
    }
    public String getPosition() {
        return position;
    }
    public Double getSalary() {
        return salary; 
    }

   public  void display() {
        out.println(name + "," + position + ",$" + salary);
    }
    
   
    
    
}

