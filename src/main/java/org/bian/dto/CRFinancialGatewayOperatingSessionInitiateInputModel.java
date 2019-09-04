package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionInitiateInputModel
 */
public class CRFinancialGatewayOperatingSessionInitiateInputModel   {
  private String financialGatewayServicingSessionReference = null;

  private Object financialGatewayOperatingSessionInitiateActionRecord = null;

  private String financialGatewayOperatingSessionInstanceStatus = null;

  private CRFinancialGatewayOperatingSessionInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialGatewayOperatingSessionInitiateActionRecord
  **/

  public Object getFinancialGatewayOperatingSessionInitiateActionRecord() {
    return financialGatewayOperatingSessionInitiateActionRecord;
  }

  public void setFinancialGatewayOperatingSessionInitiateActionRecord(Object financialGatewayOperatingSessionInitiateActionRecord) {
    this.financialGatewayOperatingSessionInitiateActionRecord = financialGatewayOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Gateway Operating Session instance (e.g. initialised, pending, active) 
   * @return financialGatewayOperatingSessionInstanceStatus
  **/

  public String getFinancialGatewayOperatingSessionInstanceStatus() {
    return financialGatewayOperatingSessionInstanceStatus;
  }

  public void setFinancialGatewayOperatingSessionInstanceStatus(String financialGatewayOperatingSessionInstanceStatus) {
    this.financialGatewayOperatingSessionInstanceStatus = financialGatewayOperatingSessionInstanceStatus;
  }


  /**
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public CRFinancialGatewayOperatingSessionInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(CRFinancialGatewayOperatingSessionInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


}

