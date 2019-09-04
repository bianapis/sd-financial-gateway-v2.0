/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FinancialGatewayApiServiceImpl implements FinancialGatewayApiService {

	public SDFinancialGatewayActivateOutputModel activate(SDFinancialGatewayActivateInputModel request){
		return JsonReader.read("activate-SDFinancialGatewayActivateOutputModel.json",new TypeReference<SDFinancialGatewayActivateOutputModel>(){});
	}
	
	public SDFinancialGatewayConfigureOutputModel configure(String sdReferenceId, SDFinancialGatewayConfigureInputModel request){
		return JsonReader.read("configure-SDFinancialGatewayConfigureOutputModel.json",new TypeReference<SDFinancialGatewayConfigureOutputModel>(){});
	}
	
	public CRFinancialGatewayOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialGatewayOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRFinancialGatewayOperatingSessionControlOutputModel.json",new TypeReference<CRFinancialGatewayOperatingSessionControlOutputModel>(){});
	}
	
	public SDFinancialGatewayFeedbackOutputModel feedback(String sdReferenceId, SDFinancialGatewayFeedbackInputModel request){
		return JsonReader.read("feedback-SDFinancialGatewayFeedbackOutputModel.json",new TypeReference<SDFinancialGatewayFeedbackOutputModel>(){});
	}
	
	public CRFinancialGatewayOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRFinancialGatewayOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRFinancialGatewayOperatingSessionInitiateOutputModel.json",new TypeReference<CRFinancialGatewayOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request){
		return JsonReader.read("initiate-BQInboundInitiateOutputModel.json",new TypeReference<BQInboundInitiateOutputModel>(){});
	}
	
	public BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request){
		return JsonReader.read("initiate-BQOutboundInitiateOutputModel.json",new TypeReference<BQOutboundInitiateOutputModel>(){});
	}
	
	public CRFinancialGatewayOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialGatewayOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRFinancialGatewayOperatingSessionRequestOutputModel.json",new TypeReference<CRFinancialGatewayOperatingSessionRequestOutputModel>(){});
	}
	
	public CRFinancialGatewayOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFinancialGatewayOperatingSessionRetrieveOutputModel.json",new TypeReference<CRFinancialGatewayOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInboundRetrieveOutputModel.json",new TypeReference<BQInboundRetrieveOutputModel>(){});
	}
	
	public BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOutboundRetrieveOutputModel.json",new TypeReference<BQOutboundRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDFinancialGatewayRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFinancialGatewayRetrieveOutputModel.json",new TypeReference<SDFinancialGatewayRetrieveOutputModel>(){});
	}
	
	public CRFinancialGatewayOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialGatewayOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRFinancialGatewayOperatingSessionUpdateOutputModel.json",new TypeReference<CRFinancialGatewayOperatingSessionUpdateOutputModel>(){});
	}
	
}
