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
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.IEEE754rUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;

import com.jagp.builder.InfoDTO;
import com.jagp.builder.InfoDTOBuilder;

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

   
   @Test
   public void test9() {
      double[] testVector = {1.0,2.0,3.0,3.1};
      boolean[] booleanVector = {true,false,true};
      System.out.println("Maximo:"+IEEE754rUtils.max(testVector));
      System.out.println("Un cuarto "+ Fraction.ONE_QUARTER);
      System.out.println("Un cuarto por un cuarto "+ Fraction.ONE_QUARTER.multiplyBy(Fraction.ONE_QUARTER));
      System.out.println("Suma de fraccion 3/9 + 2/3 ="+ Fraction.getFraction("3/9").add(Fraction.TWO_THIRDS).doubleValue());
      System.out.println("Fraccion reducida "+ Fraction.getReducedFraction(3, 9));
      System.out.println("Valida si 15230152 solo tiene digitos :"+ NumberUtils.isDigits("1520152"));
      System.out.println("Valida si ABDD15230152 solo tiene digitos :"+ NumberUtils.isDigits("ABDD15230152"));
      System.out.println("Valida si 15.230152 solo es un numero que se puede crear :"+ NumberUtils.isCreatable("15.230152"));
      System.out.println("Valida si 0XABCG es un numero que se puede crear :"+ NumberUtils.isCreatable("0XABCG"));
      System.out.println("Mostrar lista:"+ ArrayUtils.toString(testVector));
      System.out.println("And:"+ BooleanUtils.and(booleanVector));
      System.out.println("Or:"+ BooleanUtils.or(booleanVector));
      
      //Clonar objeto
      Integer i = null;    
      System.out.println("i defaultItNull:"+ObjectUtils.defaultIfNull(i, 40));
      System.out.println("firstNonNull:"+ObjectUtils.firstNonNull(i,null,20));
      
      System.out.println("RandomStringUtils.random:"+RandomStringUtils.random(50,'a','b','c'));
      System.out.println("RandomStringUtils.random:"+RandomStringUtils.random(20, true, true));
      
      System.out.println("RandomStringUtils.random:"+RandomStringUtils.random(8, "colombia"));
      System.out.println("RandomStringUtils.randomAlphabetic:"+RandomStringUtils.randomAlphabetic(35));
      System.out.println("RandomStringUtils.randomAscii:"+RandomStringUtils.randomAscii(100));
      System.out.println("RandomStringUtils.randomGraph:"+RandomStringUtils.randomGraph(100));
      System.out.println("RandomStringUtils.randomPrint:"+RandomStringUtils.randomPrint(100));
      
      System.out.println(".randomPrint:"+RandomStringUtils.randomPrint(100));
      System.out.println("StringUtils.join  "+StringUtils.join(testVector, '-'));
      System.out.println("normalizeSpace  "+StringUtils.normalizeSpace("uno dos  tres   cuatro    cinco."));
      
   }
   
   
   @Test
   public void test10() {
      InfoDTO info = new InfoDTOBuilder()
                        .attribute1("Uno")
                        .attribute2("dos")
                        .build();
      System.out.println("info att1:"+info.getAttribute1());
      System.out.println("info att2:"+info.getAttribute2());
      
      //DateUtil
      System.out.println("Date format:"+DateFormatUtils.format(Calendar.getInstance(),DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.getPattern()));
      
      System.out.println("Date format:"+DateFormatUtils.format(Calendar.getInstance(),DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.getPattern()));
      
      System.out.println(info);
      System.out.println(ToStringBuilder.reflectionToString(info));
      
   }
}
