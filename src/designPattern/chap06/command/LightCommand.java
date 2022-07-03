package designPattern.chap06.command;

import designPattern.chap06.entity.Light;

public class LightCommand implements Command {

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
