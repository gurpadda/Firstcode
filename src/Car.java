public class Car {
   static String brand ="Audi";
    String color;
    int engineCapacity;

    public Car(String color, int engineCapacity) {
        this.color = color;
        this.engineCapacity = engineCapacity;
    }
    public  void printCarDetails(){
        System.out.println("brand name: " +brand );
        System.out.println(" car color:" +color);
        System.out.println(" car engineCapcity:" +engineCapacity);



    }
}
