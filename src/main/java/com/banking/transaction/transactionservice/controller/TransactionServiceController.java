package com.banking.transaction.transactionservice.controller;



import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.banking.transaction.transactionservice.model.PaymentDetails;
import com.banking.transaction.transactionservice.proxy.CardServicesProxy;

@RestController
public class TransactionServiceController {
	
	private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PaymentDetails pd;
	
	@Autowired
	Environment env;
	
	@Autowired
	CardServicesProxy cardServicesProxy;
	
	
	@GetMapping("/transaction-service/amount/{amount}/cvv/{cvv}/cardType/{cardType}")
	public PaymentDetails getTransactionDetail(@PathVariable String amount, @PathVariable String cvv,@PathVariable String cardType)
	{
		
		pd.setAmount(Double.parseDouble(amount));
		pd.setCvv(cvv);

		
		PaymentDetails response=cardServicesProxy.getCardInformation(cardType);
		pd.setCardName(response.getCardName());
		pd.setCardType(cardType);
		pd.setCardProvider(response.getCardProvider());
		pd.setPort(response.getPort());
		logger.info("transaction service  ->>>>>>>",pd);
		return pd;
		
		
	}
	

}
