package Result;


import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import java.awt.*;

public abstract class ChartBase {

    public abstract ChartPanel getChartPanel();

    protected abstract JFreeChart createChart();

    public static final Font DEFAULT_FONT = new Font("SansSerif", Font.PLAIN, 12);

    public static final String NO_DATA_ERR = "No data available";


}
