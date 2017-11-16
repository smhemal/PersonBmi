
package personbmi;


public class PersonBmi {

    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.name = "Hemal";
        p1.age = 37;
        p1.ht = 1.67;
        p1.wt = 78;
        p1.calculateBmi();
        System.out.println(p1.bmi);
              
        
    }
    
}
