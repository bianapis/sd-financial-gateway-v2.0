package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionInitiateOutputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord
 */
public class CRFinancialGatewayOperatingSessionInitiateOutputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord   {
  private String productionIssueDiagnosis = null;

  private String productionIssueResolutionTask = null;

  private Object productionIssueRecord = null;

  private String productionIssueStatus = null;


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

