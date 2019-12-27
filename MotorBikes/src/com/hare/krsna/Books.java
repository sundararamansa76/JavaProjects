package com.hare.krsna;

public class Books {

	private int pageContent = 0;
	private boolean pageReview = false;
	private int totalPages = 0;

	private int bookSold = 0;

	public Books(int booksSold) {
		this.bookSold = booksSold;
	}

	public int getTotalPages() {
		return this.totalPages;
	}

	public int getBookSold() {
		return this.bookSold;
	}

	public void setBookSold(int bookSold) {
		this.bookSold = bookSold;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageContent() {
		return this.pageContent;
	}

	public void setPageContent(int pageContent) {
		this.pageContent = pageContent;
	}

	public boolean isPageReview() {
		return this.pageReview;
	}

	public void setPageReview(boolean pageReview) {
		this.pageReview = pageReview;
	}

	void contentsPrint() {
		System.out.println("Contents ");
	}
}
