package G_VGuppgift;

import javax.swing.*;

public class Palmtree extends Plants {
    public Palmtree(String name, double height) {
        this.setName(name);
        this.setHeight(height);
    }
    public double plantCalculation () {
        return getTapWater() * getHeight();
    }
    public void printPlant () { //Polymorfism
        JOptionPane.showMessageDialog(null, PlantType.Palmen + " " + getName() + " behöver " + plantCalculation() + " liter kranvatten per dag.");
    }
}
