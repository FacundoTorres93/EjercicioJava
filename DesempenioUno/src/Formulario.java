import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JDialog;

/*DESEMPEÑO 1 TORRES FACUNDO - ANALISTA DE SISTEMAS*/
public class Formulario extends JFrame implements ActionListener {

	private JLabel label0, label1,label2, label3, tf1;
	private JComboBox combo1;
	private ButtonGroup bg1,bg2;
	private JRadioButton r1, r2, r3, r4, r5, r6;
	private JCheckBox check1, check2;
	private JButton boton1, boton2, boton3, jButton;
	private JDialog jd;
	public Formulario() {
		setLayout(null);
		label1= new JLabel("Seleccione la marca:");
		label1.setBounds(170, 30, 300, 40);
		add(label1);
		combo1= new JComboBox();
		combo1.setBounds(300, 40, 100, 30);
		add(combo1);
		combo1.addItem("SAMSUNG");
		combo1.addItem("IPHONE");
		combo1.addItem("MOTOROLA");
		


		label0=new JLabel ("VENTA DE CELULARES");
		label0.setBounds(300, 0, 400, 20);
		add(label0);
		
		label2 = new JLabel("Seleccione el tipo:");
		label2.setBounds(170, 85, 300, 40);
		add(label2);
		r1 = new JRadioButton("Básico");
		r1.setBounds(300, 90, 100, 30);
		add(r1);
		r2= new JRadioButton("Estándar");
		r2.setBounds(400, 90, 100, 30);
		add(r2);
		r3= new JRadioButton("Smartphone");
		r3.setBounds(500, 90, 100, 30);
		add(r3);
		bg1= new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		
		
		
		label3= new JLabel("Memoria:");
		label3.setBounds(170, 140 , 300, 40);
		add(label3);
		r4= new JRadioButton("8Gb");
		r4.setBounds(170, 170, 100, 30);
		add(r4);
		r5= new JRadioButton("16Gb");
		r5.setBounds(170, 200, 100, 30);
		add(r5);
		r6= new JRadioButton("32Gb");
		r6.setBounds(170, 230, 100, 30);
		add(r6);
		bg2= new ButtonGroup();
		bg2.add(r4);
		bg2.add(r5);
		bg2.add(r6);
		
		
		check1 = new JCheckBox("Doble cámara trasera");
		check1.setBounds(400, 150, 300, 30);
		add(check1);
		check2= new  JCheckBox("Doble SIM");
		check2.setBounds(400, 180, 300, 30);
		add(check2);
		

		tf1 = new JLabel();
		tf1.setBounds(460, 220, 130, 30);
		add(tf1);

		boton1= new JButton("Calcular importe");
		boton1.setBounds(300, 220, 130, 30);
		add(boton1);
		boton2= new JButton("Ver Diálogo");
		boton2.setBounds(300, 260,130 , 30);
		add(boton2);
		boton3= new JButton("Salir");
		boton3.setBounds(440, 260, 130, 30);
		add(boton3);

		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);

		jd = new JDialog(this);

		jd.setLayout(new FlowLayout());

		jd.setBounds(500, 300, 400, 300);

		JLabel jLabelName = new JLabel("Facundo Torres.");
		JLabel jLabelDesc = new JLabel("Analista de Sistemas, Desempeño de valoración 1. AED2");

		jButton = new JButton("Cerrar");

		jButton.addActionListener(this);

		jd.add(jLabelName);
		jd.add(jLabelDesc);
		jd.add(jButton);
		jd.setVisible(false);

	}
	
	public static void main (String[] args) {
		Formulario f=new  Formulario();
		f.setBounds(0, 0, 700, 400);
		f.setTitle("Desempeño de valoración 1");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jButton){
			jd.setVisible(false);
			return;
		}

		if (e.getSource() == boton2){
			jd.setVisible(true);
			return;
		}

		if (e.getSource() == boton3){
			System.exit(0);
			return;
		}

		String marca = combo1.getSelectedItem().toString();
		float precio = 0;

		if (marca.equals("SAMSUNG")) {
			precio = 200;
		}

		if (marca.equals("IPHONE")) {
			precio = 250;
		}

		if (marca.equals("MOTOROLA")) {
			precio = 180;
		}

		if (r2.isSelected()){
			precio = (float) (precio + (precio * 0.1));
		}

		if (r3.isSelected()){
			precio = (float) (precio + (precio * 0.3));
		}

		if (r4.isSelected()){
			precio =  precio + 30;
		}

		if (r5.isSelected()){
			precio =  precio + 50;
		}

		if (r6.isSelected()){
			precio =  precio + 90;
		}

		if (check1.isSelected()){
			precio += 30;
		}

		if (check2.isSelected()){
			precio += 20;
		}
		tf1.setText(String.valueOf("Precio: U$D " + precio));
	}
}
