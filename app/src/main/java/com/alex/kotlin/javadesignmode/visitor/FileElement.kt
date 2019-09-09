package com.alex.kotlin.javadesignmode.visitor

import android.util.Log

/**
 * @author Alex
 * @date 2019/4/15 下午4:47
 * @email 18238818283@sina.cn
 * @desc ...
 */
class FileElement(val nameFile: String, val sizeFile: Int = 0, var parentFile: Element? = null) : Element() {
    override fun accept(visitor: Visitor) {
        visitor.visitor(this)
    }
    init {
        name = nameFile
        parent = parentFile
    }
}