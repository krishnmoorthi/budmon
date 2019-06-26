/**
 * 
 */
package com.budmon.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.budmon.exception.LedgerServiceException;
import com.budmon.model.Ledger;
import com.budmon.model.User;
import com.budmon.service.LedgerService;

/**
 * @author kthangav
 *
 */
@RestController
public class LedgerController {

	@Autowired
	LedgerService ledgerService;

	@PutMapping("/CreateLedger")
	public ResponseEntity<Ledger> createLedgerForUser(@RequestBody User user, String ledgerType)
			throws LedgerServiceException {
		Ledger ledger = ledgerService.createLedger(user, ledgerType);
		if (ledger == null)
			return ResponseEntity.unprocessableEntity().eTag("Ledger not created for user").build();

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ledger}")
				.buildAndExpand(ledger.getName()).toUri();

		return ResponseEntity.created(location).build();
	}
}
