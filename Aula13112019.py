def main():
    dicionario = {}

    #dicionario = {'Lucas:'['02/02/2000','rua da areia]'],'Gabriel:'['01/02/2000'], 'rua da palha'}

    #dicionario['chave'] = 'Nome'
    #dicionario = {'lg':'2.19', 'sm':'2.22'}

    for i in range(1):
        nome = input("Digite o Nome")
        dataNasc = int(input("Digite sua Data de Nascimento"))
        end = input("Digite seu Endereço")

        dicionario [nome]=[dataNasc, end]

        print(dicionario)



main()