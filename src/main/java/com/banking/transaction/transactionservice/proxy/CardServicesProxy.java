package com.banking.transaction.transactionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.banking.transaction.transactionservice.model.PaymentDetails;

//@FeignClient(name="card-services")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="card-services")
public interface CardServicesProxy {
	//@GetMapping("/{cardType}")
	@GetMapping("card-services/{cardType}")
	public PaymentDetails getCardInformation(@PathVariable("cardType")String cardType);

}
