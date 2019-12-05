package com.base.Republic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.base.Republic.config.WebServiceConfig;
import com.base.Republic.model.Beneficiary;
import com.base.Republic.model.BeneficiaryRetrieveDataApr;
import com.base.Republic.model.ListApResponse;
import com.base.Republic.service.BeneficiaryService;
import com.base.Republic.wsclient.ListApServiceClient;

@RestController
@RequestMapping("/api")
public class BeneficiaryController {

	@Autowired
	WebServiceConfig webServiceConfig;
	
	@Autowired
	BeneficiaryService benService;
	
	
	@RequestMapping(value = "/beneficiarys", method = RequestMethod.GET)
	ResponseEntity<?> loadAll() {
		List<Beneficiary> res = this.benService.loadAll();
		return new ResponseEntity<>(new ResponseWrapper(res), HttpStatus.OK);
	}
	

	@RequestMapping(value = "/beneficiarysByApr", method = RequestMethod.POST)
	ResponseEntity<?> addBeneficiary(@RequestBody BeneficiaryRetrieveDataApr beneficiaryRetrieveDataApr)
			throws Exception {
		

		
		System.out.println("USAO SAMN!");
		if (beneficiaryRetrieveDataApr.getBrdTzpeField() != null && beneficiaryRetrieveDataApr.getBrdTzpeField() < 8) {

			/// INICIJALIZACIJA LISTAP APR SERVISA I REQUEST
			ListApServiceClient service = webServiceConfig.initializeListApServiceClient();
			ListApResponse responseSOAP = service.getData(beneficiaryRetrieveDataApr.getBrdRegistrationNumberField().trim(),
					beneficiaryRetrieveDataApr.getBrdTzpeField());
			
			Beneficiary ben = responseSOAP.getBeneficiary();
			List<Beneficiary>listaOgranaka = responseSOAP.getListaOgranaka();

			return new ResponseEntity<>(new ResponseWrapper(ben), HttpStatus.CREATED);

		} else {
			return new ResponseEntity<>(new ResponseWrapper(null), HttpStatus.BAD_REQUEST);
		}

	}
}
