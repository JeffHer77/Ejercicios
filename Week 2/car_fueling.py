from sys import stdin


def car_fueling(distancia_total, capacidad_tanque, estaciones):
    estaciones.append(distancia_total)  
    num_repostajes = 0
    aux = 0
    for i in range(len(estaciones)):

        if estaciones[i] > aux and estaciones[i] - aux <= capacidad_tanque:

            
            if i != len(estaciones) -1:
                
                if estaciones[i+1] > aux and estaciones[i+1] - aux > capacidad_tanque:
                    
                    aux = estaciones[i] 
                    num_repostajes += 1
            
            else:
                
                aux = estaciones[i]

        else:

            return -1

        if aux == distancia_total:

            break
        
    return num_repostajes


if __name__ == '__main__':
    d, m, _, *stops = map(float, stdin.read().split())
    print(car_fueling(d, m, stops))
