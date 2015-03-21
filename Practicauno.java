
package uno;

import java.util.*;

public class Practicauno {
	public static void main(String[] args) {
		
		Scanner z=new Scanner (System.in);
		System.out.println("1.Grafica");
		System.out.println("2.Media y nota en letra est.IPC1");
		System.out.println("3.Conversion de hora 24hrs a 12hrs (ingrese 5 caracteres 00:00)");
		System.out.println("4.Area, perimetro y radio (3 figuras)");
		System.out.println("5.Diferencia de dias entre 2 fechas (todos los meses 30 dias)");
		System.out.println("6.Calculadora (suma,resta,Division y multiplicacion)");
		System.out.println("7.Tabla de multiplicar (entre 0 y 10)");
		System.out.println("8.Numero entre 0 y 100 aleatorio en letras");
		System.out.println("9.Numero arabigo a romano");
		System.out.println("10.Piramide inversa de x numero");
		System.out.println("11.Numeros romanos en letras (mayor y menor de listado)");
		System.out.println("12.Letras ingresados con asteriscos");
		System.out.println("13.Encontrar letra ingresada (antes o despues)");
		System.out.println("14.Dibujar cuadrado de N elementos * ");
		System.out.println("15.Ingresar n, y cuantos primos hay de 0 a n");
		
		System.out.println("\n              Ingrese el No. De su opción");
		int a=z.nextInt();
		switch (a) {
		case 1:		
	System.out.println("     *");
	System.out.println("    ***");
	System.out.println("   *****");
	System.out.println("  *******");
	System.out.println(" *********");
	System.out.println("  *******");
	System.out.println("   *****");
	System.out.println("    ***");
	System.out.println("     *");break;
	
		case 2:
			int b,c,d,e,f,g,h;
			Scanner notas=new Scanner (System.in);
			System.out.println("Ingrese nota 1 de 6 entre (0pts y 100pts) para saber su promedio");
			b=notas.nextInt();
			if (b<0 || b>100){
				System.out.println("La nota no esta en el rango correcto lea mejor a la proxima");
			}else{
			System.out.println("Ingrese nota 2 de 6 entre (0pts y 100pts) para saber su promedio");
			c=notas.nextInt();
			if (c<0 || c>100){
				System.out.println("La nota no esta en el rango correcto lea mejor a la proxima");
			}else{
			System.out.println("Ingrese nota 3 de 6 entre (0pts y 100pts) para saber su promedio");
			d=notas.nextInt();
			if (d<0 || d>100){
				System.out.println("La nota no esta en el rango correcto lea mejor a la proxima");
			}else{
			System.out.println("Ingrese nota 4 de 6 entre (0pts y 100pts) para saber su promedio");
			e=notas.nextInt();
			if (e<0 || e>100){
				System.out.println("La nota no esta en el rango correcto lea mejor a la proxima");
			}else{
			System.out.println("Ingrese nota 5 de 6 entre (0pts y 100pts) para saber su promedio");
			f=notas.nextInt();
			if (f<0 || f>100){
				System.out.println("La nota no esta en el rango correcto lea mejor a la proxima");
			}else{
			System.out.println("Ingrese nota 6 de 6 entre (0pts y 100pts) para saber su promedio");
			g=notas.nextInt();
			if (g<0 || g>100){
				System.out.println("La nota no esta en el rango correcto lea mejor a la proxima");
			}
		
			h=((b+c+d+e+f+g)/6);
			
			System.out.println("MEDIA             PUNTUACION");
			System.out.println("(90-100)                A");
			System.out.println("(80-89)                 B");
			System.out.println("(70-79)                 C");
			System.out.println("(60-69)                 D");
			System.out.println("(0-59)                  E");
			
			if(h>=90 && h<=100){
			System.out.println("su nota promedio es   "+h+"  Equivalente a una: A");}
			if(h>=80 && h<=89){
			System.out.println("su nota promedio es   "+h+"  Equivalente a una: B");}
			if(h>=70 && h<=79){
			System.out.println("su nota promedio es   "+h+"  Equivalente a una: C");}
			if(h>=60 && h<=69){
			System.out.println("su nota promedio es   "+h+"  Equivalente a una: D");}
			if(h>=0 && h<=59){
			System.out.println("su nota promedio es   "+h+"  Equivalente a una: E");}
			
			}}}}}
		break;
		
		case 3:
			Scanner S=new Scanner(System.in); 
			String teclado; 
			System.out.println("Ingrese Hora en formato 24hrs: debe digitar 5 caracteres. ejemplo (00:00)"); 
			teclado=S.nextLine(); 
			
			int hora,min; 
			hora=Integer.parseInt( teclado.substring(0,2)); 
			min=Integer.parseInt( teclado.substring (3,5)); 
			if((hora>=0 && hora <=24) && (min<=60 && min>=0)){
			if(hora==0){ 
			System.out.println((hora+12)+":"+ min+" AM"); 
			}else if(hora==12){ 
			System.out.println(hora+":"+ min+" PM"); 
			}	
			else if(hora>=0 && hora<12){ 
			System.out.println(hora+":"+ min+" AM"); 
			} 
			else{ 
			System.out.println((hora-12)+":"+ min+" PM"); 
			} 
			}else System.out.println("no esta ingresando bien la hora");
			break;
			
			
		case 4:
			Scanner ok=new Scanner(System.in);
			System.out.println("Escriba C=circulo U=cuadrado, T=triangulo, seguido de X para obtener area y perimetro de la fig. ejemplo (C,3) ");
			String datas=ok.nextLine();
			String form;
			double nu=Double.parseDouble(datas.substring(2,3));
			form=datas.substring(0,2);
			char swif=form.charAt(0);
			switch (swif){
			
			case 'C':
				System.out.println("Si el radio del Circulo es= "+nu);
				System.out.println("El perimetro es= "+2*Math.PI*nu);
				System.out.println("El area es= "+Math.PI*(nu*nu));
			break;
			case 'U':
				System.out.println("Si un lado del Cuadrado es= "+nu);
				System.out.println("El perimetro es= "+4*nu);
				System.out.println("El area es= "+nu*nu);
				
			break;	
			case 'T':
				System.out.println("Si un lado del Trinagulo es= "+nu);
				System.out.println("El perimetro es= "+3*nu);
				System.out.println("El area es= "+0.5*(nu*nu));
			break;	
			default: System.out.println("No ingreso ninguna opcion correcta");
			
			break;
			}
	
			break;
			
		case 5:
			Scanner u=new Scanner(System.in);
			String fecha;
			System.out.println("Ingrese la primera fecha de la sig. Manera (DD/MM/AÑOS) EJE. (00/00/0000)");
			fecha=u.nextLine();
			String fecha2;
			System.out.println("Ingrese la segunda fecha de la sig. Manera (DD/MM/AÑOS) EJE. (00/00/0000)");
			fecha2=u.nextLine();
			long dia,mes,año,dia2,mes2,año2,total,total2,Diferencia;
			dia=Long.parseLong(fecha.substring(0,2));
			mes=Long.parseLong(fecha.substring(3,5));
			año=Long.parseLong(fecha.substring(6,10));
			total=(dia+(mes*30)+(año*360));
			dia2=Long.parseLong(fecha2.substring(0,2));
			mes2=Long.parseLong(fecha2.substring(3,5));
			año2=Long.parseLong(fecha2.substring(6,10));
			total2=(dia2+(mes2*30)+(año2*360));
			Diferencia=(total-total2);
			if (Diferencia<0){
			System.out.println("la diferencia en dias es "+(-Diferencia)+" dias");
			}else {
				System.out.println("la diferencia en dias es  "+Diferencia+" dias");
			}
			break;
		case 6:
			Scanner calc=new Scanner(System.in);
			double numb,numb2;
			System.out.println("Ingrese el primer numero");
			numb=calc.nextDouble();
			System.out.println("Ingrese el segundo numero");
			numb2=calc.nextDouble();
			
			Scanner op=new Scanner(System.in);
			System.out.println("Seleccione la operacion de la que desea su resultado");
			System.out.println(" s = obtener suma de sus 2 numeros");
			System.out.println(" r = obtener diferencia de sus 2 numeros");
			System.out.println(" m = obtener el producto de sus 2 numeros");
			System.out.println(" d = obtener el cociente de sus 2 numeros");
			char calcu=op.next().charAt(0);
			switch (calcu){
			case 's':
				System.out.println("La suma de sus numeros es:  "+(numb+numb2));
				break;
			case 'r':
				System.out.println("La diferencia de sus numeros es:  "+(numb-numb2));
				break;
			case 'm':
				System.out.println("El producto de sus numeros es:  "+(numb*numb2));
				break;
			case 'd':
				System.out.println("El cociente de sus numeros es:  "+(numb/numb2));
				break;
			
			default: System.out.println("No ingreso ninguna opcion correcta");
			}
			break;
		
		case 7:
		       Scanner  tabla= new Scanner(System.in);
		        System.out.print("Introduce un número entero del 0 al 10, para ver su tabla ");
		        int n = tabla.nextInt();
		        if (n<=10 && n>=0){
		        System.out.println("Tabla del " + n);
		        for(int i=10; i>=0; i--){
		             System.out.println(n + " * " + i + " = " + n*i); }
		        }
		        else System.out.println("no esta dentro del rango indicado la tabla");
		        break;
		case 8:
				Scanner ocho=new Scanner(System.in);
				System.out.println("ingrese su primer numero ó limite inferior del intervalo (0 a 100)");
				int date=ocho.nextInt();
				if (date<0 || date>100){
					System.out.println("El dato ingresado no esta en el rango que se le indico");
				}else{
				System.out.println("ingrese su segundo numero ó limite superior del intervalo (0 a 100)");
				int date2=ocho.nextInt();
				if (date2<0 || date2>100){
					System.out.println("El dato ingresado no esta en el intervalo que se le indico");
				}
				else{
				int date3=(int)(Math.random()*(date-date2+1)+date2);
		        System.out.println("su numero aleatorio es "+date3);
				
		 String[] UNIDADES = { "CERO", "UNO ", "DOS ", "TRES ","CUATRO ", "CINCO ", "SEIS ", "SIETE ", "OCHO ", "NUEVE ", "DIEZ " };
		 String[] DECENAS = { "VENTI", "TREINTA ", "CUARENTA ","CINCUENTA ", "SESENTA ", "SETENTA ", "OCHENTA ", "NOVENTA ","CIEN " };
		 String[] ESPECIALES = { "ONCE ", "DOCE ", "TRECE ", "CATORCE ", "QUINCE ", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE" };
		 
		    if(date3>=0 && date3<11)  
	             System.out.print("\n su numero aleatorio es" + UNIDADES[date3]);           
	        else if(date3<20)  
	            System.out.print("\n su numero aleatorio es" + ESPECIALES[date3-11]);          
	         else if(date3<100){  
	            int unid = date3 % 10;  
	            int dec = date3/10;  
	            if(unid == 0)  
	                System.out.print("\n su numero aleatorio es" + DECENAS[dec-2]);                  
	            else  
	                System.out.print("\n su numero aleatorio es" + DECENAS[dec-2]+ " y " + UNIDADES[unid]);  
	         }}}
				
				
		        break;
		case 9:
			Scanner roma=new Scanner(System.in);
		
			
			   String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
			   String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
			   String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
			     System.out.println("Ingresa numero entre 1 y 999");  
			      int arabe=roma.nextInt();  
			      int uni =arabe%10;  
			      int dece =(arabe/10)%10;  
			      int cente =arabe/100;  
			      if(arabe>=100){           
			          System.out.println(Centena[cente]+Decena[dece]+Unidad[uni]);  
			      }else{  
			          if(arabe>=10){  
			              System.out.println(Decena[dece]+Unidad[uni]);            
			          }else{  
			              System.out.println(Unidad[arabe]);            
			          }            
			      }          
			
			break;
		case 10:
			Scanner leer=new Scanner(System.in); 
			int x;
			System.out.println("Escribir un numero: ");
			x=leer.nextInt();  
			int espacios,asteriscos,i,j;
			
		       for ( espacios=0, asteriscos=(x*2)-1; asteriscos>0;espacios++, asteriscos-=2){
	
		            for (i=1; i<=espacios;i++){
		                System.out.print(" ");
		            }
		
		            for (j=asteriscos; j!=0;j--){
		                
		                		System.out.print(i);
		                		
		            }
		            System.out.println("");
		       }
		        
		
			
		break;
		
		case 11:
			System.out.println("");
			break;
		
		case 12:
		System.out.println("");
			break;
		case 13:
		System.out.println("");
			break;
		case 14:
		Scanner relle=new Scanner(System.in);
		System.out.println("Ingrese un numero n, para fabricar un cuadrado de n lados");
		int relleno=relle.nextInt();
		int l,r;
		 for(l=1; l<=relleno ;l++){        
		       for (r=1; r<=relleno; r++)
		           {
		               if (r == 1 || r == relleno || l == 1 || l == relleno)
		               {
		                   System.out.print("* ");
		               }
		               else{
		                   System.out.print("  ");
		                   }
		            }
		            System.out.println();
		
	
		 }
		
		
			break;
			
		case 15:
			Scanner xm=new Scanner(System.in);
			boolean primo;
			int rango;
			int registro=0;
			int im,jm; // para los for
			int w;
			System.out.println("Introduce un rango inicial: ");
			w=xm.nextInt();

			System.out.println("Introduce un rango final: ");
			rango=xm.nextInt();
			System.out.println();
			for(im=w;im<=rango;im++)
			{
			primo=true;
			jm=2;
			while(jm<=im-1 && primo==true)
			{
			if(im%jm==0)
			primo=false;
			jm++;
			}
			if(primo==true)
			{
			registro++;
			System.out.println(im+(" Es numero primo"));
			}
			}
			
			
			break;
			
	 	default: 	System.out.println(" Lo siento no es opcion");
		
		}	
	}

}
