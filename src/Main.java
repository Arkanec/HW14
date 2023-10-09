public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(95, 100,86,90,97);
        Gryffindor ronYizli = new Gryffindor(81,90,76,79, 70);
        Gryffindor germionaGrenjer = new Gryffindor(90,95,94,100,98);

        Kogtevran joyChang = new Kogtevran(90, 80,75,80,69,89);
        Kogtevran padmaPatil = new Kogtevran(78, 79,73,78,73,79);
        Kogtevran markusBelbi = new Kogtevran(81,64,82,95,76,85);

        Slizerin drakoMalfoy = new Slizerin(95,100,97,92,96,94,92);
        Slizerin grehemMontegu = new Slizerin(97,85,69,72,89,92,98);
        Slizerin gregoryGoil = new Slizerin(97,84,92,97,86,94,89);

        Phuffendy zahariaSmit = new Phuffendy(78,94,58,92,87);
        Phuffendy sedrikDiggory = new Phuffendy(95,100,97,95,98);
        Phuffendy jastinFinch = new Phuffendy(98,48,96,62,82);

        System.out.println(harryPotter);
        System.out.println(ronYizli);
        System.out.println(germionaGrenjer);

        harryPotter.campare(germionaGrenjer);
        joyChang.campare(markusBelbi);
        drakoMalfoy.campare(gregoryGoil);
        zahariaSmit.campare(sedrikDiggory);
        harryPotter.basicCampare(drakoMalfoy);
    }
}