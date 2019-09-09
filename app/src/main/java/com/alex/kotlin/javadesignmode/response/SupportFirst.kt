package com.alex.kotlin.javadesignmode.response

/**
 * @author Alex
 * @date 2019-09-09 14:27
 * @email 18238818283@sina.cn
 * @desc ...
 */
class SupportFirst : Support() {
    override fun action(number: Int) {
      System.out.println("SupportFirst")
    }
    override fun canResolve(number: Int): Boolean {
       return number < 10
    }
}