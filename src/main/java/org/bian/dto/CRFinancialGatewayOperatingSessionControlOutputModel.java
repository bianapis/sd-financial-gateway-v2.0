package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionControlOutputModel
 */
public class CRFinancialGatewayOperatingSessionControlOutputModel   {
  private String financialGatewayOperatingSessionControlActionTaskReference = null;

  private Object financialGatewayOperatingSessionControlActionTaskRecord = null;

  private String financialGatewayOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Gateway Operating Session instance control processing service call 
   * @return financialGatewayOperatingSessionControlActionTaskReference
  **/

  public String getFinancialGatewayOperatingSessionControlActionTaskReference() {
    return financialGatewayOperatingSessionControlActionTaskReference;
  }

  public void setFinancialGatewayOperatingSessionControlActionTaskReference(String financialGatewayOperatingSessionControlActionTaskReference) {
    this.financialGatewayOperatingSessionControlActionTaskReference = financialGatewayOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return financialGatewayOperatingSessionControlActionTaskRecord
  **/

  public Object getFinancialGatewayOperatingSessionControlActionTaskRecord() {
    return financialGatewayOperatingSessionControlActionTaskRecord;
  }

  public void setFinancialGatewayOperatingSessionControlActionTaskRecord(Object financialGatewayOperatingSessionControlActionTaskRecord) {
    this.financialGatewayOperatingSessionControlActionTaskRecord = financialGatewayOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return financialGatewayOperatingSessionControlActionResponse
  **/

  public String getFinancialGatewayOperatingSessionControlActionResponse() {
    return financialGatewayOperatingSessionControlActionResponse;
  }

  public void setFinancialGatewayOperatingSessionControlActionResponse(String financialGatewayOperatingSessionControlActionResponse) {
    this.financialGatewayOperatingSessionControlActionResponse = financialGatewayOperatingSessionControlActionResponse;
  }


}

