package org.lambda;

import java.util.function.Consumer;

public class EjemploLambda {
    public static void main(String[] args) {
        Consumer<String> expresionLambda = frase -> {
            String resultado = frase.replaceAll("[ ,\\.]", "").toUpperCase();
            System.out.println("Frase original: " + frase);
            System.out.println("Frase procesada: " + resultado);
        };

        expresionLambda.accept("Hola, mundo. Esto es una prueba.");
    }
}
