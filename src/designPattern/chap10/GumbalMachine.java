package designPattern.chap10;

import designPattern.chap10.state.*;

public class GumbalMachine {
    State soldOUtState;
    State noQuaterState;
    State hasQuaterState;
    State soldState;

    State state;

    int count = 0;

    public GumbalMachine(int numberGumballs) {
        soldOUtState = new SoldOutState(this);
        noQuaterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if(numberGumballs > 0) {
            state = noQuaterState;
        } else {
            state = soldOUtState;
        }
    }

    public void insertQuater() {
        state.insertQuater();
    }

    public void ejectQuater() {
        state.ejectQuater();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다");
        if(count > 0) count -= 1;
    }

    public State getSoldOUtState() {
        return soldOUtState;
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public State getHasQuaterState() {
        return hasQuaterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}
