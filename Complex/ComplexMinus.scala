case class ComplexMinus(re:Double =0.0, im:Double = 0.0) {
    def minus(that:ComplexMinus) = ComplexMinus(re - that.re, im - that.im)
}