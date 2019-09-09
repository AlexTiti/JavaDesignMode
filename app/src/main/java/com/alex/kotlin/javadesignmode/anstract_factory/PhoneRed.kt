package com.alex.kotlin.javadesignmode.anstract_factory

/**
 * @author Alex
 * @date 2019-09-04 15:30
 * @email 18238818283@sina.cn
 * @desc ...
 */
class PhoneRed : Phone() {
    override fun call(number: String) {
        System.out.println(" Call $number  by  Red Phone !")
    }
}