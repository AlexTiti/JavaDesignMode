package com.alex.kotlin.javadesignmode.iterator

/**
 * @author Alex
 * @date 2019/3/29 上午10:21
 * @email 18238818283@sina.cn
 * @desc ...
 */
class StudentIterator(val congregation: StudentCongregation) : Iterator {

    var index = 0

    override fun hasNext(): Boolean {
        return index < congregation.getSize()
    }

    override fun next(): Student {
        val student = congregation.get(index)
        index++
        return student
    }

}