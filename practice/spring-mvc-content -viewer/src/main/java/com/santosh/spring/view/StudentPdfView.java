package com.santosh.spring.view;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.santosh.spring.model.Student;


public class StudentPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc, PdfWriter writer, HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		List<Student> student = (List<Student>) model.get("student");
		
		PdfPTable table = new PdfPTable(9); // 3 columns.
		table.setWidthPercentage(100); // Width 100%
		// Set Column widths
		float[] columnWidths = { 1f, 1f, 1f, 1f, 1f, 1f, 1f, 5f, 1f };
		table.setWidths(columnWidths);
		PdfPCell cell = null;
		cell = new PdfPCell(new Phrase("ID"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("FIRSTNAME"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("LASTNAME"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("B'DAY"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("ADDRESS"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("CITY"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("MOBILE"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("EMAIL"));
		table.addCell(cell);
		cell = new PdfPCell(new Phrase("PINCODE"));
		table.addCell(cell);
		table.setWidthPercentage(90f);
		for (Student s : student) {
			cell = new PdfPCell(new Phrase(Integer.toString(s.getId())));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(s.getFirstname()));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(s.getLastname()));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(formatter.format(s.getDob())));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(s.getAddress()));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(s.getCity()));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(s.getMobile()));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(s.getEmail()));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(Integer.toString(s.getPincode())));
			table.addCell(cell);
		}
		// Table header

		doc.add(table);
	}

}
