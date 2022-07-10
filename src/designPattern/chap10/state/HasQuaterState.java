package designPattern.chap10.state;

import designPattern.chap10.GumbalMachine;

public class HasQuaterState implements State {

    GumbalMachine gumbalMachine;

    public HasQuaterState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("동전은 하나만 넣어주세요");
    }

    @Override
    public void ejectQuater() {
        System.out.println("동전이 반환됩니다.");
        gumbalMachine.setState(gumbalMachine.getNoQuaterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다..");
        gumbalMachine.setState(gumbalMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다..");
    }
}
