public class CashFlow{
    private String name;
    private double income;
    private double expense;

    public String getName(){
         return name;
    }


   public double getIncome(){
        return income;
    }

   public double getExpense(){
        return expense;
    }
    public String setName(String name){
       return this.name=name;
    }

    public double setIncome(double income){
       return this.income=income;
    }
    
    public  double setExpenses(double expense){
       return this.expense=expense;
    }

    public void summary(){
        System.out.print("\n\n\tSUMMARY\n\n");
        System.out.print("YOUR NAME IS: "+name);
    }

    public double addIncome(double x, double y){
        double sum= x+y;
        return sum; 
    }

    public double addExpense(double x, double y){
        double sum= x+y;
        return sum; 
    }
    
    


   

}