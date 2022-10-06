package G_VGuppgift;

import javax.swing.*;

public class Cactus extends Plants implements Liquid {
    public Cactus (String name, double height) {
        this.setName(name);
        this.setHeight(height);
    }
    public void printPlant () { //I denna metod använder jag polymorfism tillsammans med metoden med samma namn klasserna Carnivorous och Palmtree.
        JOptionPane.showMessageDialog(null, PlantType.Kaktusen + " " + getName() + " behöver " + getMineralWater() + " cl mineralvatten per dag.");
    }
}
