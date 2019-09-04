package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionControlInputModelFinancialGatewayOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionControlInputModel
 */
public class CRFinancialGatewayOperatingSessionControlInputModel   {
  private String financialGatewayServicingSessionReference = null;

  private String financialGatewayOperatingSessionInstanceReference = null;

  private Object financialGatewayOperatingSessionControlActionTaskRecord = null;

  private CRFinancialGatewayOperatingSessionControlInputModelFinancialGatewayOperatingSessionControlActionRequest financialGatewayOperatingSessionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return financialGatewayServicingSessionReference
  **/

  public String getFinancialGatewayServicingSessionReference() {
    return financialGatewayServicingSessionReference;
  }

  public void setFinancialGatewayServicingSessionReference(String financialGatewayServicingSessionReference) {
    this.financialGatewayServicingSessionReference = financialGatewayServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Gateway Operating Session instance 
   * @return financialGatewayOperatingSessionInstanceReference
  **/

  public String getFinancialGatewayOperatingSessionInstanceReference() {
    return financialGatewayOperatingSessionInstanceReference;
  }

  public void setFinancialGatewayOperatingSessionInstanceReference(String financialGatewayOperatingSessionInstanceReference) {
    this.financialGatewayOperatingSessionInstanceReference = financialGatewayOperatingSessionInstanceReference;
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
   * Get financialGatewayOperatingSessionControlActionRequest
   * @return financialGatewayOperatingSessionControlActionRequest
  **/

  public CRFinancialGatewayOperatingSessionControlInputModelFinancialGatewayOperatingSessionControlActionRequest getFinancialGatewayOperatingSessionControlActionRequest() {
    return financialGatewayOperatingSessionControlActionRequest;
  }

  public void setFinancialGatewayOperatingSessionControlActionRequest(CRFinancialGatewayOperatingSessionControlInputModelFinancialGatewayOperatingSessionControlActionRequest financialGatewayOperatingSessionControlActionRequest) {
    this.financialGatewayOperatingSessionControlActionRequest = financialGatewayOperatingSessionControlActionRequest;
  }


}

