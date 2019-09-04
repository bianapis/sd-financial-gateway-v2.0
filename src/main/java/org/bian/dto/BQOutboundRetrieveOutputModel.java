package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelOutboundInstanceRecord;
import org.bian.dto.BQOutboundRetrieveOutputModelOutboundInstanceAnalysis;
import org.bian.dto.BQOutboundRetrieveOutputModelOutboundInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundRetrieveOutputModel
 */
public class BQOutboundRetrieveOutputModel   {
  private BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private String outboundRetrieveActionTaskReference = null;

  private Object outboundRetrieveActionTaskRecord = null;

  private String outboundRetrieveActionResponse = null;

  private BQOutboundRetrieveOutputModelOutboundInstanceReport outboundInstanceReport = null;

  private BQOutboundRetrieveOutputModelOutboundInstanceAnalysis outboundInstanceAnalysis = null;


  /**
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundInitiateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Outbound instance retrieve service call 
   * @return outboundRetrieveActionTaskReference
  **/

  public String getOutboundRetrieveActionTaskReference() {
    return outboundRetrieveActionTaskReference;
  }

  public void setOutboundRetrieveActionTaskReference(String outboundRetrieveActionTaskReference) {
    this.outboundRetrieveActionTaskReference = outboundRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return outboundRetrieveActionTaskRecord
  **/

  public Object getOutboundRetrieveActionTaskRecord() {
    return outboundRetrieveActionTaskRecord;
  }

  public void setOutboundRetrieveActionTaskRecord(Object outboundRetrieveActionTaskRecord) {
    this.outboundRetrieveActionTaskRecord = outboundRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return outboundRetrieveActionResponse
  **/

  public String getOutboundRetrieveActionResponse() {
    return outboundRetrieveActionResponse;
  }

  public void setOutboundRetrieveActionResponse(String outboundRetrieveActionResponse) {
    this.outboundRetrieveActionResponse = outboundRetrieveActionResponse;
  }


  /**
   * Get outboundInstanceReport
   * @return outboundInstanceReport
  **/

  public BQOutboundRetrieveOutputModelOutboundInstanceReport getOutboundInstanceReport() {
    return outboundInstanceReport;
  }

  public void setOutboundInstanceReport(BQOutboundRetrieveOutputModelOutboundInstanceReport outboundInstanceReport) {
    this.outboundInstanceReport = outboundInstanceReport;
  }


  /**
   * Get outboundInstanceAnalysis
   * @return outboundInstanceAnalysis
  **/

  public BQOutboundRetrieveOutputModelOutboundInstanceAnalysis getOutboundInstanceAnalysis() {
    return outboundInstanceAnalysis;
  }

  public void setOutboundInstanceAnalysis(BQOutboundRetrieveOutputModelOutboundInstanceAnalysis outboundInstanceAnalysis) {
    this.outboundInstanceAnalysis = outboundInstanceAnalysis;
  }


}

