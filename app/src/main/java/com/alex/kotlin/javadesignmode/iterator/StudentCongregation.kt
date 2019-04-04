package com.alex.kotlin.javadesignmode.iterator

/**
 * @author Alex
 * @date 2019/3/29 上午10:21
 * @email 18238818283@sina.cn
 * @desc ...
 */
class StudentCongregation : Congregation {

   private val list by lazy {
        arrayListOf<Student>()
    }

    override fun createIterator(): StudentIterator {
        return StudentIterator(this)
    }

    fun getSize():Int{
        return list.size
    }

    fun add(student: Student){
        list.add(student)
    }

    fun get(index : Int): Student{
        return list[index]
    }

}