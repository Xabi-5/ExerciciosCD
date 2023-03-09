#Suma todos os numeros pares dunha lista
def sum_even_numbers(numbers):
    sum = 0
    for num in numbers:
        if num % 2 == 0:
            sum += num
    return sum