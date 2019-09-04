package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionRequestOutputModelFinancialGatewayOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRequestOutputModel
 */
public class CRFinancialGatewayOperatingSessionRequestOutputModel   {
  private CRFinancialGatewayOperatingSessionRequestOutputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private String financialGatewayOperatingSessionRequestActionTaskReference = null;

  private Object financialGatewayOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public CRFinancialGatewayOperatingSessionRequestOutputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(CRFinancialGatewayOperatingSessionRequestOutputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Gateway Operating Session instance request service call 
   * @return financialGatewayOperatingSessionRequestActionTaskReference
  **/

  public String getFinancialGatewayOperatingSessionRequestActionTaskReference() {
    return financialGatewayOperatingSessionRequestActionTaskReference;
  }

  public void setFinancialGatewayOperatingSessionRequestActionTaskReference(String financialGatewayOperatingSessionRequestActionTaskReference) {
    this.financialGatewayOperatingSessionRequestActionTaskReference = financialGatewayOperatingSessionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return financialGatewayOperatingSessionRequestActionTaskRecord
  **/

  public Object getFinancialGatewayOperatingSessionRequestActionTaskRecord() {
    return financialGatewayOperatingSessionRequestActionTaskRecord;
  }

  public void setFinancialGatewayOperatingSessionRequestActionTaskRecord(Object financialGatewayOperatingSessionRequestActionTaskRecord) {
    this.financialGatewayOperatingSessionRequestActionTaskRecord = financialGatewayOperatingSessionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

