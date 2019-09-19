public class MainStart {

    public static void main(String[] args) {

        Hund goldenRetriever = new Hund();

        goldenRetriever.setAge(5);
        goldenRetriever.setColor("golden");
        goldenRetriever.setClean(true);
        goldenRetriever.setLegs(3);
        goldenRetriever.setSize(55);

        //Kan hunden løbe?
        if (goldenRetriever.run())
            System.out.println("Hunden løber");
        else
            System.out.println("Hunden kan ikke løbe");

        //Hunden størreslse - er den mellem 80 og 100?
        if (goldenRetriever.size > 80 && goldenRetriever.size < 100)
            System.out.println("Størrelsen passer");
        else
            System.out.println("Størrelsen passer ikke");

        //ANVENDELSE AF IF/ELSE (https://www.w3schools.com/java/java_conditions.asp)

        // Er hunden lille, mellem eller stor?
        if (goldenRetriever.size > 0 && goldenRetriever.size < 30)
            System.out.println("Hunden er lille");
        else if (goldenRetriever.size > 31 && goldenRetriever.size < 60)
            System.out.println("Hunden er mellem");
        else if (goldenRetriever.size > 61 && goldenRetriever.size < 90)
            System.out.println("Hunden er stor");
        else // her skal ikke være et statement, for dét er ro resultatet, hvis alt ovenstående ikke passer
            System.out.println("Hunden er ekstra stor");


        // ANVENDELSE AF SWITCH (https://www.w3schools.com/java/java_switch.asp)

        int sizeInterval;
        sizeInterval = goldenRetriever.size / 30;
        switch (sizeInterval) {
            case 0:
                System.out.println("Hunden er lille");
                break;
            case 1:
                System.out.println("Hunden er mellem");
                break;
            case 2:
                System.out.println("Hunden er stor");
                break;
            case 3:
                System.out.println("Hunden er ekstra stor");
                break;
        }
    }

}
