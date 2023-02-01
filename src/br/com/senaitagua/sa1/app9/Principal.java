package br.com.senaitagua.sa1.app9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int mes=12;
		int opcao=5;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao 5"));
		
	    switch(opcao) {
	       case 1:
	    	   
			    if(mes==1)
				    System.out.println("Janeiro");
			        break;
	       case 2:
	    	   
	    	   if(mes==1)
				    System.out.println("Janeiro");
			    else
			     	System.out.print("Outro mês");
			    break;
	       case 3:
	    	   
	    	   if(mes==1) {
				    System.out.println("Janeiro");
	    	   }else if(mes==2) {
			     	System.out.print("Fevereiro");
	    	   }else {
			    	System.out.println("Outro mês");
	    	   }
			    break;
	       case 4:
	    	   if(mes==12) {
	    		   for(int i=1;i<=12;i++) {
	    			   System.out.println("Feliz Natal-mes:"+i);
	    		   }
	    	   }else {
	    		   System.out.println("Não é natal!");
	    	   }
	    	   break;
	       case 5:
	    	   if(mes==12) {
	    		   System.out.println("Seja bem vindo ao Banco SS");
	    		   
	    		   int senha;
	    		   int cont=1;
	    		    
	    		   while (cont <= 3) {
	    		   senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
		    		   if(senha == 123) {
		    			   System.out.println("pode sacar");
		    			   break;
		    		   }else{
		    			   System.out.println("senha inválida");
		    			   cont++;
		    		   }
		    			   
		    		if (cont == 4) {
		    			JOptionPane.showMessageDialog(null, "Conta Bloqueada");
		    			break;
		    			}
		    		}
	    	   }
	    	  
			default:
				System.out.println("Não tem essa opção não");
				break;
	    	     
	    }
		
	}
}

