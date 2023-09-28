//AUTHOR(S)
//KIMBERLY CONDE
//GRETCHEN SUNIT
//DENN CARLISLE TORREVILLAS
package mainactivity1;
public class MainActivity1 {

    public static void main(String[] args) {
         
        Input student[] = new Input[3];
        
        for(int i=0; i<student.length; i++){
            student[i]= new Input();
        }
        
        String name;
        String email;
       long  phone;
        
                
        System.out.print("STUDENT RECORDS:\n\n");
      
            student[0].setName("KIMBERLY CONDE");
            student[0].setEmail("kim@gmail.com");
            student[0].setPhone(639478321);
            
            
            student[1].setName("GRETCHEN SUNIT");
            student[1].setEmail("gretchen@gmail.com");
            student[1].setPhone(639172784);
            
            student[2].setName("DENN CARLISLE TORREVILLAS");
            student[2].setEmail("denn@gmail.com");
            student[2].setPhone(639786546);

             
            System.out.println("\nNAME: "+student[0].getName());
            System.out.println("EMAIL: "+student[0].getEmail());
            System.out.println("PHONE: "+student[0].getPhone());
            
             System.out.println("\nNAME: "+student[1].getName());
            System.out.println("EMAIL: "+student[1].getEmail());
            System.out.println("PHONE: "+student[1].getPhone());
            
             System.out.println("\nNAME: "+student[2].getName());
            System.out.println("EMAIL: "+student[2].getEmail());
            System.out.println("PHONE: "+student[2].getPhone());
         
       
        
        
    }
    
}
