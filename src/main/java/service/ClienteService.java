package service;

import entity.Cliente;
import java.util.List;

public interface ClienteService {

    List<Cliente> listarTodos();
    void guardar(Cliente cliente);
    Cliente buscarPorId(Integer id);
    void eliminar(Integer id);

}
