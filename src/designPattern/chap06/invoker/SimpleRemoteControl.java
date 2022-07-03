package designPattern.chap06.invoker;

import designPattern.chap06.command.Command;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressend() {
        command.execute();
    }
}
