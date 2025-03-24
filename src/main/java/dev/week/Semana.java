package dev.week;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Semana {
    private List<String> diasSemana;

    public Semana() {
        this.diasSemana = new ArrayList<>();
    }
    public void crearListaDias() {
        this.diasSemana.add("Lunes");
        this.diasSemana.add("Martes");
        this.diasSemana.add("Miercoles");
        this.diasSemana.add("Jueves");
        this.diasSemana.add("Viernes");
        this.diasSemana.add("Sabado");
        this.diasSemana.add("Domingo");
    }
    public List<String> obtenerDiasSemana() {
        return this.diasSemana;
    }
    public int testObtenerLargoLista() {
        return this.diasSemana.size();

    public boolean eliminarDia(String dia) {
        return this.diasSemana.remove(dia); 
    }    

    



    }

