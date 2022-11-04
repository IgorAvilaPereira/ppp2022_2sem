
package apresentacao;

import negocio.*;

public class Main {

    public static void main(String[] args) {
        
        Query q = new Query.Builder("S")
                                        .tabela("Pessoas")
                                        .select("nome")
                                        .select("idade")
                                        .where("id = 2")
                                        .where("nome = 'Andre'")
                                        .groupBy("nome")
                                        .having("nome = a")
                                        .orderBy("nome DESC")
                                        .where("nome <> 'alex'")
                                        .select("altura")
                                        .limit(10)
                                        .orderBy("idade ASC")
                                        .build();
        System.out.println("====================================");  
        System.out.println( q.getQueryFinal());  
        System.out.println("====================================");  
    }
}