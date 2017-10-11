object GCD
{
    def gcd(a: Int,b: Int): Int = {
       if(b ==0) a else gcd(b, a%b)
    }
     
    def main(args: Array[String]) {
        println(gcd(25,15))
    }
}