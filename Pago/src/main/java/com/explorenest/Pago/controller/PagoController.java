package com.explorenest.Pago.controller;

import com.explorenest.Pago.domain.Pago;
import com.explorenest.Pago.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("api/pago")
public class PagoController {
    @Autowired
    private PagoService pagoService;

    @GetMapping("list_pago")
    public List<Pago> getPagos() {
        return pagoService.getAllPagos();
    }

    @GetMapping("pago_por_id")
    public Optional<Pago> getPagoById(int id) {
        return pagoService.getPagoById(id);
    }

    @GetMapping("get_by_metodo")
    public Optional<List<Pago>> getClientByName(String metodo) {
        return pagoService.getPagosByMetodo(metodo);
    }
}
