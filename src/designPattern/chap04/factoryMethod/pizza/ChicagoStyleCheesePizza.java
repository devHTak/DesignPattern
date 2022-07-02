package designPattern.chap04.factoryMethod.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        super.name = "시카고 스탈 치즈피자";
        super.dough = "두꺼운 도우";
        super.source = "플럼토마토 소스";

        toppins.add("모짜렐라 치즈");
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 자르기");
    }
}
