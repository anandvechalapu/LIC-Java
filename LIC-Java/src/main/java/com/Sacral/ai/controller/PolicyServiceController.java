package com.Sacral.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.ai.model.PolicyServiceRequestDto;
import com.Sacral.ai.model.CommonResponseDto;
import com.Sacral.ai.model.PolicyServiceDto;
import com.Sacral.ai.service.PolicyServiceService;

@RestController
@RequestMapping("/api/v1/policyService")
public class PolicyServiceController {

    private PolicyServiceService policyServiceService;

    @Autowired
    public PolicyServiceController(PolicyServiceService policyServiceService) {
        this.policyServiceService = policyServiceService;
    }

    /**
     * Retrieves the policy service details by providing the policy service ID and the service type.
     *
     * @param policyServiceRequestDto The PolicyServiceRequestDto object containing the policy service ID and servcie type.
     * @return A CommonResponseDto<PolicyServiceDto> object containing the policy service details.
     */
    @GetMapping
    public CommonResponseDto<PolicyServiceDto> getPolicyServiceById(@RequestBody PolicyServiceRequestDto policyServiceRequestDto) {
        return policyServiceService.getPolicyServiceById(policyServiceRequestDto);
    }
}