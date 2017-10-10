package com.santosh.spring.view;

import java.text.DateFormat;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.santosh.spring.model.Student;

public class ItextPdfView extends AbstractITextPdfView {

	private static final DateFormat DATE_FORMAT = DateFormat.getDateInstance(DateFormat.SHORT);

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		@SuppressWarnings("unchecked")
		List<Student> students = (List<Student>) model.get("student");

		/*PdfPTable table = new PdfPTable(9);
		table.setWidths(new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10 });*/
		
		PdfPTable table = new PdfPTable(9);
		table.setWidthPercentage(110.0f);
        table.setWidths(new float[] {1.0f, 1.0f, 1.0f, 1.0f, 1.0f,1.0f, 1.0f, 2.0f, 1.0f});
        table.setSpacingBefore(10);
         
        // define font for table header row
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(BaseColor.WHITE);
         
        // define table header cell
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(BaseColor.BLACK);
        cell.setPadding(5);
       
        cell.setPhrase(new Phrase("ID", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("FirstName", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("LastName", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("B'Day", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Address", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("City", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Mobile", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Email", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Pin", font));
        table.addCell(cell);

		for (Student st : students) {
			table.addCell(String.valueOf(st.getId()));
			table.addCell(st.getFirstname());
			table.addCell(st.getLastname());
			table.addCell(DATE_FORMAT.format(st.getDob()));
			table.addCell(st.getAddress());
			table.addCell(st.getCity());
			table.addCell(st.getMobile());
			table.addCell(st.getEmail());
			table.addCell(String.valueOf(st.getPincode()));
		}

		document.add(table);
	}

}