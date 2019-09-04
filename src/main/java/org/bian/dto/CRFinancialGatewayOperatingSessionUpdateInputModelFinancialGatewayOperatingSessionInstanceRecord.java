package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord
 */
public class CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord   {
  private String financialGatewayServiceType = null;

  private String financialGatewayServiceSessionStatistics = null;

  private String financialGatewayServiceSessionReportType = null;

  private Object financialGatewayServiceSessionReport = null;

  private String financialGatewayServiceSessionDate = null;

  private CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord financialGatewayServiceSessionIssueRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of gateway (e.g. ACH, SWIFT) 
   * @return financialGatewayServiceType
  **/

  public String getFinancialGatewayServiceType() {
    return financialGatewayServiceType;
  }

  public void setFinancialGatewayServiceType(String financialGatewayServiceType) {
    this.financialGatewayServiceType = financialGatewayServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service activity statistics that are maintained during the session 
   * @return financialGatewayServiceSessionStatistics
  **/

  public String getFinancialGatewayServiceSessionStatistics() {
    return financialGatewayServiceSessionStatistics;
  }

  public void setFinancialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
    this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Session reports that can be accessed during the session (e.g. real-time status, session statistics) 
   * @return financialGatewayServiceSessionReportType
  **/

  public String getFinancialGatewayServiceSessionReportType() {
    return financialGatewayServiceSessionReportType;
  }

  public void setFinancialGatewayServiceSessionReportType(String financialGatewayServiceSessionReportType) {
    this.financialGatewayServiceSessionReportType = financialGatewayServiceSessionReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The session activity report 
   * @return financialGatewayServiceSessionReport
  **/

  public Object getFinancialGatewayServiceSessionReport() {
    return financialGatewayServiceSessionReport;
  }

  public void setFinancialGatewayServiceSessionReport(Object financialGatewayServiceSessionReport) {
    this.financialGatewayServiceSessionReport = financialGatewayServiceSessionReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times for the session 
   * @return financialGatewayServiceSessionDate
  **/

  public String getFinancialGatewayServiceSessionDate() {
    return financialGatewayServiceSessionDate;
  }

  public void setFinancialGatewayServiceSessionDate(String financialGatewayServiceSessionDate) {
    this.financialGatewayServiceSessionDate = financialGatewayServiceSessionDate;
  }


  /**
   * Get financialGatewayServiceSessionIssueRecord
   * @return financialGatewayServiceSessionIssueRecord
  **/

  public CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord getFinancialGatewayServiceSessionIssueRecord() {
    return financialGatewayServiceSessionIssueRecord;
  }

  public void setFinancialGatewayServiceSessionIssueRecord(CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord financialGatewayServiceSessionIssueRecord) {
    this.financialGatewayServiceSessionIssueRecord = financialGatewayServiceSessionIssueRecord;
  }


}

