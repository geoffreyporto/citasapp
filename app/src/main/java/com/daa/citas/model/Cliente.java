package com.daa.citas.model;

import java.util.UUID;

public class Cliente {
    UUID id_Cliente;
    String nombre;
    String email;
    String tel;

    public Cliente(UUID id, String nombre, String email, String tel) {
        this.id_Cliente = id;
        this.nombre = nombre;
        this.email = email;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
