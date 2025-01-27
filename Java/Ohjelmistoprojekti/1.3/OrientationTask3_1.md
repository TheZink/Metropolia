Ikäjakauma säilytetään AgeDistribution-listassa ja käytämme kumulatiivista jakaumaa.

| Ikä   | Opiskelija | Kumulatiivinen jakauma |
|-------|------------|------------------------|
| 18    | 20         |0,20                    |
| 19    | 30         |0,50                    |
| 20    | 25         |0,75                    |
| 21    | 15         |0,90                    |
| 22    | 10         |1,00                    |

Ohjelman alussa luodaan kaksiulotteista listaa, jossa säilytämme tietyn iän ja sen
esiintymiskerran. Listaa alustetaan for-loopissa ja kerrat alustetaan 0:ksi. Esimerkki ArrayList:sta.

Arraylist ageCounter:

| Ikä | Esiintymiskerta |
|-----|-----------------|
| 18  | 0               |
| 19  | 0               |
| 20  | 0               |
| 21  | 0               |
| 22  | 0               |

Alustuksen jälkeen menemme uudestaan for-looppiin, jossa simuloidaan math.random() avulla
luvun ja tarkastetaan, mihin ikäryhmään se luku kuuluu (agedistribution-lista). Kun oikea ikä löytyy, niin kyseisen ikäryhmän esiintymiskerta korotetaan ageCounter:ssa.

Tämä toiminto tehdään 1000 kertaa.

Ohjelman lopussa tulostetaan ikien esiintymiskerrat ja prosentti.

Esimerkki ageCounter-listan tulostuksesta:

| Ikä | Esiintymiskerta | Prosentti |
|-----|-----------------|-----------|
| 18  | 218             | 21,8%     |
| 19  | 262             | 26,2%     |
| 20  | 250             | 25,0%     |
| 21  | 161             | 16.1%     |
| 22  | 109             | 10,9%     |

Prosentin laskussa käytetään kaavaa

Esiintymiskerta / Simulaatioiden kerrat * 100
