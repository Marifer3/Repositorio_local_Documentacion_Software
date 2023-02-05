/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2ejercicio1;
import javax.swing.JOptionPane;
/**
 *
 * @author maria
 */
public class Tarea2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double matriz [][]=new double [3][3];
        rellenaMatriz(matriz);
        muestraMatriz(matriz);
        suma(matriz);
    }
    public static int num(String output){
        return Integer.parseInt(JOptionPane.showInputDialog(output));
    }
    public static void rellenaMatriz(double valor[][]){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                valor[ i ][ j ] = num("Digite los valores para matriz");
            }    
        }   
    }
    public static void muestraMatriz(double valor[][]){
        for(int i=0;i<valor.length;i++){
            System.out.printf("%n");
            for(int j=0;j<valor[0].length;j++){
                System.out.print(valor[i][j]+" ");
            }        
        }    
    }
    public static void suma(double valor[][]){
        double suma=0;
        for(int i = 0; i < 3; i++){
            for(int j=0; j < 3; j++){
                double num = valor[i][j];
                suma=num+suma;
            }        
        }
        System.out.println();
        System.out.println("La suma total de los valores es de: "+suma);
    }    
}    