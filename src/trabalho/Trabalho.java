
package trabalho;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {

        Path caminho = Paths.get("C:/Users/Davi Sisnando/Desktop/aaaa.txt");
        try {
            byte[] arrayTexto = Files.readAllBytes(caminho);
            String texto = new String(arrayTexto);
            Lista lista = new Lista(texto);
            
            
            int[] v = new int[256];

        for ( int i = 0; i < texto.length(); i++ )
        {
            char c = texto.charAt( i );
            int ascii = ( int )c;
            v[ascii]++;
        }

        for ( int i = 0; i < v.length; i++ )
        {
            if ( v[i] > 0 )
            {
                System.out.println( "Frequencia de " + (char)i + " = " + v[i] );
            }
        }
            
            
            lista.exibir();
        }
        catch(Exception erro){}


        
    }
}
