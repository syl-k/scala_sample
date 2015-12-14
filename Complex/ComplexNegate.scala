case class ComplexNegate(re:Double = 0.0, im:Double = 0.0) {
    def negate(that:ComplexNegate) = (-re, -im)
}