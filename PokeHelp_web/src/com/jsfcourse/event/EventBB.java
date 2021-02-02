package com.jsfcourse.event;

import java.io.IOException;
import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.Date; 

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;


import pokehelp.entities.Event;
import pokehelp.dao.EventDAO;

@Named
@ViewScoped
public class EventBB implements Serializable {
	
	
	private Event event = new Event();

	@EJB
	EventDAO eventDAO;
	
	@Inject
	FacesContext context;

	@Inject
	Flash flash;
	
	
	public Event getEvent() {
		return event;
	}

	public String addEvent() {
		
		
		
		
		
		try {
			
			
			
			eventDAO.create(event);
			System.out.println(event.getNazwa());
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Dodawanie eventu powiod³o siê", null));
			
			
		} catch (Exception e){
			e.printStackTrace();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wyst¹pi³ b³¹d przy rejestracji", null));
			return null;
			
		}
		return null;
	}

}




