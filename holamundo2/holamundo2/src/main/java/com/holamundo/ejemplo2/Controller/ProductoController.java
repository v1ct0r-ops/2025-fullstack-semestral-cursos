package com.holamundo.ejemplo2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @GetMapping
    public String index(){
        return "Bienvenido al listado de productos.";
    }

    @GetMapping("/productos/{idProducto}")
    public String productos(@PathVariable String idProducto){

        List producto = new ArrayList<>();

        producto.add("a");
        producto.add("b");
        producto.add("c");

        if (producto.contains(idProducto)){
            return "Producto encontrado";
        }else{
            return "No encontrado";
        }
    }

}
