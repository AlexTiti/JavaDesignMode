package com.alex.kotlin.javadesignmode.anstract_factory

/**
 * @author Alex
 * @date 2019-09-04 15:28
 * @email 18238818283@sina.cn
 * @desc ...
 */
abstract class Phone(var name: String = "Phone") {
    abstract fun call(number : String)
}