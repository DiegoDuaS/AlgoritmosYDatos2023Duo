/**
* Tarea: Hoja de trabajo 8
* Autores: Sofia Garcia, Diego Duarte
* Fecha: 02/04/2023
*/

import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void add(){
        Priorityqueue priorityQueue = new VectorHeap<>();
        Process process = new Process("loquilla100", "purriana", 15);
        priorityQueue.add(process);
        Object result = priorityQueue.getFirst();
        assertEquals(result, process);
    }
    @Test
    public void remove(){
        Priorityqueue priorityQueue = new VectorHeap<>();
        Process process = new Process("loquilla100", "purriana", 15);
        priorityQueue.add(process);
        Object result = priorityQueue.remove();
        assertEquals(result, process);
    }
}