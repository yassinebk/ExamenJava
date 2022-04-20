package com.mycompany.examenjava;
import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
import java.util.ArrayList;

 public class TacheComplexeSwing {

 private TacheComplexe tache;
 final JFrame fenetre = new JFrame("Nouvelle tâche");
 final private JTextField valeurNom = new JTextField(10);
 final private JTextField valeurCout = new JTextField(10);
 final private JButton boutonAjouter = new JButton("Ajouter");
 final private JButton boutonQuitter = new JButton("Quitter");
 JList list; 
DefaultListModel<String> tacheElem; 

public TacheComplexeSwing(TacheComplexe tache) {
 this.tache = tache;
 this.tacheElem=  new DefaultListModel<String>();
 while(tache.iterator().hasNext()){
    this. tacheElem.addElement( tache.iterator().next().getNom());
 }
this.list =new JList<String>(this.tacheElem);
fenetre.add(list);
 Container c = fenetre.getContentPane();
 c.setLayout(new BorderLayout());
 JPanel informations = new JPanel(new GridLayout(2,2));
 informations.add(new JLabel("Nom : ", SwingConstants.RIGHT));
 informations.add(valeurNom);
 informations.add(new JLabel("Coût : ", SwingConstants.RIGHT));
 informations.add(valeurCout);
 c.add(informations, BorderLayout.CENTER);
 boutonAjouter.addActionListener(new ClickActionAddButton(tache,this.valeurNom,this.valeurCout));
 boutonQuitter.addActionListener(new CloseButtonActionListener(this.fenetre));
         
         
         

 JPanel boutons = new JPanel(new FlowLayout());
 boutons.add(boutonAjouter);
 boutons.add(boutonQuitter);
 c.add(boutons, BorderLayout.SOUTH);

 fenetre.pack();
 fenetre.setVisible(true);

 }

     public static void main(String[] args) {
         TacheComplexe t2= new TacheComplexe("A");
         TacheComplexeSwing t1 = new TacheComplexeSwing(t2);
     }
 }