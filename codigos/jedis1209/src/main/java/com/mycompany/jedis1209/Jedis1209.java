/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.jedis1209;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import negocio.Anotacao;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 *
 * @author iapereira
 */
public class Jedis1209 {

    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost", 6379);
        
        
        
        
        try ( Jedis jedis = pool.getResource()) {
            jedis.select(1);
            Anotacao anotacao = new Anotacao();
            anotacao.setTitulo("titulo");
            anotacao.setDescricao("descricao");
            Gson g = new Gson();
            jedis.set(UUID.randomUUID().toString(), g.toJson(anotacao));
        }

    }
}
