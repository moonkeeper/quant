/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.wallet.service;

import com.megance.quant.domain.wallet.model.WalletModel;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: quant
 * @classname: WalletDomainServiceImpl
 * @package: com.megance.quant.domain.wallet.service
 * @description: wallet domain service impl
 * @author: linus
 * @create: 2024-08-06 10:39
 **/
@Service
public class WalletDomainServiceImpl implements WalletDomainService{

    @Override
    @Async(value = "asyncServiceExecutor")
    public WalletModel createWalletAddress(WalletModel walletModel) {
        return null;
    }
}
