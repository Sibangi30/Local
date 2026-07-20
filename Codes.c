#include <stdio.h>
#include <limits.h>

int main() {
    FILE *file;
    int n;
    printf("Enter the number of elements (n): ");
    scanf("%d", &n);
    int input_arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &input_arr[i]);
    }
    file = fopen("input.txt", "w");
    fprintf(file, "%d\n", n);
    for (int i = 0; i < n; i++) {
        fprintf(file, "%d ", input_arr[i]);
    }
    fclose(file); 
    printf("\ndata entered in file\n\n");
    file = fopen("input.txt", "r");
    fscanf(file, "%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        fscanf(file, "%d", &arr[i]);
    }
    fclose(file);
    int smallest = arr[0];
    int second_smallest = INT_MAX;
    
    int largest = arr[0];
    int second_largest = INT_MIN;
    for (int i = 1; i < n; i++) {
        if (arr[i] < smallest) {
            second_smallest = smallest;
            smallest = arr[i];
        } else if (arr[i] < second_smallest && arr[i] != smallest) {
            second_smallest = arr[i];
        }

        if (arr[i] > largest) {
            second_largest = largest;
            largest = arr[i];
        } else if (arr[i] > second_largest && arr[i] != largest) {
            second_largest = arr[i];
        }
    }

    printf("Second smallest: %d\n", second_smallest);
    printf("Second largest: %d\n", second_largest);

    return 0;
}
