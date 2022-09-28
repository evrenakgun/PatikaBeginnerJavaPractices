# Insertion Sort Projesi

[PatikaDev: evrenakgun](https://app.patika.dev/evrenakgun)

## Proje 1 - Sorular
1. [22,27,16,2,18,6] -> Insertion Sort

- Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
- Big-O gösterimini yazınız.
- Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
- Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.


2. [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

## Proje 1 - Cevaplar

1. [22,27,16,2,18,6] -> Insertion Sort

-   [2,27,16,22,18,6]  
    [2,6,16,22,18,27]  
    [2,6,16,18,22,27]  

-   Insertion Sorting'e göre n elemanlı bir dizinin sıralanmasında n+(n-1)+(n-2)+...+1 kadar işlem uygulanır. 1'den n'e kadar olan sayıların toplamını ifade eden formül ise n(n+1)/2 olduğu için burada baskın olan ifade n²'dir. Dolayısıyla bu dizinin Big-O gösterimi O(n²) olacaktır.

-   Average case: 16,18
    Worst Case  : 27
    Best Case   : 2

-   Dizi sıralandıktan sonra 18 sayısı "Average Case" kapsamına girer.

2. [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

-   [2,3,5,8,7,9,4,15,6]  
    [2,3,4,8,7,9,5,15,6]  
    [2,3,4,5,7,9,8,15,6]  
    [2,3,4,5,6,9,8,15,7]