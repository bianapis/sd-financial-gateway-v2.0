package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord
 */
public class CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord   {
  private String employeeBusinessUnitReference = null;

  private String messageReference = null;

  private String productionIssueType = null;

  private String productionIssueDescription = null;

  private String productionIssueDiagnosis = null;

  private String productionIssueResolutionTask = null;

  private Object productionIssueRecord = null;

  private String productionIssueStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The source of the issue report if appropriate 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the financial message(s) involved in the issue 
   * @return messageReference
  **/

  public String getMessageReference() {
    return messageReference;
  }

  public void setMessageReference(String messageReference) {
    this.messageReference = messageReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of network event or error being recorded (e.g. device failure) 
   * @return productionIssueType
  **/

  public String getProductionIssueType() {
    return productionIssueType;
  }

  public void setProductionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The description of the event error 
   * @return productionIssueDescription
  **/

  public String getProductionIssueDescription() {
    return productionIssueDescription;
  }

  public void setProductionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Evaluation of the event cause and impact assessment 
   * @return productionIssueDiagnosis
  **/

  public String getProductionIssueDiagnosis() {
    return productionIssueDiagnosis;
  }

  public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of corrective action proposed and taken 
   * @return productionIssueResolutionTask
  **/

  public String getProductionIssueResolutionTask() {
    return productionIssueResolutionTask;
  }

  public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the issue, response and interested parties logged for reference 
   * @return productionIssueRecord
  **/

  public Object getProductionIssueRecord() {
    return productionIssueRecord;
  }

  public void setProductionIssueRecord(Object productionIssueRecord) {
    this.productionIssueRecord = productionIssueRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracking the state of resolution of a reported issue during the session 
   * @return productionIssueStatus
  **/

  public String getProductionIssueStatus() {
    return productionIssueStatus;
  }

  public void setProductionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
  }


}

