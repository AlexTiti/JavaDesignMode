package com.alex.kotlin.javadesignmode.anstract_factory

/**
 * @author Alex
 * @date 2019-09-04 15:36
 * @email 18238818283@sina.cn
 * @desc ...
 */
class FactoryRed : Factory {
    override fun createComputer(): Computer {
        return ComputerRed() //生产Red电脑
    }
    override fun createPhone(): Phone {
        return PhoneRed() //生产Red手机
    }
}