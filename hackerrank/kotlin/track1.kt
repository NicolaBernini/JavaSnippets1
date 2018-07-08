

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> 
{
    // Convention is max, min appunto 
    var res = Array<Int>(2, {i -> 0}); 
    var temp = Array<Int>(2, {i -> scores[0]}); ///< Initialize the b/w scores with first value 
    for(e in scores.sliceArray( 1 .. scores.size-1 ))
    {
        if(e > temp[0]) 
        {
            temp[0] = e; 
            res[0]++; 
        }
        
        if(e < temp[1]) 
        {
            temp[1] = e; 
            res[1]++; 
        }
    }
    
    return res; 
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}


