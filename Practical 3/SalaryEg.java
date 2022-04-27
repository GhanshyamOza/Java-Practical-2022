import java.util.*;

class Salary {
    String name; 
    int basic_salary;
    int d_A;
    int TDS;
    void calculate(){
        System.out.println("Name: " +name);
        System.out.println("Basic Salary: " +basic_salary);
        d_A = (74*basic_salary) / 100;
        if(basic_salary>100000){
            int gross_salary = basic_salary + d_A;
            TDS = (10*gross_salary) / 100;
        }
        System.out.println("DA: " +d_A);
        System.out.println("Net salary: " +(basic_salary+d_A));
        System.out.println("TDS: " +TDS);
    }
}
class SalaryEg{
    public static void main(String[] args) {
        Salary sal = new Salary();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        sal.name = in.nextLine();
        System.out.println("Enter the basic salary (yearly): ");
        sal.basic_salary = in.nextInt();
        sal.calculate();
    }
}
