package G_VGuppgift;

import javax.swing.*;

public class Plants {

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
    public void plantLoop () {
        Palmtree laura = new Palmtree("Laura", 5);
        Palmtree putte = new Palmtree("Putte", 1);
        Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);
        Cactus igge = new Cactus("Igge", 20);

        while (true) {
            setName(JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?"));

            if (getName().equalsIgnoreCase("Igge")){
                igge.printPlant();
                break;
            }
            else if (getName().equalsIgnoreCase("Laura")) {
                laura.printPlant();
                break;
            }
            else if (getName().equalsIgnoreCase("Meatloaf")) {
                meatloaf.printPlant();
                break;
            }
            else if (getName().equalsIgnoreCase("Putte")) {
                putte.printPlant();
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ingen växt hittades med det namnet, försök igen med ett annat");
            }

        }
    }


}

