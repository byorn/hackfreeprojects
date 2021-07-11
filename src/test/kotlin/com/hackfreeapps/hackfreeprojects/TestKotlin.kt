package com.hackfreeapps.hackfreeprojects

import org.junit.jupiter.api.Test

class TestingKotlin {

    fun main(){
        println("Hello World");
    }

    @Test
    fun testintJunitSetup(){
        println("Hello Junit Test")
    }

    @Test
    fun initialiseAClass(){
        val instance = TestingKotlin();
        println("Hello Junit Test")
    }

    @Test
    fun testAddingTwoNumbers(){
        var result1 = addTwoNumbers1(2,2);
        var result = addTwoNumbers(2,2);
        println("Result $result $result1" )
    }

    @Test
    fun testIfAndForLoop(){
        val items = listOf<String>("apples", "bannanas","mango");
        items.forEach{
            println (it);
        }

        for(i in items){
            if (i == "apples") print("found apples");
        }

    }

    fun addTwoNumbers(num1: Int, num2: Int):Int{
        return (num1 + num2);
    }

    fun addTwoNumbers1(num1: Int, num2: Int) = (num1 + num2);

    @Test
    fun testWhenExpression(){
       println(whenExpression(1));
    }

    @Test
    fun testRanges(){
        val numberX = 100;
        if(numberX in 1..200){
            println ("fits in range");
        }

        val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9);
        for( num in 1..3){
            println(num);
        }



        for (x in 1..10 step 2) {
            print(x)
        }
        for (x in 9 downTo 0 step 3) {
            print(x)
        }

        when {(3 in numbers) -> { println ("found 3 in numbers") }
            (5 in numbers) -> println ("found 5 in numbers")}

    }

    fun whenExpression(obj: Any):String{
        when(obj){
            1 -> return "one was the input variable"
            "two" ->  return "two was the input variable"
            is Long -> return "was a long type"
            !is String -> return "not a string"
            else -> return "unknown"
        }
        return "nothing came insise when"
    }

}

