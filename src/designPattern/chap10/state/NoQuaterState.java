package designPattern.chap10.state;

import designPattern.chap10.GumbalMachine;

public class NoQuaterState implements State {

    GumbalMachine gumbalMachine;

    public NoQuaterState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuater() {

    }

    @Override
    public void ejectQuater() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
