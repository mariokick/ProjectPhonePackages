/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhonePackages;

/**
 *
 * @author Godonlyknows
 */
public class Customer {
    private String name ;
    private String tel ;
    private Packages use_packages ;
    private Packages serviceCharge;
    private Packages limte;
    
    
    
    public void NewPackages(Packages name){
        use_packages= name;
    }
    public boolean chang(Packages name){
   if(use_packages==name){
       return true ;
   }
        return false; 
    }
    public void cancle(){
        use_packages = null;
    }
    public Packages checkpackage(){
     return use_packages ;
    }
    public Packages checkserviceCharge(){
        return serviceCharge;
    }
   
    public Packages checknet(){
        return limte;
    }
    
    public void addCustomer (String n, String t){
        name = n;
        tel = t;
}
    public String getCustomer(){
        return "Name : "+name+" Tel : "+tel+" Packages :"+use_packages.getPackages();
    }
    
}