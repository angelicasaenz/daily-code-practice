package com.devsenior;

public class CompraService {

    public ResultadoCompra comprar(Carrito carrito){
        if(carrito.estaVacio()) {
            throw new CarritoVacioException("El carrito está vacío");
        }
        carrito.vaciar();
        return new CompraExitosa();
    }

    public String generarMensaje(){
        return "Compra realizada con éxito";
    }
}
