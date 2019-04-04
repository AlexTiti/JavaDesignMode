package com.alex.kotlin.javadesignmode.factory

/**
 * @author Alex
 * @date 2019/4/1 上午10:25
 * @email 18238818283@sina.cn
 * @desc ...
 */
interface ProductFactory {
    /**
     * 创建Product抽象方法
     */
    fun createProduct(name: String):Product
}