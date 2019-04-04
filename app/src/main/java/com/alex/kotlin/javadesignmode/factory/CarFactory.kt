package com.alex.kotlin.javadesignmode.factory

/**
 * @author Alex
 * @date 2019/4/1 上午10:28
 * @email 18238818283@sina.cn
 * @desc ...
 */
open class CarFactory : ProductFactory {

    override fun createProduct(name: String): Product {
        return Car(name)
    }
}