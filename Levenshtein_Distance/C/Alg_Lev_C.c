#include <stdio.h>
#include <string.h>
#include <stdlib.h>
/**
 * @author Andrew Izu
 *
 * \brief This is a C implementation for calculating
 *        the levenshtein distance of two strings.
 *
 * see ../Levenstein_Distance/README.txt for more info
 *
 */
int main(int argc, char *argv[]){
  if(argc != 3){
    printf("Oops! Please supply exactly two arguments.\n");
    exit(-1);
  }
  char *string_1;
  char *string_2;
  /*Finding the number of characters in each argument*/
  int numChars_arg1 = sizeof(argv[1])/sizeof(char);
  int numChars_arg2 = sizeof(argv[2])/sizeof(char);
  /*Allocating space for each string*/
  /*Add 1 for the null character*/
  string_1 = (char *)malloc(sizeof(char) * (numChars_arg1 + 1));
  string_2 = (char *)malloc(sizeof(char) * (numChars_arg2 + 1));
  /*Don't want to operate directly on argv array*/
  strcpy(string_1,argv[1]);
  strcpy(string_2,argv[2]);
  /**/
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
  printf("Levenshtein Distance:%d\n",(min_numCharsDiffer + add_numCharsDiffer));
  /*Don't forget to release memory*/
  free(string_2);
  free(string_1);
  exit(1);
}
