/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
/**
 *
 * @author Alumno
 */
public class Crear_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader lector;
        FileReader escrito;
        FileWriter archivo = null;
        PrintWriter escritor = null;
        File al;
    try {
        al= new File("C:\\Users\\Alumno\\Desktop\\xd.txt");
            archivo = new FileWriter("C:\\Users\\Alumno\\Desktop\\xd.txt");
            escritor = new PrintWriter(archivo);
            
            escritor.println("hola");
            escritor.println("xd");
        } 
        catch (Exception e) {
            System.out.println("Error: "+   e.getMessage());
        }
        finally{
            archivo.close();
        }
    try {
        escrito = new FileReader("C:\\Users\\Alumno\\Desktop\\xd.txt");
        if (escrito.ready()) {
            
            lector=new BufferedReader(escrito);
            String cadena;
            
            while((cadena= lector.readLine()) !=null){
                System.out.println(cadena);
            }
        } 
        else
        {
            System.out.println("El archivo no esta listo para ser leído... ");
        }
    } 
    catch (Exception e) {
       System.out.println("Error" + e.getMessage());
    }
  }   
}
