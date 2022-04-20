/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenjava;


import java.util.Comparator;

public class CompCout implements Comparator<Tache> {

    public CompCout() {
    }

    public int compare(Tache o1, Tache o2) {
        int k = o1.getCout() - o2.getCout();
        if (k > 0)
            return 1;
        else if (k < 0)
            return -1;
        return 0;
    }
}
