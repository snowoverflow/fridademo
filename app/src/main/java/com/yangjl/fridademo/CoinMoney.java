package com.yangjl.fridademo;

/**
 * @author yangjl
 * @date 2019/8/25
 * @版本: 1.0
 * @描述:
 */
public class CoinMoney {
    private int money;
    private String value;
    private int extMoney;

    public CoinMoney(int money) {
        this.money = money;
    }

    public CoinMoney(int money, String value) {
        this.money = money;
        this.value = value;
    }

    public int getMoney() {
        return money;
    }
}
