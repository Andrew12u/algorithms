================================
Finding the Levenshtein Distance
================================
********************************
Problem:
********************************
Description:
Given two strings, what is the minimal number of characters you must
insert,substitute, or remove to get one string to equal the other.

Example:
"dance" ==> "robots", Levenshtein Distance is 6
-----------------------------------------------------------
                      | Rule          | Levenstein Distance
-----------------------------------------------------------
"dance"  ==> "robots" | -             |
"rance"  ==> "robots" | Substitution  | 1
"ronce"  ==> "robots" | Substitution  | 2
"robce"  ==> "robots" | Substitution  | 3
"roboe"  ==> "robots" | Substitution  | 4
"robot"  ==> "robots" | Substitution  | 5
"robots" ==> "robots" | Insertion     | 6

********************************
Implementation
********************************
Note: Where possible, I have tried to stay ways from solutions
that I have found online.  These solutions probably exist
somewhere, but I haven't made it a point to look at them.

(1) : GIVEN <string_1> and <string_2>
      IF(<string_2>.length > <string_1>.length)
          <larger_string>  = <string_2>
          <shorter_string> = <string_1>
      ELSE
          <larger_string>  = <string_1> #<larger_string> will be the first string if lengths are equal
          <shorter_string> = <string_2>

      <min_char_different> = <larger_string>.length - <shorter_string>.length
      <relevant_substring> = <larger_string>.substring(0,<larger_string>.length - <min_char_different>)

      STACK <stack_a> = new STACK(<relevant_substring>)
      STACK <stack_b> = new STACK(<shorter_string>)

      FOR(i=<stack_a>.length; i > 0; i--)
          <char_1> = <stack_a>.pop()
          <char_2> = <stack_b>.pop()
          IF(<char_1> != <char_2>)
              <num_char_different>++

      RETURN <num_char_different> + <min_char_different>

(2) : Same as (1) but forget the Stack completely.  Just
      iterate through each character in the string.
