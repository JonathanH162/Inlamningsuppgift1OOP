package G_VGuppgift;
public class Plants implements Liquid {
    private double height; //Här använder jag inkapsling på dessa essentiella variabler.
    private String name; //Här använder jag inkapsling på dessa essentiella variabler.

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name får inte vara blank");
            return;
        }
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("Height får inte vara mindre än 0");
            return;
        }
        this.height = height;
    }
    public void printPlant () { //Polymorfism

    }
}

