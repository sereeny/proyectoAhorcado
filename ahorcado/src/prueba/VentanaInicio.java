package prueba;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaInicio extends JFrame {

    public VentanaInicio() {
        setTitle("Juego del Ahorcado");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Ingrese su nombre:");
        JTextField txtNombre = new JTextField(20);
        JButton btnIniciar = new JButton("Iniciar Juego");
        //Poner el action Listener del boton

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(txtNombre);
        panel.add(btnIniciar);

        add(panel);
        setVisible(true);
    }
    
    String[] opciones = {"Pop", "Peliculas", "Paises"};
    String genero = (String) JOptionPane.showInputDialog(null, "Elige un género", "Selección", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    

	
}
