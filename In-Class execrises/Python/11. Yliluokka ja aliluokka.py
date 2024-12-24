class Työntekijä:

    työntekijöiden_lkm = 0

    def __init__(self,etunimi,sukunimi):
        self.etunimi = etunimi
        self.sukunimi = sukunimi
        Työntekijä.työntekijöiden_lkm += 1
        self.työntekijä_nro = Työntekijä.työntekijöiden_lkm

    def tulosta_tiedot(self):
        print(f'{self.työntekijä_nro}: {self.etunimi} {self.sukunimi}')
        return

class Tuntipalkkalainen(Työntekijä):

    def __init__(self, etunimi, sukunimi,tpalkka):
        super().__init__(etunimi, sukunimi)
        self.tpalkka = tpalkka
    
    def tulosta_tiedot(self):
        print(f"{self.työntekijä_nro}: {self.etunimi} {self.sukunimi}")
        print(f" - Työntekijä on tuntipalkkalainen: {self.tpalkka}€ / h")
        return
    
class Kuukausipalkkalainen(Työntekijä):

    def __init__(self, etunimi, sukunimi,kkpalkka):
        super().__init__(etunimi, sukunimi)
        self.kkpalkka = kkpalkka

    def tulosta_tiedot(self):
        print(f"{self.työntekijä_nro}: {self.etunimi} {self.sukunimi}")
        print(f" - Työntekijä on kuukausipalkkalainen: {self.kkpalkka}€ / kk")
        return


työvoima = []
työvoima.append(Tuntipalkkalainen("Ilkka","Sinkonen",50))
työvoima.append(Kuukausipalkkalainen("Erkki","Esimerkki",2500))
työvoima.append(Työntekijä("Teppo","Testaaja"))

for työntekijä in työvoima:
    työntekijä.tulosta_tiedot()