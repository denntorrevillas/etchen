import java.util.Scanner;
public class Main{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        CashFlow cf= new CashFlow();
        

        double a=1000.00;
        double b=500.00;

        System.out.print("\n\nENTER YOUR NAME: ");
        cf.setName(scan.nextLine());

        System.out.print("\nYOUR INCOME IS: "+a);
        System.out.print("\nENTER INCOME TO BE ADDED: ");
        cf.setIncome(scan.nextDouble());


        System.out.print("\n\nYOUR EXPENSES IS: "+ b);
        System.out.print("\nENTER EXPENSES TO BE ADDED: ");
        cf.setExpenses(scan.nextDouble());


        double totalIc= cf.addIncome(a,cf.getIncome());
        double totalEx= cf.addExpense(b,cf.getExpense());



        cf.summary();

        System.out.print("\n\nTOTAL INCOME IS: "+totalIc);

         System.out.print("\n\nTOTAL INCOME IS: "+totalEx);

         System.out.println();
         System.out.println();



       
    
     }
}