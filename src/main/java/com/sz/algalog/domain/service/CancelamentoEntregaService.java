package com.sz.algalog.domain.service;

import org.springframework.stereotype.Service;

import com.sz.algalog.domain.model.Entrega;
import com.sz.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CancelamentoEntregaService {
	
	private BuscaEntregaService buscaEntregaService;
	private EntregaRepository entregaRepository;
	
	public void cancelar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		entrega.cancelar();
		
		entregaRepository.save(entrega);
	}

}
