package designPattern.chap01.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("NO FLY");
    }
}
