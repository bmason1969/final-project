package com.promineotech.phone.entity;

import java.math.BigDecimal;
import java.util.Comparator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Comparable<Phone>{
  private Long modelPK;
  private PhoneModel modelId;
  private BigDecimal Price;
  
  @JsonIgnore
  public long getModelPK() {
    return modelPK;
  }

  @Override
  public int compareTo(Phone that) {
 // formatter:off
    return Comparator
        .comparing(Phone::getModelId)        
        .compare(this, that);
    // formatter:on
  }
}



