package es.cliente.datautil;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do m�s
		   Converte numero do m�s para um objecto do enumerado Meses e guarda na vari�vel mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     ent�o
		        LER ano
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		     sen�o
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		        
		   Fim_SE
		   
		
	    */ 
		Data a1 = new Data();
		
		System.out.println(a1.diasMes(Meses.FEVEREIRO,2000));
		System.out.println(a1.diasMes(Meses.JUNHO,2000));
		
		System.out.println(a1.anoBissexto(2019));
		
		System.out.println(a1.diasMes(Meses.AGOSTO));
		
		
		
		
		
	}

}
