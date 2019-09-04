package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionUpdateInputModel
 */
public class CRFinancialGatewayOperatingSessionUpdateInputModel   {
  private String financialGatewayServicingSessionReference = null;

  private String financialGatewayOperatingSessionInstanceReference = null;

  private CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private Object financialGatewayOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialGatewayOperatingSessionUpdateActionTaskRecord
  **/

  public Object getFinancialGatewayOperatingSessionUpdateActionTaskRecord() {
    return financialGatewayOperatingSessionUpdateActionTaskRecord;
  }

  public void setFinancialGatewayOperatingSessionUpdateActionTaskRecord(Object financialGatewayOperatingSessionUpdateActionTaskRecord) {
    this.financialGatewayOperatingSessionUpdateActionTaskRecord = financialGatewayOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

