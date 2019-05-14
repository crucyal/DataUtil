package es.cliente.datautil;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do mês
		   Converte numero do mês para um objecto do enumerado Meses e guarda na variável mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     então
		        LER ano
		        Invocar método classe Data para obter o número de dias do mês
		     senão
		        Invocar método classe Data para obter o número de dias do mês
		        
		   Fim_SE
		   
		
	    */ 
		Data a1 = new Data();
		
		System.out.println(a1.diasMes(Meses.FEVEREIRO,2000));
		System.out.println(a1.diasMes(Meses.JUNHO,2000));
		
		System.out.println(a1.anoBissexto(2019));
		
		System.out.println(a1.diasMes(Meses.AGOSTO));
		
		
		
		
		
	}

}
