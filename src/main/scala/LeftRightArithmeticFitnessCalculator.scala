//import GeneTypes._
//
//class LeftRightArithmeticFitnessCalculator(target: Int) {
//
//  case class State(accumulator: Double, activeOperator: Option[OperatorGene])
//
//  def calculateFitness(chromosome: Chromosome): Double = {
//    val genesWithoutLeadingOperators = chromosome.dropWhile(ArithmeticGenePool.geneToNumber(_).isEmpty)
//
//    val firstNumber = ArithmeticGenePool.geneToNumber(genesWithoutLeadingOperators.head).get
//    val initialState = State(firstNumber, None)
//
//    val res = genesWithoutLeadingOperators.tail.foldLeft(initialState)((state, gene) => {
//      state.activeOperator.map {
//        operator => {
//          println(s"Active operator Found - $operator")
//          ArithmeticGenePool.geneToNumber(gene).map {
//            number => {
//              println(s"Setting state after operating with accumulator ${state.accumulator} and number $number")
//              val operated = operator.operate(state.accumulator, number)
//              println(s"Operation gave $operated")
//              State(operated, None)
//            }
//          } getOrElse state
//        }
//      } getOrElse {
//        println(s"No active operator found")
//        println(s"Setting state with acc ${state.accumulator}")
//        State(state.accumulator, ArithmeticGenePool.geneToOperator(gene))
//      }
//    })
//
//    val variation = (target - res.accumulator).abs
//    val fitness = if(variation == 0) -1 else 1/variation
//
//    println(s"Result is ${res.accumulator}, with a fitness of $fitness")
//
//    fitness
//
//  }
//}