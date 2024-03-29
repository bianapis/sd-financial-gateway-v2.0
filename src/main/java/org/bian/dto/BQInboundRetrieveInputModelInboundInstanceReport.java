package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveInputModelInboundInstanceReport
 */
public class BQInboundRetrieveInputModelInboundInstanceReport   {
  private String inboundInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return inboundInstanceReportReference
  **/

  public String getInboundInstanceReportReference() {
    return inboundInstanceReportReference;
  }

  public void setInboundInstanceReportReference(String inboundInstanceReportReference) {
    this.inboundInstanceReportReference = inboundInstanceReportReference;
  }


}

