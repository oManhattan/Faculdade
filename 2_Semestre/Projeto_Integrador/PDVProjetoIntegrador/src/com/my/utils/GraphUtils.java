/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.utils;

import com.bancodados.model.dao.DaoRelatorio;
import java.awt.BasicStroke;
import java.awt.BorderLayout;

import com.janela.main.JanelaMain;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Matheus
 */
public class GraphUtils {

    public static JPanel createChartPanel(LocalDate inicio, LocalDate fim) { // this method will create the chart panel containin the graph 
        DaoRelatorio daoRelatorio = new DaoRelatorio();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ArrayList<String[]> list = daoRelatorio.getGraph(inicio, fim);
        
        for (String[] i : list) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
        if (list.isEmpty()) {

        } else {
            for (String[] i : list) {
                dataset.addValue(Double.parseDouble(i[2]), i[1], i[0]);
            }
        }

        JFreeChart chart = ChartFactory.createLineChart("Relatório Sintético", "Data (dd/mm/aaaa)", "Valor (R$)", dataset);

        customizeChart(chart);
        
       
        return new ChartPanel(chart);
    }

    private static void customizeChart(JFreeChart chart) {   // here we make some customization
        CategoryPlot plot = chart.getCategoryPlot();
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();

        Color c = new Color(214, 217, 223);

        chart.setBackgroundPaint(c);

        // sets paint color for each series
        renderer.setSeriesPaint(0, Color.YELLOW);
        renderer.setSeriesPaint(1, Color.GREEN);

        // sets thickness for series (using strokes)
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        renderer.setSeriesStroke(1, new BasicStroke(3.0f));

        // sets paint color for plot outlines
        plot.setOutlinePaint(Color.BLACK);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        // sets renderer for lines
        plot.setRenderer(renderer);

        // sets plot background
        plot.setBackgroundPaint(Color.LIGHT_GRAY);

        // sets paint color for the grid lines
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
    }
}
