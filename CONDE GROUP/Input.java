//AUTHOR(S)
//KIMBERLY CONDE
//GRETCHEN SUNIT
//DENN CARLISLE TORREVILLAS
package mainactivity1;

public class Input {
  
    private String name, email;
    private long phone;

    
    
   public Input(){
        this.name=name;
        this.email=email;
        this.phone=phone;

   
    }
   
    public void setName(String name){
        this.name=name;
        
    }
   
  public void setEmail(String email){
      this.email=email;
  }
  
   public void setPhone(int phone){
        this.phone=phone;
    }
   
    String getName(){
        return this.name;
    }
    
    String getEmail(){
      return this.email;
    }
    long getPhone(){
        return this.phone;
    }
    
    
    
}