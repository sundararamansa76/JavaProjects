package com.hare.krsna.WebServiceToDo;

public class BookImpl {
	Long id;
	String name;
	String author;
	public BookImpl(Long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "BookImpl [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	
}
