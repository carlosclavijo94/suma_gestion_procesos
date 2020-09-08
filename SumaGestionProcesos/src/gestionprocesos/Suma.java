package gestionprocesos;

import javax.swing.JOptionPane;

public class Suma {
	
	
	
	public static void main(String[] args) {
		String n1=JOptionPane.showInputDialog(null,"Ingrese un numero");
		String n2=JOptionPane.showInputDialog(null,"Ingrese un numero");
		
		float num1,num2;
		
		num1=Float.parseFloat(n1);
		num2=Float.parseFloat(n2);
		
		int i,j;
		int a=0;
		int b=0;
		int ver=0;
		int ver1=0;
		
		for(i=1;i<(num1+1);i++){
	         if(num1%i==0){
	             a++;
	            }
	         }
	         if(a!=2){
	              System.out.println("No es Primo");
	            }else{
	            	ver=1;
	                System.out.println("Si es Primo");
	         }
	         
	         
	 		for(j=1;j<(num2+1);j++){
		         if(num2%j==0){
		             b++;
		            }
		         }
		         if(b!=2){
		              System.out.println("No es Primo");
		            }else{
		            	ver1=1;
		                System.out.println("Si es Primo");
		         }
		

		
		
		float res;
		
		if(ver==1 & ver1==1) {
			res= num1+num2;
			JOptionPane.showMessageDialog(null, "Respuesta: " + res);
		}else {
			JOptionPane.showMessageDialog(null, "Por favor ingrese dos numeros primos");
		}

		
		
	}
	
	
	

}
