package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	
List<Item> findAll();




}
