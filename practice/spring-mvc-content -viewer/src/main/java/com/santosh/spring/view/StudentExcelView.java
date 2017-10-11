package com.santosh.spring.view;

import java.text.DateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.format.CellFormat;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.santosh.spring.model.Student;

public class StudentExcelView extends AbstractXlsxView {

	private static final DateFormat DATE_FORMAT = DateFormat.getDateInstance(DateFormat.SHORT);
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook wb, HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		List<Student> student = (List<Student>) model.get("student");
		Sheet sheet;
		
		sheet = wb.createSheet("Students");
		sheet.setDefaultColumnWidth(20);
		
		CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setFontName("Arial");
        style.setFillForegroundColor(HSSFColor.BLACK.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setColor(HSSFColor.WHITE.index);
        style.setFont(font);
        //style.setAlignment(CellStyle.ALIGN_JUSTIFY);
        style.setAlignment(CellStyle.ALIGN_CENTER);
        
		int rowCount = 1;
		// SID
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("ID");
		header.getCell(0).setCellStyle(style);
		header.createCell(1).setCellValue("FirstName");
		header.getCell(1).setCellStyle(style);
		header.createCell(2).setCellValue("LastName");
		header.getCell(2).setCellStyle(style);
		header.createCell(3).setCellValue("B'Day");
		header.getCell(3).setCellStyle(style);
		header.createCell(4).setCellValue("Address");
		header.getCell(4).setCellStyle(style);
		header.createCell(5).setCellValue("City");
		header.getCell(5).setCellStyle(style);
		header.createCell(6).setCellValue("Mobile");
		header.getCell(6).setCellStyle(style);
		header.createCell(7).setCellValue("Email");
		header.getCell(7).setCellStyle(style);
		header.createCell(8).setCellValue("Pincode");
		header.getCell(8).setCellStyle(style);
		for (Student s : student) {
			Row row = sheet.createRow((short) rowCount++);
			Cell cell = row.createCell(0);
			cell = row.createCell(0);
			cell.setCellValue(Integer.toString(s.getId()));
			cell = row.createCell(1);
			cell.setCellValue((s.getFirstname()));
			cell = row.createCell(2);
			cell.setCellValue((s.getLastname()));
			cell = row.createCell(3);
			cell.setCellValue(DATE_FORMAT.format(s.getDob()));
			cell = row.createCell(4);
			cell.setCellValue((s.getAddress()));
			cell = row.createCell(5);
			cell.setCellValue((s.getCity()));
			cell = row.createCell(6);
			cell.setCellValue((s.getMobile()));
			cell = row.createCell(7);
			cell.setCellValue((s.getEmail()));
			cell = row.createCell(8);
			cell.setCellValue(Integer.toString(s.getPincode()));
		}
	}
}
