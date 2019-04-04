package com.alex.kotlin.javadesignmode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.alex.kotlin.javadesignmode.adapter.Adapter
import com.alex.kotlin.javadesignmode.factory.BusFactory
import com.alex.kotlin.javadesignmode.factory.CarFactory
import com.alex.kotlin.javadesignmode.iterator.Student
import com.alex.kotlin.javadesignmode.iterator.StudentCongregation
import com.alex.kotlin.javadesignmode.prototype.CarProduct
import com.alex.kotlin.javadesignmode.prototype.Food
import com.alex.kotlin.javadesignmode.prototype.FoodProduct
import com.alex.kotlin.javadesignmode.template.DesignWorker
import com.alex.kotlin.javadesignmode.template.ITWorker

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val congregation = StudentCongregation()
//        for (id in 0..5) {
//         congregation.add(Student(id,"name = id",id * 10))
//        }
//
//        val iterator = congregation.createIterator()
//        while (iterator.hasNext()){
//            val student = iterator.next()
//            Log.e("=====","id = ${student.id} name = ${student.name} age = ${student.age}")
//        }

//        val adapter = Adapter()
//        adapter.print("123")

        //模版模式
//        val itWorker = ITWorker("程序猿")
//        val design = DesignWorker("设计师")
//        itWorker.actionForWorker()
//        design.actionForWorker()

//        //工厂模式
//        val car = CarFactory().createProduct("Audi")
//        car.action()
//
//        val bus = BusFactory().createProduct("Yu Tong")
//        bus.action()
//
        //原型模式

//        val car = CarProduct()
//        car.name = "Audi"
//        car.price = 10000
//
//        val cerP = car.createClone()
//        Log.e("Car Name ---",car.name)
//        Log.e("Car Price ---",car.price.toString())
//        Log.e("Car Color ---",car.coclor)
//
//        Log.e("Cerp Name +++",cerP.name)
//        Log.e("Cerp Price +++",cerP.price.toString())
//
//        cerP.name = "BBA"
//        Log.e("Car Name ---",car.name)
//        Log.e("Cerp Name +++",cerP.name)

        val food = Food(1314,"Pomelos")
        val foodProduct = FoodProduct(food)
        foodProduct.name = "A6"

        Log.e("foodProduct Name ---",foodProduct.name)
        Log.e("Food Price ---",foodProduct.food.price.toString())
        Log.e("Food Shop ---",foodProduct.food.shop)

        val cloneFood = foodProduct.createClone()

        Log.e("foodProduct Name +++",cloneFood.name)
        Log.e("Food Price +++",cloneFood.food.price.toString())
        Log.e("Food Shop +++",cloneFood.food.shop)

        cloneFood.name = "Q5"
        cloneFood.food.shop = "QIBAO"
        cloneFood.food.price = 520

        Log.e("------------","---------------------")

        Log.e("foodProduct Name ---",foodProduct.name)
        Log.e("Food Price ---",foodProduct.food.price.toString())
        Log.e("Food Shop ---",foodProduct.food.shop)

        Log.e("foodProduct Name +++",cloneFood.name)
        Log.e("Food Price +++",cloneFood.food.price.toString())
        Log.e("Food Shop +++",cloneFood.food.shop)

    }
}
