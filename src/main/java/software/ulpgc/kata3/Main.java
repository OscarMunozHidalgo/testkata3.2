package software.ulpgc.kata3;

import software.ulpgc.kata2.CsvFileWaterLoader;
import software.ulpgc.kata2.Water;

import java.awt.*;
import java.io.File;
import java.util.List;
import software.ulpgc.kata2.*;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        List<Water> data = new CsvFileWaterLoader(new File("water_potability.csv")).load();
        double[] finalData = data.stream().mapToDouble(Main::waterToDouble).toArray();
        mainFrame.getHistogramDisplay().show("HARDNESS HISTOGRAM",
                "Hardness",
                "Frequency",
                finalData,
                50);
        for(double d : finalData){
            System.out.println(d);
        }
        mainFrame.setVisible(true);

    }

    private static double waterToDouble(Water water) {
        return water.getHardness();
    }

}
