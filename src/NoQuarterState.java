/**
 * Created by Тим on 07.06.2017.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("\n" +
                "Вы вставили четверть");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("\n" +
                "Вы не ввели четверть");
    }

    public void turnCrank() {
        System.out.println("\n" +
                "Вы повернулись, но нет четверти");
    }

    public void dispense() {
        System.out.println("Сначала нужно заплатить");
    }

    public String toString() {
        return "Ожидание квартала";
    }
}