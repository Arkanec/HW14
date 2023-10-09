public class Hogwarts {

    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void basicCampare(Hogwarts hogwarts) {
        int sum1 = magicPower + transgressionDistance;
        int sum2 = hogwarts.getMagicPower() + hogwarts.getTransgressionDistance();

        if(sum1 > sum2) {
            System.out.println("Ученик 1 лучше чем ученик 2 по базовым параметрам");
        } else if (sum2 > sum1) {
            System.out.println("Ученик 2 лучше чем ученик 1 по базовым параметрам");
        } else {
            System.out.println("Ученики равны по базовым параметрам");
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
