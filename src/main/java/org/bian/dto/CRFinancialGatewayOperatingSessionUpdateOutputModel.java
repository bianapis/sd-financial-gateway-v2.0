package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionUpdateOutputModel
 */
public class CRFinancialGatewayOperatingSessionUpdateOutputModel   {
  private CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord = null;

  private String financialGatewayOperatingSessionUpdateActionTaskReference = null;

  private Object financialGatewayOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get financialGatewayOperatingSessionInstanceRecord
   * @return financialGatewayOperatingSessionInstanceRecord
  **/

  public CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord getFinancialGatewayOperatingSessionInstanceRecord() {
    return financialGatewayOperatingSessionInstanceRecord;
  }

  public void setFinancialGatewayOperatingSessionInstanceRecord(CRFinancialGatewayOperatingSessionUpdateInputModelFinancialGatewayOperatingSessionInstanceRecord financialGatewayOperatingSessionInstanceRecord) {
    this.financialGatewayOperatingSessionInstanceRecord = financialGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return financialGatewayOperatingSessionUpdateActionTaskReference
  **/

  public String getFinancialGatewayOperatingSessionUpdateActionTaskReference() {
    return financialGatewayOperatingSessionUpdateActionTaskReference;
  }

  public void setFinancialGatewayOperatingSessionUpdateActionTaskReference(String financialGatewayOperatingSessionUpdateActionTaskReference) {
    this.financialGatewayOperatingSessionUpdateActionTaskReference = financialGatewayOperatingSessionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialGatewayOperatingSessionUpdateActionTaskRecord
  **/

  public Object getFinancialGatewayOperatingSessionUpdateActionTaskRecord() {
    return financialGatewayOperatingSessionUpdateActionTaskRecord;
  }

  public void setFinancialGatewayOperatingSessionUpdateActionTaskRecord(Object financialGatewayOperatingSessionUpdateActionTaskRecord) {
    this.financialGatewayOperatingSessionUpdateActionTaskRecord = financialGatewayOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

