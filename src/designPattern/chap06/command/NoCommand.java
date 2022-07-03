package designPattern.chap06.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NOP");
    }
}
