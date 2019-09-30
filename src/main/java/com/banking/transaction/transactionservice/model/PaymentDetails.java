/**
 * 
 */
package com.banking.transaction.transactionservice.model;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author 9naya44
 *
 */
@Component
public class PaymentDetails {

	private double amount;
	private String cvv;
	private String port;
    private String cardDetailsPort;

	public String getCardDetailsPort() {
		return cardDetailsPort;
	}

	public void setCardDetailsPort(String cardDetailsPort) {
		this.cardDetailsPort = cardDetailsPort;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	private String cardType;
	private String cardName;

	private String cardProvider;

	public String getCardProvider() {
		return cardProvider;
	}

	public void setCardProvider(String cardProvider) {
		this.cardProvider = cardProvider;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	

}
