/**
 * 
 */
package com.jagp.builder;

import org.apache.commons.lang3.builder.Builder;

/**
 * @author jagomezp
 *
 */
public class InfoDTOBuilder  implements Builder<InfoDTO>{

   private InfoDTO dto;
   
   public InfoDTOBuilder(){
      this.dto = new InfoDTO();
   }
   
   public InfoDTOBuilder attribute1(String att){
      this.dto.setAttribute1(att);
      return this;
   }
   
   public InfoDTOBuilder attribute2(String att){
      this.dto.setAttribute2(att);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.apache.commons.lang3.builder.Builder#build()
    */
   public InfoDTO build() {
      return dto;
   }

}
