package com.gmail.vaadin.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.vaadin.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
