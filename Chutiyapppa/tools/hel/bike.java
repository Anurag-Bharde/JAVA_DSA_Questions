package Chutiyapppa.tools.hel;

public class bike{
    public int speed;
    public int gear;

    bike(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void applyBreak(int a){
        speed-=a;
    }
    public void accelator(int a){
        speed+=a;
    }

    public void print(){
        System.out.println("Speed of bike is : " + speed  +"\n Gear is : "+gear);
    }
}


 class inheritance {
    public static void main(String[] args) {
        motorBike m = new motorBike(100, 4, 25);
        m.print();
        m.accelator(20);
        m.applyBreak(10);
        m.print();
    }
}
//}
