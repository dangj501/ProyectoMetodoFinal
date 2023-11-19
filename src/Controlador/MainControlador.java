package Controlador;

import Modelo.Modelo;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainControlador implements ActionListener{
 private MainWindow ventana;
    private final Modelo modelo = new Modelo();

    public MainControlador(MainWindow ventana) {
        this.ventana = ventana;
    }

    public MainWindow getVentana() {
        return ventana;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setVentana(MainWindow ventana) {
        this.ventana = ventana;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== ventana.btPacientes){
            ventanaPaciente home = new ventanaPaciente();
            ventana.setVisible(false);
            home.setVisible(true);
        }
    }
    
}