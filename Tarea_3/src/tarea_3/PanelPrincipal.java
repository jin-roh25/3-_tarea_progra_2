/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_3;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel{
    
    private Comprador com; 
    private Expendedor exp;
    
    public PanelPrincipal(){ 
        exp = new Expendedor(4,200);
        com = new Comprador(null,exp,0); 
        this.setBackground(Color.white); 
    } 
    /*public void paint (Graphics g) {  //todo se dibuja a partir de este método 
         super.paint(g);  //llama al método pint al que hace override en la super clase 
                          //el de la super clase solo pinta el fondo (background)          
         com.paint(g);    //llama al metodo paint definido en el comprador 
         exp.paint(g);    //llama al metodo paint definido en el expendedor 
    } */  
}
