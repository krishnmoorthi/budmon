/**
 * 
 */
package com.budmon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.budmon.model.Ledger;
import com.budmon.service.LedgerService;
import com.budmon.utilities.CommonUtils;

/**
 * @author kthangav
 *
 */
@Service
@Qualifier("ledgerService")
public class LedgerServiceImpl implements LedgerService {

	@Override
	public Ledger createLedger(String LedgerType) {
		String ledgername = generateLedgerForYear(LedgerType);
		Ledger ledger = new Ledger();
		ledger.setName(ledgername);
		return ledger;
	}

	@Override
	public String generateLedgerForYear(String LedgerType) {
		return LedgerType.concat("_") + CommonUtils.getCurrentYear();
	}

	@Override
	public void deleteLedger(Ledger ledger) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Ledger> getAllledgers() {
		return null;
	}

}
