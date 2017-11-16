
package personbmi;

public class Person {
    String name;
    double age;
    double wt;
    double ht;
    double bmi;
    
public Person(){
    System.out.println("Welcome to BMI");
    //constructor without name
}
public Person(String provideAname){
    System.out.println("Welcome to BMI with Name ");
    name = provideAname;
    //constructor with a name
}
    
public Person(String provideAname,int provideAage,double provideAht,double provideAwt){
    System.out.println("Welcome to BMI with Name ");
    name = provideAname;
    age = provideAage;
    ht = provideAht;
    wt = provideAwt;
    calculateBmi();
    //constructor with a name,Age,Ht
}
public void calculateBmi(){
    bmi=wt/(ht*ht);
    
}
            
            
    
}
