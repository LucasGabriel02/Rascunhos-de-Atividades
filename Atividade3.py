def main():

    cep1 = '58328000'
    end1 = 'rua da areia'

    dicionario = {}

    for i in range(2):
        cep = input('Digite o CEP onde você mora: \n\n')

        end = input('Digite seu Endereço: \n')
        dicionario[cep] = [end]

    for k, v in dicionario.items():

        if cep1 in k:
            print('CEP Existente\n')

        if end1 in v:
            print('Endereço Existente! \n')


main()
