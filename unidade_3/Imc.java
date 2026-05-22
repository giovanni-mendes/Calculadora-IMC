package unidade_3;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Imc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JLabel imcTitulo;
	private JLabel classificacaoTitulo;
	private JLabel imcResultado;
	private JLabel classificacaoResultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imc frame = new Imc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Imc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(158, 94, 121, 29);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA DE IMC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 36));
		lblNewLabel.setBounds(10, 21, 634, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso (Kg)");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(69, 97, 79, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Altura (cm)");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(69, 145, 79, 26);
		contentPane.add(lblNewLabel_1_1);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(158, 142, 121, 29);
		contentPane.add(txtAltura);
		
		JButton botao = new JButton("CALCULAR\r\n");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				imcTitulo.setText("IMC");
				classificacaoTitulo.setText("Classificação:");
				
				float peso = Float.parseFloat(txtPeso.getText());
				float altura = Float.parseFloat(txtAltura.getText()) / 100;
				
				float imc = (peso / (altura*altura));
				
				imcResultado.setText(Float.toString(imc));
				
				if (imc < 18.5) {
					classificacaoResultado.setText("Baixo peso");
				} else if (imc < 25) {
					classificacaoResultado.setText("Peso normal");
				} else if (imc < 30) {
					classificacaoResultado.setText("Sobrepeso");
				} else if (imc < 35) {
					classificacaoResultado.setText("Obesidade grau I");
				} else if (imc < 40) {
					classificacaoResultado.setText("Obesidade grau II");
				} else {
					classificacaoResultado.setText("Obesidade grau III");
				}
				
				
			}
		});
		botao.setFont(new Font("Calibri", Font.BOLD, 36));
		botao.setBounds(69, 197, 229, 61);
		contentPane.add(botao);
		
		imcTitulo = new JLabel("");
		imcTitulo.setFont(new Font("Calibri", Font.BOLD, 18));
		imcTitulo.setBounds(396, 101, 53, 22);
		contentPane.add(imcTitulo);
		
		classificacaoTitulo = new JLabel("");
		classificacaoTitulo.setFont(new Font("Calibri", Font.BOLD, 18));
		classificacaoTitulo.setBounds(396, 177, 205, 22);
		contentPane.add(classificacaoTitulo);
		
		imcResultado = new JLabel("");
		imcResultado.setFont(new Font("Calibri", Font.PLAIN, 24));
		imcResultado.setBounds(406, 124, 205, 47);
		contentPane.add(imcResultado);
		
		classificacaoResultado = new JLabel("");
		classificacaoResultado.setFont(new Font("Calibri", Font.PLAIN, 24));
		classificacaoResultado.setBounds(396, 197, 205, 47);
		contentPane.add(classificacaoResultado);

	}
}
