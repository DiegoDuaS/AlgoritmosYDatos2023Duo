/**
* Tarea: Hoja de trabajo 8
* Autores: Sofia Garcia, Diego Duarte
* Fecha: 02/04/2023
* Interfaz tomada del libro de clase
*/

public interface Priorityqueue<E extends Comparable<E>> {

    /**
    Devuelve el primer elemento de la cola de prioridad sin eliminarlo.
    @return el primer elemento de la cola de prioridad
    */
    public E getFirst();

	/**
    Elimina y devuelve el elemento de mayor prioridad de la cola de prioridad.
    @return el elemento de mayor prioridad de la cola de prioridad
    */
	public E remove();

	/**
    Inserta el elemento dado en la cola de prioridad.
    @param value el elemento que se va a insertar en la cola de prioridad
    */
	public void add(E value);

	/**
    Verifica si la cola de prioridad está vacía.
    @return true si la cola de prioridad está vacía, false en caso contrario
    */
	public boolean isEmpty();

	/**
    Devuelve la cantidad de elementos que hay en la cola de prioridad.
    @return la cantidad de elementos en la cola de prioridad
    */
	public int size();

    /**
    Elimina todos los elementos de la cola de prioridad.
    */
	public void clear();


}
