package compi1.ex3;

import java.io.StringReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "---- Ejemplo 3 ----" );
        String entrada = "int y = 5;"+
                        "\nint x  10+x";

        lexEx3 lex = new lexEx3(new StringReader(entrada));
        Parser sintax = new Parser(lex);
        sintax.parse();
        System.out.println( "---- Fin ejemplo 3 ----" );
    }
}
