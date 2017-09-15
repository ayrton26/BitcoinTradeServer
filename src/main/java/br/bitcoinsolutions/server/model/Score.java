/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.bitcoinsolutions.server.model;

import java.io.Serializable;

/**
 *
 * @author tj
 */
public class Score implements Serializable {
    
    private int id;
    private Usuario usuario;
    private int pontos;

    public Score() { }

    public Score(int id, Usuario usuario, int pontos) {
        this.id = id;
        this.usuario = usuario;
        this.pontos = pontos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
    @Override
    public int hashCode(){
        return this.id;
    }
    
    @Override
    public boolean equals(Object d){
        return d.hashCode() == this.hashCode();
    }
    
    
}
