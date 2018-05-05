
// List Filtering 
// https://www.hackerrank.com/challenges/fp-filter-array/problem
def f(delim:Int,arr:List[Int]):List[Int] = arr.flatMap(x => if(x < delim) List(x) else List())

