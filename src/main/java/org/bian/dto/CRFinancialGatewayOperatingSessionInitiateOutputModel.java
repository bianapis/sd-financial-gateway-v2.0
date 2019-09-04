package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionInitiateOutputModelFinancialGatewayOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionInitiateOutputModel
 */
public class CRFinancialGatewayOperatingSessionInitiateOutputModel   {
  private String financialGatewayOperatingSessionInstanceReference = null;

  private String financialGatewayOperatingSessionInitiateActionReference = null;

  private Object financialGatewayOperatingSessionInitiateActionRecord = null;

  private String financialGatewayOperatingSessionInstanceStatus = null;

  private CRFinancialGatewayOperatingSessionInitiateOutputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return financialGatewayOperatingSessionInitiateActionReference
  **/

  public String getFinancialGatewayOperatingSessionInitiateActionReference() {
    return financialGatewayOperatingSessionInitiateActionReference;
  }

  public void setFinancialGatewayOperatingSessionInitiateActionReference(String financialGatewayOperatingSessionInitiateActionReference) {
    this.financialGatewayOperatingSessionInitiateActionReference = financialGatewayOperatingSessionInitiateActionReference;
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

  public CRFinancialGatewayOperatingSessionInitiateOutputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(CRFinancialGatewayOperatingSessionInitiateOutputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


}

