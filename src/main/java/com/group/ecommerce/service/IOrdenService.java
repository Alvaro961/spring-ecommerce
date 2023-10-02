package com.group.ecommerce.service;

import java.util.List;

import com.group.ecommerce.model.Orden;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save (Orden orden);
}
