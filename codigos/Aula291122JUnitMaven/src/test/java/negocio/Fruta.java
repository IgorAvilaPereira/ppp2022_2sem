package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */
public class Fruta {

    private String nome;
    private HashMap<String, Vitamina> listVitamina;

    public Fruta() {
        this.listVitamina = new HashMap<>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<String, Vitamina> getListVitamina() {
        return listVitamina;
    }

    public void setListVitamina(HashMap<String, Vitamina> listVitamina) {
        this.listVitamina = listVitamina;
    }

    public void substituirVitamina(Vitamina x, Vitamina y) {
        this.listVitamina.remove(x.getSigla());
        this.listVitamina.put(y.getSigla(), y);
    }

    public void removerVitamina(Vitamina x) {
        this.listVitamina.remove(x.getSigla());

    }

    @Override
    public String toString() {
        String aux = "(";
        Iterator iterator = this.listVitamina.values().iterator();
        while (iterator.hasNext()) {
            Vitamina vitamina = (Vitamina) iterator.next();
            aux += vitamina.getSigla() + ",";
        }
        aux+=")";
        aux = aux.replace(",)", ")");
        return "Fruta{" + "nome=" + nome + ", listVitamina=" + aux + '}';
    }

    public void adicionarVitamina(Vitamina x) {
        this.getListVitamina().put(x.getSigla(), x);

    }

}
