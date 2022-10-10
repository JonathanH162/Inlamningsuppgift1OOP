package G_VGuppgift;

import javax.swing.*;
public class Cactus extends Plants{
    public Cactus (String name, double height) {
        this.setName(name);
        this.setHeight(height);
    }
    public void printPlant () { //Polymorfism
        JOptionPane.showMessageDialog(null, PlantType.Kaktusen + " " + getName() + " behöver " + getMineralWater() + " cl mineralvatten per dag.");
    }
}
