package com.idat.EFYaserQuinonezPizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFYaserQuinonezPizzeria.model.Pizzeria;
import com.idat.EFYaserQuinonezPizzeria.repository.PizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {
	
	@Autowired
	private PizzeriaRepository repository;

	@Override
	public List<Pizzeria> listarPizzerias() {
		return repository.findAll();
	}

	@Override
	public String obtenerPizzeria(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarPizzeria(Pizzeria pizzeria) {
		repository.save(pizzeria);		
	}

	@Override
	public void actualizarPizzeria(Pizzeria pizzeria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPizzeria(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
