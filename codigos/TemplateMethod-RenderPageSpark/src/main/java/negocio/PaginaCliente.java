/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;
import persistencia.ClienteDAO;

/**
 *
 * @author iapereira
 */
public class PaginaCliente extends TemplateHTML {

    private ClienteDAO clienteDAO;

    public PaginaCliente() {
        this.clienteDAO = new ClienteDAO();
    }

    @Override
    protected String cabecalho() {
        return "aqui o cabecalho eh diferente...";
    }

    @Override
    protected String conteudo() {
        String resultado = "";
        ArrayList<Cliente> vetCliente = this.clienteDAO.listar();
        for (int i = 0; i < vetCliente.size(); i++) {
            Cliente cliente = vetCliente.get(i);
            resultado += cliente.toString();

        }
        return resultado;
    }

}
