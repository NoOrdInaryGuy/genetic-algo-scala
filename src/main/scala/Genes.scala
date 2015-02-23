import collection.immutable.Seq

object Genes {
  trait Gene

  sealed trait OperatorGene extends Gene {
    def operate(left: Double, right: Double): Double
  }

  trait NumericGene extends Gene

  object Add extends OperatorGene {
    override def operate(left: Double, right: Double): Double = left + right
  }

  object Subtract extends OperatorGene {
    override def operate(left: Double, right: Double): Double = left - right
  }

  object Multiply extends OperatorGene {
    override def operate(left: Double, right: Double): Double = left * right
  }

  object Divide extends OperatorGene {
    override def operate(left: Double, right: Double): Double = left / right
  }

  object One extends Gene

  object Two extends Gene

  object Three extends Gene

  object Four extends Gene

  object Five extends Gene

  object Six extends Gene

  object Seven extends Gene

  object Eight extends Gene

  object Nine extends Gene

  val all = Seq(
    Add, Subtract, Multiply, Divide, One, Two, Three, Four, Five, Six, Seven, Eight, Nine
  )

}