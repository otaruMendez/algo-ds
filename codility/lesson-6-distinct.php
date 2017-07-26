<?php
// you can write to stdout for debugging purposes, e.g.
// print "this is a debug message\n";

function solution($A) {
    // write your code in PHP7.0
    
    if (empty($A)) {
        return 0;
    }
    $sortedArray = sort($A);  // Time: O{N*log(N)}
    $checkValue = $A[0];
    $result = 1;
    $aSize = count($A);
    
    for ($i = 1; $i < $aSize; $i++) {   //Time:  O(N)
        if ($checkValue !== $A[$i]) {
            $checkValue = $A[$i];
            $result++;
        }
    }
    return $result;
}
