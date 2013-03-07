package Util;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.awt.*;

/**
 * A simple demonstration application showing how to create a bar chart.
 *
 */
public class PieChartDemo extends ApplicationFrame {


    /**
     * Creates a new demo instance.
     *
     * @param title  the frame title.
     */
    public PieChartDemo(final String title) {

        super(title);

        final PieDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);

    }

    /**
     * Returns a sample dataset.
     *
     * @return The dataset.
     */
    private PieDataset createDataset() {

        // create the dataset...
        DefaultPieDataset dataset = new DefaultPieDataset();

        dataset.setValue("Looduslik", new Double(43.2));
        dataset.setValue("Õhusaaste", new Double(10.0));
        dataset.setValue("Ärakanne", new Double(27.5));

        return dataset;

    }

    /**
     * Creates a sample chart.
     *
     * @param dataset  the dataset.
     *
     * @return The chart.
     */
    private JFreeChart createChart(final PieDataset dataset) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createPieChart(
                "Wennerblom",         // chart title
                dataset,                  // data
                true,                     // include legend
                true,                     // tooltips?
                false                     // URLs?
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        return chart;
    }

    public static void main(final String[] args) {

        final PieChartDemo demo = new PieChartDemo("Bar Chart Demo");
        demo.pack();
        demo.setMinimumSize(new Dimension(300, 300));
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}

