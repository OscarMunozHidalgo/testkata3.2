package software.ulpgc.kata3;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;

import software.ulpgc.kata2.*;

public class MainFrame extends JFrame {

    private HistogramDisplay histogramDisplay;

    public HistogramDisplay getHistogramDisplay() {
        return histogramDisplay;
    }

    public MainFrame() throws HeadlessException{
        this.setTitle("HISTOGRAM");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreeChartHistogramDisplay display = new JFreeChartHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }
}
