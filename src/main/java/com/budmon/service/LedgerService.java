/**
 * 
 */
package com.budmon.service;

import java.util.List;

import com.budmon.exception.LedgerServiceException;
import com.budmon.model.Ledger;
import com.budmon.model.User;

/**
 * @author kthangav
 *
 */
public interface LedgerService {
	
	public Ledger createLedger(User user,String LedgerType) throws LedgerServiceException;
	public void deleteLedger(Ledger ledger) throws LedgerServiceException;
	public List<Ledger> getAllledgers() throws LedgerServiceException;
	public String generateLedgerForYear(User user,String LedgerType);
	
}
