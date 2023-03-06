package br.com.thaizacn.dao;

import java.util.Collection;

import br.com.thaizacn.domain.Cliente;

/**
 * @author thaizacn
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
