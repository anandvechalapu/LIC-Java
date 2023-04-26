package com.Sacral.ai.repository;

import org.springframework.data.repository.CrudRepository;

import com.Sacral.ai.model.PolicyServiceRequestDto;
import com.Sacral.ai.model.PolicyServiceDto;
import com.Sacral.ai.model.CommonResponseDto;

public interface PolicyServiceRepository extends CrudRepository<PolicyServiceRequestDto, Long> {

    /**
     * Retrieves the policy service details by providing the policy service ID and the service type.
     *
     * @param policyServiceRequestDto The PolicyServiceRequestDto object containing the policy service ID and servcie type.
     * @return A CommonResponseDto<PolicyServiceDto> object containing the policy service details.
     */
    CommonResponseDto<PolicyServiceDto> getPolicyServiceById(PolicyServiceRequestDto policyServiceRequestDto);
}