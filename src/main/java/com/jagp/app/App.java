package com.jagp.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       if(args.length>0){
         System.out.println("Mensaje de entrada"+args[0]);
       }
       
       java.lang.String cadena = new String();
       java.lang.Double numero = new Double(1);
       
       System.out.println( "this is a sample test" );
       Person person = new Person();
       
       person.setName("Luis Perez");
       System.out.println(person.getName());
       newText();
    }

    private static String newText(){
	for(int i=20; i<40;i++){    
    	        System.out.println("Nuevo mensaje para trabajar con otros elementos diferentes."+i);
	}
	return null;
    }
}
