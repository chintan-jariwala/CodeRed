package com.example.samberg.codered;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.util.EventLogTags;
import android.util.Log;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Graph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
    }
}




public class MainActivity extends AppCompatActivity {

    private static final String Tag = "MainActivity";
    int sum = 0;
    int Average = 0;
    int i = 0;

    ArrayList <String> names;

    List<Integer> testList=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testList.add(14);
        testList.add(20);
        testList.add(17);
        testList.add(10);
        testList.add(25);
        testList.add(55);
        Collections.sort(testList);

        Log.d(Tag, "OnCreate:" + testList +" Size " + testList.size() + "Median " + testList.get(testList.size()/2) );
        int median = testList.size() / 2;			// get median index
        int medianElement = 0;								// make variable to store median element

        if (testList.size() % 2 == 0) {				// testList has even number of elements
            medianElement = testList.get(median) + testList.get(median + 1);
            medianElement = medianElement / 2;	// calculate median for even list
        } else {															// testlist has odd number of elements
            medianElement = testList.get(median);
        }

// do something with medianElement		// medianElement now contains median of testList
        medianElement = testList.size()/2;
        int firstHalfMedian = median/2;
        int secondHalfMedian = (median + testList.size())/2;

        for (int i = firstHalfMedian - 1; i >= 0; i--) {
            testList.remove(i);
        }
        for (int i = testList.size() - 1; i >= secondHalfMedian; i--) {
            testList.remove(i);
        }
        for(int i = 0; i <=testList.size()-1; i++) {
            sum = sum+testList.get(i);
        }
        int endValue = testList.get(testList.size() -1 );
        int firstValue = testList.get(0);

        Average = sum / testList.size();
        Log.d(Tag, "OnCreate:" + testList +"Size" + testList.size() + "Average" + Average);

        XYSeries series = new XYSeries("Cycle Lengths");
        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
//        int hour = 0;

//        dataset.addSeries(series);
        // Now we create the renderer

        XYSeries series1 = new XYSeries("Days Between Start Days");
        XYSeries series2 = new XYSeries("Cycle Length");
        XYSeries series3 = new XYSeries("Prediction");

        series1.add(31,14);
        series2.add(36,6);
        series1.add(120,20);
        series2.add(130,10);
        series1.add(214,17);
        series2.add(224,8);
        series1.add(308,10);
        series2.add(318,30);
        series1.add(400,25);
        series2.add(410,45);
        series1.add(494,55);
        series2.add(504,15);
        series3.add(588,19);
        XYMultipleSeriesDataset dataSet = new XYMultipleSeriesDataset();
        dataSet.addSeries(series1);
        dataSet.addSeries(series2);
        dataSet.addSeries(series3);
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

        renderer2.setLineWidth(5);



        XYSeriesRenderer renderer3 = new XYSeriesRenderer();
        renderer3.setColor(Color.rgb(204,0,204));

        renderer3.setDisplayChartValues(true);
        renderer3.setChartValuesSpacing(2);

        renderer3.setLineWidth(5);

        XYMultipleSeriesRenderer mRenderer = new XYMultipleSeriesRenderer();
        mRenderer.addSeriesRenderer(renderer);
        mRenderer.addSeriesRenderer(renderer2);
        mRenderer.addSeriesRenderer(renderer3);


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
        mRenderer.setXAxisMax(600);
        mRenderer.setXAxisMin(0);
        mRenderer.setXTitle("CYCLES");
        mRenderer.setYTitle("Days");
        mRenderer.setAxisTitleTextSize(20);
        mRenderer.setShowGrid(true); // we show the grid
        mRenderer.setBarSpacing(2);
        mRenderer.setBarWidth(40);
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