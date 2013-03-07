package Result;

import Wennerblom.WennerblomModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class NChart extends ChartBase {                //JPanel-i sisu

    private WennerblomModel model;

    private ChartPanel chartPanel;

    public NChart(WennerblomModel model) {
        this.model = model;
        chartPanel = new ChartPanel(createChart());
    }

    public ChartPanel getChartPanel(){
        return chartPanel;
    }

    /**
     *
     * @return
     */
    protected JFreeChart createChart() {

        DefaultCategoryDataset dataSet = getDataSet();

        JFreeChart oChart = ChartFactory.createBarChart(
                "Nitrogen runoff", //title
                "Nitrogen",         //categoryAxisLabel
                "tons per year",    //valueAxisLabel
                dataSet,            //dataset
                PlotOrientation.HORIZONTAL, //orientation
                true,           //legend
                true,          //tooltips
                false);         //urls

        oChart.setBackgroundPaint(Color.white);
        CategoryPlot plot = oChart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer)plot.getRenderer();
        renderer.setDrawBarOutline(true);

        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue,
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green,
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.red,
            0.0f, 0.0f, Color.lightGray
        );
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        return oChart;
    }

    private DefaultCategoryDataset getDataSet() {
        // row keys...
        String series1 = "Natural";
        String series2 = "Leakage";
        String series3 = "Air pollution";

        // column keys...
        String category1 = "Fallout from the air onto the surface of lakes";
        String category2 = "Leakage from forests";
        String category3 = "Leakage from agricultural land";
        String category4 = "Leakage from wetlands";
        String category5 = "Milking parlors and manure storage";
        String category6 = "Septic tanks";
        String category7 = "Wastewater treatment";
        String category8 = "Runoff and rain";
        String category9 = "Industrial waste water";
        String category10 = "Fish farming";

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

        //Sadenemine õhust järve
        dataSet.addValue(model.getN34(), series1, category1);
        dataSet.addValue(0, series2, category1);
        dataSet.addValue(model.getN40(), series3, category1);
        //Ärakanne metsast
        dataSet.addValue(model.getN30(), series1, category2);
        dataSet.addValue((model.getN43() + model.getN44() + model.getN45()), series2, category2);
        dataSet.addValue(model.getN41(), series3, category2);
        //Ärakanne põllumaalt
        dataSet.addValue(model.getN31(), series1, category3);
        dataSet.addValue(model.getN46(), series2, category3);
        dataSet.addValue(model.getN42(), series3, category3);
        //Ärakanne märgaladelt jm.
        double d = (model.getN32() + model.getN33());
        dataSet.addValue(d, series1, category4);
        dataSet.addValue(0, series2, category4);
        dataSet.addValue(0, series3, category4);
        //Lüpsikojad ja sõnnikuhoidlad
        dataSet.addValue(0, series1, category5);
        dataSet.addValue(model.getN47() + model.getN48(), series2, category5);
        dataSet.addValue(0, series3, category5);
        //Omapuhastid
        dataSet.addValue(0, series1, category6);
        dataSet.addValue(model.getN49(), series2, category6);
        dataSet.addValue(0, series3, category6);
        //Reoveepuhastid
        dataSet.addValue(0, series1, category7);
        dataSet.addValue(model.getN50(), series2, category7);
        dataSet.addValue(0, series3, category7);
        //Otsevoolu- ja sademevesi
        dataSet.addValue(0, series1, category8);
        dataSet.addValue(model.getN51(), series2, category8);
        dataSet.addValue(0, series3, category8);
        //Tööstuse otseheide suublasse
        dataSet.addValue(0, series1, category9);
        dataSet.addValue(model.getN52(), series2, category9);
        dataSet.addValue(0, series3, category9);
        //Kalakasvatus
        dataSet.addValue(0, series1, category10);
        dataSet.addValue(model.getN53(), series2, category10);
        dataSet.addValue(0, series3, category10);

        return dataSet;
    }
}