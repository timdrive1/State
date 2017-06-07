/**
 * Created by Тим on 07.06.2017.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Вы не можете вставить четверть, машина продана");
    }

    public void ejectQuarter() {
        System.out.println("Вы не можете выбросить, вы еще не ввели четверть");
    }

    public void turnCrank() {
        System.out.println("Вы обернулись, но нет gumballs");
    }

    public void dispense() {
        System.out.println("Запрещается раздавать гамбол");
    }

    public String toString() {
        return "продано";
    }
}