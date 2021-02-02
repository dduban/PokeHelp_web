package com.jsfcourse.user;

import java.io.IOException;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;


import pokehelp.entities.User;
import pokehelp.dao.UserDAO;

@Named
@ViewScoped
public class LoginBB implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static final String PAGE_LOGIN = "login?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;

	private User user = new User();

	@EJB
	UserDAO userDAO;
	
	@Inject
	FacesContext context;

	@Inject
	Flash flash;
	
	
	public User getUser() {
		return user;
	}

	public String register() {
		
		
		
		try {
			user.setRole("user");
			userDAO.create(user);
			
			
		} catch (Exception e){
			e.printStackTrace();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wyst¹pi³ b³¹d przy rejestracji", null));
			return null;
			
		}
		return null;
	}
	
}
