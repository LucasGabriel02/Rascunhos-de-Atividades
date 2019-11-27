def main():
    dicionario = {}

    for i in range(3):
        cep = input('Digite o CEP onde você mora: \n\n')

        end = input('Digite seu Endereço: ')
        dicionario[cep] = [end]

    for j in dicionario.keys():
        print(j)
