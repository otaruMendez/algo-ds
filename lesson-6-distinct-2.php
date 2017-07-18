<?php

// you can write to stdout for debugging purposes, e.g.
// print "this is a debug message\n";

function solution($A) {
    // write your code in PHP7.0
    $result = [];
    foreach ($A as $a) {
        $result[$a] = 1;
    }
    return count($result);
}


