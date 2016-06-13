package com.example.samberg.codered;

import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.BarChart;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.model.XYValueSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XYSeries series = new XYSeries("Cycle Lengths");
        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
//        int hour = 0;

//        dataset.addSeries(series);
        // Now we create the renderer

        XYSeries series1 = new XYSeries("Days Between Start Days");
        XYSeries series2 = new XYSeries("Cycle Length");

        series1.add(10,14);
        series2.add(20,6);
        series1.add(40,20);
        series2.add(50,10);
        series1.add(70,17);
        series2.add(80,8);
        XYMultipleSeriesDataset dataSet = new XYMultipleSeriesDataset();
        dataSet.addSeries(series1);
        dataSet.addSeries(series2);

//
//        int x=80, y=40;
//
//        CategorySeries series1 = new CategorySeries("Bar1");
//        CategorySeries series2 = new CategorySeries("Bar2");
//
//        series1.add(x);
//        series2.add(y);
//
//        XYMultipleSeriesDataset dataSet = new XYMultipleSeriesDataset();
//        dataSet.addSeries(series1.toXYSeries());
//        dataSet.addSeries(series2.toXYSeries());

        XYSeriesRenderer renderer = new XYSeriesRenderer();
        renderer.setLineWidth(2);
        renderer.setColor(Color.RED);
        renderer.setDisplayChartValues(true);
        renderer.setChartValuesSpacing(2);



        XYSeriesRenderer renderer2 = new XYSeriesRenderer();
        renderer2.setColor(Color.BLUE);

        renderer2.setDisplayChartValues(true);
        renderer2.setChartValuesSpacing(2);

        renderer2.setLineWidth(10);

        XYMultipleSeriesRenderer mRenderer = new XYMultipleSeriesRenderer();
        mRenderer.addSeriesRenderer(renderer);
        mRenderer.addSeriesRenderer(renderer2);


//
//// Include low and max value
//        renderer.setDisplayBoundingPoints(true);
//// we add point markers
//        renderer.setPointStyle(PointStyle.CIRCLE);
//        renderer.setPointStrokeWidth(3);
//
//        mRenderer.addSeriesRenderer(renderer);

        // We want to avoid black border
        mRenderer.setMarginsColor(Color.argb(0x00, 0xff, 0x00, 0x00)); // transparent margins
// Disable Pan on two axis
        mRenderer.setPanEnabled(false, false);
        mRenderer.setYAxisMax(100);
        mRenderer.setYAxisMin(0);
        mRenderer.setXAxisMax(90);
        mRenderer.setXAxisMin(0);
        mRenderer.setXTitle("CYCLES");
        mRenderer.setYTitle("Days");
        mRenderer.setAxisTitleTextSize(20);
        mRenderer.setShowGrid(true); // we show the grid
        mRenderer.setBarSpacing(2);
        mRenderer.setBarWidth(50);
        mRenderer.setApplyBackgroundColor(true);
        mRenderer.setBackgroundColor(Color.BLACK);
        mRenderer.setLegendTextSize(15);

        GraphicalView chartView = ChartFactory.getBarChartView(this, dataSet, mRenderer, BarChart.Type.DEFAULT);
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
