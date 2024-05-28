/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Manipulador {
    
    public static Properties getProp() throws IOException{
        Properties props = new Properties();
        try{
        FileInputStream file = new FileInputStream("../properties/dados.properties");
        props.load(file);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        return props;
        
    }
}
