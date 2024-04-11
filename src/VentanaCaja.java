import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCaja {
    private JTextField ingreseElCodigoTextField;
    private JTextField codigoTextField;
    private JButton AñadirButton;
    private JTextArea textArea1;
    private JButton mostrarButton;
    private JTextField nombreEmpresaTextField;
    private JComboBox comboBox1;
    private JButton buscarButton;
    private JComboBox comboBox2;


    private Pila pila1= new Pila();
    private Pila pila2= new Pila();
    private Pila pila3= new Pila();

    public VentanaCaja() {

        AñadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String selectedItem = comboBox2.getSelectedItem().toString();
            if(selectedItem.equals("1")){
                if(pila1.gettamanio()<6){
                    pila1.apilar(codigoTextField.getText(),nombreEmpresaTextField.getText(),comboBox2.getSelectedItem().toString());
               textArea1.setText(pila1.toString());
                }else{
                    JOptionPane.showConfirmDialog(null,"Esta vacia");

                }

            }
            //comprobar si la pila esta vacia


            }
        });
    }


}
