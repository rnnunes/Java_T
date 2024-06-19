package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AbrirExcel {

	
	private static final String filePath = "D:/Script/Java_T/TesteCNPJ/Lista CNPJ Exemplos.xlsx";
	
	public static void main(String[] args) throws IOException {
	
		List<Planilha> listaCNPJ = new ArrayList<Planilha>();
		
		try {
			FileInputStream arquivo = new FileInputStream(new File(AbrirExcel.filePath));
			XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
			XSSFSheet sheetCNPJ = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheetCNPJ.iterator();
			
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				
				Planilha planilha = new Planilha();
				listaCNPJ.add(planilha);
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					
					case 0:
						planilha.setCNPJ(cell.getStringCellValue());
						break;
						
					case 1:
						planilha.setNome(cell.getStringCellValue());
						break;
					
					case 2: 
						planilha.setSituacao(cell.getStringCellValue());
						break;
					
					}
					
				}
				
			}
			arquivo.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo Excel não encontrado!");
		}

//		if (listaCNPJ.size() == 0) {
//			System.out.println("Nenhum CNPJ encontrado!");
//		} else {
//			
//		}
		
	}

}
