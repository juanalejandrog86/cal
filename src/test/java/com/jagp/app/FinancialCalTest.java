/**
 * 
 */
package com.jagp.app;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

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
      cal.add(Calendar.DAY_OF_MONTH, -1);
      
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
   
   @Test
   public void test11(){
      Map<String,String> mapa = new HashMap<String, String>();
      System.out.println("Valor retornado "+mapa.get("dos"));
   }
   
   
   
   @Test
   public void test12(){
      StringBuilder s = new StringBuilder();
      s.append("Cadena a dividir");
      System.out.println(s.toString().substring(0,s.length()-2));
      
   }
     
   @Test
   public void test14(){
      String initBalance = "null";
      System.out.println("Resultado de prueba initBalance ->"+(StringUtils.isNotBlank(initBalance) && !"null".equals(initBalance)));
   }
   
   @Test
   public void test15(){
      Map<String, String> parameterMap = new LinkedHashMap<String, String>(); 
      parameterMap.put("service_type","ServAvailInvCrit3");
      parameterMap.put("type", "getArticleDistributor");
      parameterMap.put("idCity","2");
      parameterMap.put("idDistributor","3");
      parameterMap.put("plu",null);
      parameterMap.put("serial","4");
      parameterMap.put("idPdv","null");
      parameterMap.put("codigoSAPpdv","6");
      
      String cadenaGenerada = getInfoAvailableInvKeyValueString(parameterMap);
      System.out.println("->>>>>>>>>"+cadenaGenerada);
   }
   
   /** Req 146777
    * Se encarga de formar una cadena clave valor para el consumo del servicio rest   
    * @return
    */
   private String getInfoAvailableInvKeyValueString(Map<String,String> map){
     StringBuilder keyValueBuilder;
      List<String> list = new ArrayList<String>();
      //Se valida que el mapa no este vacio
      if(map!=null && !map.isEmpty()){
         //Se recorre el mapa para formar la cadena
         for(Entry<String,String> entry:map.entrySet()){
            //Solo se agregan a la cadena los parametros que no sean vacios
            if(StringUtils.isNotBlank(entry.getValue()) && !"null".equals(entry.getValue())){
               keyValueBuilder = new StringBuilder();
               keyValueBuilder.append("{\"@value\":\"").append(entry.getValue()).append("\",\"@name\":\"").append(entry.getKey()).append("\"}");
               list.add(keyValueBuilder.toString());
            }
         }
      }
      // Se retornan los elementos de list como una cadena separada por comas
      return StringUtils.join(list.toArray(),",");
   }
   
   
   @Test
   public void test16(){
     String  numeroB=Integer.toBinaryString(32);
     Integer maxLonguitud = 0;
     System.out.println("numeroB="+numeroB);
     /*//Se eliminan ceros del inicio
     if(numeroB.startsWith("0")){
        numeroB =numeroB.substring(numeroB.indexOf("1")); 
     }*/
     //Se eliminan numeros de la cola
     if(numeroB.endsWith("0")){
        numeroB =numeroB.substring(0,numeroB.lastIndexOf("1"));
     }
     System.out.println("numeroB sin ceros finales ="+numeroB);
     String[] cadenas=numeroB.split("1");
     for(int i=0;i<cadenas.length;i++){
        if(cadenas[i].length()>maxLonguitud){
           maxLonguitud=cadenas[i].length();
        }
     }
     System.out.println("Maxima longitud="+maxLonguitud);
   }
   
   @Test
   public void testDecimal(){
      
      Locale locale = new Locale("en", "UK"); 

      String pattern = "###,###.###";
      DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
      symbols.setDecimalSeparator('.');
      symbols.setGroupingSeparator('.');

      DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
      
      BigDecimal patrimonio = new BigDecimal("1900123");
      
      System.out.println("Valor con formato"+decimalFormat.format(patrimonio));
   }
}
