# Exercício USP
def ForcaOpcao(msg, opcoes):
    opcao = input(msg)
    if opcao not in opcoes:
        print("Inválido!")
        opcao = ForcaOpcao(msg, opcoes)
    return opcao

def ForcaNumero(msg):
    n = input(msg)
    if not n.isnumeric():
        print("Precisa ser um número.")
        n = ForcaNumero(msg)
    return n

def ValidaNUSP():
    while True:
        nusp = ForcaNumero("Digite o NUSP: ")
        if nusp in alunos["nusp"] or nusp in professores["nusp"]:
            print("Esse NUSP já existe. Tente novamente.")
        else:
            return nusp

def ValidaData(msg):
    data = input(msg)
    data = data.split(" ")

    if not len(data) == 2:
        print("Inválido!")
        data = ValidaData(msg)

    if not (data[0].isnumeric() and data[1].isnumeric()):
        print("Precisa ser um número (ex.: 12 2025).")
        data = ValidaData(msg) 
    else:
        for i in range(2):
            data[i] = int(data[i])

    if data[0] < 1 or data[0] > 12:
        print("Mês inválido.")
        data = ValidaData(msg)

    if data[1] < 1900: 
        print("Ano inválido.")
        data = ValidaData(msg)
    return data

def ConfereData(data_inicial, data_final):
    msg = "A data de inicio não pode ser depois da data de fim."
    if data_inicial[1] > data_final[1]:
        print(msg)
        return False 
    if data_inicial[1] == data_final[1] and data_inicial[0] > data_final[0]:
        print(msg)
        return False
    if data_inicial == data_final:
        print("As datas não podem ser iguais.")
        return False
    return True

def AdicionarAluno():
    print()
    print("Cadastro de Aluno")
    nusp = ValidaNUSP()
    nome = input("Digite seu nome: ")

    alunos["nusp"].append(nusp)
    alunos["nome"].append(nome)
    alunos["bolsa"].append("nao")

    print("Aluno adicionado com sucesso") 
    print()

    # print("Alunos cadastrados")
    # for i in range(len(alunos["nusp"])):
    #     for key in alunos.keys():
    #         print(f"{key}: {alunos[key][i]}")
    #     print()
    return

def AdicionarProfessor():
    print()
    print("Cadastro de Professor")
    nusp = ValidaNUSP()
    nome = input("Digite seu nome: ")
    unidade = input("Digite a unidade: ")

    professores["nusp"].append(nusp)
    professores["nome"].append(nome)
    professores["unidade"].append(unidade)

    print("Professor adicionado com sucesso") 
    print()

    # print("Professores cadastrados")
    # for i in range(len(professores["nusp"])):
    #     for key in professores.keys():
    #         print(f"{key}: {professores[key][i]}")
    #     print()
    return

def CadastrarBolsa():
    print()
    print("Cadastro de Bolsa")
    print()

    if not alunos["nome"]:
        print("Sem alunos cadastrados")
        print()
        return
    elif not professores["nome"]:
        print("Sem professores cadastrados")
        print()
        return

    print("Alunos")
    for i in range(len(alunos["nusp"])):
        print(f"{alunos['nusp'][i]} - {alunos['nome'][i]}")
    nusp_aluno = ForcaOpcao("Digite o NUSP do aluno: ", alunos["nusp"])
    for i in range(len(alunos["nusp"])):
        if nusp_aluno == alunos["nusp"][i]:
            aluno = alunos["nome"][i]
            alunos["bolsa"][i] = "sim"
    print()

    tipos_bolsas = ["PEEG", "PUB", "PIBIC"]

    print("Tipo de bolsa")
    for i in range(len(tipos_bolsas)):
        print(f"{i+1}) {tipos_bolsas[i]}")
    bolsa = ForcaOpcao("Digite a opcao: ", ['1', '2', '3'])
    bolsa = int(bolsa)
    print()

    while True:
        data_inicio = ValidaData("Digite o mes e o ano de inicio: ")
        data_fim = ValidaData("Digite o mes e o ano de fim: ")

        p = ConfereData(data_inicio, data_fim)

        if p == True:
            break

    codigo = input("Digite o codigo da disciplina: ")

    print()
    print("Professores")
    for i in range(len(professores["nusp"])):
        print(f"{professores['nusp'][i]} - {professores['nome'][i]}")
    nusp_professor = ForcaOpcao("Digite o NUSP do professor: ", professores["nusp"])
    for i in range(len(professores["nusp"])):
        if nusp_professor == professores["nusp"][i]:
            professor = professores["nome"][i]
    
    bolsas["aluno"].append(aluno)
    bolsas["nusp_aluno"].append(nusp_aluno)
    bolsas["bolsa"].append(tipos_bolsas[bolsa-1])
    bolsas["data_inicio"].append(data_inicio)
    bolsas["data_fim"].append(data_fim)
    bolsas["codigo"].append(codigo)
    bolsas["orientador"].append(professor)

    print("Bolsa cadastrada com sucesso")
    print()

    # print("Bolsas cadastradas")
    # for i in range(len(bolsas["bolsa"])):
    #     for key in bolsas.keys():
    #         print(f"{key}: {bolsas[key][i]}")
    #     print()
    return

def ConsultarUsuario():
    if alunos["nusp"] or professores["nusp"]:
        print()
        print("Consulta de Usuario")
        total_nusps = alunos["nusp"] + professores["nusp"]
        nusp = ForcaOpcao("Digite o NUSP: ", total_nusps)
        for i in range(len(alunos["nusp"])):
            if nusp == alunos["nusp"][i]:
                print(f"Aluno: {alunos['nome'][i]}")
                print("Bolsas:")
                if alunos["bolsa"][i] == "sim":
                    for i in range(len(bolsas["aluno"])):
                        if nusp == bolsas["nusp_aluno"][i]:
                            print(f"({bolsas['bolsa'][i]}) {bolsas['data_inicio'][i][0]}/{bolsas['data_inicio'][i][1]} a {bolsas['data_fim'][i][0]}/{bolsas['data_fim'][i][1]} - {bolsas['codigo'][i]} - Orientador: {bolsas['orientador'][i]}")
                else:
                    print("Sem bolsas cadastradas") 
        for i in range(len(professores["nusp"])):
            if nusp == professores["nusp"][i]:
                print(f"Professor: {professores['nome'][i]}, Unidade: {professores['unidade'][i]}")
    else:
        print("Sem cadastrados")
    print()
    return

def ConsultarValor():
    return

alunos = {
    "nusp": [],
    "nome": [],
    "bolsa": []
}

professores = {
    "nusp": [],
    "nome": [],
    "unidade": []
}

bolsas = {
    "aluno": [],
    "nusp_aluno": [],
    "bolsa": [],
    "data_inicio": [],
    "data_fim": [],
    "codigo": [],
    "orientador": []
}

acoes = ["Sair", "Adicionar aluno", "Adicionar professor", "Cadastrar bolsa", "Consultar usuario", "Consultar valor"]

while True:
    print("Gestão de bolsas USP")
    for i in range(len(acoes)):
        print(f"{i}) {acoes[i]}")
    acao = ForcaOpcao("Escolha uma opcao: ", ['0', '1', '2', '3', '4', '5'])

    match acao:
        case '0':
            break
        case '1':
            AdicionarAluno()
        case '2':
            AdicionarProfessor()
        case '3':
            CadastrarBolsa()
        case '4':
            ConsultarUsuario()
        case '5':
            ConsultarValor()