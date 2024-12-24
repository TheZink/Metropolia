from flask import Flask, request, Response
import json

app = Flask(__name__)
@app.route('/summa/<luku1>/<luku2>') #localhost:3000/summa/13/25 tai 127.0.0.1:3000/summa/13/25

def summa(luku1, luku2):
    try:
        luku1 = float(luku1)
        luku2 = float(luku2)
        summa = luku1 + luku2

        tilakoodi = 200
        vastaus = {
            'luku1': luku1,
            'luku2': luku2,
            'summa': summa
        }
    
    except ValueError:
        tilakoodi = 400
        vastaus = {
            'Tilakoodi': tilakoodi,
            'Virhe': 'Yhteenlaskettava ei ole numero'
        }

    json_vastaus = json.dumps(vastaus)
    return Response(response=json_vastaus, status=tilakoodi, mimetype='application/json')

@app.route('/erotus/<luku1>/<luku2>') #localhost:3000/erotus/13/25 tai 127.0.0.1:3000/erotus/13/25
def erotus(luku1,luku2):
    try:
        luku1 = float(luku1)
        luku2 = float(luku2)
        summa = luku1 - luku2

        tilakoodi = 200
        vastaus = {
            'luku1': luku1,
            'luku2': luku2,
            'summa': summa
        }
    
    except ValueError:
        tilakoodi = 400
        vastaus = {
            'Tilakoodi': tilakoodi,
            'Virhe': 'Yhteenlaskettava ei ole numero'
        }

    json_vastaus = json.dumps(vastaus)
    return Response(response=json_vastaus, status=tilakoodi, mimetype='application/json')

@app.errorhandler(404)
def sivua_ei_loydy(virheolio):
    vastaus = {
        'Tilakoodi': '404',
        'Kuvaus': 'Virhe päätepisteen osoitteessa'
    }
    json_vastaus = json.dumps(vastaus)
    return Response(response=json_vastaus,status=404,mimetype='application/json')
    

if __name__ == "__main__":
    app.run(use_reloader=True, host='127.0.0.1', port=3000) # localhost == 127.0.0.1
