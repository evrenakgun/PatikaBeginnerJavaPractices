# Merge Sort Projesi

[PatikaDev: evrenakgun](https://app.patika.dev/evrenakgun)

## Proje 2 - Sorular
1. [16,21,11,8,12,22] -> Merge Sort

- Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
- Big-O gösterimini yazınız.

## Proje 2 - Cevaplar

1. [16,21,11,8,12,22] -> Merge Sort

-         [16,21,11]          [8,12,22]  
    
        [16]   [21,11]      [8,12]  [22]  
    
        [16] [21] [11]      [8] [12] [22]  

        [16]   [11,21]      [8,12]  [22]  

            [11,16,21]      [8,12,22]  
        
                [8,11,12,16,21,22]


-   Merge Sort'a göre n elemanlı bir dizinin Big-O gösterimi O(nlogn) olacaktır.