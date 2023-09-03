package YouDoItCh4;

//Filename SpaService.java
//Written by Sandi Cook
//Written on September 1, 2023

/*
Purpose: This class stores information about services
offered at Paradise Day Spa 

 */
public class SpaService {

    private String serviceDescription; 
    private double price;

    public void setServiceDescription(String service) {
        serviceDescription = service; }
        public void setPrice(double servicePrice) {
        price = servicePrice; } 

    public String getServiceDescription() {
        return serviceDescription; }
        public double getPrice() {
        return price; }
                

}