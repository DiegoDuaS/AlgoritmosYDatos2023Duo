/**
* Tarea: Hoja de trabajo 8
* Autores: Sofia Garcia, Diego Duarte
* Fecha: 02/04/2023
*/

import java.io.BufferedReader;
import java.io.FileReader;

public class Controller {
    View vista = new View();
    Priorityqueue<Process> priorityqueue;

   

    public void procesar (){
        String archivo = vista.archivodestino();
        int choice = vista.tipodequeue();
        if (choice == 1){
            priorityqueue = new PriorityQueueJAVAF<>();
        }
        else if (choice == 2){
            priorityqueue = new VectorHeap<>();
        }
        else{
            vista.error();
        }
        createVector(priorityqueue, archivo);
        while (!priorityqueue.isEmpty()){
            vista.printprocess(priorityqueue.remove());
        }
    }

    
    /**
     * @param priorityQueue
     * crea el priority queue al leer el archivo 
     */
    public static void createVector(Priorityqueue priorityQueue, String dirección){
        FileReader ar;
        BufferedReader reader;
        try {
            ar = new FileReader(dirección);
            if (ar.ready()) {
                reader = new BufferedReader(ar);
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    priorityQueue.add(new Process(data[0],data[1],Integer.valueOf(data[2])));
                }
                
            } else {
                System.out.println("archivo no encontrado");
               
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
          
        }
    }
}
