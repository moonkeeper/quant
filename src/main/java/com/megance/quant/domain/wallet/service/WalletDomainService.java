/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.wallet.service;

import com.megance.quant.domain.wallet.model.WalletModel;

/**
 * @program: quant
 * @classname: WalletService
 * @package: com.megance.quant.domain.wallet.service
 * @description: wallet domain service
 * @author: linus
 * @create: 2024-08-06 10:34
 **/
public interface WalletDomainService {

    /**
     * 创建钱包信息
     * @param walletModel
     * @return
     */
    public WalletModel createWalletAddress(WalletModel walletModel);
}
