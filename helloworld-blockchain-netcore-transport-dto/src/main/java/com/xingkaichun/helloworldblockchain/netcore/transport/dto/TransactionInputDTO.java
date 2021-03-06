package com.xingkaichun.helloworldblockchain.netcore.transport.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 交易输入
 * 属性含义参考 com.xingkaichun.helloworldblockchain.core.model.TransactionInput
 *
 * @author 邢开春 微信HelloworldBlockchain 邮箱xingkaichun@qq.com
 */
public class TransactionInputDTO implements Serializable {

    //交易的输入
    private String unspendTransactionOutputHash;
    //脚本钥匙
    private List<String> scriptKey;




    //region get set

    public String getUnspendTransactionOutputHash() {
        return unspendTransactionOutputHash;
    }

    public void setUnspendTransactionOutputHash(String unspendTransactionOutputHash) {
        this.unspendTransactionOutputHash = unspendTransactionOutputHash;
    }

    public List<String> getScriptKey() {
        return scriptKey;
    }

    public void setScriptKey(List<String> scriptKey) {
        this.scriptKey = scriptKey;
    }

    //endregion
}