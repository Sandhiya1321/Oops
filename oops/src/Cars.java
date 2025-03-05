 class Cars {
     String brand;
     String model;
     int year;

     public Cars(String brand, String model, int year) {
         this.brand=brand;
         this.model=model;
         this.year=year;
     }
     public String getBrand(){
         return brand;
     }
     public String getModel(){
         return model;
     }
     public int getYear(){
         return year;
     }

     public static void main(String[] args) {
         Cars car=new Cars("BMW","sword",2000);
         System.out.println("brand is:"+ car.getBrand());
         System.out.println("model is:"+ car.getModel());
         System.out.println("year is:"+ car.getYear());

     }
 }
