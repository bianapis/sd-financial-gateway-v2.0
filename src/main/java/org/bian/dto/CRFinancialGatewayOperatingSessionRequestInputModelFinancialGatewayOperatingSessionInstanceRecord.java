package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecord
 */
public class CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecord   {
  private CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord financialGatewayServiceSessionIssueRecord = null;


  /**
   * Get financialGatewayServiceSessionIssueRecord
   * @return financialGatewayServiceSessionIssueRecord
  **/

  public CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord getFinancialGatewayServiceSessionIssueRecord() {
    return financialGatewayServiceSessionIssueRecord;
  }

  public void setFinancialGatewayServiceSessionIssueRecord(CRFinancialGatewayOperatingSessionRequestInputModelFinancialGatewayOperatingSessionInstanceRecordFinancialGatewayServiceSessionIssueRecord financialGatewayServiceSessionIssueRecord) {
    this.financialGatewayServiceSessionIssueRecord = financialGatewayServiceSessionIssueRecord;
  }


}

