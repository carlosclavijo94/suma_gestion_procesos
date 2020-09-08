package gestionprocesos;

import javax.swing.JOptionPane;

public class Suma {
	
	
	
	public static void main(String[] args) {
		String n1=JOptionPane.showInputDialog(null,"Ingrese un numero");
		String n2=JOptionPane.showInputDialog(null,"Ingrese un numero");
		
		float num1,num2;
		
		num1=Float.parseFloat(n1);
		num2=Float.parseFloat(n2);
		
		float res;
		res= num1+num2;
		JOptionPane.showMessageDialog(null, "Respuesta: " + res);
		

		
	}
	
	
	
	
	

}
