/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.NoSuchElementException;


public class In {
    /**
     * Objeto utilizado para parsear la linea introducida por el usuario
     * mediante el teclado.
     * @see #getNextToken(String)
     */
    private static StringTokenizer st;
    /**
     * Objeto de I/O (entrada/salida) utilizado para leer los datos desde el 
     * teclado.
     * @see #getNextToken(String)
     */
    private static BufferedReader source;
    
    /**
     * Constructor privado implementado para evitar instanciacion y
     * derivacion.
     */
    private In() {}
    
    /**
     * Metodo utilizado para leer cadenas de caracteres que no contengan
     * espacios. Los siguientes caracteres son considerados espacios:
     * &lt;ul&gt;
     *     &lt;li&gt;&lt;code&gt;' '&lt;/code&gt;: espacio en blanco.
     *     &lt;li&gt;&lt;code&gt;'\t'&lt;/code&gt;: tabulacion (tab).
     *     &lt;li&gt;&lt;code&gt;'\n'&lt;/code&gt;: nueva linea, equivalente al [Enter] (new-line).
     *     &lt;li&gt;&lt;code&gt;'\r'&lt;/code&gt;: retorno de carro (carriage-return).
     *     &lt;li&gt;&lt;code&gt;'\f'&lt;/code&gt;: avance de pagina (form-feed).
     * &lt;/ul&gt;
     * @return la primer palabra completa que se haya introducido.
     * @see #readLine()
     */
    public static String readString() {
        return getNextToken();
    }
    
    /**
     * Metodo utilizado para leer cadenas de caracteres que contengan
     * espacios en blanco y/o tabulaciones.
     * @return la linea introducida hasta que se encuentre un [Enter].
     * @see #readString()
     */
    public static String readLine() {
        return getNextToken("\r\n\f");
    }
    
    /**
     * Metodo utilizado para leer numeros enteros de 32 bits.
     * @return el numero introducido o 0 (cero) si el valor introducido
     * no puede ser interpretado como numero entero. Esto ocurre cuando 
     * se introducen letras o signos de puntuacion mezclados con el 
     * numero.
     * @see #readLong()
     */
    public static int readInt() {
        return (int)readLong();
    }
    
    /**
     * Metodo utilizado para leer numeros enteros de 64 bits.
     * @return el numero introducido o 0L (cero) si el valor introducido
     * no puede ser interpretado como numero entero. Esto ocurre cuando 
     * se introducen letras o signos de puntuacion mezclados con el 
     * numero.
     * @see #readInt()
     */
    public static long readLong() {
        long retVal = 0;
        try {
            retVal = Long.parseLong(getNextToken());
        } catch (NumberFormatException e) {}
        return retVal;
    }
    
    /**
     * Metodo utilizado para leer numeros reales de 32 bits de 
     * precision.
     * @return el numero introducido o 0.0F (cero) si el valor introducido
     * no puede ser interpretado como numero entero. Esto ocurre cuando 
     * se introducen letras o signos de puntuacion mezclados con el 
     * numero. Los unicos signos permitidos son el - (menos) al
     * comienzo del numero y una unica aparicion del . 
     * (punto decimal).
     * @see #readDouble()
     */
    public static float readFloat() {
        return (float)readDouble();
    }
    
    /**
     * Metodo utilizado para leer numeros reales de 64 bits de 
     * precision.
     * @return el numero introducido o 0.0 (cero) si el valor introducido
     * no puede ser interpretado como numero entero. Esto ocurre cuando 
     * se introducen letras o signos de puntuacion mezclados con el 
     * numero. Los unicos signos permitidos son el - (menos) al
     * comienzo del numero y una unica aparicion del . 
     * (punto decimal).
     * @see #readFloat()
     */
    public static double readDouble() {
        double retVal = 0.0;
        try {
            retVal = Double.valueOf(getNextToken()).doubleValue();
        } catch (NumberFormatException e) {}
        return retVal;
    }
    
    /**
     * Metodo utilizado para leer un caracter.
     * @return el primer caracter de la cadena introducida o '\0' (caracter nulo) 
     * si se introdujo una cadena vacia.
     * @see #readString()
     */
    public static char readChar() {
        char car = '\0';
        String str;
        
        str = getNextToken("\0");
        if (str.length() == 0) {
            car = str.charAt(0);
            st = new StringTokenizer(str.substring(1));
        }
        return car;
    }
    
    /**
     * Metodo utilizado para obtener la siguiente palabra (o numero)
     * del objeto parseador de la entrada.
     * @return siguiente elemento del parseador de cadenas, considerando como 
     * separadores a los caracteres de espacio (ver documentacion de 
     * {@link #readString() readString()}).
     * @see #getNextToken(String)
     * @see #st
     * @see &quot;Documentacion de la clase &lt;code&gt;StringTokenizer&lt;/code&gt; en el
     * sitio oficial de Java: &lt;a href=&quot;<a href="http://java.sun.com" target="_blank">http://java.sun.com</a>&quot;&gt;<a href="http://java.sun.com" target="_blank">http://java.sun.com</a>&lt;/a&gt;.&quot;
     */
    private static String getNextToken() {
        return getNextToken(null);
    }
    
    /**
     * Metodo utilizado para obtener el siguiente elemento del objeto 
     * parseador de la entrada. Los elementos estaran definidos por el 
     * delimitador que se recibe como parametro.
     * @param delim delimitador a utilizar durante el parseo de la entrada. Si
     * el parametro es &lt;code&gt;null&lt;/code&gt; se tomar&aacute;n los delimitadores
     * indicados en {@link #readString() readString()}.
     * @return siguiente elemento del parseador de cadenas, considerando como 
     * separadores al par&amp;aacute;metro recibido.
     * @see #getNextToken()
     * @see #st
     * @see &quot;Documentaci&amp;oacute;n de la clase &lt;code&gt;StringTokenizer&lt;/code&gt; en el
     * sitio oficial de Java: &lt;a href=&quot;<a href="http://java.sun.com" target="_blank">http://java.sun.com</a>&quot;&gt;<a href="http://java.sun.com" target="_blank">http://java.sun.com</a>&lt;/a&gt;.&quot;
     */
    private static String getNextToken(String delim) {
        String input;
        String retVal = "&";
        
        try {
            if ((st == null) || !st.hasMoreElements()) {
                if (source == null) {
                    source = new BufferedReader(new InputStreamReader(System.in));
                }
                input = source.readLine();
                st = new StringTokenizer(input);
            }
            if (delim == null) {
                delim = " \t\n\r\f";
            }
            retVal = st.nextToken(delim);
        } catch (NoSuchElementException e1) {
            // si ocurre una excepci&oacute;n, no hacer nada
        } catch (IOException e2) {
            // si ocurre una excepci&oacute;n, no hacer nada
        }
        
        return retVal;
    }
}
