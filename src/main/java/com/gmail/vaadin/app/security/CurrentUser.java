package com.gmail.vaadin.app.security;

import com.gmail.vaadin.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
