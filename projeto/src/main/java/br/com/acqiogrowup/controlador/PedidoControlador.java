package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Pedido;
import br.com.acqiogrowup.repositorio.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoControlador {

    @Autowired
    PedidoRepositorio pedidoRepositorio;

    @GetMapping
    public List<Pedido> listar(){
        return pedidoRepositorio.findAll();
    }

    @PostMapping
    public Pedido criar (@RequestBody Pedido pedido){
        return pedidoRepositorio.save(pedido);
    }

}