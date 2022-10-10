package G_VGuppgift;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Plants> plantList = new ArrayList<>(); //Polymorfism
        plantList.add(new Palmtree("Laura", 5));
        plantList.add(new Palmtree("Putte", 1));
        plantList.add(new Carnivorous("Meatloaf", 0.7));
        plantList.add(new Cactus("Igge", 20));

        while (true) {
            String name = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
            Plants plant = getPlant(name, plantList);
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            else if (plant == null) {
                JOptionPane.showMessageDialog(null, "Det finns ingen växt med det här namnet");
                continue;
            }
            plant.printPlant();
        }
    }
    private static Plants getPlant (String name, List<Plants> list) {
        for (Plants p: list) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

}
