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
public class Packages {
    private Phone brand ;
    private String name ;
    private Double service;
    private String limit_Use;
    
    public void addpackage(Phone b , String n , Double s , String lu){
     
        brand = b;
          
          
        name = n ;
        service = s;
        limit_Use = lu;
    }
    public String getbrand(){
        return brand.getbrand();
    }
    public String getPackages(){
        return name;
    }
  
  //  public Phone getphone(){
      //  return brand;
   // }
}
