package com.jagp.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
       java.lang.String cadena = new String();
       java.lang.Double numero = new Double(1);
       
       System.out.println( "this is a sample test" );
       newText();
    }

    private static String newText(){
	for(int i=20; i<40;i++){    
    	        System.out.println("Totalmente mucho mas rápido de hacer");
	}
	return null;
    }
}
