package designPattern.chap10.state;

import designPattern.chap10.GumbalMachine;

public class SoldOutState implements State {

    GumbalMachine gumbalMachine;

    public SoldOutState(GumbalMachine gumbalMachine) {
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
