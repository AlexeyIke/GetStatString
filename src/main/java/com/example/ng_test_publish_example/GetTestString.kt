package com.example.ng_test_publish_example

class GetTestString {
    fun getTestString(): String{
        return "object String"
    }

    companion object {
        fun getStaticString():String{
            return "object StaticString"

        }
    }
}