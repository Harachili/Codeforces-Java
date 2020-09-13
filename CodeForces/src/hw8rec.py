def overlaps(a, b): #Controllo che esista un collegamento non nullo tra le stringhe
    #for m, s in enumerate(a, 1):
        #if a.endswith(b[:m]):
    for m, s in enumerate(b, 1):
        if a.endswith(b[:m]):
            return True;
    return False;


def solve(idx, bm, N, edges, nxt): #Cerco una soluzione
    if bm == ((1 << N) - 1):
        return True;
    
    if nxt[idx][bm] != -1:
        return False;
    
    for v in edges[idx]:
        if not (bm & (1 << v)):
            if solve(v, bm | (1 << v), N, edges, nxt):
                nxt[idx][bm] = v;
                return True; #OK, percorso Hamiltoniano
    
    return False; #Nessun percorso da qua


def getOrder(start, N, nxt):#ritorno l'ordine degli indici del percorso 
    V = []
    currVertice = start;
    currBm = 0;
    
    while(True):
        V.append(currVertice);
        currBm |= (1 << currVertice);
        if currBm == (1 << N) - 1:
            break;
        currVertice = nxt[currVertice][currBm];
    
    return V;


def es(fparole, ftesto):
    with open(fparole) as F:
        strings = [x.strip() for x in F.readlines()];
        print(strings)
    N = len(strings); #numero di nodi nel grafo
    
    
    edges = [[] for i in range(N)]; #collegamenti di ogni nodo
    
    for i in range(N):
        for j in range(N):
            if i != j and overlaps(strings[i], strings[j]):
                edges[i].append(j);   #Segno tutti i collegamenti di ogni nodo del grafo, OK
    print(edges)
    nxt = [[-1]*(1<<N)]*(N); #creo l'array bidimensionale (dp) 
    
    
    for i in range(N):
        if solve(i, 1 << i, N, edges, nxt): #cerco una soluzione partendo da ciascun nodo
            a = getOrder(i, N, nxt);
            
            
            iniz = strings[a[0]];  #inizio a costruire la parola e poi la scrivo
            for c in a[1:]:
                cont = strings[c];
                for m, s in enumerate(cont, 1):
                    if iniz.endswith(cont[:m]) and not iniz.endswith(cont[:m+1]):
                        iniz += cont[m:];
            with open(ftesto, 'w') as f:
                print(iniz)
                f.write(iniz);
            return a;