package com.example.samberg.codered;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.BarChart;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XYSeries series = new XYSeries("London Temperature hourly");
        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
        int hour = 0;
        series.add(10,14);
        series.add(20,6);
        series.add(40,20);
        series.add(50,10);
        series.add(70,17);
        series.add(80,8);
        dataset.addSeries(series);
        // Now we create the renderer
        XYSeriesRenderer renderer = new XYSeriesRenderer();
        renderer.setLineWidth(2);
        renderer.setColor(Color.RED);
// Include low and max value
        renderer.setDisplayBoundingPoints(true);
// we add point markers
        renderer.setPointStyle(PointStyle.CIRCLE);
        renderer.setPointStrokeWidth(3);

        XYMultipleSeriesRenderer mRenderer = new XYMultipleSeriesRenderer();
        mRenderer.addSeriesRenderer(renderer);

        // We want to avoid black border
        mRenderer.setMarginsColor(Color.argb(0x00, 0xff, 0x00, 0x00)); // transparent margins
// Disable Pan on two axis
        mRenderer.setPanEnabled(false, false);
        mRenderer.setYAxisMax(20);
        mRenderer.setYAxisMin(0);
        mRenderer.setXAxisMax(90);
        mRenderer.setXAxisMin(0);
        mRenderer.setShowGrid(true); // we show the grid

        GraphicalView chartView = ChartFactory.getBarChartView(this, dataset, mRenderer, BarChart.Type.DEFAULT);
        LinearLayout chartLayout = (LinearLayout)findViewById(R.id.chart);
        chartLayout.addView(chartView,0);
//        for (DailyCycle dc : nextDailyCycle) {
//            series.add(hour++,
//                    dc.cycle.currentCondition.getDays());
//
//            if (days > 42)
//                break;
//        }
//        GraphicalView chartView =
//                ChartFactory.getBarChartView(getActivity(), dataset, mRenderer, BarChart.Type.DEFAULT);
    }
}
