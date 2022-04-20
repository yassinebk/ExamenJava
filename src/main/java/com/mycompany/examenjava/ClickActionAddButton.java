/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenjava;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class ClickActionAddButton extends AbstractAction {
    TacheComplexe tache; 
    JTextField text; 
    JTextField number;
    public ClickActionAddButton(TacheComplexe tache,JTextField text, JTextField number){
        super();
        this.tache=tache;
        this.text=text;
        this.number=number;
    }
    public void actionPerformed (ActionEvent e) {
	       
			  String nom= this.text.getText();
			  String x = this.number.getText();
			 try { 
			  Integer cout= Integer.parseInt(x) ;
			 tache.ajouter(new TacheElementaire(cout,nom) );}
			 
			 catch (NumberFormatException b) 
			 { System.out.println(" Cast String to number for field cout error " + b);
			 this.number.setBackground(Color.RED);}
			 
		
			tache.triNom(new CompNom ());
			 
			  
			  System.out.println("tache ajoutée");
			  
			  }}
    
}
