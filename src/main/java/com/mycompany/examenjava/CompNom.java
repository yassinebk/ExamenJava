/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenjava;
import java.util.Comparator;

public class CompNom implements Comparator<Tache> {

    /** @params a:string b
     * @returns one
     */
    public CompNom() {
    }

    public int compare(Tache o1, Tache o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
