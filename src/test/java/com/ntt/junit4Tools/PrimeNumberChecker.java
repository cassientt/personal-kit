package com.ntt.junit4Tools;

/**
 * @author nietingting
 * Created on 2022-05-07
 */


public class PrimeNumberChecker {
//质数：奇数验证（除1和它本身之外不能被整除）
    public Boolean validate(final Integer parimeNumber) {
        for (int i = 2; i < (parimeNumber / 2); i++) {
            if (parimeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}