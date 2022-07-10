package designPattern.chap10.state;

import designPattern.chap10.GumbalMachine;

public class SoldState implements State {

    GumbalMachine gumbalMachine;

    public SoldState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세요.");
    }

    @Override
    public void dispense() {
        gumbalMachine.releaseBall();
        if(gumbalMachine.getCount() > 0) {
            gumbalMachine.setState(gumbalMachine.getNoQuaterState());
        } else {
            gumbalMachine.setState(gumbalMachine.getSoldOUtState());
        }
    }
}
