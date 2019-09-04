package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord;
import org.bian.dto.BQInboundInitiateInputModelInboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModel
 */
public class BQInboundInitiateInputModel   {
  private BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private String financialGatewayOperatingSessionInstanceReference = null;

  private Object inboundInitiateActionRecord = null;

  private BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord = null;


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
   * @return inboundInitiateActionRecord
  **/

  public Object getInboundInitiateActionRecord() {
    return inboundInitiateActionRecord;
  }

  public void setInboundInitiateActionRecord(Object inboundInitiateActionRecord) {
    this.inboundInitiateActionRecord = inboundInitiateActionRecord;
  }


  /**
   * Get inboundInstanceRecord
   * @return inboundInstanceRecord
  **/

  public BQInboundInitiateInputModelInboundInstanceRecord getInboundInstanceRecord() {
    return inboundInstanceRecord;
  }

  public void setInboundInstanceRecord(BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord) {
    this.inboundInstanceRecord = inboundInstanceRecord;
  }


}

