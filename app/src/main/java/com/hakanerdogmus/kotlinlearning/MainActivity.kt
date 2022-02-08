package com.hakanerdogmus.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // println("Hello Kotlin")
        // println(4 * 5)

        // Variables

        var x = 5
        var y = 4

        println(x * y)

        var age = 35            // değişkenler için kullanılır.

        val result = age / 7 * 5
        println(result)

        //defining : Tanımlamak.
        //val myInteger : Int = 10
        val myInteger : Int

        //Initialize : başlatmak ilk değer.
        myInteger = 10


        //String

        val myString = "hakan erdoğmuş"

        val name ="Emine"
        val surname = "Erdoğmuş"

       // val fulName = name + " " + surname
       // println(fulName)
        val fullName = "$name $surname"
        println(fullName)

       println(myString.capitalize())

        //Conversion

        val input = "10"
        val inputInteger = input.toInt()
        println(inputInteger * 2)


        //Collection (koleksiyon) = verileri toplama yeri

        //Array (dizi)

        val myArray = arrayOf("James", "Kirk", "Rob", "Lars")

        println(myArray[0])
        println(myArray[1])
        println(myArray[2])
        println(myArray[3])

        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammet")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val mixedArray = arrayOf("Hakan", 23)
        println(mixedArray[0])
        println(mixedArray[1])

        //List - ArrayList

        val myMusician = arrayListOf<String>("Hakan" , "Emine")
        myMusician.add("Erdoğmuş")
        println(myMusician[2])

        myMusician.add(0, "HAKAN")
        println(myMusician[0])

        //Set = dizi içerisinde kullanılan eleman bir daha kullanılmaz

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)

        mySet.forEach { println(it)}

        //Map - Hashmap

        //Key-Value
        val furitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100 , 150)
        println(furitArray[0] + ": " + caloriesArray[0])

        //HashMap
        val fruitCaloriesMap = HashMap<String,Int>()
        fruitCaloriesMap.put("Apple",100)
        fruitCaloriesMap.put("Banana",150)
        println(fruitCaloriesMap["Apple"])

        val myHashMap = hashMapOf<String,String>()

        val newHashMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(newHashMap["C"])


        //Switch - When
        val day = 3
        var dayString = ""

        /*
        if (day == 3) {
            dayString = "Monday"
        }
        else if (day == 2){
            dayString = "Tuesday"
        }
        else if (day==1){
            dayString = "Wednesday"
        }
        println(dayString)
        */

        when(day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)


        //Loops
        //For Loop

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        var myDegisken = myArrayOfNumbers[0] / 3 * 5
        println(myDegisken)

        for (number in myArrayOfNumbers){
            val z = number / 3 * 5
            println(z)
        }

        for (b in 0..9){
            println(b)
        }


        //While Loop

        var j = 0

        while (j < 10) {            //kuşul sağlanana kadar döngü devam eder

            println(j)
            j++
        }






    }
}