package com.alex.kotlin.javadesignmode.singleton

/**
 * @author Alex
 * @date 2019/4/2 下午2:05
 * @email 18238818283@sina.cn
 * @desc 使用双重判断模式提供单例模式
 */
class Singleton private constructor() {
    companion object {
       private var singleton: Singleton? = null
        fun getIntance(): Singleton {
            if (singleton == null) {
                synchronized(Singleton::class.java) {
                    singleton = Singleton()
                }
            }
            return singleton!!
        }
    }
}