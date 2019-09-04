package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateOutputModelOutboundInstanceRecord
 */
public class BQOutboundInitiateOutputModelOutboundInstanceRecord   {
  private String financialGatewayOutboundMessageStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Used to track delivery (e.g. pending, delivered, possible duplicate, error) 
   * @return financialGatewayOutboundMessageStatus
  **/

  public String getFinancialGatewayOutboundMessageStatus() {
    return financialGatewayOutboundMessageStatus;
  }

  public void setFinancialGatewayOutboundMessageStatus(String financialGatewayOutboundMessageStatus) {
    this.financialGatewayOutboundMessageStatus = financialGatewayOutboundMessageStatus;
  }


}

