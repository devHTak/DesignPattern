package designPattern.chap01.behavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FLY WITH WINGS");
    }
}
