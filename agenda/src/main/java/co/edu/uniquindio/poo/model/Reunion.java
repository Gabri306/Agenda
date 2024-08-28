package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reunion {
    private String descripcion;
    private LocalDate fecha; 
    private LocalTime hora;
    private Contacto[] listaContactosAsistentes;

    public Reunion(String descripcion, LocalDate fecha, LocalTime hora,int numeroContactos){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.listaContactosAsistentes = new Contacto[numeroContactos];

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + "]";
    }

    public void asignarContactoAsistente(Contacto contacto) {
        for (int i = 0; i < listaContactosAsistentes.length; i++) {
            if (listaContactosAsistentes[i] == null) {
                listaContactosAsistentes[i] = contacto;
                break;
            }
        }
    }
    

}