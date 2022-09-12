from openpyxl import load_workbook as load_table

def getTableContent():
    table = load_table(filename="tabela.xlsx")
    sheet = table['Sheet1']
    for row in sheet.iter_rows(3):
        for cell in row:
            print(cell.value, end=" ")
        print("")



if __name__ == "__main__":
    getTableContent()
    print("finished")