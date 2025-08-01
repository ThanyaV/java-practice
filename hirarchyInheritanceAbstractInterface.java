import java.util.Scanner;
abstract class vehicle
{
 private String vehicleNumber;
private String vehicleType;
static int vehicleCount=0;

public vehicle(String vehicleNumber, String vehicleType)
 {
  this.vehicleNumber=vehicleNumber;
  this.vehicleType=vehicleType;
  vehicleCount++;
 }
public String getVehicleNumber()
{
 return vehicleNumber;
}
public String getVehicleType()
{
 return vehicleType;
}
abstract void start();
abstract void stop();
}
interface driveable
{
void drive();
static void maxSpeed()
{
System.out.println("Top speed = 180");
}
default void fuelType()
{
System.out.println("Petrol or Diesel");
}
}
 class car extends vehicle implements driveable
{
 private String brand;
car(String vehicleNumber,String vehicleType,String brand)
{
  super(vehicleNumber, vehicleType);
this.brand=brand;
}
public String getBrand()
{
return brand;
}
public void start()
{
System.out.println("<<<Start with key>>>");
}
public void stop()
{
 System.out.println("<<<Stops with Break!!!>>>");
}
public void drive()
{
System.out.println("Car is moving");
}
}
 class owner extends car
{
private String ownerName;
private String ownerNumber;
owner(String vehicleNumber,String vehicleType,String brand,String ownerName, String ownerNumber)
{
 super(vehicleNumber,vehicleType,brand);
 this.ownerName=ownerName;
this.ownerNumber=ownerNumber;
}
public void disp()
{
System.out.println(" Vehicle Count : "+vehicleCount);
System.out.println(" Vehicle Number : "+getVehicleNumber());
System.out.println(" Vehicle Type : "+getVehicleType());
System.out.println(" Vehicle brand : "+getBrand());
System.out.println(" Owner Name : "+ownerName);
System.out.println(" Owner Contact : "+ownerNumber);
}

}
class hirarchyInheritanceAbstractInterface
{
public static void main(String args[])
{
owner o=new owner("TN60T1120","Car","MS Swift","crista joe","83452*****");
o.start();
System.out.println();
o.drive();
System.out.println();
o.disp();
System.out.println();
driveable.maxSpeed();
System.out.println();
o.fuelType();
System.out.println();
o.stop();
}
}
