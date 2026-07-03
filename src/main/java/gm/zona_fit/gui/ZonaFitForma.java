package gm.zona_fit.gui;

import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import jakarta.annotation.PostConstruct;

@Component
public class ZonaFitForma extends JFrame{
    private JPanel panelPrincipal;
    IClienteServicio clienteServicio;

    @Autowired
    public ZonaFitForma(IClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
        iniciarForma();
    }

    @PostConstruct
    public void iniciarForma() {
        if (panelPrincipal == null) {
            // Parche de seguridad por si el diseñador visual no instanció el panel a tiempo
            panelPrincipal = new JPanel();
        }
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null); // Centra la ventana en pantalla
        setVisible(false); // Hace visible tu ventana de Zona Fit
    }
}
