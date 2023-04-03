/**
* Tarea: Hoja de trabajo 8
* Autores: Sofia Garcia, Diego Duarte
* Fecha: 02/04/2023
*Clase tomada como referencia del libro de clase
*/

import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements Priorityqueue<E>{

	protected Vector<E> data; 

    /**
    * Crea una nueva cola de prioridad vacía utilizando un Vector.
    */
	public VectorHeap(){
		data = new Vector<E>();
	}

    /**
     * Crea una nueva cola de prioridad a partir de un Vector dado.
     * 
     * @param v Vector de elementos a agregar a la cola de prioridad
     */
	public VectorHeap(Vector<E> v){
		int i;
		data = new Vector<E>(v.size()); 
		for (i = 0; i < v.size(); i++){ 
			add(v.get(i));
		}
	}

    /**
     * Devuelve el índice del padre de un elemento en la cola de prioridad.
     * 
     * @param i índice del elemento
     * @return índice del padre del elemento
     */
	protected static int parent(int i){
		return (i-1)/2;
	}


    /**
     * Devuelve el índice del hijo izquierdo de un elemento en la cola de prioridad.
     * 
     * @param i índice del elemento
     * @return índice del hijo izquierdo del elemento
     */
	protected static int left(int i){
		return 2*i+1;
	}


    /**
     * Devuelve el índice del hijo derecho de un elemento en la cola de prioridad.
     * 
     * @param i índice del elemento
     * @return índice del hijo derecho del elemento
     */
	protected static int right(int i){
		return (2*i+1) + 1;
	}

    /**
     * Mueve un elemento hacia arriba en la cola de prioridad hasta su posición correcta.
     * 
     * @param leaf índice del elemento a mover
     */
	protected void percolateUp(int leaf){
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

    /**
     * Agrega un elemento a la cola de prioridad.
     * 
     * @param value elemento a agregar
     */
	public void add(E value){
		data.add(value);
		percolateUp(data.size()-1);
	}

    /**
     * Mueve el elemento de la raíz hacia abajo en la cola de prioridad hasta su posición correcta.
     * 
     * @param root índice del elemento de la raíz
     */
	protected void pushDownRoot(int root){
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize){
				if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo(data.get(childpos)) < 0)){
					childpos++;
				}

			if ((data.get(childpos)).compareTo (value) < 0){
				data.set(root,data.get(childpos));
				root = childpos; 
			} 
            else { 
				data.set(root,value);
				return;
			}
			} 
            else { 
				data.set(root,value);
				return;
			}
		}
	}

    /**
    * Elimina el elemento con la prioridad más alta de la cola de prioridad y lo devuelve.
    * Si la cola de prioridad está vacía, devuelve null.
    *
    * @return el elemento con la prioridad más alta de la cola de prioridad o null si la cola está vacía.
    */
	public E remove(){
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

    /**
     * Devuelve el primer elemento del vector, que es el mínimo en la cola de prioridad.
     * @return el primer elemento del vector
     */
    @Override
    public E getFirst() {
        return data.get(0);
    }

    /**
     * Verifica si la cola de prioridad está vacía.
     * @return true si la cola de prioridad está vacía, false en caso contrario
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Devuelve el número de elementos en la cola de prioridad.
     * @return el número de elementos en la cola de prioridad
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    @Override
    public void clear() {
        data.clear();
    }
}