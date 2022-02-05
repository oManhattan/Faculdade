/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste01;

import com.my.utils.GraphUtils;
import java.awt.BorderLayout;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Matheus
 */
public class java {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2021, 4, 4); 
//        LocalDate d = LocalDate.now(); 
        
        JFrame f = new JFrame("ME AJUDA DEUS");
        JPanel p = GraphUtils.createChartPanel(d.minusDays(30), d);
        
        f.add(p, BorderLayout.CENTER);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
