package com.Sacral.ai.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyServiceRequestDto {

    @Id
    private String id;

    private String serviceType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}

package com.Sacral.ai.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommonResponseDto<T> {

    @Id
    private String transactionStatus;

    private String transactionMessage;

    private T data;

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

package com.Sacral.ai.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyServiceDto {

    @Id
    private String policyNumber;

    private String policyType;

    private String policyStatus;

    private String policyOwnerName;

    private String policyOwnerCountry;

    private String insuredName;

    private String insuredCountry;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPolicyOwnerName() {
        return policyOwnerName;
    }

    public void setPolicyOwnerName(String policyOwnerName) {
        this.policyOwnerName = policyOwnerName;
    }

    public String getPolicyOwnerCountry() {
        return policyOwnerCountry;
    }

    public void setPolicyOwnerCountry(String policyOwnerCountry) {
        this.policyOwnerCountry = policyOwnerCountry;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getInsuredCountry() {
        return insuredCountry;
    }

    public void setInsuredCountry(String insuredCountry) {
        this.insuredCountry = insuredCountry;
    }

}