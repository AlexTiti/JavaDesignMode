package com.alex.kotlin.javadesignmode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.alex.kotlin.javadesignmode.adapter.Adapter
import com.alex.kotlin.javadesignmode.anstract_factory.FactoryGreen
import com.alex.kotlin.javadesignmode.anstract_factory.FactoryRed
import com.alex.kotlin.javadesignmode.command.ActionCommand
import com.alex.kotlin.javadesignmode.command.Invoke
import com.alex.kotlin.javadesignmode.command.Receiver
import com.alex.kotlin.javadesignmode.composite.Directory
import com.alex.kotlin.javadesignmode.composite.File
import com.alex.kotlin.javadesignmode.decorator.ConcerteComponent
import com.alex.kotlin.javadesignmode.decorator.ConcerteDecorator
import com.alex.kotlin.javadesignmode.facade.Car
import com.alex.kotlin.javadesignmode.iterator.Student
import com.alex.kotlin.javadesignmode.iterator.StudentCongregation
import com.alex.kotlin.javadesignmode.meidator.Meidator
import com.alex.kotlin.javadesignmode.proxy.ProxyPrint
import com.alex.kotlin.javadesignmode.response.SupportFirst
import com.alex.kotlin.javadesignmode.response.SupportSecond
import com.alex.kotlin.javadesignmode.singleton.Singleton
import com.alex.kotlin.javadesignmode.singleton.SingletonInner
import com.alex.kotlin.javadesignmode.state.Light
import com.alex.kotlin.javadesignmode.strategy.DoubleStrategy
import com.alex.kotlin.javadesignmode.strategy.NumberStrategy
import com.alex.kotlin.javadesignmode.strategy.Palyer
import com.alex.kotlin.javadesignmode.template.DesignWorker
import com.alex.kotlin.javadesignmode.template.ITWorker
import com.alex.kotlin.javadesignmode.visitor.ConcreteVisitor
import com.alex.kotlin.javadesignmode.visitor.DirectoryElement
import com.alex.kotlin.javadesignmode.visitor.FileElement

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val congregation = StudentCongregation()
        for (id in 0..5) {
            congregation.add(Student(id, "name = id", id * 10))
        }
        val iterator = congregation.createIterator()
        while (iterator.hasNext()) {
            val student = iterator.next()
            Log.e("=====", "id = ${student.id} name = ${student.name} age = ${student.age}")
        }

        val adapter = Adapter()
        adapter.print("123")

        //模版模式
        val itWorker = ITWorker("程序猿")
        val design = DesignWorker("设计师")
        itWorker.actionForWorker()
        design.actionForWorker()

        //工厂模式
//        val car = CarFactory().createProduct("Audi")
//        car.action()

        val factoryGreen = FactoryGreen()
        factoryGreen.createComputer()
        factoryGreen.createComputer()

        val factoryRed = FactoryRed()
        factoryRed.createComputer()
        factoryRed.createComputer()

        val single = Singleton.getIntance()
        val singleInner = SingletonInner.SingleHolder.singletonInner


//
//        val bus = BusFactory().createProduct("Yu Tong")
//        bus.action()
//
        //原型模式

//        val car = CarProduct()
//        car.name = "Audi"
//        car.price = 10000
//        val cerClone = car.createClone()
//        Log.e("Car Name ---",cerClone.name)
//        Log.e("Car Price ---",cerClone.price.toString())
//        Log.e("Car Color ---",cerClone.coclor)
//
//        Log.e("Cerp Name +++",cerP.name)
//        Log.e("Cerp Price +++",cerP.price.toString())
//
//        cerP.name = "BBA"
//        Log.e("Car Name ---",car.name)
//        Log.e("Cerp Name +++",cerP.name)

//        val food = Food(1314,"Pomelos")
//        val foodProduct = FoodProduct(food)
//        foodProduct.name = "A6"
//
//        Log.e("foodProduct Name ---",foodProduct.name)
//        Log.e("Food Price ---",foodProduct.food.price.toString())
//        Log.e("Food Shop ---",foodProduct.food.shop)
//
//        val cloneFood = foodProduct.createClone()
//
//        Log.e("foodProduct Name +++",cloneFood.name)
//        Log.e("Food Price +++",cloneFood.food.price.toString())
//        Log.e("Food Shop +++",cloneFood.food.shop)
//
//        cloneFood.name = "Q5"
//        cloneFood.food.shop = "QIBAO"
//        cloneFood.food.price = 520
//
//        Log.e("------------","---------------------")
//
//        Log.e("foodProduct Name ---",foodProduct.name)
//        Log.e("Food Price ---",foodProduct.food.price.toString())
//        Log.e("Food Shop ---",foodProduct.food.shop)
//
//        Log.e("foodProduct Name +++",cloneFood.name)
//        Log.e("Food Price +++",cloneFood.food.price.toString())
//        Log.e("Food Shop +++",cloneFood.food.shop)

//        //Builder 模式
//        val builder = ConcreteBuilder()
//        val director = Director(builder)
//        director.construct()

        //Bridge 模式
//
//        val logImplementer = LogImplementer()
//        val addFunction = AddFunction(logImplementer)
//        addFunction.doSomething("Bridge")
//        addFunction.addAction("Bridgr")
//
//        val printImplementer = PrintImplementer()
//        val addFunctionPrint = AddFunction(printImplementer)
//        addFunctionPrint.doSomething("Bridge")
//        addFunctionPrint.addAction("Bridgr")

        // Composite

        val rootD = Directory("root")
        val bin = Directory("bin", rootD)
        val tem = Directory("tem", rootD)
        val user = Directory("user", rootD)

        val vi = File("vi", 1000)
        val latex = File("latex", 500)
        val tem_in = File("latex", 800)

        rootD.add(bin)
        rootD.add(tem)
        rootD.add(user)
        bin.add(vi)
        bin.add(latex)
        tem.add(tem_in)
        bin.add(tem)

//        Log.e("Root Size = ",root.getSize().toString())
//        Log.e("Bin Size = ",bin.getSize().toString())
//        Log.e("Tem Size = ",tem.getSize().toString())
//        Log.e("User Size = ",user.getSize().toString())
//        Log.e("Vi Size = ",vi.getSize().toString())
//        Log.e("Latex Size = ",latex.getSize().toString())
//        Log.e("Tem_in Size = ",tem_in.getSize().toString())
//
//        root.printStrign("")
//        bin.printStrign("")
//        tem.printStrign("")
//        user.printStrign("")
//        vi.printStrign("")
//        latex.printStrign("")
//        tem_in.printStrign("")
//
//        Log.e("Root Size = ",root.getAbslouteName())
//        Log.e("Bin Size = ",bin.getAbslouteName())
//        Log.e("Tem Size = ",tem.getAbslouteName())
//        Log.e("User Size = ",user.getAbslouteName())
//        Log.e("VI Size = ",vi.getAbslouteName())
//        Log.e("Latex Size = ",latex.getAbslouteName())
//        Log.e("Tem_in Size = ",tem_in.getAbslouteName())


        //Decorator
        val component = ConcerteComponent("HELLO")
        val concerteDecorator = ConcerteDecorator(component)
        concerteDecorator.show()

        //Visitor
        val root = DirectoryElement("Root")
        val file0 = FileElement("First", 1000)
        val file1 = FileElement("Second", 1000)

        root.add(file0)
        root.add(file1)

        val visitor = ConcreteVisitor()
        root.accept(visitor)
        //Proxy
        val print = ProxyPrint("Proxy")
        print.getName()
        print.print("This is proxy !")
        //facade
        val car = Car()
        car.start()
        car.stop()


        val player = Palyer(NumberStrategy())
        player.play(5)
        val playerD = Palyer(DoubleStrategy())
        playerD.play(5)

        val receiver = Receiver()
        val command = ActionCommand(receiver)
        val invoke = Invoke(command)
        invoke.doInvoke()

        val supportFirst = SupportFirst()
        val supportSecond = SupportSecond(20)
        val supportThird = SupportSecond(30)
        supportFirst.setNextSupport(supportSecond)?.setNextSupport(supportThird)
        supportFirst.action(25)

        val light = Light()
        light.open()
        light.open()
        light.close()
        light.close()

        val meidator = Meidator()
        meidator.doAction()

    }
}
