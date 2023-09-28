

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
    public void setPhone(long Phone){
        this.phone=phone;
    }
  public void setEmail(String email){
      this.email=email;
  }
   
    String getName(){
        return this.name;
    }
    long getPhone(){
        return this.phone;
    }
    String getEmail(){
      return this.email;
    }
    
    
    
}