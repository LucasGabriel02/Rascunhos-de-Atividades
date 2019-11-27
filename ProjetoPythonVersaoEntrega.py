# Projeto de Estrutura de Dados


def Program2():
    Clientes = []

    cont = 0

    # Imprimir Menu

    def Menu():

        print(" \n\n------------------ Menu ------------------")

        print(" 1 - Usuário Comum  ")

        print(" 2 - Gestor de Recurso")

        print(" 3 - Cancelamento")

        print(" 4 - Login")

        print(' 5 - Coordenador')

        print(" 0 - Sair do programa\n")

    # Verificação e adição de item

    # Usuário Comum
    def UsuárioComum():

        print(" Vamos fazer o Cadastro")

        NovoCliente = input("\n Digite seu NOME: ")
        NovoCliente = input("\n Digite sua MATRICULA: ")
        NovoCliente = input("\n Digite sua SENHA: ")
        NovoCliente = input("\n É coordenador? ")

        # indice = Clientes.index(NovoCliente)

        if (NovoCliente in Clientes):

            print("Esse clinte já esta cadastrado!")

        else:

            Clientes.append(NovoCliente)

            print("Cliente cadastrado!")

    def Login():
        print('Você está Acessando sua Conta \n\n')

        login = input("\n Digite seu NOME: ")
        login = input("\n Digite sua SENHA: ")

        if (login in Clientes):
            print('Você está Logado')

        else:
            print('Login não Encontrado! ')

    # Gestor de Recurso

    def GestorRecurso():

        print("\n Exibir lista de Recurso:")

        # Clientes.soft()

        for I in (Clientes):
            print(I)

        print('\n\n Confirmação do Local de Reuniões')

        local = input("\n Você vai Participar da Reunião? : \n\n")

        print('\n Cadastrar o Novo Espaço de Reuniões:')

        novoLocal = input("\n Qual Local Você deseja? ")

        print(local)
        print(novoLocal)

    def Cancelamento():

        print(" Fazendo cancelamento do Cadastro")

        NovoCliente = input(" Digite o nome do cliente: ")

        if (NovoCliente in Clientes):

            Clientes.remove(NovoCliente)

        else:

            print(" Cliente não cadastrado!")

    def Coordenador():

        def Menu2():
            print("1 - Visualizar Reuniões")
            print("2 - Presença em Reuniões")
            print("3 - Criar Reuniões")
            print("4 - Editar ATAS das Reuniões")
            print("5 - Realocar Reuniões")
            print("6 - Adicionar Participantes as Reuniões")

        def Visualizar():
            print(reuniao)

        def Presença():

            confirma = input("Confirma presença?")

        def Criar_reunioes():
            if (NovoCliente == 'sim'):
                reuniao = input("\n Digite o nome da reunião:")
            reuniao = input("\n Digite o local da reunião:")
            reuniao = input("\n Digite o data da reunião:")

            

        '''def CriarAtas():

        def Realocar():

        def adcPart():
            participante = input("Digite o nome: ")
            if ():

        # Fazer Validação

        while (cont2 != 6):

            Menu2()
            cont2 = int(input(" Digite a Opção Você Deseja: "))

            if (cont2 == 1):

                Visualizar()

            elif (cont2 == 2):

                Presença()

            elif (cont2 == 3):

                Criar_reunioes()

            elif (cont2 == 4):

                CriarAtas()

            elif (cont2 == 5):

                Realocar()

            elif (cont2 == 6):

                adcPart()

            elif (cont2 == 0):

                Sair()'''

    # Funçao de sair do menu

    def Sair():

        print("Saindo do programa!!")

    while (cont != 4):

        Menu()

        cont = int(input(" Digite a Opção Você Deseja: "))

        if (cont == 1):

            UsuárioComum()

        elif (cont == 2):

            GestorRecurso()

        elif (cont == 3):

            Cancelamento()

        elif (cont == 4):

            Login()

        elif (cont == 5):

            Coordenador()

        elif (cont == 0):
            Sair()


Program2()