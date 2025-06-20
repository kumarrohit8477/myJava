public class Car {

    // instace variables
    static int carSold = 500;
    int noOfWheels;
    int noOfDoors;
    int noOfSeats;
    String color;
    String Brand;
    float maxSpeed;
    float currentFuelInLiters =1;
    int price;


    // instace methods
   
    public void start(){
        if (currentFuelInLiters <= 0) {
            System.out.println("Can't start no fuel left.");     
        }

        else if (currentFuelInLiters<=5) {
            System.out.println("Warning: Low fuel level. Please refuel soon.");
            System.out.println("The car is startig, bruh....");
        }
        else{
            System.out.println("The car is startig, bruh....");  
        }
    }

     public void drive(){
        currentFuelInLiters--;
        System.out.println("The car is driving.");     
    }


    public void getCurrentFuelInLiters(){
        System.out.println("Current fuel in car is " + currentFuelInLiters + " liters.");
    }
    

    public void addFuel(float fuelInLiters){
        currentFuelInLiters += fuelInLiters;
        System.out.println("Added " + fuelInLiters + " liters of fuel. Current fuel level: " + currentFuelInLiters + " liters.");
    }
}
