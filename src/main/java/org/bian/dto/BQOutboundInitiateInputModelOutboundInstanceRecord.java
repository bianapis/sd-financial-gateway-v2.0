package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateInputModelOutboundInstanceRecord
 */
public class BQOutboundInitiateInputModelOutboundInstanceRecord   {
  private String financialGatewayOutboundMessageType = null;

  private Object financialGatewayOutboundMessageRecord = null;

  private String financialGatewayOutboundMessageSender = null;

  private String financialGatewayOutboundMessageReceiver = null;

  private String financialGatewayOutboundMessageStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the type of message (defines format) 
   * @return financialGatewayOutboundMessageType
  **/

  public String getFinancialGatewayOutboundMessageType() {
    return financialGatewayOutboundMessageType;
  }

  public void setFinancialGatewayOutboundMessageType(String financialGatewayOutboundMessageType) {
    this.financialGatewayOutboundMessageType = financialGatewayOutboundMessageType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The message content in any suitable format 
   * @return financialGatewayOutboundMessageRecord
  **/

  public Object getFinancialGatewayOutboundMessageRecord() {
    return financialGatewayOutboundMessageRecord;
  }

  public void setFinancialGatewayOutboundMessageRecord(Object financialGatewayOutboundMessageRecord) {
    this.financialGatewayOutboundMessageRecord = financialGatewayOutboundMessageRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Employee/Business unit sending the message 
   * @return financialGatewayOutboundMessageSender
  **/

  public String getFinancialGatewayOutboundMessageSender() {
    return financialGatewayOutboundMessageSender;
  }

  public void setFinancialGatewayOutboundMessageSender(String financialGatewayOutboundMessageSender) {
    this.financialGatewayOutboundMessageSender = financialGatewayOutboundMessageSender;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The addressee of the message (identified by the financial gateway recognized party reference) 
   * @return financialGatewayOutboundMessageReceiver
  **/

  public String getFinancialGatewayOutboundMessageReceiver() {
    return financialGatewayOutboundMessageReceiver;
  }

  public void setFinancialGatewayOutboundMessageReceiver(String financialGatewayOutboundMessageReceiver) {
    this.financialGatewayOutboundMessageReceiver = financialGatewayOutboundMessageReceiver;
  }


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

