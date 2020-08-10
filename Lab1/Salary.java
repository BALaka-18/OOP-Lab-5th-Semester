public class Main{
    // Function to check quadrant 
    static void checkSalary(int salary, int merit) { 
        if (salary >= 700 && salary <= 899){
            if (salary >= 700 && salary <= 799 && merit < 20)
                System.out.print("Grade B\n");
            else
                System.out.print("Grade A\n");
        }
        else if (salary >= 600 && salary <= 799){
            if (salary >= 600 && salary <= 649 && merit < 10)
                System.out.print("Grade C\n");
            else
                System.out.print("Grade B\n");
        }
        else if (salary >= 500 && salary <= 649){
            System.out.print("Grade C\n");
        }
        else
            System.out.print("More than given ranges.");
    } 
        
    // Driver Code 
    public static void main(String[] args) 
    {
        // Function Calling :
        // CASE 1 :  salary : $500, merit : 10
        System.out.println(" salary : $500, merit : 10");
        checkSalary(500, 10);
        // CASE 2 : salary : $610, merit : 5
        System.out.println("salary : $610, merit : 5");
        checkSalary(610, 5);
        // CASE 3 : salary : $610, merit : 10
        System.out.println("salary : $610, merit : 10");
        checkSalary(610, 10);
        // CASE 4 : salary : $710, merit : 15
        System.out.println("salary : $710, merit : 15");
        checkSalary(710, 15);
        // CASE 5 : salary : $710, merit : 20
        System.out.println("salary : $710, merit : 20");
        checkSalary(710, 20);
        // CASE 6 : salary : $800, merit : 30
        System.out.println("salary : $800, merit : 30");
        checkSalary(800, 30);
    } 
}
