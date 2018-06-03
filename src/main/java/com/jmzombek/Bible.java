package com.jmzombek;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Bible {
    public void parse() throws Exception {
        
       //String title = "error";
    	
       // Read HTML page from URL
       //Document doc;
       //try {
    	   
    	   String HTMLSTring = "<!DOCTYPE html>"
                   + "<html>"
                   + "<head>"
                   + "<title>Bible Extract Example</title>"
                   + "</head>"
                   + "<body>"
                                     
                   + "<h1 class=\"passage-display\">"
                   + "<span class=\"passage-display-bcv\">Genesis 1</span>" 
                   + "<span class=\"passage-display-version\">King James Version (KJV)</span>"
                   + "</h1> <p class=\"chapter-1\"><span id=\"en-KJV-1\" class=\"text Gen-1-1\">"
                   + "<span class=\"chapternum\">1</span>In the beginning God created the heaven and the earth.</span></p>"
    	   
                   + "</table>"
                   + "</body>"
                   + "</html>";
    	   
    	   Document doc = Jsoup.parse(HTMLSTring);
    	   String title = doc.title();
    	   Elements elements = doc.getElementsByClass("passage-display");
      	   System.out.println("Size: " + elements.size());
      	   String element = elements.first().text();
      	   System.out.println("element value: " + element);
    	   
    	   for (Element element2 : elements) {
             System.out.println("value: " + element2.val());  
             System.out.println("outerHtml: " + element2.outerHtml());  
           }
      
           System.out.println("Input HTML String to JSoup :" + HTMLSTring);
           System.out.println("After parsing, Title : " + title);
           //System.out.println("After parsing, Heading : " + h1);
    	       	   
           //doc = Jsoup.connect("https://www.biblegateway.com/passage/?search=Genesis+1&version=KJV").get();
           //title = doc.title();
           
           //String h1 = html.body().getElementsByTag("h1").text();
           
           //String h1 = html.body().getElementsByTag("h1").text();
           
           //Elements h1s = doc.select("h1");
           //for (Element h1 : h1s) {
           //  System.out.println(h1.val());  
          // }
           
           
           //Element firstClass = classes.get(0);
           //System.out.println(firstClass.text());
           
           
           //Elements elementsByClass = doc.getElementsByClass("passage-display");
           //System.out.println("Element By Class");  
             
           //for(Element e : elementsByClass){
           // System.out.println(e.val());  
          // }
           
       //} catch (IOException e) {
       //  e.printStackTrace();
       //}
       //System.out.println("Jsoup Can read HTML page from URL, title : " + title);
  
   //}
    /*
    <h1 class="passage-display">
    <span class="passage-display-bcv">Genesis 1</span> 
    <span class="passage-display-version">King James Version (KJV)</span>
    </h1> <p class="chapter-1"><span id="en-KJV-1" class="text Gen-1-1">
    <span class="chapternum">1 </span>In the beginning God created the heaven and the earth.</span></p>
    <p><span id="en-KJV-2" 
    */
    }
}