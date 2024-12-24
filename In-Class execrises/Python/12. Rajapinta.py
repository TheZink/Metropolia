import requests
import json

hakusana = input("Mitä haetaan?: ")

pyyntö = "https://api.tvmaze.com/search/shows?q=" + hakusana

try:
    tila = requests.get(pyyntö)
    
    if tila.status_code == 200:

        vastaus = tila.json()

        for esitys in vastaus:
            print(f"\n{esitys['show']['name']}, voit lukea lisätietoja: {esitys['show']['officialSite']}\n")
            print(f"Esitys: {esitys['show']['schedule']['time']}")
            print("Ohjelma esitetään:")
            
            if len(esitys['show']['schedule']['days']) > 0:
                for day in esitys['show']['schedule']['days']:
                    print(f" -{day}")

            else:
                print(" -Esityspäivät eivät ole tiedossa.\n")

    else:
        print(f"Haku ei onnistunut. Ei löydy {hakusana}. Status {tila.status_code}")

except requests.exceptions.RequestException as error:
    print("Ei voitu suorittaa pyyntöä")
    print()
    print(error)
