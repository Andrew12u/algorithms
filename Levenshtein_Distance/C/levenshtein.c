#include <string.h>

#include "levenshtein.h"

int distance (char *string_1, char *string_2) {
  char *larger_string;
  char *shorter_string;
  if(strlen(string_2) > strlen(string_1)){
    larger_string  = string_2;
    shorter_string = string_1;
  }else{
    larger_string  = string_1;
    shorter_string = string_2;
  }
  int min_numCharsDiffer = strlen(larger_string) - strlen(shorter_string);
  /**  Technically, we don't really need a stack for c.
    *  We can just iterate through individual strings,
    *  as they are already arrays.
    */
  int add_numCharsDiffer = 0;
  int i;
  for(i=0; i<(strlen(larger_string)-min_numCharsDiffer);i++){
      if(shorter_string[i] != larger_string[i]){
        add_numCharsDiffer++;
      }
  }

  return min_numCharsDiffer + add_numCharsDiffer;
}

