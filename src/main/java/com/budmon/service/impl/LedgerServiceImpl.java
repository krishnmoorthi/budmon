/**
 * 
 */
package com.budmon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.budmon.model.Ledger;
import com.budmon.model.User;
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
	public Ledger createLedger(User user, String LedgerType) {
		if (null == user.getLedgers() || user.getLedgers().isEmpty()) {
			user.setLedgers(new ArrayList<>());
		}
		String ledgername = generateLedgerForYear(user, LedgerType);
		Ledger ledger = new Ledger();
		ledger.setName(ledgername);
		user.getLedgers().add(ledger);
		return ledger;
	}

	@Override
	public String generateLedgerForYear(User user, String LedgerType) {
		return user.getUsername().concat("_").concat(LedgerType).concat("_") + CommonUtils.getCurrentYear();
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
