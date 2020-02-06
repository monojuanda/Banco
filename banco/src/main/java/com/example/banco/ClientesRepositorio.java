
package com.example.banco;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ClientesRepositorio extends Repository<Clientes, Integer> {
    List<Clientes>findAll();
    Clientes findById(int id);
    Clientes save(Clientes p);
    void delete(Clientes p);
    long count();
}
