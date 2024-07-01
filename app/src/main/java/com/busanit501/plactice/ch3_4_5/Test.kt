package com.busanit501.androidlabtest501.ch3_4_5

class Test {
    //클래스 내부,선언과  할당 동시에 해주세요.
    var price = 1000
}
// 클래스 밖, 최상위. 선언과  할당 동시에 해주세요.
var name3 = 1
val name : String = "이상용"
var name2 : String = "이상용2"
// 타입이 없어도 알아서 추론해서 할당 해줌. 동적 할당.
var menu = "국수"

// var 만, 기본형 타입 안됨.
lateinit var name6:String

//늦게 초기화 놀이 2,
// lazy 뒤에 블록 부분은, 해당 상수가 최초로 이용 될 때, 사용됨.
val  data : String by lazy {
    println("val  data : String by lazy : 확인중")
    "오늘 뭐 먹죠?"
}

// 함수 내부
fun main() { // 선언만 해도 가능. 초기화를 조금 늦게 해도 됨.
    println("fun main() 실행")
//    val name4:String
//    val name = "이상용"
//    println("이름 : " + name)
//    name = "오늘 점심"
//    name2 = "오늘점심"
    println("by lazy 테스트")
    println(data)

    //배열 만들기
    val data3 : Array<String> = Array(3,{""})
    data3[0] = "lsy1"
    data3[1] = "lsy2"
    data3.set(2,"lsy3")
    //가져오기 get
    println("data3 배열 가져오기 테스트 : 사이즈 : ${data3.size}, data[0] : ${data3[0]}"
    + ", data3.get(1) : ${data3.get(1)}")


    val arrayData2 = intArrayOf(1,2,3)
    val arrayData3 = booleanArrayOf(true, false, true)
    val arrayData4 = arrayOf<String>("국수", "국밥", "된장찌개")
    val arrayData5 = arrayOf<Int>(1,2,3)

    var list1 = listOf<Int>(1,2,3)
    var list2 = listOf<String>("1","2","3")

    var mutableList1 = mutableListOf<Int>(1,2,3)
    var mutableList2 = mutableListOf<String>("1","2","3")
    mutableList2.add(4,"4")

    //Map , 고정길이
    var map1 = mapOf<String,String>(Pair("1","one"), Pair("2","two"), "3" to "three")

    var mutableMap1 = mutableMapOf<String,String>()

    //when
    var data = 1
    when(data) {
        1 -> println("1번 국수")
        2 -> println("2번 국밥")
        else -> {
            println("기본 된장찌깨")
        }
    }
}
//변경 테스트23