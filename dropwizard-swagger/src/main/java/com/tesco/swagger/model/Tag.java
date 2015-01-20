package com.tesco.swagger.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Tag")
public class Tag {
	private long id;
	private String name;

	@XmlElement(name = "id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}