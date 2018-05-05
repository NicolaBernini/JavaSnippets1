
// FP List Replication 
// https://www.hackerrank.com/challenges/fp-list-replication/problem

import scala.collection.mutable.ArrayBuffer; 

def f(num:Int,arr:List[Int]):List[Int] = 
{
    var t_res = new ArrayBuffer[Int](); 
    for(e <- arr) for(i <- 1 to num) t_res += e; 
    return t_res.toList;     
}









