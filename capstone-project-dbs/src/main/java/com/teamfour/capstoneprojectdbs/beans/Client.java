package com.teamfour.capstoneprojectdbs.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@ToString
public class Client {
    @Id
    @NotNull
    String clientId;
    
    @NotNull
    String clientName;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "custodian_id")
    Custodian custodian;

    @NotNull
    Double transactionLimit;
    public Client() {
    	
    }
    
    public Client(@NotNull String clientId, @NotNull String clientName, @NotNull Custodian custodian,
			@NotNull Double transactionLimit) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.custodian = custodian;
		this.transactionLimit = transactionLimit;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Custodian getCustodian() {
		return custodian;
	}

	public void setCustodian(Custodian custodian) {
		this.custodian = custodian;
	}

	public Double getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(Double transactionLimit) {
		this.transactionLimit = transactionLimit;
	}

	
}
