/**
* Tarea: Hoja de trabajo 8
* Autores: Sofia Garcia, Diego Duarte
* Fecha: 02/04/2023
*/

import java.util.Scanner;

public class View {
    
    String answer;
    int choice;
    Scanner sc = new Scanner(System.in);


    
    /** escoger el archivo a leer
     * @return String
     */
    public String archivodestino (){
        System.out.println("\t\t\t\t\t\tBienvenido a ChichicasteLinux!!!\nPor favor ingrese la dirección del archivo que desea utilizar: ");
        answer = sc.nextLine();
        return answer;
    }


    /** escoger el tipo de priority queue
     * @return int
     */
    public int tipodequeue (){
        System.out.println("\n\nQué tipo de implementación de Priority Queue desea utilizar?\n1. VectorHeap\n2. Priority Queue de JF");
        choice = sc.nextInt();
        return choice;
    }

    /** 
     * mensaje de error
     */
    public void error(){
        System.out.println("Opción inválida");
    }

    public void printprocess(Process process){
        System.out.println(process);
    }
    
}
