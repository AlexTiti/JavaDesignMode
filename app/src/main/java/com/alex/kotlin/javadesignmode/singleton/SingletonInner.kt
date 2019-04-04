package com.alex.kotlin.javadesignmode.singleton

/**
 * @author Alex
 * @date 2019/4/2 下午2:08
 * @email 18238818283@sina.cn
 * @desc 使用内部类形式实现单利模式
 */
class SingletonInner private constructor() {

    companion object {
        fun getInstance() = SingleHolder.singletonInner
    }

    class SingleHolder {
        companion object {
            val singletonInner = SingletonInner()
        }
    }
}