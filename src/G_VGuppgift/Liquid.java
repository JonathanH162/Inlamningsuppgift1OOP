package G_VGuppgift;
public interface Liquid {
    double tapWater = 0.5;
    double mineralWater = 2;
    double proteinDrink = 0.1;

    default double getTapWater () {
        return tapWater;
    }
    default double getMineralWater () {
        return mineralWater;
    }
    default double getProteinDrink () {
        return proteinDrink;
    }
}
