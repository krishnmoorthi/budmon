/**
 * 
 */
package com.budmon.service;

import java.util.List;

import com.budmon.exception.LedgerServiceException;
import com.budmon.model.Ledger;

/**
 * @author kthangav
 *
 */
public interface LedgerService {
	
	public Ledger createLedger(String LedgerType) throws LedgerServiceException;
	public void deleteLedger(Ledger ledger) throws LedgerServiceException;
	public List<Ledger> getAllledgers() throws LedgerServiceException;
	public String generateLedgerForYear(String LedgerType);
	
}
