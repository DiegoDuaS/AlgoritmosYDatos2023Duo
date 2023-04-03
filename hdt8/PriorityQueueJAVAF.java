/**
* Tarea: Hoja de trabajo 8
* Autores: Sofia Garcia, Diego Duarte
* Fecha: 02/04/2023
*/

import java.util.PriorityQueue;

public class PriorityQueueJAVAF<E extends Comparable<E>> implements Priorityqueue<E>  {
    protected PriorityQueue<E> data;

    public PriorityQueueJAVAF(){
        data = new PriorityQueue<E>();
    }

    /**
    Devuelve el primer elemento de la cola de prioridad sin eliminarlo.
    @return el primer elemento de la cola de prioridad
    */
    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        return data.peek();
    }

    /**
    Elimina y devuelve el elemento de mayor prioridad de la cola de prioridad.
    @return el elemento de mayor prioridad de la cola de prioridad
    */
    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return data.remove();
    }

	/**
    Inserta el elemento dado en la cola de prioridad.
    @param value el elemento que se va a insertar en la cola de prioridad
    */
    @Override
    public void add(E value) {
        // TODO Auto-generated method stub
        data.add(value);
    }

	/**
    Verifica si la cola de prioridad está vacía.
    @return true si la cola de prioridad está vacía, false en caso contrario
    */
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size()==0;
    }

	/**
    Devuelve la cantidad de elementos que hay en la cola de prioridad.
    @return la cantidad de elementos en la cola de prioridad
    */
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return data.size();
    }

    /**
    Elimina todos los elementos de la cola de prioridad.
    */
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        data.clear();
    }

    
}
