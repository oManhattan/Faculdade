import numbers
from typing import List
import numpy as np
import matplotlib.pyplot as plt
import csv

# 1) Crie um programa que leia os dados
def carregarConjunto():
    file = open("2022_3_EP_4MA_ADO01_DadosMatheusCavalcanti.csv", "r", encoding = "utf-8-sig")
    # file = open("2022_3_EP_4MA_ADO01_DadosGustavoTozeti.csv", "r", encoding = "utf-8-sig")
    conjunto = list(map(int, file.read().strip().split("\n")))
    print(f"1) Conjunto fornecido: {conjunto}")
    return conjunto

# 2) Inclua em seu programa uma rotina qque organize e exiba os 40 dados em ordem crescente
def ordenarConjunto(conjunto: List):
    conjunto.sort()
    conjunto_ordenado = conjunto.copy()
    print(f"2) Conjunto ordenado: {conjunto_ordenado}")
    return conjunto_ordenado

# 3) Inclua em seu programa uma rotina que calcule e apresente a média dos 40 dados.
def calcularMediaAritmeticaConjunto(conjunto: List):
    media_aritmetica = np.average(conjunto)
    print(f"3) Média aritmética do conjunto: {media_aritmetica}")
    return media_aritmetica

# 4) Inclua em seu programa uma rotina que determine e exiba a mediana dos 40 dados.
def calcularMedianaConjunto(conjunto: List):
    mediana = np.median(conjunto)
    print(f"4) Mediana do conjunto: {mediana}")
    return mediana

# 5) Inclua em seu programa uma rotina que verifique se existe uma (ou mais) moda(s) entre os 40 dados. Caso exista(m), o programa deve apresentá-la(s)
def calcularModaConjunto(conjunto: List):
    frequencia_numeros = []

    for i in conjunto:
        esta_contido = False
        for j in frequencia_numeros:
            if i == j[0]:
                j[1] += 1
                esta_contido = True
                break
        if not esta_contido:
            frequencia_numeros.append([i, 1])

    frequencia_numeros.sort(key = ordenarArray, reverse = True)
    maior_repeticao = frequencia_numeros[0][1]
    conjunto_moda = []
    for i in frequencia_numeros:
        if i[1] == maior_repeticao:
            conjunto_moda.append(i[0])
        else:
            break
    
    print(f"5) Moda do conjunto: {conjunto_moda}")

def ordenarArray(e):
    return e[1]

# 6) Inclua em seu programa uma rotina que calcule e apresente o desvio absoluto médio dos 40 dados.
def desvioAbsolutoMedioConjunto(conjunto: List):
    # Calcular a média aritmédica do conjunto
    media_aritmedica = np.average(conjunto)
    # Subtrair de cada valor do conjunto a média calculada
    novo_conjunto = []
    for valor in conjunto:
        novo_conjunto.append(abs(valor - media_aritmedica))
    # Somar todos os valores e dividir pelo número de dados
    desvio_abs_medio = np.average(novo_conjunto)
    print(f"6) Desvio absoluto médio: {desvio_abs_medio}")
    
# 7) Inclua em seu programa uma rotina que calcule e apresente a variância e o desvio padrão dos 40 dados.
def varianciaDesvioPadrao(conjunto: list):
    # calcular a média aritmédica do conjunto
    media_aritmedica = np.average(conjunto)
    # subtrair de cada valor do array a média calculada e depois elevar cada resultado ao quadrado
    novo_array = []
    for valor in conjunto:
        novo_array.append(pow(valor - media_aritmedica, 2))
    # somar todos os valores e dividir pelo número de dados
    variancia = np.average(novo_array)
    # desvio padrão é igual a raiz quadrada da variância
    desvio_padrao = np.sqrt(variancia)
    
    print(f"7) Variância do conjunto: {variancia}, desvio padrão do conjunto: {desvio_padrao}")

# 8) Inclua em seu programa uma rotina que agrupe os 40 dados em 7 classes e apresente a distribuição de frequências destas classes. Esta tabela de distribuição de frequências deve ter colunas para as classes, ponto médio de cada classe (xi), frequências absolutas (ni), frequências relativas (ou proporções, fi) e porcentagens (%, obtidas como 100*fi).
def tabelaFrequencia(conjunto: List):
    frequencia_str = ["0 |- 10", "10 |- 20", "20 |- 30", "30 |- 40", "40 |- 50", "50 |- 60", "60 |- 70"]
    conjunto_frequencia = [0, 0, 0, 0, 0, 0, 0]
    for valor in conjunto:
        if valor < 10:
            conjunto_frequencia[0] += 1
        elif valor >= 10 and valor < 20:
            conjunto_frequencia[1] += 1
        elif valor >= 20 and valor < 30:
            conjunto_frequencia[2] += 1
        elif valor >= 30 and valor < 40:
            conjunto_frequencia[3] += 1
        elif valor >= 40 and valor < 50:
            conjunto_frequencia[4] += 1
        elif valor >=  50 and valor < 60:
            conjunto_frequencia[5] += 1
        else:
            conjunto_frequencia[6] += 1

    with open("tabela-frequencia.csv", "w", encoding = "UTF-8") as arquivo:
        writer = csv.writer(arquivo)
        cabecalho = ["Classes", "Ponto Médio", "Frequência", "Proporção", "Porcentagem"]
        writer.writerow(cabecalho)

        for i in range(len(conjunto_frequencia)):
            aux = list(map(int, frequencia_str[i].split(" |- ")))
            proporcao = conjunto_frequencia[i] / 40
            row_content = [f"{frequencia_str[i]}", np.average(aux), conjunto_frequencia[i], "{:.3f}".format(proporcao), "{:.2f}".format(proporcao * 100)]
            writer.writerow(row_content)

        footer = ["Total", "-", np.sum(conjunto_frequencia), 1, 100]
        writer.writerow(footer)
        arquivo.close()

# 9. Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, apresente um histograma da distribuição. Caso a apresentação de um histograma seja muito difícil na linguagem de programação com a qual você esteja trabalhando, tente apresentar ao menos um diagrama de ramos-e-folhas dos dados, ou um gráfico de dispersão unidimensional (aquele dos pontinhos).
def histogramaFrequencias(conjunto: List):
    (fig, axs) = plt.subplots()
    axs.hist(conjunto, bins = [0, 10, 20, 30, 40, 50, 60, 70])
    axs.set_title("Histograma Conjunto")
    axs.set_ylabel("Frequência")
    axs.set_xlabel("Números")
    fig.savefig("histograma-conjunto")

# 10) Inclua em seu programa uma rotina que calcule a média usando os dados agrupados em classes (item 8. acima). Verifique se há alguma diferença entre esta média e aquela calculada no item 3. acima. Caso haja alguma diferença, explique por que isso ocorre.
def mediaAritmeticaDadosAgrupados():

    arquivo = open("tabela-frequencia.csv", "r")
    reader = csv.reader(arquivo)
    # Ponto Médio está na coluna 2 e frequência está na coluna 3
    pontos_medios = []
    frequencias = []
    for row in reader:
        try:
            pontos_medios.append(float(row[1]) * float(row[2]))
            frequencias.append(float(row[2]))
        except:
            pass
    media_frequencia = np.sum(pontos_medios)/np.sum(frequencias)

    return media_frequencia

# 11) Inclua em seu programa uma rotina que determine a(s) classe(s) modal(is) da distribuição de frequências construída no item 8. acima.
def classeModalDadosAgrupados():
    arquivo = open("tabela-frequencia.csv", "r")
    reader = csv.reader(arquivo)
    # Classes e Frequência
    classe_modal = ""
    maior_frequencia = -1
    for row in reader:
        try:
            if "Total" in row[0] or "Classe" in row[0]:
                continue
            if float(row[2]) > maior_frequencia:
                maior_frequencia = float(row[2])
                classe_modal = row[0]
        except:
            pass

    print(f"11) Classe Modal: {classe_modal}")
    
# 12) Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, calcule e apresente o desvio absoluto médio. Verifique se há alguma diferença entre este desvio absoluto médio e aquele calculado no item 6. acima. Caso haja alguma diferença, explique por que isso ocorre.
def desvioAbsolutoMedioDadosAgrupados():
    arquivo = open("tabela-frequencia.csv", "r")
    reader = csv.reader(arquivo)
    media_frequencia = mediaAritmeticaDadosAgrupados()
    pontos_medios = []
    frequencias = []
    for row in reader:
        try:
            pontos_medios.append(float(row[1]))
            frequencias.append(float(row[2]))
        except:
            pass
    
    for i in range(len(pontos_medios)):
        pontos_medios[i] = abs(pontos_medios[i] - media_frequencia) * frequencias[i]
    
    print(f"12) Desvio Médio Absoluto {sum(pontos_medios) / sum(frequencias)}")

# 13) Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, calcule e apresente a variância e o desvio padrão. Verifique se há alguma diferença entre a variância e o desvio padrão assim calculados e aqueles calculados no item 7. acima. Caso haja alguma diferença, explique por que isso ocorre. Obs.: como estamos lidando com mais de 30 dados, não é necessário usar a correção (n-1) no cálculo da variância.
def varianciaDesvioPadraoDadosAgrupados():
    # calcular a média aritmédica do conjunto
    media = mediaAritmeticaDadosAgrupados()
    # subtrair de cada valor do array a média calculada e depois elevar cada resultado ao quadrado
    arquivo = open("tabela-frequencia.csv", "r")
    reader = csv.reader(arquivo)
    pontos_medios = []
    frequencias = []
    aux = []
    for row in reader:
        try:
            pontos_medios.append(float(row[1]))
            frequencias.append(float(row[2]))
            temp = pow(float(row[1]) - media, 2)
            aux.append(temp * float(row[2]))
        except:
            pass
    
    # somar todos os valores e dividir pelo número de dados
    variancia = sum(aux) / sum(frequencias)
    # desvio padrão é igual a raiz quadrada da variância
    desvio_padrao = np.sqrt(variancia)
    print(f"13) Variância: {variancia}; Desvio padrão: {desvio_padrao}")

if __name__ == "__main__":
    # 1) Crie um programa que leia os dados.
    conjunto = carregarConjunto()    

    # 2) Inclua em seu programa uma rotina qque organize e exiba os 40 dados em ordem crescente.
    conjunto = ordenarConjunto(conjunto)

    # 3) Inclua em seu programa uma rotina que calcule e apresente a média dos 40 dados.
    calcularMediaAritmeticaConjunto(conjunto)

    # 4) Inclua em seu programa uma rotina que determine e exiba a mediana dos 40 dados.
    calcularMedianaConjunto(conjunto)

    # 5) Inclua em seu programa uma rotina que verifique se existe uma (ou mais) moda(s) entre os 40 dados. Caso exista(m), o programa deve apresentá-la(s)
    calcularModaConjunto(conjunto)

    # 6) Inclua em seu programa uma rotina que calcule e apresente o desvio absoluto médio dos 40 dados.
    desvioAbsolutoMedioConjunto(conjunto)

    # 7) Inclua em seu programa uma rotina que calcule e apresente a variância e o desvio padrão dos 40 dados.
    varianciaDesvioPadrao(conjunto)

    # 8) Inclua em seu programa uma rotina que agrupe os 40 dados em 7 classes e apresente a distribuição de frequências destas classes. Esta tabela de distribuição de frequências deve ter colunas para as classes, ponto médio de cada classe (xi), frequências absolutas (ni), frequências relativas (ou proporções, fi) e porcentagens (%, obtidas como 100*fi).
    tabelaFrequencia(conjunto)
    print("8) Arquivo \"tabela-frequencia.csv\" foi criado.")

    # 9) Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, apresente um histograma da distribuição. Caso a apresentação de um histograma seja muito difícil na linguagem de programação com a qual você esteja trabalhando, tente apresentar ao menos um diagrama de ramos-e-folhas dos dados, ou um gráfico de dispersão unidimensional (aquele dos pontinhos).
    histogramaFrequencias(conjunto)
    print("9) Arquivo \"histograma-conjunto.pnj\" foi criado.")

    # 10) Inclua em seu programa uma rotina que calcule a média usando os dados agrupados em classes (item 8. acima). Verifique se há alguma diferença entre esta média e aquela calculada no item 3. acima. Caso haja alguma diferença, explique por que isso ocorre.
    media_agrupada = mediaAritmeticaDadosAgrupados()
    print(f"10) Média das frequencias: {media_agrupada}")

    # 11) Inclua em seu programa uma rotina que determine a(s) classe(s) modal(is) da distribuição de frequências construída no item 8. acima.
    classeModalDadosAgrupados()

    # 12) Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, calcule e apresente o desvio absoluto médio. Verifique se há alguma diferença entre este desvio absoluto médio e aquele calculado no item 6. acima. Caso haja alguma diferença, explique por que isso ocorre.
    desvioAbsolutoMedioDadosAgrupados()

    # 13) Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, calcule e apresente a variância e o desvio padrão. Verifique se há alguma diferença entre a variância e o desvio padrão assim calculados e aqueles calculados no item 7. acima. Caso haja alguma diferença, explique por que isso ocorre. Obs.: como estamos lidando com mais de 30 dados, não é necessário usar a correção (n-1) no cálculo da variância.
    varianciaDesvioPadraoDadosAgrupados()

    print("Fim da execussão.")
