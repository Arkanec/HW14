public class Kogtevran extends Hogwarts {

    private int smart;

    private int wise;

    private int witty;

    private int creativity;

    public Kogtevran(int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}' + super.toString();
    }

    public void campare(Kogtevran kogtevran) {
        int sum1 = smart + wise + witty + creativity;
        int sum2 = kogtevran.getSmart() + kogtevran.getWise() + kogtevran.getWitty() + kogtevran.getCreativity();

        if(sum1 > sum2) {
            System.out.println("Ученик 1 лучше чем ученик 2");
        } else if (sum2 > sum1) {
            System.out.println("Ученик 2 лучше чем ученик 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}
