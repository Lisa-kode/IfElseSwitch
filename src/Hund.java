public class Hund {

    //Deklarer variable for objekt Hund

    int legs;       //hvor mange antal ben hunden har (0-4)
    String color;   //hvilken farve hunden har
    boolean clean;  //er hunden pottetrænet (true/false)
    int size;       // hvor stor hunden er (10-120 cm)
    int age;        // hvor gammel er hunden (0-15 år)

    //Getters and setters:

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    //Deklarerer metoder for objekt Hund

    //Hunden kan gø
    public String makeNoise(){
        return "vuf";
    }

    //Hunden kan løbe, hvis den har fire ben
    public boolean run(){ //der er ingen parametre i denne metode, parantesen er tom
        if (legs == 4)
            return true;
        else
            return false;

    }




}
