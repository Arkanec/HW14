public class Slizerin extends Hogwarts {

    private int cunning;

    private int determination;

    private int ambition;

    private int resourcefunles;

    private int thirstForPower;

    public Slizerin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefunles, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefunles = resourcefunles;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefunles() {
        return resourcefunles;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefunles=" + resourcefunles +
                ", thirstForPower=" + thirstForPower +
                '}' + super.toString();
    }

    public void campare(Slizerin slizerin) {
        int sum1 = cunning + determination + ambition + resourcefunles + thirstForPower;
        int sum2 = slizerin.getCunning() + slizerin.getDetermination() + slizerin.getAmbition() +
                slizerin.getResourcefunles() + slizerin.getThirstForPower();

        if(sum1 > sum2) {
            System.out.println("Ученик 1 лучше чем ученик 2");
        } else if (sum2 > sum1) {
            System.out.println("Ученик 2 лучше чем ученик 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}
