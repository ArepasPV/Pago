package com.explorenest.Pago.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pago {
    @Id
    private Integer id;
    private Integer reserva_id;
    private Float valor;
    private String metodo_pago;
    private Date fecha_pago;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(Integer reserva_id) {
        this.reserva_id = reserva_id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
}
