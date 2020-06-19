package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class RentabilidadFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtInversion;
	private JTextField txtTasa;
	private JLabel lblTasa;
	private JTextField txtFlujo1;
	private JTextField txtFlujo2;
	private JTextField txtFlujo3;
	private JTextField txtFlujo4;
	private JTextField txtFlujo5;
	private JButton btnCalcular;
	private JLabel lblIngreseGanancias;
	private JTextField txtEsRentable;
	private JLabel lblEncabezado7;
	private JTextField txtValorizacion;
	private JTextField txtRentabilidad;
	private JLabel lblSimboloPorcentaje;
	private JLabel lblEncabezado9;
	private JTextField txtRecuperacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentabilidadFrame frame = new RentabilidadFrame();
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
	public RentabilidadFrame() {
		setResizable(false);
		setTitle("Rentabilidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInversión = new JLabel("Monto a invertir");
		lblInversión.setBounds(10, 53, 123, 14);
		contentPane.add(lblInversión);
		
		JLabel lblPregunta = new JLabel("\u00BFQu\u00E9 tasa de inter\u00E9s te pagar\u00EDa un Banco, Cooperativa u otro Proyecto futuro? ");
		lblPregunta.setBounds(10, 82, 414, 14);
		contentPane.add(lblPregunta);
		
		txtInversion = new JTextField();
		txtInversion.setBounds(163, 50, 242, 20);
		contentPane.add(txtInversion);
		txtInversion.setColumns(10);
		
		txtTasa = new JTextField();
		txtTasa.setBounds(163, 107, 242, 20);
		contentPane.add(txtTasa);
		txtTasa.setColumns(10);
		
		lblTasa = new JLabel("Piensa y elige la más alta");
		lblTasa.setBounds(10, 110, 123, 14);
		contentPane.add(lblTasa);
		
		JLabel lblEncabezado1 = new JLabel("Año 1");
		lblEncabezado1.setBounds(10, 165, 46, 14);
		contentPane.add(lblEncabezado1);
		
		JLabel lblSubEncabezado1 = new JLabel("Ganancia / Pérdida");
		lblSubEncabezado1.setBounds(10, 180, 123, 14);
		contentPane.add(lblSubEncabezado1);
		
		txtFlujo1 = new JTextField();
		txtFlujo1.setBounds(163, 174, 242, 20);
		contentPane.add(txtFlujo1);
		txtFlujo1.setColumns(10);
		
		JLabel lblEncabezado2 = new JLabel("Año 2");
		lblEncabezado2.setBounds(10, 205, 46, 14);
		contentPane.add(lblEncabezado2);
		
		JLabel lblSubEncabezado2 = new JLabel("Ganancia / Pérdida");
		lblSubEncabezado2.setBounds(10, 220, 123, 14);
		contentPane.add(lblSubEncabezado2);
		
		txtFlujo2 = new JTextField();
		txtFlujo2.setColumns(10);
		txtFlujo2.setBounds(163, 214, 242, 20);
		contentPane.add(txtFlujo2);
		
		JLabel lblEncabezado3 = new JLabel("Año 3");
		lblEncabezado3.setBounds(10, 245, 46, 14);
		contentPane.add(lblEncabezado3);
		
		JLabel lblSubEncabezado3 = new JLabel("Ganancia / Pérdida");
		lblSubEncabezado3.setBounds(10, 260, 123, 14);
		contentPane.add(lblSubEncabezado3);
		
		txtFlujo3 = new JTextField();
		txtFlujo3.setColumns(10);
		txtFlujo3.setBounds(163, 254, 242, 20);
		contentPane.add(txtFlujo3);
		
		JLabel lblEncabezado4 = new JLabel("Año 4");
		lblEncabezado4.setBounds(10, 285, 46, 14);
		contentPane.add(lblEncabezado4);
		
		JLabel lblSubEncabezado4 = new JLabel("Ganancia / Pérdida");
		lblSubEncabezado4.setBounds(10, 300, 123, 14);
		contentPane.add(lblSubEncabezado4);
		
		txtFlujo4 = new JTextField();
		txtFlujo4.setColumns(10);
		txtFlujo4.setBounds(163, 294, 242, 20);
		contentPane.add(txtFlujo4);
		
		JLabel lblEncabezado5 = new JLabel("Año 5");
		lblEncabezado5.setBounds(10, 325, 46, 14);
		contentPane.add(lblEncabezado5);
		
		JLabel lblSubEncabezado5 = new JLabel("Ganancia / Pérdida");
		lblSubEncabezado5.setBounds(10, 340, 123, 14);
		contentPane.add(lblSubEncabezado5);
		
		txtFlujo5 = new JTextField();
		txtFlujo5.setColumns(10);
		txtFlujo5.setBounds(163, 334, 242, 20);
		contentPane.add(txtFlujo5);
		
		btnCalcular = new JButton("Procesar");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(316, 370, 89, 23);
		contentPane.add(btnCalcular);
		
		lblIngreseGanancias = new JLabel("Ingresa ganancias / pérdidas esperadas");
		lblIngreseGanancias.setBounds(118, 145, 200, 14);
		contentPane.add(lblIngreseGanancias);
		
		JLabel lblConsultaSiTu = new JLabel("\u00BFTU STARTUP ES RENTABLE? ");
		lblConsultaSiTu.setBounds(145, 11, 142, 14);
		contentPane.add(lblConsultaSiTu);
		
		JLabel lblConsulta = new JLabel("CONSULTA AQU\u00CD");
		lblConsulta.setBounds(171, 24, 82, 14);
		contentPane.add(lblConsulta);
		
		JLabel lblEncabezado6 = new JLabel("¿Es rentable?");
		lblEncabezado6.setBounds(10, 407, 64, 14);
		contentPane.add(lblEncabezado6);
		
		txtEsRentable = new JTextField();
		txtEsRentable.setBounds(163, 404, 242, 20);
		contentPane.add(txtEsRentable);
		txtEsRentable.setColumns(10);
		
		lblEncabezado7 = new JLabel("Su valorizaci\u00F3n");
		lblEncabezado7.setBounds(10, 435, 71, 14);
		contentPane.add(lblEncabezado7);
		
		txtValorizacion = new JTextField();
		txtValorizacion.setColumns(10);
		txtValorizacion.setBounds(163, 432, 242, 20);
		contentPane.add(txtValorizacion);
		
		JLabel lblEncabezado8 = new JLabel("Su rentabilidad");
		lblEncabezado8.setBounds(10, 463, 80, 14);
		contentPane.add(lblEncabezado8);
		
		txtRentabilidad = new JTextField();
		txtRentabilidad.setColumns(10);
		txtRentabilidad.setBounds(163, 460, 242, 20);
		contentPane.add(txtRentabilidad);
		
		lblSimboloPorcentaje = new JLabel("%");
		lblSimboloPorcentaje.setBounds(135, 110, 11, 14);
		contentPane.add(lblSimboloPorcentaje);
		
		lblEncabezado9 = new JLabel("A\u00F1os para recuperar inversi\u00F3n");
		lblEncabezado9.setBounds(10, 491, 145, 14);
		contentPane.add(lblEncabezado9);
		
		txtRecuperacion = new JTextField();
		txtRecuperacion.setColumns(10);
		txtRecuperacion.setBounds(163, 488, 242, 20);
		contentPane.add(txtRecuperacion);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCalcular) {
			actionPerformedBtnCalcular(arg0);
		}
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) { 
		try{
			//Declarar variables	
			double inversion, tasa, van, tir, prd;
		    double [] flujos;	    	
		    //Entrada de datos
		    inversion = leerInversion();
		    tasa  	  = leerTasaDescuento(); 
		    if (tasa<0){
		    	JOptionPane.showMessageDialog(this, "Tasa debe ser mayor que cero");
		        txtTasa.requestFocus();
		        txtTasa.selectAll();
		    }
		    else{
			    flujos 	  = leerFlujos();
			    
			    //Procesar
			    van  	  = calcularVAN(tasa, inversion, flujos);
			    tir       = calcularTIR(inversion, flujos);
			    prd       = calcularPRD(tasa, inversion, flujos);
			    
			    //Salida de datos
			    mostrarConclusion(van); 
			    mostrarVAN(van);
			    mostrarTIR(tir);
			    mostrarPRD(prd);	
		    }
		}
	    catch(Exception ex){
	    	JOptionPane.showMessageDialog(this, "Debe ingresar números");
	    }
	}
/*----------------------------------------------------------------------------*/	
	//Entrada de datos
	    public double leerInversion() {
	        double inv;
	        inv = Double.parseDouble(txtInversion.getText());
	    	if(inv>=0) 
	            return inv*(-1);	
	        else 
	            return inv;
	    }   
	    public double leerTasaDescuento() {
	        double ta;
	        ta = Double.parseDouble(txtTasa.getText());
	        return ta/100;
	    }
	    public double[] leerFlujos(){
	    	double[] f = new double[5];	    	
	    	f[0] = Double.parseDouble(txtFlujo1.getText()); 
	    	f[1] = Double.parseDouble(txtFlujo2.getText()); 
	    	f[2] = Double.parseDouble(txtFlujo3.getText()); 
	    	f[3] = Double.parseDouble(txtFlujo4.getText());
	    	f[4] =	Double.parseDouble(txtFlujo5.getText());    
	    	return f;
	    }	    	
/*----------------------------------------------------------------------------*/		
	//Procesar 
	    public double calcularVAN(double ta, double inv, double[] f){
	    	double sum=0;
	    	for (int i=0; i<f.length; i++){
	            sum = sum + f[i]/Math.pow((1+ta),(i+1));              
	    	}  	    	
	    	return Math.round((inv + sum)*100d)/100d;
	    }
	    public double calcularTIR(double inv, double[] f) {
	        //Declarar constantes
	        double RATIO_MIN = 0.01; 
	        double RATIO_MAX = 0.5; 
	        double REPETICION_MAX = 1000; 
	        double PRECISION = 0.00000001; 
	        
	       //Declarar variables
	        int i = 0,j = 0;
	        double anterior = 0.00;
	        double nuevo = 0.00;	        
	        double nuevoRatioEstimado = RATIO_MIN; 
	        double ratioEstimado = RATIO_MIN; 
	        double minRatioEstimado = RATIO_MIN; 
	        double maxRatioEstimado = RATIO_MAX; 
	        double npv = 0.0;
	        double denom = 0.0;
	 
	        for(i=0; i<REPETICION_MAX; i++) {
	            npv = 0.00;
	            npv = npv + inv;
	                for(j=0; j<f.length; j++) {
	                    denom = Math.pow((1 + ratioEstimado),(j+1));
	                    npv = npv + (f[j]/denom);
	                }
	  
	            /* Se detiene cuando el VAN iguala a variable PRECISION */
	            if((npv > 0) && (npv < PRECISION))
	                break;
	            if(anterior == 0)
	                anterior = npv;
	            else
	                anterior = nuevo;
	            nuevo = npv;
	            if(i > 0) {
	                if(anterior < nuevo) {
	                    if(anterior < 0 && nuevo < 0)
	                        maxRatioEstimado = nuevoRatioEstimado;
	                    else
	                        minRatioEstimado = nuevoRatioEstimado;
	                }
	                else {
	                    if(anterior > 0 && nuevo > 0)
	                        minRatioEstimado = nuevoRatioEstimado;
	                    else
	                        maxRatioEstimado = nuevoRatioEstimado;
	                }
	            }
	            ratioEstimado = (minRatioEstimado + maxRatioEstimado)/2;
	            nuevoRatioEstimado = ratioEstimado;
	        }
	        return Math.round(ratioEstimado*1000d)/1000d;
	}
	    
	    public double calcularPRD(double ta, double inv, double[] f){
	    	double sum=0;
	        int i=0;
	        while(i<f.length){  
	            sum = sum + f[i]/Math.pow((1+ta),(i+1));          
	            if(sum>(inv*-1)){
	                sum = sum - f[i]/Math.pow((1+ta),(i+1));
	    	        return Math.round((i-(inv+sum)/(f[i]/Math.pow((1+ta),(i+1))))*100d)/100d;
	            }
	            i++;
	        }
	        	return -99;
	    }       
/*----------------------------------------------------------------------------*/	  	
	//Salida de datos
	    public void mostrarConclusion(double v){  
	    	if (v>0)
	    		txtEsRentable.setText("Sí");
	    	else if (v==0)
	    		txtEsRentable.setText("Indiferente");
	    	else
	    		txtEsRentable.setText("No"); 
	    }  		    
	    public void mostrarVAN(double v){
	    	txtValorizacion.setText(String.valueOf(v));
	    }		
	    public void mostrarTIR(double t){
	    	txtRentabilidad.setText(String.valueOf(t*100)+ "%");  
	    }
	    public void mostrarPRD(double pr){
	    	txtRecuperacion.setText(String.valueOf(pr));
	    }
}