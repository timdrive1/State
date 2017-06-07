import java.util.Random;

/**
 * Created by Тим on 07.06.2017.
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Вы не можете вставить еще одну четверть??????");
    }

    public void ejectQuarter() {
        System.out.println("Четверть возвращена???");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("\n" +
                "Вы повернули(но явно не туда)...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("Запрещается раздавать гамбол");
    }

    public String toString() {
        return "Ожидание поворота кривошипа";
    }
}