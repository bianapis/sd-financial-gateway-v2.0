package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceAnalysis
 */
public class CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceAnalysis   {
  private String financialGatewayOperatingSessionInstanceAnalysisReference = null;

  private String financialGatewayOperatingSessionInstanceAnalysisReportType = null;

  private String financialGatewayOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialGatewayOperatingSessionInstanceAnalysisReference
  **/

  public String getFinancialGatewayOperatingSessionInstanceAnalysisReference() {
    return financialGatewayOperatingSessionInstanceAnalysisReference;
  }

  public void setFinancialGatewayOperatingSessionInstanceAnalysisReference(String financialGatewayOperatingSessionInstanceAnalysisReference) {
    this.financialGatewayOperatingSessionInstanceAnalysisReference = financialGatewayOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialGatewayOperatingSessionInstanceAnalysisParameters
  **/

  public String getFinancialGatewayOperatingSessionInstanceAnalysisParameters() {
    return financialGatewayOperatingSessionInstanceAnalysisParameters;
  }

  public void setFinancialGatewayOperatingSessionInstanceAnalysisParameters(String financialGatewayOperatingSessionInstanceAnalysisParameters) {
    this.financialGatewayOperatingSessionInstanceAnalysisParameters = financialGatewayOperatingSessionInstanceAnalysisParameters;
  }


}

