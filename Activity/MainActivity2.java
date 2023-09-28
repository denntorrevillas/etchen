package javacts;

import java.util.Scanner;

public class MainActivity2{

    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
 
int num,loop;
  

        
        System.out.print("ENTER NUMBER OF STUDENT TO RECORD: ");
        
        num = scan.nextInt();
        
        Input[] student = new Input [num];
        
        for (loop=0;loop<student.length; loop++){
           student [loop]= new Input();
        }
        
        for (loop=0;loop<student.length; loop++){
        int count= loop+1;
        
       System.out.print("\n\nSTUDENT NO.  "+count+" RECORD:\n\n");
       
        
      System.out.print("INPUT YOUR NAME: ");
      student[loop].setName(scan.next());
    
  
      System.out.print("ENTER YOUR EMAIL : ");
      student[loop].setEmail(scan.next());
      
        
      System.out.print("ENTER YOUR PHONE NUMBER: ");
      student[loop].setPhone(scan.nextLong());

        }
        
        System.out.print("\n\nALL DATA HAS BEEN RECORDED\n\n");
      
       
    }
    
}