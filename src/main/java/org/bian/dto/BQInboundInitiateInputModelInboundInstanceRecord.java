package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModelInboundInstanceRecord
 */
public class BQInboundInitiateInputModelInboundInstanceRecord   {
  private String financialGatewayInboundMessageType = null;

  private Object financialGatewayInboundMessageRecord = null;

  private String financialGatewayInboundMessageReceiver = null;

  private String financialGatewayInboundMessageStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the type of message (defines format) 
   * @return financialGatewayInboundMessageType
  **/

  public String getFinancialGatewayInboundMessageType() {
    return financialGatewayInboundMessageType;
  }

  public void setFinancialGatewayInboundMessageType(String financialGatewayInboundMessageType) {
    this.financialGatewayInboundMessageType = financialGatewayInboundMessageType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The message content in any suitable format 
   * @return financialGatewayInboundMessageRecord
  **/

  public Object getFinancialGatewayInboundMessageRecord() {
    return financialGatewayInboundMessageRecord;
  }

  public void setFinancialGatewayInboundMessageRecord(Object financialGatewayInboundMessageRecord) {
    this.financialGatewayInboundMessageRecord = financialGatewayInboundMessageRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Employee/Business unit addressed by the message 
   * @return financialGatewayInboundMessageReceiver
  **/

  public String getFinancialGatewayInboundMessageReceiver() {
    return financialGatewayInboundMessageReceiver;
  }

  public void setFinancialGatewayInboundMessageReceiver(String financialGatewayInboundMessageReceiver) {
    this.financialGatewayInboundMessageReceiver = financialGatewayInboundMessageReceiver;
  }


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

