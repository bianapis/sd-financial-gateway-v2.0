package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceAnalysis;
import org.bian.dto.CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceRecord;
import org.bian.dto.CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRetrieveOutputModel
 */
public class CRFinancialGatewayOperatingSessionRetrieveOutputModel   {
  private CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private String financialGatewayOperatingSessionRetrieveActionTaskReference = null;

  private Object financialGatewayOperatingSessionRetrieveActionTaskRecord = null;

  private String financialGatewayOperatingSessionRetrieveActionResponse = null;

  private CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceReportRecord financialGatewayOperatingSessionInstanceReportRecord = null;

  private CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceAnalysis financialGatewayOperatingSessionInstanceAnalysis = null;


  /**
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Gateway Operating Session instance retrieve service call 
   * @return financialGatewayOperatingSessionRetrieveActionTaskReference
  **/

  public String getFinancialGatewayOperatingSessionRetrieveActionTaskReference() {
    return financialGatewayOperatingSessionRetrieveActionTaskReference;
  }

  public void setFinancialGatewayOperatingSessionRetrieveActionTaskReference(String financialGatewayOperatingSessionRetrieveActionTaskReference) {
    this.financialGatewayOperatingSessionRetrieveActionTaskReference = financialGatewayOperatingSessionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialGatewayOperatingSessionRetrieveActionResponse
  **/

  public String getFinancialGatewayOperatingSessionRetrieveActionResponse() {
    return financialGatewayOperatingSessionRetrieveActionResponse;
  }

  public void setFinancialGatewayOperatingSessionRetrieveActionResponse(String financialGatewayOperatingSessionRetrieveActionResponse) {
    this.financialGatewayOperatingSessionRetrieveActionResponse = financialGatewayOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get financialGatewayOperatingSessionInstanceReportRecord
   * @return financialGatewayOperatingSessionInstanceReportRecord
  **/

  public CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceReportRecord getFinancialGatewayOperatingSessionInstanceReportRecord() {
    return financialGatewayOperatingSessionInstanceReportRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceReportRecord(CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceReportRecord financialGatewayOperatingSessionInstanceReportRecord) {
    this.financialGatewayOperatingSessionInstanceReportRecord = financialGatewayOperatingSessionInstanceReportRecord;
  }


  /**
   * Get financialGatewayOperatingSessionInstanceAnalysis
   * @return financialGatewayOperatingSessionInstanceAnalysis
  **/

  public CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceAnalysis getFinancialGatewayOperatingSessionInstanceAnalysis() {
    return financialGatewayOperatingSessionInstanceAnalysis;
  }

  public void setFinancialGatewayOperatingSessionInstanceAnalysis(CRFinancialGatewayOperatingSessionRetrieveOutputModelFinancialGatewayOperatingSessionInstanceAnalysis financialGatewayOperatingSessionInstanceAnalysis) {
    this.financialGatewayOperatingSessionInstanceAnalysis = financialGatewayOperatingSessionInstanceAnalysis;
  }


}

