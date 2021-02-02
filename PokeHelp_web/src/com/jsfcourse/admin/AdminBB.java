package com.jsfcourse.admin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.servlet.http.HttpSession;

import org.primefaces.model.SortMeta;

import pokehelp.dao.PokemonDAO;
import pokehelp.entities.Pokemon;

@Named
@ViewScoped
public class AdminBB implements Serializable{


	private String login;
		
	@Inject
	ExternalContext extcontext;
	
	@Inject
	Flash flash;
	
	@EJB
	PokemonDAO pokemonDAO;
	
	private List<Pokemon> filteredPokemons;
	private List<Pokemon> sortBy;
		
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Pokemon> getFullList(){
		return pokemonDAO.getFullList();
	}

	public List<Pokemon> getList(){
		List<Pokemon> list = null;
		
		//1. Prepare search params
		Map<String,Object> searchParams = new HashMap<String, Object>();
		
		
		//2. Get list
		list = pokemonDAO.getFilteredPokemons(searchParams);
		
		return list;
	}
	
	public List<Pokemon> getFilteredPokemons() {
        return filteredPokemons;
    }

    public void setFilteredPokemons(List<Pokemon> filteredPokemons) {
        this.filteredPokemons = filteredPokemons;
    }
    
    
    public List<Pokemon> getSortBy() {
    	System.out.println("hej jestem tu, sortby: "+sortBy);
        return sortBy;
    }
	

		
	
}
