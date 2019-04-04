package com.alex.kotlin.javadesignmode.template

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * @author Alex
 * @date 2019/3/30 上午11:26
 * @email 18238818283@sina.cn
 * @desc ...
 */
class DesignWorkerTest{

    val design = DesignWorker("设计师")
    val it = ITWorker("程序猿")
    @Before
    fun setUp(){

    }

    @Test
    fun test(){
        design.actionForWorker()
        it.actionForWorker()
    }
}