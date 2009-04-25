test: http_parser.o test.c 
	gcc -g -O2 $^ -o $@

http_parser.o: http_parser.c http_parser.h Makefile
	gcc -g -c -O2 $<

http_parser.c: http_parser.rl Makefile
	ragel -s -G2 $< -o $@

clean:
	rm -f *.o http_parser.c test

.PHONY: clean 

