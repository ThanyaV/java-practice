
class car
{
   
    
        String Brand;
        car()
        {
            Brand = "unknown";
            System.out.println("Default constructor");
        }
        String setBrand()
        {
            Brand = "Mahendra Thar";
            return Brand;
        }
        void display()
        {
            System.out.println("Brand : "+Brand);
        }
        public static void main(String arg[])
        {
            car c=new car();
            c.display();
            c.setBrand();
            c.display();
            
        }
        

    
}