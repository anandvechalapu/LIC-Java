package com.Sacral.ai.model;

import java.io.Serializable;

public class PolicyServiceRequestDto implements Serializable {

    private Long policyServiceId;
    private String serviceType;

    public Long getPolicyServiceId() {
        return policyServiceId;
    }

    public void setPolicyServiceId(Long policyServiceId) {
        this.policyServiceId = policyServiceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}

package com.Sacral.ai.model;

import java.io.Serializable;

public class PolicyServiceDto implements Serializable {

    private Long policyServiceId;
    private String serviceName;
    private String serviceType;

    public Long getPolicyServiceId() {
        return policyServiceId;
    }

    public void setPolicyServiceId(Long policyServiceId) {
        this.policyServiceId = policyServiceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}

package com.Sacral.ai.model;

import java.io.Serializable;

public class CommonResponseDto<T> implements Serializable {

    private int status;
    private String message;
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}