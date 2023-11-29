package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;

import java.util.List;

public interface HistogramDisplay {
    void show(String title, String xTitle, String yTitle, double[] data, int bins);
}
