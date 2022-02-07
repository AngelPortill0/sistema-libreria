package logica;

import java.awt.Color;
import java.io.*;
import java.util.HashMap;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset; 
import org.jfree.chart.ChartUtils;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.ui.RectangleEdge;

public class Reporte {
    
    private HashMap<String, Integer> datos = new HashMap<>(); 
    private DefaultPieDataset dataset = new DefaultPieDataset();
    
    public Reporte(HashMap<String, Integer> datos){
        
        for(String dato: datos.keySet())
            dataset.setValue(dato, datos.get(dato));
    }
    
    public void graficar() throws IOException {     

        JFreeChart chart = ChartFactory.createPieChart( 
         "Géneros Literarios más Frecuentes" ,  // chart title                   
         dataset ,                              // data 
         true ,                                 // include legend                   
         true, 
         false);
        
        chart.getLegend().setFrame(BlockBorder.NONE);

        PiePlot plot = (PiePlot) chart.getPlot();  
        plot.setSimpleLabels(true);
        
        PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("{2}");
        plot.setLabelGenerator(generator);
        
        plot.setBackgroundPaint(Color.WHITE);
        
        plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0}: {1}"));
        
        plot.setSectionOutlinesVisible(true);
        
        LegendTitle legend = chart.getLegend();
        legend.setPosition(RectangleEdge.RIGHT);
        
        int width = 1280;   /* Width of the image */             
        int height = 720;  /* Height of the image */                             
        File pieChart = new File( "generos_mas_comunes" );                           
        ChartUtils.saveChartAsPNG(pieChart, chart, width, height);
        
        JOptionPane.showMessageDialog(null, "Reporte generado, revise su directorio!");
   }
}
