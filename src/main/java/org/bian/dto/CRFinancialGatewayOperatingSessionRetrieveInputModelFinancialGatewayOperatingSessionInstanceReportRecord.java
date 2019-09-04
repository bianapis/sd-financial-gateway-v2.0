package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceReportRecord
 */
public class CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceReportRecord   {
  private String financialGatewayOperatingSessionInstanceReportReference = null;

  private String financialGatewayOperatingSessionInstanceReportType = null;

  private String financialGatewayOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialGatewayOperatingSessionInstanceReportReference
  **/

  public String getFinancialGatewayOperatingSessionInstanceReportReference() {
    return financialGatewayOperatingSessionInstanceReportReference;
  }

  public void setFinancialGatewayOperatingSessionInstanceReportReference(String financialGatewayOperatingSessionInstanceReportReference) {
    this.financialGatewayOperatingSessionInstanceReportReference = financialGatewayOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialGatewayOperatingSessionInstanceReportType
  **/

  public String getFinancialGatewayOperatingSessionInstanceReportType() {
    return financialGatewayOperatingSessionInstanceReportType;
  }

  public void setFinancialGatewayOperatingSessionInstanceReportType(String financialGatewayOperatingSessionInstanceReportType) {
    this.financialGatewayOperatingSessionInstanceReportType = financialGatewayOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialGatewayOperatingSessionInstanceReportParameters
  **/

  public String getFinancialGatewayOperatingSessionInstanceReportParameters() {
    return financialGatewayOperatingSessionInstanceReportParameters;
  }

  public void setFinancialGatewayOperatingSessionInstanceReportParameters(String financialGatewayOperatingSessionInstanceReportParameters) {
    this.financialGatewayOperatingSessionInstanceReportParameters = financialGatewayOperatingSessionInstanceReportParameters;
  }


}

