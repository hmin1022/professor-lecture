package Unit5;
public class CarTest {

  public static void main(String[] args) {
    Car car = new Car();   
    car.setColor("red");
    System.out.println(car);

    
    for (int i = 0; i < 81; i++) {
      car.speedUp();
    }
    System.out.println(car);
  }
}