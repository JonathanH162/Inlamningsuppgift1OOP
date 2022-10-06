package G_VGuppgift;

import javax.swing.*;

public class Palmtree extends Plants implements Liquid {
    public Palmtree(String name, double height) {
        this.setName(name);
        this.setHeight(height);
    }
    public double plantCalculation () { //I denna metod använder jag polymorfism tillsammans med metoden med samma namn i klassen Carnivorous.
        return getTapWater() * getHeight();
    }
    public void printPlant () { //I denna metod använder jag polymorfism tillsammans med metoderna med samma namn klassen Carnivorous och Cactus.
        JOptionPane.showMessageDialog(null, PlantType.Palmen + " " + getName() + " behöver " + plantCalculation() + " liter kranvatten per dag.");
    }



}
