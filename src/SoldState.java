/**
 * Created by Тим on 07.06.2017.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Подождите, мы уже даем вам gumball");
    }

    public void ejectQuarter() {
        System.out.println("Извините, вы уже повернули рукоятку");
    }

    public void turnCrank() {
        System.out.println("Поворачиваясь дважды, вы не получите еще один гамбол!");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("\n" +
                    "Ой, из gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public String toString() {
        return "Раздача gumball";
    }
}