sealed trait OperatorGene {
  def operate(left: Double, right: Double): Double
}

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