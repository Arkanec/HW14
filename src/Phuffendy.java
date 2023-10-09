public class Phuffendy extends Hogwarts {

    private int hardwork;

    private int loyal;

    private int honest;

    public Phuffendy(int magicPower, int transgressionDistance, int hardwork, int loyal, int honest) {
        super(magicPower, transgressionDistance);
        this.hardwork = hardwork;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardwork() {
        return hardwork;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Phuffendy{" +
                "hardwork=" + hardwork +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}' + super.toString();
    }

    public void campare(Phuffendy phuffendy) {
        int sum1 = hardwork + loyal + honest;
        int sum2 = phuffendy.getHardwork() + phuffendy.getLoyal() + phuffendy.getHonest();

        if(sum1 > sum2) {
            System.out.println("Ученик 1 лучше чем ученик 2");
        } else if (sum2 > sum1) {
            System.out.println("Ученик 2 лучше чем ученик 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}
