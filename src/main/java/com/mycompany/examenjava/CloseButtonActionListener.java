/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenjava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class CloseButtonActionListener implements ActionListener {
JFrame fenetre;
    public CloseButtonActionListener(JFrame aThis) {
    this.fenetre=aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fenetre.dispose();
    }
    
}
