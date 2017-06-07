/**
 * Created by Тим on 07.06.2017.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Подождите, мы уже даем вам Gumball");
    }

    public void ejectQuarter() {
        System.out.println("Подождите, мы уже даем вам Gumball");
    }

    public void turnCrank() {
        System.out.println("Поворот снова не принесет вам еще один гамбол!");
    }

    public void dispense() {
        System.out.println("ВЫ ПОБЕДИТЕЛЬ! Вы получаете два gumballs для своего квартала");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Ой, из gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public String toString() {
        return "Десорбирование двух gumballs для вашего квартала, потому что ВЫ ПОБЕДИТЕЛЬ!";
    }
}