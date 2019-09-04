/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FinancialGatewayApiService {

	SDFinancialGatewayActivateOutputModel activate(SDFinancialGatewayActivateInputModel request);
	
	SDFinancialGatewayConfigureOutputModel configure(String sdReferenceId, SDFinancialGatewayConfigureInputModel request);
	
	CRFinancialGatewayOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialGatewayOperatingSessionControlInputModel request);
	
	SDFinancialGatewayFeedbackOutputModel feedback(String sdReferenceId, SDFinancialGatewayFeedbackInputModel request);
	
	CRFinancialGatewayOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRFinancialGatewayOperatingSessionInitiateInputModel request);
	
	BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request);
	
	BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request);
	
	CRFinancialGatewayOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialGatewayOperatingSessionRequestInputModel request);
	
	CRFinancialGatewayOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDFinancialGatewayRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFinancialGatewayOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialGatewayOperatingSessionUpdateInputModel request);
	
}
