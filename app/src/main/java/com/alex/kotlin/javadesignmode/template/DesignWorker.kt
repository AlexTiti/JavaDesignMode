package com.alex.kotlin.javadesignmode.template

import android.util.Log

/**
 * @author Alex
 * @date 2019/3/30 上午11:18
 * @email 18238818283@sina.cn
 * @desc ...
 */
class DesignWorker(val name: String) : AbstractTemplate() {

    override fun weakUp() {
        Log.e("$name ------","8:00 起床了！")
        Log.e("$name ------","8:10 刷牙洗脸！")
        Log.e("$name ------","8:20 健身！")
        Log.e("$name ------","8:40 吃早饭！")
        Log.e("$name ------","9:00 开车出发！")
    }

    override fun enteringTheOffice() {
        Log.e("$name ------","9:30 进入公司！")
        Log.e("$name ------","9:35 泡了杯咖啡！")
    }

    override fun openCompute() {
        Log.e("$name ------","9:40 看了场设计秀！")
    }

    override fun doJob() {
        Log.e("$name ------","10:30 开始设计！")
    }

    override fun goHome() {
        Log.e("$name ------","7:00 开车回家！")
    }
}