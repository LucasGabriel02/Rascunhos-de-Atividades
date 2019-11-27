def main():



    #QUESTAO 02
    matriz = []
    #contador da outra opçao

    contador = 0

    for i in range (0,2):
        linha = []

        for j in range(0,2):
            valor = int(input('Digite o Valor da MATRIZ'))

            if (valor > 10):

                contador = contador +1
            linha.append(valor)
        matriz.append(linha)

        print('Os valores acima de 10 é: {} '.format(contador))
        print('------------------------------------')

    # outra opão
    '''maior = 0
    for j in matriz:
        for k in range(len(matriz)):

            if j[k] > 10:
                maior += 1

    print('Temos a quantida de valores acima de 10:   {}'.format(maior))'''



    print(matriz)






#______________________________________

    #QUESTAO DO ISLIDE
    '''matri = [[1,2,3,4], [5,6,7,8]]
    print(matri)

    num = int(input('Digite um Numero: '))

    cont = 0

    while (cont < 2):

    #for i in range(0,2):
        #Isso é do FOR
        #matri[i].append(num)
        matri[cont].append(num)
        cont = cont +1

    print(matri)'''



#________________________________________________
    
    #questao 01 de exemplo
    '''matriz = [['Bruna', '999999999999'], ['Alberto', '33333333333333'], ['Felipe', '555555555555']]

    matriz.append('Eduardo')
    matriz.append(['tiago','1111111135611'])
    matriz[0].append('10.0')


    print(matriz)'''


main()
