
package com.example.banco;

import java.util.List;

public interface ClienteService {
    List<Clientes>listar();
    Clientes listarId(int id);
    Clientes add(Clientes p);
    Clientes edit(Clientes p);
    Clientes delete(int id);
   
}
