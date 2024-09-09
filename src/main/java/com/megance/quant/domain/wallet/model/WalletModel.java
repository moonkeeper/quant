/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.wallet.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: quant
 * @classname: WalletModel
 * @package: com.megance.quant.domain.wallet.model
 * @description:
 * @author: linus
 * @create: 2024-08-06 10:37
 **/
@Data
public class WalletModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;
}
