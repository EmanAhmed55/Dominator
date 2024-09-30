<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dominator Algorithm</title>
</head>
<body>
    <h1>Dominator Algorithm</h1>
    
    <h2>Problem Description</h2>
    <p>
        Given an array <strong>A</strong> consisting of <strong>N</strong> integers, the dominator is defined as the value that occurs in 
        more than half of the elements of <strong>A</strong>. The goal is to write an efficient algorithm that returns 
        the index of any element in array <strong>A</strong> where the dominator occurs. If there is no dominator, 
        the function should return <code>-1</code>.
    </p>
    
    <h2>Input Specifications</h2>
    <ul>
        <li><strong>N</strong> is an integer within the range [0..100,000].</li>
        <li>Each element of array <strong>A</strong> is an integer within the range [−2,147,483,648..2,147,483,647].</li>
    </ul>

    <h2>Example</h2>
    <h3>Sample Input:</h3>
    <pre>
    A[0] = 3 
    A[1] = 4 
    A[2] = 3 
    A[3] = 2 
    A[4] = 3 
    A[5] = -1 
    A[6] = 3 
    A[7] = 3
    </pre>
    
    <h3>Sample Output:</h3>
    <pre>0, 2, 4, 6</pre>

    <h2>Algorithm</h2>
    <p>
        To solve this problem, we can use a hash map to count the occurrences of each number, and 
        then determine if any number exceeds <strong>N/2</strong> occurrences. This approach allows us to efficiently 
        identify the dominator, if it exists.
    </p>

    <h2>Usage</h2>
    <p>
        Implement the algorithm in your preferred programming language. Call the function with 
        the input array to retrieve the result. The function should return the index of any element 
        where the dominator occurs, or <code>-1</code> if no dominator exists.
    </p>
</body>
</html>
