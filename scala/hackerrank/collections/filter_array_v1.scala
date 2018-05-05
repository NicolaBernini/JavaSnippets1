
// Problem at 
// https://www.hackerrank.com/challenges/fp-filter-array/problem

import scala.collection.mutable.ArrayBuffer
def f(delim:Int,arr:List[Int]):List[Int] = 
{
    var t_res = new ArrayBuffer[Int]();
    for(e <- arr) if(e < delim) t_res += e; 
    return t_res.toList; 
}
