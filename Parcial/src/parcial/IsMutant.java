/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class IsMutant {

    public boolean isMutant(List<String> adn) {
        boolean mutant = false;
        int cont=0;
        //Verifica secuencia en filas
        for (String row : adn) {
            if (buscarElementosJuntos(row)) {
                
                cont++;
            }
        }

        // Verifica secuencias en columnas
        for (int j = 0; j < adn.size(); j++) {
            StringBuilder columna = new StringBuilder();
            for (String row : adn) {
                columna.append(row.charAt(j));
            }
            if (buscarElementosJuntos(columna.toString())) {
                
                cont++;
            }
        }

        // Verifica secuencias en diagonales
        for (int i = 0; i < adn.size() - 3; i++) {
            for (int j = 0; j < adn.get(i).length() - 3; j++) {
                StringBuilder diagonal = new StringBuilder();
                for (int k = 0; k < 4; k++) {
                    diagonal.append(adn.get(i + k).charAt(j + k));
                }
                if (buscarElementosJuntos(diagonal.toString())) {
                    
                    cont++;
                }
            }
        }
        if (cont>=2){
            mutant=true;
            return mutant;
        }
    return mutant;
        
    }

    // Función que verifica si una cadena contiene alguna de las secuencias dadas
    public boolean buscarElementosJuntos(String cadena) {
        return cadena.contains("AAAA") || cadena.contains("TTTT") || cadena.contains("CCCC") || cadena.contains("GGGG");
    }
}
