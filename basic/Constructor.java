public class Constructor {
    // instace variables
    static int carSold = 500;
    int noOfWheels;
    int noOfDoors;
    int noOfSeats;
    String color;
    String Brand;
    float maxSpeed;
    float currentFuelInLiters;
    int price;

    // Constructor to initialize the instance variables
    Constructor(){
        noOfWheels = 4;
        noOfDoors = 4;
        noOfSeats = 5;
        color = "Black";
        currentFuelInLiters =3;
        maxSpeed = 200.0f;
        price = 2000000;
    }

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

    public static void main(String[] args) {
        Constructor car = new Constructor();
        System.out.println("Car Details:");
        System.out.println("No of Wheels: " + car.noOfWheels);
        System.out.println("No of Doors: " + car.noOfDoors);
        System.out.println("No of Seats: " + car.noOfSeats);
        System.out.println("Color: " + car.color);
        car.start();
        car.drive();
    }


  

}
