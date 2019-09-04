package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateOutputModelInboundInstanceRecord
 */
public class BQInboundInitiateOutputModelInboundInstanceRecord   {
  private String financialGatewayInboundMessageStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Used to track delivery (e.g. pending, delivered, possible duplicate, error) 
   * @return financialGatewayInboundMessageStatus
  **/

  public String getFinancialGatewayInboundMessageStatus() {
    return financialGatewayInboundMessageStatus;
  }

  public void setFinancialGatewayInboundMessageStatus(String financialGatewayInboundMessageStatus) {
    this.financialGatewayInboundMessageStatus = financialGatewayInboundMessageStatus;
  }


}

