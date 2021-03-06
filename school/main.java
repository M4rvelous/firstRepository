/* A small and simple application that classifies the people 
/  that are involved in everyday school operations.
/ I wrote this in order to famirize myself more with Java inheretence
*/

package school;


public class School {

    public static void main(String[] args) {
        
        student aStudent = new student() ; 
      
       aStudent.setName("Nick");
       aStudent.setAge(14);
       aStudent.setGender("Male");
       
       employee aEmployee = new employee();
       
       aEmployee.setName("Mr.Garisson");
       aEmployee.setPosition("Janitor");
       aEmployee.setPayroll(1500.0);
       
       teacher aTeacher = new teacher();
       
       aTeacher.setName("Mr.Smith");
       aTeacher.setPosition("Math Teacher");
       aTeacher.setPayroll(1600.0);
       aTeacher.setModule("Calculus, Linear Algebra");
       
       manager aManager = new manager(); 
       
       aManager.setName("Mr.Harris");
       aManager.setPosition("Accounting Manager");
       aManager.setPayroll(1800.0);
       aManager.setRes("Managing accounting operations");
       aManager.setInfo("Issuing ivoices and making sure payments are made on time");
       
       aStudent.display();
       aEmployee.display();
       aTeacher.display();
       aManager.display();
       
    }

}
