package com.Sacral.ai.service;

import org.springframework.stereotype.Service;

import com.Sacral.ai.model.PolicyServiceRequestDto;
import com.Sacral.ai.model.PolicyServiceDto;
import com.Sacral.ai.model.CommonResponseDto;
import com.Sacral.ai.repository.PolicyServiceRepository;

@Service
public class PolicyServiceService {

    private PolicyServiceRepository policyServiceRepository;

    public PolicyServiceService(PolicyServiceRepository policyServiceRepository) {
        this.policyServiceRepository = policyServiceRepository;
    }

    /**
     * Retrieves the policy service details by providing the policy service ID and the service type.
     *
     * @param policyServiceRequestDto The PolicyServiceRequestDto object containing the policy service ID and servcie type.
     * @return A CommonResponseDto<PolicyServiceDto> object containing the policy service details.
     */
    public CommonResponseDto<PolicyServiceDto> getPolicyServiceById(PolicyServiceRequestDto policyServiceRequestDto) {
        return policyServiceRepository.getPolicyServiceById(policyServiceRequestDto);
    }
}