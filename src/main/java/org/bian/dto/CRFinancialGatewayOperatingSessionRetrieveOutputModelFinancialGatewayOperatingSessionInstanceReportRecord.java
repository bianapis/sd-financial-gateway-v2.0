package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceReportRecord
 */
public class CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceReportRecord   {
  private String financialGatewayOperatingSessionInstanceReportData = null;

  private String financialGatewayOperatingSessionInstanceReportType = null;

  private Object financialGatewayOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialGatewayOperatingSessionInstanceReportData
  **/

  public String getFinancialGatewayOperatingSessionInstanceReportData() {
    return financialGatewayOperatingSessionInstanceReportData;
  }

  public void setFinancialGatewayOperatingSessionInstanceReportData(String financialGatewayOperatingSessionInstanceReportData) {
    this.financialGatewayOperatingSessionInstanceReportData = financialGatewayOperatingSessionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialGatewayOperatingSessionInstanceReport
  **/

  public Object getFinancialGatewayOperatingSessionInstanceReport() {
    return financialGatewayOperatingSessionInstanceReport;
  }

  public void setFinancialGatewayOperatingSessionInstanceReport(Object financialGatewayOperatingSessionInstanceReport) {
    this.financialGatewayOperatingSessionInstanceReport = financialGatewayOperatingSessionInstanceReport;
  }


}

