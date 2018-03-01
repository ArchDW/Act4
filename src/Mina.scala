import java.util.concurrent.ThreadLocalRandom
import scala.collection.mutable.ArrayBuffer

object Mina {

	def MostrarVector(Vec: Array[Int]): Unit ={
			for(i <- 0 until Vec.length){
				print(Vec(i)+ " ")
			}//end the for
			println()
	}//Enteros

	def MostrarTemp(Vec: Array[Int], vec2: ArrayBuffer[Int]): Unit ={
			for(i <- 0 until Vec.length){
				if(i%2 == 1){
					if(Vec(i) == 25){
						print(Vec(i-1)+" " +Vec(i)+ " ")
						vec2 += Vec(i-1)
						vec2 += Vec(i)
					}//The End  of If
				}//The End  of If
			}//The End of For
	}//Enteros

	def Hora(vec: Array[Int]): Unit={
			var cont = 0
					//println(vec.length)
					for(i <- 0 until vec.length){
						if(i%2 == 0){
							vec(i) = cont
									cont += 1
									//	println(vec.length)
									//	println(cont)
						}//The End  of If
					}//The End of For
	}//The End of Hora

	def Temp(vec: Array[Int]): Unit={
			for(i <- 0 until vec.length){
				if(i%2 == 1){
					vec(i) = ThreadLocalRandom.current().nextInt(22, 30 + 1)
				}//The End  of If
			}//The End of For
	}//The End of Temp

	def PromTemp(vec: ArrayBuffer[Int]): Unit={
	  var promedio = 0.0
	  var cont=0
			for(i <- 0 until vec.length){
				if(i%2 == 0){
				 promedio = promedio + vec(i) 
				 cont += 1
				}//The End  of If
			}//The End of For
	  
	  promedio = promedio/cont
	  
	  println("Promedio de Horas: "+ promedio)
	}//The End of PromTemp

	def main(args: Array[String]): Unit = {
			val vec= new Array[Int](48)
			val vec2 = new ArrayBuffer[Int]()
					//println(vec.length)
					Temp(vec)
					Hora(vec)
					MostrarVector(vec)
					println()
					MostrarTemp(vec, vec2)
					println()
					PromTemp(vec2)

	}//End the Main
}//End the Object