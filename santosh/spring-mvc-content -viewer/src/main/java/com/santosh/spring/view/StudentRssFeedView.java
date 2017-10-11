package com.santosh.spring.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Item;
import com.santosh.spring.model.Student;

public class StudentRssFeedView extends AbstractRssFeedView {

	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Channel feed, HttpServletRequest request) {

		feed.setTitle("SANTOSH");
		feed.setDescription("Spring Content View Resolver");
		feed.setLink("http://www.facebook.com/santosh9752572357");

		super.buildFeedMetadata(model, feed, request);
	}

	@Override
	protected List<Item> buildFeedItems(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		//Student students = (Student) model.get("student");
		List<Student> students = (List<Student>) model.get("student");
		System.out.println(students.size());
		String msg = students.get(0) +"||"+students.get(1) +"||"+ students.get(2)+ "||"+students.get(3);

		List<Item> items = new ArrayList<Item>(1);
		Item item = new Item();
		item.setAuthor("SANTOSH");
		item.setLink("http://www.santosh.com");

		Content content = new Content();
		content.setValue(msg);

		item.setContent(content);

		items.add(item);

		return items;
	}
}
