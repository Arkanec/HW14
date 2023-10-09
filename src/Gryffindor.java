public class Gryffindor extends Hogwarts{

    private int hobility;

    private int honor;

    private int bravery;

    public Gryffindor(int magicPower, int transgressionDistance, int hobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.hobility = hobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getHobility() {
        return hobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "hobility=" + hobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}' + super.toString();
    }

    public void campare(Gryffindor gryffindor) {
        int sum1 = hobility + honor + bravery;
        int sum2 = gryffindor.getHobility() + gryffindor.getHonor() + gryffindor.getBravery();

        if(sum1 > sum2) {
            System.out.println("Ученик 1 лучше чем ученик 2");
        } else if (sum2 > sum1) {
            System.out.println("Ученик 2 лучше чем ученик 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}
