CC=gcc
CFLAGS=-Wall
TARGET=levenshtein
LDFLAGS=-o $(TARGET)
TESTLIBS=-lcunit
TESTTARGET=$(TARGET)_test

all: default

default: objs
	$(CC) $(CFLAGS) main.o levenshtein.o $(LDFLAGS)

objs: main.c levenshtein.c levenshtein_test.c
	$(CC) $(CFLAGS) -c main.c levenshtein.c levenshtein_test.c

test: objs
	$(CC) $(CFLAGS) levenshtein.c levenshtein_test.c $(TESTLIBS) -o $(TESTTARGET) && ./$(TESTTARGET)

clean:
	rm -f *.o $(TARGET) $(TESTTARGET)

