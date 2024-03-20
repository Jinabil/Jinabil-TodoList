package com.jina.TodoClasses;

public class Tache {
    private int id_tache;
    private int id_user;
    private String intitule;
    private String description;
    private Statut statut;
    
    public Tache(int id_tache, int id_user, String intitule, String description, Statut statut) {
        this.id_tache = id_tache;
        this.id_user = id_user;
        this.intitule = intitule;
        this.description = description;
        this.statut = statut;
    }
    
    public int getId_tache() {
        return id_tache;
    }
    
    public void setId_tache(int idTache) {
        this.id_tache = idTache;
    }
    
    public int getId_user() {
        return id_user;
    }
    
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    public String getIntitule() {
        return intitule;
    }
    
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Statut getStatut() {
        return statut;
    }
    
    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    
    public enum Statut {
        EN_COURS,
        TERMINE,
        EN_ATTENTE
    }
}