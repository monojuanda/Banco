
package com.example.banco;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String ciudad;
    @Column 
    private int telefono;
    @Column
    private int tarjetas;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    
}
