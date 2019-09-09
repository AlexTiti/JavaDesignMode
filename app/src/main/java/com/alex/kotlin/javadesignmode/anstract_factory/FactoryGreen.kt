package com.alex.kotlin.javadesignmode.anstract_factory

/**
 * @author Alex
 * @date 2019-09-04 15:36
 * @email 18238818283@sina.cn
 * @desc ...
 */
class FactoryGreen : Factory {
    override fun createComputer(): Computer {
        return ComputerGreen() //生产Green电脑
    }

    override fun createPhone(): Phone {
        return PhoneGreen() //生产Green手机
    }
}