package com.explorenest.Pago.service;


import com.explorenest.Pago.domain.Pago;
import com.explorenest.Pago.repository.PagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {
    private PagoRepository pagoRepository;

    public Optional<Pago> getPagoById(int id) {
        return pagoRepository.findById(id);
    }
    public List<Pago> getAllPagos() {
        return pagoRepository.findAll();
    }

    public Optional<List<Pago>> getPagosByMetodo(String metodo) {
        return pagoRepository.findAllByMetodo(metodo);
    }
}
