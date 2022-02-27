package mainpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.umg.data.structures.Queue.ArrayBasedQueue;
import com.umg.data.structures.Queue.LinkedListBasedQueue;

public class Main {
	
	
	public static void main(String[] args){
		
		
		//basadoenarrays();
		basadoenlistas();
		 
	        
	    }
	
	

	public static void basadoenarrays() {
		ArrayBasedQueue tipoArray = new ArrayBasedQueue(10);
		 Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion;  
	 
	        while (!salir) {
	        	System.out.println("BASADO EN ARRAYS");
	        	System.out.println("	1-Encolar");
	    		   System.out.println("	2-Desencolar");
	    		   System.out.println("	3-Cima");	
	    		   System.out.println("	4-Tamaño");
	    		   System.out.println("	5-salir");

	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                    	System.out.println("Ingrese elemenento en cola");
	                    	tipoArray.enqueue(sn.nextLine());
							sn.nextLine();
	                        break;
	                    case 2:
	                    	 System.out.println("	2-Desencolar");
	                    	 System.out.println(" \n El elemento se Desencolo correctamente "+ tipoArray.dequeue());
	 						 sn.nextLine();
	                        break;
	                    case 3:
	                    
	                    	System.out.println("	3-Cima");
	                    	
	                    	
	                    	System.out.println(" \nEl elemento que se encuentra primero en la cola es "+ tipoArray.peek());
							sn.nextLine();
	                    	
	                        break;
	                    case 4:
	                    	System.out.println("	4-Tamaño");
	                    	System.out.println("Tamaño de Cola: "+ tipoArray.size());
							sn.nextLine();
	                        break;
	                    case 5:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 4");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }
		
	}
	
	public static void basadoenlistas() {
		LinkedListBasedQueue tipoLista = new LinkedListBasedQueue();
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
        	System.out.println("BASADO EN LISTAS");
        	System.out.println("	1-Encolar");
    		   System.out.println("	2-Desencolar");
    		   System.out.println("	3-Cima");	
    		   System.out.println("	4-Tamaño");
    		   System.out.println("	5-salir");

 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	System.out.println("	1-Encolar");
                    	tipoLista.enqueue(sn.nextLine());
						sn.nextLine();
                        break;
                    case 2:
                    	 System.out.println("	2-Desencolar");
                    	 System.out.println(" \n El elemento se Desencolo correctamente "+ tipoLista.dequeue());
 						 sn.nextLine();
                        break;
                    case 3:
                    	System.out.println("	3-Cima");	
                    	System.out.println(" \nEl elemento que se encuentra primero en la cola es "+ tipoLista.peek());
						sn.nextLine();
                        break;
                    case 4:
                    	System.out.println("	4-Tamaño");
                    	System.out.println("Tamaño de Cola: "+ tipoLista.size());
						sn.nextLine();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
	
		
		
	}
	

	

	


}
