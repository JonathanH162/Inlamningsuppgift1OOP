package G_VGuppgift;

import javax.swing.*;

public class Carnivorous extends Plants implements Liquid {
        public Carnivorous (String name, double height) {
                this.setName(name);
                this.setHeight(height);
        }
        public double plantCalculation () { //I denna metod använder jag polymorfism tillsammans med metoden med samma namn i klassen Palmtree.
                return getProteinDrink() + (getHeight() * 0.2);
        }
        public void printPlant () { //I denna metod använder jag polymorfism tillsammans med metoden med samma namn i klasserna Palmtree och Cactus.
                JOptionPane.showMessageDialog(null, "Den " + PlantType.köttätande +  " växten " + getName() + " behöver "
                                                + plantCalculation() + " liter proteindryck per dag.");
        }

}
