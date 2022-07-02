package designPattern.chap04.factoryMethod.pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        super.name = "뉴욕 스탈 치즈피자";
        super.dough = "씬 도우";
        super.source = "마리나라 소스";

        toppins.add("레지아노 소스");
    }

}
