package com.hare.krsna.WebServiceToDo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<BookImpl> getAllBooks()
	{
		return Arrays.asList(new BookImpl(1l, "HareKrnsa", "PMP"));
	}
}
