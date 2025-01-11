#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100

int main(int argc, char *argv[]) {
    char buffer[MAX];
    int i, j;
    FILE *file;

    if (argc < 2) {
        printf("Usage: %s <filename>\n", argv[0]);
        exit(1);
    }

    file = fopen(argv[1], "w");
    if (file == NULL) {
        printf("Error opening file %s\n", argv[1]);
        exit(1);
    }

    for (i = 0; i < MAX; i++) {
        for (j = 0; j < MAX; j++) {
            buffer[j] = 'a' + (i + j) % 26;
        }
        buffer[j] = '\0';
        fprintf(file, "%s\n", buffer);
    }

    fclose(file);
    return 0;
}
