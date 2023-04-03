/**
* Tarea: Hoja de trabajo 8
* Autores: Sofia Garcia, Diego Duarte
* Fecha: 02/04/2023
*/

public class Process implements Comparable<Process>{
    String process;
    String username;
    int nice = 0; 
    int priority;

    /**
     * @param processName
     * @param userName
     * @param niceValue
     * Constructor de la clase, se necesita un nombre de proceso, seguido del usuario, valor de nice y la prioridad que es calculada con nice   
     * */
    public Process(String processName, String userName,Integer niceValue){
        this.process = processName;
        this.username = userName;
        this.nice = niceValue;
        Priority(niceValue);
    }

    /**
     * @param niceValue
     * Prioridad es 120 + el valor nice
     */
    private void Priority(Integer niceValue){
        priority = 120+niceValue;
    }

    public Integer getPriority(){
        return priority;
    }
    public int getNice() {
        return nice;
    }
    public String getProcess() {
        return process;
    }
    public String getUsername() {
        return username;
    }

    @Override
    public int compareTo(Process o) {
        return this.getPriority().compareTo(o.getPriority());
    }
    
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append("\n\nProceso: "+getProcess()+"\nNombre de usuario: "+getUsername()+"\nValor nice: "+getNice()+"\nPrioridad: "+getPriority());
        return s.toString();
    }
}
