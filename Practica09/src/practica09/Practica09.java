/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author ing_jd
 */
public class Practica09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String ruta = "/home/ing_jd/Documents/Curso_Git/Test_PF_Git/RegistroII.txt";
        String contenido = "Administrador;123456;";

        try 
         {
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) 
            {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.close();
                System.out.println("Archivo Generado");
            }
            else
            {
                Scanner input = new Scanner(new File(ruta));        
                //while (input.hasNextLine()) 
                //{
                    String line = input.nextLine();
                //    System.out.println(line);
                //}

                input.close();

                System.out.println(line);

            if (line.equals(contenido)) 
                System.out.println("Archivo Correcto");
            else
                System.out.println("Archivo Corrupto");

            }            
            //Tester
            
         } 
         catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        
        
        
    }
    
}
