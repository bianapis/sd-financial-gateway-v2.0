package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecord;
import org.bian.dto.CRFinancialGatewayOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRequestInputModel
 */
public class CRFinancialGatewayOperatingSessionRequestInputModel   {
  private String financialGatewayServicingSessionReference = null;

  private String financialGatewayOperatingSessionInstanceReference = null;

  private CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private Object financialGatewayOperatingSessionRequestActionTaskRecord = null;

  private CRFinancialGatewayOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return financialGatewayServicingSessionReference
  **/

  public String getFinancialGatewayServicingSessionReference() {
    return financialGatewayServicingSessionReference;
  }

  public void setFinancialGatewayServicingSessionReference(String financialGatewayServicingSessionReference) {
    this.financialGatewayServicingSessionReference = financialGatewayServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Gateway Operating Session instance 
   * @return financialGatewayOperatingSessionInstanceReference
  **/

  public String getFinancialGatewayOperatingSessionInstanceReference() {
    return financialGatewayOperatingSessionInstanceReference;
  }

  public void setFinancialGatewayOperatingSessionInstanceReference(String financialGatewayOperatingSessionInstanceReference) {
    this.financialGatewayOperatingSessionInstanceReference = financialGatewayOperatingSessionInstanceReference;
  }


  /**
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRFinancialGatewayOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRFinancialGatewayOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

