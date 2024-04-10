package com.explorenest.Pago.repository;

import com.explorenest.Pago.domain.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PagoRepository extends JpaRepository<Pago, Integer> {

    Optional<List<Pago>> findAllByMetodo(String metodo);
}
