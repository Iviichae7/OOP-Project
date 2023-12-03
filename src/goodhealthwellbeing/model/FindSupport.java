/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goodhealthwellbeing.model;

/**
 *
 * @MD MAHMUDUL HASAN
 *
 */
public class FindSupport {
    
    String []cityName;
    String []address;
    String inputCity;
    
    public FindSupport(){
        inputCity= " ";
        cityName=new String[]{"Dublin","Galway","Cork","Limerick","Waterford","Sligo","Kilkenny"};
        address=new String[]{"11 Grafton St,D01FC30","12 Galway Rd, G01FF20","13 Cork High St,C22FG43","14 Leimerick rd,L89GG6","56 Waterford,F56M50","56 Sligo St,BN89RT6","99 Kilkenny Center,TY99F4"};
        
    }

    public void setInputCity(String inputCity) {
        this.inputCity = inputCity;
    }

    

  public String getAddress(String inputCity) {
    for (int i = 0; i < cityName.length; i++) {
        if (cityName[i].equalsIgnoreCase(inputCity)) {
            return address[i];
        }
    }
    return "Address not found for city: " + inputCity;
}

    
    
    
    
    
    
}
