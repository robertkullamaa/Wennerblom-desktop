package Result;

import Util.LanguageResourceBundle;
import Wennerblom.WennerblomModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class PPieChart extends ChartBase {                //JPanel-i sisu

    private WennerblomModel model;

    private ChartPanel chartPanel;

    /**
     *
     * @param model
     */
    public PPieChart(WennerblomModel model) {
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

        DefaultPieDataset dataSet = getDataSet();

        JFreeChart chart = ChartFactory.createPieChart(
                "Lämmastik",              // chart title
                dataSet,                  // data
                true,                     // include legend
                true,                     // tooltips?
                false                     // URLs?
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(DEFAULT_FONT);
        plot.setNoDataMessage(NO_DATA_ERR);
        plot.setCircular(false);
        plot.setLabelGap(0.02);

        return chart;
    }

    private DefaultPieDataset getDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        String series1 = LanguageResourceBundle.getBundle().getString("PieChartSeries1");
        String series2 = LanguageResourceBundle.getBundle().getString("PieChartSeries2");
        String series3 = LanguageResourceBundle.getBundle().getString("PieChartSeries3");

        double series1Data = 0;
        double series2Data = 0;
        double series3Data = 0;

        //Sadenemine õhust järve
        series1Data += model.getN34();
        series3Data += model.getN40();
        //Ärakanne metsast
        series1Data += model.getN30();
        series2Data += model.getN43() + model.getN44() + model.getN45();
        series3Data += model.getN41();
        //Ärakanne põllumaalt
        series1Data += model.getN31();
        series2Data += model.getN46();
        series3Data += model.getN42();
        //Ärakanne märgaladelt jm.
        series1Data += model.getN32() + model.getN33();
        //Lüpsikojad ja sõnnikuhoidlad
        series2Data += model.getN47() + model.getN48();
        //Omapuhastid
        series2Data += model.getN49();
        //Reoveepuhastid
        series2Data += model.getN50();
        //Otsevoolu- ja sademevesi
        series2Data += model.getN51();
        //Tööstuse otseheide suublasse
        series2Data += model.getN52();
        //Kalakasvatus
        series2Data += model.getN53();



        dataset.setValue(series1, series1Data);
        dataset.setValue(series2, series2Data);
        dataset.setValue(series3, series3Data);

        return dataset;
    }
}