/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llistaCompra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raulvallez
 */

public class LlistaCompra {

    public static void main(String[] args) {
        // Llista de la compra predefinida
        List<String> llista = new ArrayList<>();
        llista.add("Pa");
        llista.add("Llet");
        llista.add("Ous");
        llista.add("Formatge");
        llista.add("Tomàquets");
        llista.add("DVD Batman");
        llista.add("DVD Superman");
        llista.add("DVD Spiderman");
        llista.add("Pepino");
        llista.add("Gelat de vainilla");
        llista.add("Gelat de xocolata");
        llista.add("Gelat de maduixa");

        // Mostrar la llista de la compra
        System.out.println("Llista de la compra:");
        for (String article : llista) {
            System.out.println("- " + article);
        }
    }
}