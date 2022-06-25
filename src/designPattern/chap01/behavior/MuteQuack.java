package designPattern.chap01.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MUTE");
    }
}
