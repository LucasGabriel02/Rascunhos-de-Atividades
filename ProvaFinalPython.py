def prova ():

    lista = []

    lista2 = []


    for z in range (1):


        nome = str(input('Vendedor: '))

        print('')

        vendaBruta = float(input('Valor de Venda Bruta'))

        print('')

        salario = 200 + (vendaBruta * 0.09)

        lista.append(nome)
        lista.append(vendaBruta)
        lista.append(salario)

        print(f' Vendedor: {nome} Vendeu: {vendaBruta} Reais e Sua Renda Foi de {salario} Reais')

        print('-='*50)

    for y in range(1):
        nome2 = str(input('Vendedor: '))

        print('')

        vendaBruta2 = float(input('Valor de Venda Bruta'))

        print('')

        salario2 = 200 + (vendaBruta2 * 0.09)

        lista2.append(nome2)
        lista2.append(vendaBruta2)
        lista2.append(salario2)

        print(f' Vendedor: {nome2} Vendeu: {vendaBruta2} Reais e Sua Renda Foi de {salario2} Reais')


        print('=-' *60)

        print('')


    if vendaBruta > vendaBruta2:

        print(f'Vendedor {nome} Foi o Que Mais Vendeu! Ele Faturou Para Empresa {vendaBruta} REAIS e Seu Salario foi de {salario} Reais')


    elif vendaBruta2 > vendaBruta:
        print(f'Vendedor: {nome2} Foi o Que Mais Vendeu! Ele Faturou Para Empresa {vendaBruta2} REAIS e Seu Salario foi de {salario2} Reais')

    else:
        print('ERRO! Tente Novamente!')

    print('-=' * 60)


prova()