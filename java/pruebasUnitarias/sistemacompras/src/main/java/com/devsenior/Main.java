package com.devsenior;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("**** INICIO DEL SISTEMA DE COMPRAS ****");

        Usuario usuario = new Usuario("angelica@gmail.com", "12345");

        System.out.println("Intentando login con contraseña correcta...");
        boolean loginExitoso = usuario.login("1234");

        if (loginExitoso){
            System.out.println("Login Exitoso. Usuario autenticado");
        } else {
            System.out.println("Login fallido. Usuario no autenticado");
        }

        ProductoRepository repositorio = new ProductoRepository();
        Producto p1 = new Producto("1", "Smartphone", 2323);
        Producto p2 = new Producto("2", "TV", 423432);

        repositorio.guardar(p1);
        repositorio.guardar(p2);


        System.out.println("Buscar producto con ID 1...");
        Producto encontrado = repositorio.buscarPorId("1");

        System.out.println("Producto encontrado: " +
                (encontrado != null ? encontrado.getNombre() : "No encontrado")
        );


        System.out.println("Buscando producto con ID '3'...");
        Producto noEncontrado = repositorio.buscarPorId("3");
        System.out.println("Producto encontrado: " +
                (noEncontrado != null ? noEncontrado.getNombre() : "No encontrado")
        );


        System.out.println("Agregando productos al carrito...");
        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        System.out.println("Productos en el carrito:");
        for (Producto p : carrito.getProductos()) {
            System.out.println("- " + p.getNombre() + "Precio: $" + p.getPrecio());
        }


        System.out.println("Realizando compra...");
        CompraService compraService = new CompraService();

        try {
            ResultadoCompra resultado = compraService.comprar(carrito);

            if(resultado instanceof CompraExitosa){
                System.out.println(compraService.generarMensaje());
            }
        } catch (CarritoVacioException e) {
            System.out.println("Error en la compra: " + e.getMessage());
        }

    }
}