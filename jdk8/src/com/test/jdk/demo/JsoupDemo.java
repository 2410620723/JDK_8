package com.test.jdk.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.junit.Test;

public class JsoupDemo {
	
	@Test
	public void testParse(){
		String html = "<html><head><title>±ÍÃ‚</title></head>"
                + "<body><p>∂Œ¬‰</p></body></html>";
		Document doc = Jsoup.parse(html);
		System.out.println(doc);
	}
	
	
	@Test
	public void testParseBodyFragmentNotSafe(){
		String html = "<div><p>Lorem ipsum.</p>";
        Document doc = Jsoup.parseBodyFragment(html);
        Element body = doc.body();
		System.out.println(body);
	}
	
	@Test
	public void testParseBodyFragmentSafe(){
		String html = "<div><p>Lorem ipsum.</p>";
		Whitelist list = new Whitelist();
		Whitelist.relaxed();
		Whitelist.none();
		Whitelist.basic();
		Whitelist.basicWithImages();
		Whitelist.simpleText();
		list.addTags("a");
		Jsoup.clean(html, list);
		Document doc = Jsoup.parseBodyFragment(html);
		Element body = doc.body();
		System.out.println(body);
	}
	
	@Test
	public void testParseDocumentFromUrl(){
		Document doc = null;
		try {
			doc = Jsoup.connect("http://www.baidu.com").get();
			String title = doc.title();
			System.out.println(title);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
