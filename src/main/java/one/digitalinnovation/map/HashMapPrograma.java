package one.digitalinnovation.map;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class HashMapPrograma {

    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();

        estados.put("MG", "Minas Gerais"); //put adiciona ou atualiza se a chave for repetida
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("ES", "Espirito Santo");
        estados.put("BA", "Bahia");
        estados.put("PE", "Pernambuco");
        estados.put("PB", "Paraíba");
        estados.put("CE", "Ceará");
        estados.put("SE", "Sergipe");
        estados.put("PI", "Piauí");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("MA", "Maranhão");
        estados.put("AP", "Amapá");
        estados.put("PA", "Pará");
        estados.put("AM", "Amazonas");
        estados.put("AC", "Acre");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("TO", "Tocantins");
        estados.put("GO", "Goiás");
        estados.put("PR", "Paraná");
        estados.put("SC", "Santa Catarina");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("AL", "Alagoas");
        System.out.println(estados);

        estados.remove("MG");
        System.out.println(estados);

        estados.put("DF", "Distrito Federal");
        System.out.println(estados);

        System.out.println("Tamanho do mapa: " + estados.size());

        if (estados.containsValue("Mato Grosso do Sul")) {
            estados.values().remove("Mato Grosso do Sul"); {
            }
        }
        System.out.println(estados);
        System.out.println("Tamanho do mapa: " + estados.size());

        for (Map.Entry<String, String> estado: estados.entrySet()) {
            System.out.println(estado.getValue() + " (" + estado.getKey() + ")");
        }

        System.out.println("Santa Catarina pertence ao mapa: " + estados.containsKey("SC"));
        System.out.println("Maranhão pertence ao mapa: " + estados.containsValue("Maranhão"));
    }

}
