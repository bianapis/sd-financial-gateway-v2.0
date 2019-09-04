package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord;
import org.bian.dto.BQInboundInitiateInputModelInboundInstanceRecord;
import org.bian.dto.BQInboundRetrieveOutputModelInboundInstanceAnalysis;
import org.bian.dto.BQInboundRetrieveOutputModelInboundInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModel
 */
public class BQInboundRetrieveOutputModel   {
  private BQInboundInitiateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord = null;

  private String inboundRetrieveActionTaskReference = null;

  private Object inboundRetrieveActionTaskRecord = null;

  private String inboundRetrieveActionResponse = null;

  private BQInboundRetrieveOutputModelInboundInstanceReport inboundInstanceReport = null;

  private BQInboundRetrieveOutputModelInboundInstanceAnalysis inboundInstanceAnalysis = null;


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
   * Get inboundInstanceRecord
   * @return inboundInstanceRecord
  **/

  public BQInboundInitiateInputModelInboundInstanceRecord getInboundInstanceRecord() {
    return inboundInstanceRecord;
  }

  public void setInboundInstanceRecord(BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord) {
    this.inboundInstanceRecord = inboundInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inbound instance retrieve service call 
   * @return inboundRetrieveActionTaskReference
  **/

  public String getInboundRetrieveActionTaskReference() {
    return inboundRetrieveActionTaskReference;
  }

  public void setInboundRetrieveActionTaskReference(String inboundRetrieveActionTaskReference) {
    this.inboundRetrieveActionTaskReference = inboundRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inboundRetrieveActionTaskRecord
  **/

  public Object getInboundRetrieveActionTaskRecord() {
    return inboundRetrieveActionTaskRecord;
  }

  public void setInboundRetrieveActionTaskRecord(Object inboundRetrieveActionTaskRecord) {
    this.inboundRetrieveActionTaskRecord = inboundRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return inboundRetrieveActionResponse
  **/

  public String getInboundRetrieveActionResponse() {
    return inboundRetrieveActionResponse;
  }

  public void setInboundRetrieveActionResponse(String inboundRetrieveActionResponse) {
    this.inboundRetrieveActionResponse = inboundRetrieveActionResponse;
  }


  /**
   * Get inboundInstanceReport
   * @return inboundInstanceReport
  **/

  public BQInboundRetrieveOutputModelInboundInstanceReport getInboundInstanceReport() {
    return inboundInstanceReport;
  }

  public void setInboundInstanceReport(BQInboundRetrieveOutputModelInboundInstanceReport inboundInstanceReport) {
    this.inboundInstanceReport = inboundInstanceReport;
  }


  /**
   * Get inboundInstanceAnalysis
   * @return inboundInstanceAnalysis
  **/

  public BQInboundRetrieveOutputModelInboundInstanceAnalysis getInboundInstanceAnalysis() {
    return inboundInstanceAnalysis;
  }

  public void setInboundInstanceAnalysis(BQInboundRetrieveOutputModelInboundInstanceAnalysis inboundInstanceAnalysis) {
    this.inboundInstanceAnalysis = inboundInstanceAnalysis;
  }


}

