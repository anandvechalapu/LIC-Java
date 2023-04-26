package com.Sacral.ai.repository;

import org.springframework.stereotype.Repository;

import com.Sacral.ai.entity.PolicyServiceRequestDto;
import com.Sacral.ai.entity.CommonResponseDto;
import com.Sacral.ai.entity.PolicyServiceDto;
import com.Sacral.ai.exception.ApplicationException;
import com.Sacral.ai.exception.RequiredFieldException;
import com.Sacral.ai.exception.RequestValidationException;
import com.Sacral.ai.service.mergerSaveServiceImpl;
import com.Sacral.ai.service.policySrvSearchByIdServiceImpl;

@Repository
public class PolicyServicingControllerRepository {

    public CommonResponseDto<PolicyServiceDto> getPolicyServiceById(PolicyServiceRequestDto requestDto) {
        CommonResponseDto<PolicyServiceDto> response = new CommonResponseDto<>();
        try {
            validatePolicyServiceRequestDto(requestDto);
            if (requestDto.getServiceType().equals("POLSRV_TYPE")) {
                response.setData(null);
            } else if (requestDto.getServiceType().equals("POLSRV_MEMBER_TRASFER_IN_OUT_TYPE")) {
                response.setData(mergerSaveServiceImpl.getPolicyServiceById(requestDto.getId()));
            } else {
                response.setData(policySrvSearchByIdServiceImpl.getPolicyServiceById(requestDto.getId()));
            }
            response.setTransactionStatus("SUCCESS");
            response.setTransactionMessage("Data retrieved successfully.");
        } catch (ApplicationException ex) {
            response.setTransactionStatus("ERROR");
            response.setTransactionMessage(ex.getMessage());
        } catch (RequiredFieldException ex) {
            response.setTransactionStatus("ERROR");
            response.setTransactionMessage(ex.getMessage());
        } catch (RequestValidationException ex) {
            response.setTransactionStatus("ERROR");
            response.setTransactionMessage(ex.getMessage());
        } catch (Exception ex) {
            response.setTransactionStatus("ERROR");
            response.setTransactionMessage("An error occurred while retrieving the policy service details.");
        }
        return response;
    }

    private void validatePolicyServiceRequestDto(PolicyServiceRequestDto requestDto) throws RequiredFieldException, RequestValidationException {
        if (requestDto == null) {
            throw new RequiredFieldException("The request body must not be empty.");
        }
        if (requestDto.getId() == null || requestDto.getId().isEmpty()) {
            throw new RequestValidationException("The policy service ID must not be empty.");
        }
        if (requestDto.getServiceType() == null || requestDto.getServiceType().isEmpty()) {
            throw new RequestValidationException("The service type must not be empty.");
        }
    }
}