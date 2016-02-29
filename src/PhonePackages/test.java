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
public class test {
    public static  void main(String[] args){
         Phone ASUS = new Phone(); //Start new Phone
         Phone LG = new Phone();    
         Phone LAVA = new Phone(); //End new Phone
         Packages Mini = new  Packages();//Start new Packages
         Packages Medium = new Packages();
         Packages Max = new Packages();//End new Packages
         Packages MaxPlus = new Packages();
         Customer Tuksin = new Customer();
         Customer Piyawat = new Customer();
         Customer Aupsorn = new Customer();
         ASUS.addphone("ASUS","Zen 6");//Start addphone
         LAVA.addphone("Lava","IRIS 700");
         LG.addphone("LG","OPTIMUS");//End addphone
         Mini.addpackage(ASUS,"Mini",275.00,"150");//Start addpackage
         Medium.addpackage(LG,"Medium",519.00,"500");
         Max.addpackage(LG, "Max",839.00,"unlimite");//End addpackage
         MaxPlus.addpackage(LAVA,"Max Plus",899.00,"unlimite");
         Tuksin.addCustomer("Tuksin", "0926124701");
         Piyawat.addCustomer("Piyawat", "0914250644");
         Aupsorn.addCustomer("Aupsorn", "0855601007");
         Aupsorn.NewPackages(MaxPlus);
         Tuksin.NewPackages(Max);
         Piyawat.NewPackages(Mini);
         System.out.println(Piyawat.getCustomer());
                  System.out.println(Aupsorn.getCustomer());
                           System.out.println(Tuksin.getCustomer())
                 
   ;     
         
         
     
   //  System.out.println(MaxPlus.getphone());
     
   //  System.out.println("Mini name "+Mini.getpk());
    //p.addpackage("","Max",839.00,"unlimit");
    //p.addpackage("","Max Plus",899.00,"unlimit");

    }
}
