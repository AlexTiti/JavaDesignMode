package com.alex.kotlin.javadesignmode.adapter

/**
 * @author Alex
 * @date 2019/3/29 上午10:47
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Adapter : PrintString ,PrintInt(){
    override fun print(message : String) {
        when(message){
            "123" -> {printInt(123)}
        }
    }
}