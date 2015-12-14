case class ComplexTimes(re:Double = 0.0, im:Double = 0.0) {
    def times(that:ComplexTimes) = (re * that.re, im * that.im)
}