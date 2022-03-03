package mainpackage;
import com.umg.data.structures.LinkedList.DoublyLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Estructura {
	
	
	public static void main(String[] args) {
		
	
		Scanner sn = new Scanner(System.in);
		//DoublyLinkedList<String> list = new DoublyLinkedList<>();
		 
	        boolean salir = false;
	        DoublyLinkedList<String> list = new DoublyLinkedList<>();
	        int opcion;
	 
	        while (!salir) {
	        	 System.out.println("ESTRUCTURAS DINAMICAS");
	 
	            System.out.println("\n 1.Insertar al inicio");
	            System.out.println("2. Insertar al final ");
	            System.out.println("3. Recorrer hacia adelante");
	            System.out.println("4. Recorrer hacia atrás");
	            System.out.println("5. Mostrar tamaño de lista");
	            System.out.println("6. Mostrar si la lista esta vacia");
	            System.out.println("7. Buscar elemento por valor ");
	            System.out.println("8. Buscar elemento por indice");
	            System.out.println("9. Borrar un elemento");
	            System.out.println("0. Salir");
	 
	            try {
	            	
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                        System.out.println("-------Insertar al inicio-------"+"\n");
	                        
	                        System.out.println(" Ingrese texto en la caja >  " );
	                        list.insertAtHead(sn.nextLine());
	                        sn.nextLine();
	                        
	              
	                        break;
	                    case 2:
	                        System.out.println("--------Insertar al final--------"+"\n");
	                        System.out.println(" Ingrese texto en la caja >  " );
	                        list.insertAtTail(sn.nextLine());
	                        sn.nextLine();
	                        break;
	                    case 3:
	                        System.out.println("---------Recorrer hacia adelante-------"+"\n");
	                        list.traverseForward();
	                        sn.nextLine();
	                        
	                        break;
	                    case 4:
	                        System.out.println("-------Recorrer hacia atrás-------"+"\n");
	                        list.traverseBackward();
	                        sn.nextLine();
	                        
	                        break;
	                    case 5:
	                        System.out.println("-------Mostrar tamaño de lista-------"+"\n");
	                        System.out.println("El tamaño de la lista es  >  "+list.size() );
	                        
	                        sn.nextLine();
	                        break;
	                    case 6:
	                        System.out.println("-------Mostrar si la lista esta vacia-------"+"\n");
	                        if(list.isEmpty()) {
	        					System.out.println("Lista vacia");
	        				}else {
	        					System.out.println("La lista tiene >  " + list.size() + " elementos");
	        				}
	        				sn.nextLine();
	                        break;
	                    case 7:
	                        System.out.println("-------Buscar elemento por valor-------"+"\n");
	                        
	                       DoublyLinkedList<String>.Node<String> retur = list.searchByValue(sn.nextLine());
	                      
	        				if(retur== null) {
	        					
	        					System.out.println("No se encuentran el elemento buscado");
	        				}
	        				else {
	        					System.out.println(" \n Se encontró el elemento > "+retur.toString()+"\n");
	        				}
	        				sn.nextLine();
	                        break;
	                 
	                    case 8:
	                        System.out.println("-------Buscar elemento por indice-------"+"\n");
	                       DoublyLinkedList<String>.Node<String> retur1 = list.searchByIndex(sn.nextInt());
	                     
	                      
	        				sn.nextLine();
	        				if(retur1==null) {
	        					System.out.println("No se encuentra el elemento buscado, use otro indice");
	        				}else {
	        					System.out.println("El elemento encontrado > "+ retur1.toString()+".");
	        				}
	        				sn.nextLine();
	                        
	                        break;
	                    case 9:
	                        System.out.println("------- Borrar un elemento-------"+"\n");
	                        System.out.println("ingrese indice para eliminar elemento"+"\n");
	                        int delet = sn.nextInt();
	        				sn.nextLine();
	        				if(delet==0) {
	        					list.deleteFromHead();
	        				}else if(delet==list.size()-1) {
	        					list.deleteFromTail();
	        				}else {
	        					list.deleteFromPosition(delet);
	        				}
	        				sn.nextLine();
	        				break;
	                        
	                    case 0:
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
