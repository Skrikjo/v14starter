package com.gmail.vaadin.ui.exceptions;

public class AccessDeniedException extends RuntimeException {
	public AccessDeniedException() {
	}

	public AccessDeniedException(String message) {
		super(message);
	}
}
