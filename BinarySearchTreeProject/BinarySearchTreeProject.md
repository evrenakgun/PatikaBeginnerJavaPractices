# Binary Search Tree Projesi

[PatikaDev: evrenakgun](https://app.patika.dev/evrenakgun)

## Proje 3 - Sorular
1. [7,5,1,8,3,6,0,9,4,2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

## Proje 3 - Cevaplar

1. Dizinin ilk elemanı root olarak belirlenir. Daha sonraki elemanları root'tan büyükse sağ altına, küçükse sol altına yazılarak devam edilir. Diziye yeni bir eleman eklenecekse kontrole her zaman root'tan başlanarak eklenir.

|   |   |     |   |   |   |   |   |   |   |   |
|-- |-- |-    |-  |-  |-  |-  |-  |-  |-  |-  |
|   |   |     |   |   |   | 7 |   |   |   |   |
|   |   |     |   |   | / |   | \ |   |   |   |
|   |   |     |   | 5 |   |   |   | 8 |   |   |
|   |   |     | / |   | \ |   |   |   | \ |   |
|   |   |  1  |   |   |   | 6 |   |   |   | 9 |
|   | / |     | \ |   |   |   |   |   |   |   |
| 0 |   |     |   | 3 |   |   |   |   |   |   |
|   |   |     | / |   | \ |   |   |   |   |   |
|   |   |  2  |   |   |   | 4 |   |   |   |   |
|   |   |     |   |   |   |   |   |   |   |   |