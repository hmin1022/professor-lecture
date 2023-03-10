package Unit5;

public class Car {
  private String color;
  private int speed;
  private int gear = 1;

  private int MAX_SPEED = 80;
  private int GEAR_SPEED = 10;


  void changeGear() {
    int speedMax = gear * GEAR_SPEED;
    int speedMin = (gear - 1) * GEAR_SPEED;
    if(speed > speedMax) {
      this.gear++;  
      System.out.println("기어변경" + gear);      
    } else if(speed < speedMin) {  
      this.gear--;
      System.out.println("기어변경" + gear);
    }
  }

  
  void speedUp() {
    if(speed >= MAX_SPEED) {
      System.out.println("최고속도");
      return;
    }
    speed++;
    changeGear();
    System.out.println("가속 " + speed);
  }

  void setColor(String argColor) {
    this.color = argColor;
  }

  void speedDown() {
    if(speed <= 0) { 
      System.out.println("정지");
      return;
    }
    speed--;
    System.out.println("감속 " + speed);

  }

  @Override
  public String toString() {
    return "speed" + speed + "color" + color + "gear" + gear;
  }
}