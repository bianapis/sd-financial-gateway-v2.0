package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceAnalysis;
import org.bian.dto.CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRetrieveInputModel
 */
public class CRFinancialGatewayOperatingSessionRetrieveInputModel   {
  private Object financialGatewayOperatingSessionRetrieveActionTaskRecord = null;

  private String financialGatewayOperatingSessionRetrieveActionRequest = null;

  private CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceReportRecord financialGatewayOperatingSessionInstanceReportRecord = null;

  private CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceAnalysis financialGatewayOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialGatewayOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getFinancialGatewayOperatingSessionRetrieveActionTaskRecord() {
    return financialGatewayOperatingSessionRetrieveActionTaskRecord;
  }

  public void setFinancialGatewayOperatingSessionRetrieveActionTaskRecord(Object financialGatewayOperatingSessionRetrieveActionTaskRecord) {
    this.financialGatewayOperatingSessionRetrieveActionTaskRecord = financialGatewayOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialGatewayOperatingSessionRetrieveActionRequest
  **/

  public String getFinancialGatewayOperatingSessionRetrieveActionRequest() {
    return financialGatewayOperatingSessionRetrieveActionRequest;
  }

  public void setFinancialGatewayOperatingSessionRetrieveActionRequest(String financialGatewayOperatingSessionRetrieveActionRequest) {
    this.financialGatewayOperatingSessionRetrieveActionRequest = financialGatewayOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get financialGatewayOperatingSessionInstanceReportRecord
   * @return financialGatewayOperatingSessionInstanceReportRecord
  **/

  public CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceReportRecord getFinancialGatewayOperatingSessionInstanceReportRecord() {
    return financialGatewayOperatingSessionInstanceReportRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceReportRecord(CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceReportRecord financialGatewayOperatingSessionInstanceReportRecord) {
    this.financialGatewayOperatingSessionInstanceReportRecord = financialGatewayOperatingSessionInstanceReportRecord;
  }


  /**
   * Get financialGatewayOperatingSessionInstanceAnalysis
   * @return financialGatewayOperatingSessionInstanceAnalysis
  **/

  public CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceAnalysis getFinancialGatewayOperatingSessionInstanceAnalysis() {
    return financialGatewayOperatingSessionInstanceAnalysis;
  }

  public void setFinancialGatewayOperatingSessionInstanceAnalysis(CRFinancialGatewayOperatingSessionRetrieveInputModelFinancialGatewayOperatingSessionInstanceAnalysis financialGatewayOperatingSessionInstanceAnalysis) {
    this.financialGatewayOperatingSessionInstanceAnalysis = financialGatewayOperatingSessionInstanceAnalysis;
  }


}

