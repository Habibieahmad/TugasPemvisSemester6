/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
/**
 *
 * @author Habibie Ahmad
 */
public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(11,11));
        setForeground(Color.BLACK);        
        setBackground(new Color(240,240,240));
    }
}
