
package personbmi;
import javax.swing.JOptionPane;

public class PersonBmi {

    public static void main(String[] args) {
        
        Person i1 = new Person();
        i1.name = JOptionPane.showInputDialog("Name");
        i1.age = Double.parseDouble(JOptionPane.showInputDialog("Age"));
        i1.ht = Double.parseDouble(JOptionPane.showInputDialog("Height"));
        i1.wt = Double.parseDouble(JOptionPane.showInputDialog("Weight"));
        i1.calculateBmi();
        JOptionPane.showMessageDialog(null,i1.name+"'s  BMI is "+i1.bmi);
        
                
        Person p1 = new Person();
        p1.name = "Hemal";
        p1.age = 37;
        p1.ht = 1.67;
        p1.wt = 78;
        p1.calculateBmi();
        System.out.println(p1.name+"'s BMI is "+p1.bmi);
              
        Person p2 = new Person ("Tirosha");
        p2.age = 37;
        p2.ht = 1.56;
        p2.wt = 80;
        p2.calculateBmi();
        System.out.println(p2.name+"'s bmi is "+p2.bmi);
        
       
        Person p3 = new Person ("Hansana",37,1.56,80);
        System.out.println(p3.name+"'s bmi is "+p3.bmi);
       
    }
    
}
