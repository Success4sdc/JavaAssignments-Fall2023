//Filename SpaService.java
//Written by Sandi Cook
//Written on September 3, 2023

/*
Purpose: Create Variables to store serviceDescription and price
Creates methods to set the service description and price of service
Sets service price - gets description
Return price
*/

public class SpaService {
    
    // Variable to store the description of the service
    private String serviceDescription; 
    
    // Variable to store the price of the service
    private double price;

     // Default constructor
     public SpaService() {
        this ("XXX", 0);
    }
    public SpaService(String desc, double pr) {
        serviceDescription = desc; price = pr;
        } 
    // Method to set the service description
    public void setServiceDescription(String service) 
    {
        serviceDescription = service; 
    }
    
    // Method to set the price of the service
    public void setPrice(double servicePrice) 
    {
        price = servicePrice; 
    } 

    // Method to get the service description
    public String getServiceDescription() 
    {
        return serviceDescription; 
    }
    
    // Method to get the price of the service
    public double getPrice() 
    {
        return price; 
    }
        
}
