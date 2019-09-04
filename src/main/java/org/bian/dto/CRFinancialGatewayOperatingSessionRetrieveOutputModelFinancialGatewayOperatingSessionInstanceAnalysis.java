package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceAnalysis
 */
public class CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceAnalysis   {
  private String financialGatewayOperatingSessionInstanceAnalysisData = null;

  private String financialGatewayOperatingSessionInstanceAnalysisReportType = null;

  private Object financialGatewayOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialGatewayOperatingSessionInstanceAnalysisData
  **/

  public String getFinancialGatewayOperatingSessionInstanceAnalysisData() {
    return financialGatewayOperatingSessionInstanceAnalysisData;
  }

  public void setFinancialGatewayOperatingSessionInstanceAnalysisData(String financialGatewayOperatingSessionInstanceAnalysisData) {
    this.financialGatewayOperatingSessionInstanceAnalysisData = financialGatewayOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialGatewayOperatingSessionInstanceAnalysisReportType
  **/

  public String getFinancialGatewayOperatingSessionInstanceAnalysisReportType() {
    return financialGatewayOperatingSessionInstanceAnalysisReportType;
  }

  public void setFinancialGatewayOperatingSessionInstanceAnalysisReportType(String financialGatewayOperatingSessionInstanceAnalysisReportType) {
    this.financialGatewayOperatingSessionInstanceAnalysisReportType = financialGatewayOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialGatewayOperatingSessionInstanceAnalysisReport
  **/

  public Object getFinancialGatewayOperatingSessionInstanceAnalysisReport() {
    return financialGatewayOperatingSessionInstanceAnalysisReport;
  }

  public void setFinancialGatewayOperatingSessionInstanceAnalysisReport(Object financialGatewayOperatingSessionInstanceAnalysisReport) {
    this.financialGatewayOperatingSessionInstanceAnalysisReport = financialGatewayOperatingSessionInstanceAnalysisReport;
  }


}

