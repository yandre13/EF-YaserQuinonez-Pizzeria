package com.idat.EFYaserQuinonezPizzeria.service;

import java.util.List;

import com.idat.EFYaserQuinonezPizzeria.model.Pizzeria;

public interface PizzeriaService {

	public List<Pizzeria> listarPizzerias();
	public String obtenerPizzeria(Integer id);
	public void guardarPizzeria(Pizzeria pizzeria);
	public void actualizarPizzeria(Pizzeria pizzeria);
	public void eliminarPizzeria(Integer id);
}
