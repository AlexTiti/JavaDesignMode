package com.alex.kotlin.javadesignmode.anstract_factory

/**
 * @author Alex
 * @date 2019-09-04 15:33
 * @email 18238818283@sina.cn
 * @desc ...
 */
interface Factory {
    fun createComputer() : Computer//生产电脑
    fun createPhone() : Phone // 生产手机
}