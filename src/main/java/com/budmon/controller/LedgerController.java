/**
 * 
 */
package com.budmon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.budmon.service.LedgerService;

/**
 * @author kthangav
 *
 */
@RestController
public class LedgerController {

	@Autowired
	LedgerService ledgerService;

}
