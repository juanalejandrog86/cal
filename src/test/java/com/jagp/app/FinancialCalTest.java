/**
 * 
 */
package com.jagp.app;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Test;

/**
 * @author jagomezp
 *
 */
public class FinancialCalTest {

   @Test
   public void test() {
      String country="Colombia";
      
      String[] countryArray = country.split("o");
      
      List<String> countryList = Arrays.asList(countryArray);
      for(int i=0;i<countryList.size();i++){
         System.out.print("-"+countryList.get(i));
      }
      
   }
   


   @Test
   public void test3(){
      System.out.println(Math.PI);
      System.out.println(Math.abs(-200));
      System.out.println(Double.MAX_EXPONENT);
      System.out.println(Double.MAX_VALUE);
      System.out.println(Double.NaN);
      
      for(Double d=0.0;(2*Math.PI)>d;d=d+0.1){
         System.out.println(Math.cos(d));
      }
      
      System.out.println("SENO");
      
      for(Double d=0.0;(2*Math.PI)>d;d=d+0.1){
         System.out.println(Math.sin(d));
      }
      
      System.out.println(Math.E);
      
      System.out.println(Math.scalb(1,0));
      System.out.println(Math.scalb(0,1));
      System.out.println(Math.scalb(0,2));
      System.out.println(Math.toDegrees(Math.PI));
      
   }
   
   @Test
   public void test4(){
      System.out.println(new Date());
      
      System.out.println(Calendar.getInstance().getTime());
   }
   
   @Test
   public void test5(){
      String description="";
      String errorMessagge = "Error inesperado invocando servicio CMSISPN de postsale.  ->|EXITO[1]=100;Cambio realizado 4423946180038253 -->Prepago||EXITO[2]=100;OK -->MiddlewareGateway||EXITO[3]=100;OK -->Siebel 1||FALLO[4]=3007;Record not defined  -->Hlr| "; 
      String[] message = errorMessagge.split("\\|");
      if (message.length > 1) {
         System.out.println("changeMsisdnFailureFlow::::> " + message[message.length - 2]);
         String[] descriptionArray = message[message.length - 2].split("-->");
         if (descriptionArray.length > 1){
            description = message[message.length - 2].split("-->")[1];
         } 
      }
      System.out.println(description);
   }

   @Test
   public void test6(){
      Date actual = new Date();
      
      Calendar calParameter=Calendar.getInstance();
      calParameter.setTime(actual);
      
      calParameter.set(Calendar.HOUR,0);
      calParameter.set(Calendar.MINUTE,0);
      calParameter.set(Calendar.SECOND,0);
      calParameter.set(Calendar.MILLISECOND,0);
      
      Date actualnew=calParameter.getTime(); 
      
      
      Calendar cal = Calendar.getInstance();
      cal.add(Calendar.DAY_OF_MONTH,1);
      
      cal.set(Calendar.HOUR,0);
      cal.set(Calendar.MINUTE,0);
      cal.set(Calendar.SECOND,0);
      cal.set(Calendar.MILLISECOND,0);
      Date comparar = cal.getTime();
      
      
      System.out.println(actualnew);
      System.out.println(comparar);
      
      System.out.println(actualnew.after(comparar));
   }
   
   
   
   @Test
   public void test7(){
      
      Date parDateBefore= new Date();
      Date parDateAfter = new Date();
      
      System.out.println(parDateBefore);
      System.out.println(parDateAfter);
      
      
      Calendar cal = Calendar.getInstance();
      cal.setTime(parDateBefore);
      
      cal.set(Calendar.HOUR_OF_DAY,0);
      cal.set(Calendar.MINUTE,0);
      cal.set(Calendar.SECOND,0);
      cal.set(Calendar.MILLISECOND,0);
      
      Date dateBefore = cal.getTime(); 
      
      cal.setTime(parDateAfter);
      
      cal.set(Calendar.HOUR_OF_DAY,0);
      cal.set(Calendar.MINUTE,0);
      cal.set(Calendar.SECOND,0);
      cal.set(Calendar.MILLISECOND,0);
      
      Date dateAfter = cal.getTime();
      
      
      System.out.println(dateBefore);
      System.out.println(dateAfter);
      
      System.out.println(dateBefore.before(dateAfter));
      
   }
   
   @Test
   public void test8() throws IOException{
      File file = new File("documento");
      LineIterator it = FileUtils.lineIterator(file, "UTF-8");
      try {
        while (it.hasNext()) {
          String line = it.nextLine();
          System.out.println(line);
        }
      } finally {
        it.close();
      }
   }

}
