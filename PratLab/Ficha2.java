package PratLab;

import java.util.Scanner;

public class Ficha2 {
	public static void main(String[] args) {
		//System.out.println("O resultado é: " + numTotalVogais("A Maria comeu a sopa"));
		//System.out.println("O resultado é: " + numTotalVogais("A Anita foi comer"));
		//numVogais("A Anita foi comer");
		//numVogais("Eu estou cansado");
		
		//teste correção do Ex4
		//int a=factor(0);
		//System.out.println(a);
		
		Scanner myNumber = new Scanner(System.in);
		System.out.println("Insira o número de segundos");
		convertSeconds(myNumber.nextInt());
		myNumber.close();
	}
	
	
	//Ex1: Area triângulo
	public static int areaTriang(int altura, int base){
		return base*altura/2;
	}
	//Ex2: Area Retangulo
	public static int areaRetang(int altura, int comprimento){
		return comprimento*altura;
	}
	//Ex3: areaCal
	public static int areaCal(int x, int y, int z){
		int Aux;
		if (z==1){
			Aux=areaTriang(x,y);
		}
		else {
			Aux=areaRetang(x,y);
		}
		return Aux;
	}
	//Ex4: função factor ciclo
	public static int factor(int n){
		int Aux=1;
		while (n>0){		//Correção: não pode ser =0 senão multiplica por 0 (0!=1)
			Aux=Aux*n;
			n-=1;
		}
		return Aux;
	}
	//Ex5: factor recursivo
	public static int factorRecursivo(int n){
		if(n==0){		//condição de paragem é zero senao começa a factoriar negativos (-1, -2, -3)
			return 1;
		}
		else{
			return n*factorRecursivo(n-1);
		}
	}
	//Ex6: Numero de vogais numa frase	->em vez de ifs, pode-se criar um array com as vogais e comparar só com os membros do array
		public static int numTotalVogais(String frase){
			int Aux=0;
			char letra;
			String palavra=frase.toLowerCase();
			for (int i = 0; i < palavra.length(); i++) {
				letra=palavra.charAt(i);
				  if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){	//pode ser substituido por comparação com um array
					  Aux+=1;
				  }
				}
			return Aux;
		}
		//Ex7: Numero de cada vogal
		public static void numVogais(String frase){
			int numA=0;
			int numE=0;
			int numI=0;
			int numO=0;
			int numU=0;
			String palavra=frase.toLowerCase();
			char letra;
			for (int i = 0; i < palavra.length(); i++) {
				letra=palavra.charAt(i);
				switch(letra){    
					case 'a':    
						numA+=1;   
					break;  //optional  
					case 'e':    
						numE+=1;     
				 	break;
					case 'i':    
						numI+=1;     
				 	break;
					case 'o':    
						numO+=1;     
				 	break;
					case 'u':    
						numU+=1;     
				 	break;    
				default:     
				  //code to be executed if all cases are not matched;
					break;
				}  
			}	
			//imprime resultados
			System.out.println("O numero de cada vogal na frase '" + frase + "' é:");
			System.out.println("a " + numA);
			System.out.println("e " + numE);
			System.out.println("i " + numI);
			System.out.println("o " + numO);
			System.out.println("u " + numU);
		}
		//Ex8: converte segundos em segundos, minutos, horas, dias e meses
		public static void convertSeconds(int aSegundos){
			int meses=aSegundos/2592000;	//1 mes = 30 dias = 30*24*60*60 segundos
			int aux=aSegundos-meses*2592000;
			int dias=aux/86400;			//1 dia =24 horas = 24*60*60 segundos
			aux=aux-dias*86400;
			int horas=aux/3600;			//1 hora = 60 minutos = 60*60=3600 segundos
			aux=aux-horas*3600;
			int minutos=aux/60;			//1 minuto = 60 segundos
			int segundos=aux-minutos*60;	
			//imprime resultados
			System.out.println("Month: " + meses);
			System.out.println("Day: " + dias);
			System.out.println("Hour: " + horas);
			System.out.println("Minute: " + minutos);
			System.out.println("Seconds " + segundos);
		}
}
