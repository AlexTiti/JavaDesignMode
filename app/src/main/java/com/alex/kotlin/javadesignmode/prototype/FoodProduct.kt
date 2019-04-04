package com.alex.kotlin.javadesignmode.prototype

/**
 * @author Alex
 * @date 2019/4/2 下午3:19
 * @email 18238818283@sina.cn
 * @desc 保存对象的原型模式，因为原型的Clone是浅复制，因此其保存的对象类也要实现Cloneable，在clone（）时调用保存对象的clone（）同时克隆保存对象
 */
class FoodProduct(var food: Food) : BaseProduct(){

    fun createClone(): FoodProduct {
        val product = super.clone() as FoodProduct
        product.food = food.createClone()
        return product
    }
}