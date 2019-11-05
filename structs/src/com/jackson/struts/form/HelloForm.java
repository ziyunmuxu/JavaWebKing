/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.jackson.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/** 
 * MyEclipse Struts
 * Creation date: 11-05-2019
 * 
 * XDoclet definition:
 * @struts.form name="helloForm"
 */
public class HelloForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String[] hobby;
	private int age;
	private boolean experience;


	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (name == null || name.trim().length() == 0)
			errors.add("name", new ActionMessage("hello.error.name"));

		if (hobby == null || hobby.length < 1)
			errors.add("hobby", new ActionMessage("hello.error.hobby"));

		if (age < 5)
			errors.add("age", new ActionMessage("hello.error.age", 5));

		return errors;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		age = 5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isExperience() {
		return experience;
	}

	public void setExperience(boolean experience) {
		this.experience = experience;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
}