function solution(S, P, Q) {
    
    // SOLUTION DOCUMENTATION
    //  we keep an array for each nucleotide a, c, g and t
    //	insert 0 into all nucleotide arrays to indicate the starting point. (a , c, g, t = [0]])
    //  iterate through the DNA sequence string
    //  increase the size of each nucleotide array by adding its previous value OR previous value + 1  if the array corresponds to the character at that index.
    //  using the sample DNA string(CAGCCTA) in the question, arrays look like this after first iteration:
    //  a = [0,0] : c = [0,1] : g = [0,0] : t : [0,0]
    //  and like this after the third iteration:
    //  a = [0,0,1,1] : c [0,1,1,1] : g = [0, 0, 0, 1] : t = [0, 0, 0, 0]
    
    //** Building The Result **//
    //  create an array for your result, r = []
    //  run through a loop M times with i as loop counter
    //  starting with the nucleotide array that has the lowest impactFactor i.e a
    //  check if the value occurred in the range P-Q i.e a[Q[i] + 1] - a[P[i]] > 0
    //  if it did, good! put impactFactor in the result and start the next iteration
    //  otherwise check other nucleotide arrays in asc order of impactFactor, when found, save the impactFactor and start the next iteration
    


    var a = [0];
    var c = [0];
    var g = [0];
    var t = [0];
     
    for (var i =0; i < S.length + 1; i++) {
                
        a.push(a[i]);
        c.push(c[i]);
        g.push(g[i]);
        t.push(t[i]);
        
        if (S.charAt(i) == "A") {
            a[i+1] += 1;
        }
        else if (S.charAt(i) == "C") {
            c[i+1] += 1;
        }
        else if (S.charAt(i) == "G") {
            g[i+1] += 1;
        }
        else if (S.charAt(i) == "T") {
            t[i+1] += 1;
        }
    }

    var result = [];
    for (var i = 0; i < P.length; i++) {
        
    // edge case - when p[i] == q[i]
	if (P[i] == Q[i]) {
	    if (S.charAt(P[i]) == "A") {
		result.push(1);
	    }
 	    else if (S.charAt(P[i]) == "C") {
		result.push(2);
	    }
	    else if (S.charAt(P[i]) == "G") {
		result.push(3);
	    } else  {
		result.push(4);
	    }
	    continue;
	}
       
        
        if ((a[Q[i] + 1] - a[P[i]]) > 0){
            result.push(1);
        }
        else if ((c[Q[i] + 1] - c[P[i]]) > 0){
            result.push(2);
        }
        else if ((g[Q[i] + 1] - g[P[i]]) > 0){
            result.push(3);
        }
        else if ((t[Q[i] + 1] - t[P[i]]) > 0){
            result.push(4);
        }
        
       
    }
    
    return result;
}


