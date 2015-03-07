/*
  Simple test runner based on the CUnit example
  http://cunit.sourceforge.net/example.html
*/

#include "CUnit/Basic.h"

#include "levenshtein.h"

int before_suite (void) {
  /* setup tasks go here */
  return 0;
}

int after_suite (void) {
  /* cleanup tasks go here */
  return 0;
}

void testSIMPLEDISTANCE (void) {
  CU_ASSERT(2 == distance("foo", "fzz"));
}

int main () {

  CU_pSuite pSuite = NULL;

  /* initialize the CUnit test registry */
  if (CUE_SUCCESS != CU_initialize_registry()) {
    return CU_get_error();
  }

  /* add a suite to the registry */
  pSuite = CU_add_suite("Suite_1", before_suite, after_suite);
  if (NULL == pSuite) {
    CU_cleanup_registry();
    return CU_get_error();
  }

  /* add the tests to the suite */
  if (
    (NULL == CU_add_test(pSuite, "test of sum", testSIMPLEDISTANCE))
  ) {
    CU_cleanup_registry();
    return CU_get_error();
  }

  /* Run all tests using the CUnit Basic interface */
  CU_basic_set_mode(CU_BRM_VERBOSE);
  CU_basic_run_tests();
  CU_cleanup_registry();
  return CU_get_error();
}

