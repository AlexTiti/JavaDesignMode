package com.alex.kotlin.javadesignmode.template

import android.util.Log

/**
 * @author Alex
 * @date 2019/3/30 上午11:18
 * @email 18238818283@sina.cn
 * @desc ...
 */
class ITWorker(val name: String) : AbstractTemplate() {

    override fun weakUp() {
        Log.e("$name ------","8:30 起床了！")
        Log.e("$name ------","9:00 刷牙洗脸，出发上班了！")
    }

    override fun enteringTheOffice() {
        Log.e("$name ------","9:30 进入公司！")
        Log.e("$name ------","9:35 接了杯白开水！")
    }

    override fun openCompute() {
        Log.e("$name ------","9:40 打开它的Mac Pro ！")
    }

    override fun doJob() {
        Log.e("$name ------","9:40 开始一天的写代码 ！")
    }

    override fun goHome() {
        Log.e("$name ------","7:00 开始下班坐地铁回家 ！")
    }
}