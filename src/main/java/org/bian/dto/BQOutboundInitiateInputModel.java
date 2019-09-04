package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelOutboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateInputModel
 */
public class BQOutboundInitiateInputModel   {
  private BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private String financialGatewayOperatingSessionInstanceReference = null;

  private Object outboundInitiateActionRecord = null;

  private BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord = null;


  /**
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Financial Gateway Operating Session instance 
   * @return financialGatewayOperatingSessionInstanceReference
  **/

  public String getFinancialGatewayOperatingSessionInstanceReference() {
    return financialGatewayOperatingSessionInstanceReference;
  }

  public void setFinancialGatewayOperatingSessionInstanceReference(String financialGatewayOperatingSessionInstanceReference) {
    this.financialGatewayOperatingSessionInstanceReference = financialGatewayOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return outboundInitiateActionRecord
  **/

  public Object getOutboundInitiateActionRecord() {
    return outboundInitiateActionRecord;
  }

  public void setOutboundInitiateActionRecord(Object outboundInitiateActionRecord) {
    this.outboundInitiateActionRecord = outboundInitiateActionRecord;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundInitiateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


}

