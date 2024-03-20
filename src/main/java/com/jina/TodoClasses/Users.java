package com.jina.TodoClasses;

public class Users {
	
		private int id_user;
	    private String nom;
	    private String email;
	    private String password;
	    
	    // Constructeur
	    public Users(int id_user, String nom, String email, String password) {
	    	this.id_user = id_user;
	        this.nom = nom;
	        this.email = email;
	        this.password = password;
	    }
	    
	    // Getters et Setters 
	    public int getId_user() {
	        return id_user;
	    }
	    
	    public void setId_user(int id_user) {
	        this.id_user = id_user;
	    }
	    
	    public String getNom() {
	        return nom;
	    }
	    
	    
	    public void setNom(String nom) {
	        this.nom = nom;
	    }
	    
	    
	    public String getEmail() {
	        return email;
	    }
	    
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    
	    public String getPassword() {
	        return password;
	    }
	    
	   
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
	    
	  
	  
	    
	}



