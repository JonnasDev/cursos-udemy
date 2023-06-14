fun main(args: Array<String>) {

//    val numero = 50
    val resultado = soma (num1 = 10, num2 = 20)
    print(resultado)

//    when(numero){
//        10 -> {
//            print(numero)
//        }
//        20 ->{
//           print(numero)
//
//          }
//        30 ->{
//            print(numero)
//
//           }
//         40->{
//            print(numero)

//           }
//        else ->{
//            print(numero)
//          }
//    }
}

fun soma (num1: Int, num2: Int): String {
    return when{
        num1 > num2 ->{
            "$num1 é maior que $num2"
        }
        num1 < num2 ->{
            "$num1 é menor que $num2"
        }
        else ->{
            "$num1 é igual a $num2"
        }
    }
}