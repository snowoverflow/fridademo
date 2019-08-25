package com.yangjl.fridademo;

/**
 * @author yangjl
 * @date 2019/8/25
 * @版本: 1.0
 * @描述:
 */
public class Utils {
    public static String getPwd(String info){
        return info+"yangjl";
    }

    public static String getPwd(){
        return "yangjl";
    }

    public static CoinMoney getCoin(){
        return new CoinMoney(1,"1.0");
    }

    public static  int getCoinMoney(CoinMoney coin){
        return coin.getMoney();
    }

}
