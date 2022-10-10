package G_VGuppgift;

import javax.swing.*;
public class Carnivorous extends Plants{
        public Carnivorous (String name, double height) {
                this.setName(name);
                this.setHeight(height);
        }
        public double plantCalculation () {
                return getProteinDrink() + (getHeight() * 0.2);
        }
        public void printPlant () { //Polymorfism
                JOptionPane.showMessageDialog(null, "Den " + PlantType.köttätande +  " växten " + getName() + " behöver "
                                                + plantCalculation() + " liter proteindryck per dag.");
        }
}
