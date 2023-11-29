package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

import javax.swing.*;

public class JFreeChartHistogramDisplay extends JPanel implements HistogramDisplay {
    @Override
    public void show(String title, String xTitle, String yTitle, double[] data, int bins) {
        JFreeChart histogram = ChartFactory.createHistogram(
                title,
                xTitle,
                yTitle,
                dataSetFrom(data, bins),
                PlotOrientation.VERTICAL,
                false, false, false);
        add(new ChartPanel(histogram));
    }

    private HistogramDataset dataSetFrom(double[] data, int bins) {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("s", data, bins);
        return dataset;
    }
}
