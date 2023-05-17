package com.nt.text;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishMessageGenerator;
public class SetterInjectionTest {
public static void main(String[] args) {
	//locates and hold spring bean cfg file
	FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationcontext.xml");
	//Create ioc container
	XmlBeanFactory factory=new XmlBeanFactory(res);
	Object obj=factory.getBean("wmg");
	//type caste
	WishMessageGenerator generator= (WishMessageGenerator)obj;
	//invoke the b.method
	String result=generator.generateWishMessage("Vishal");
	System.out.println("Result::"+result);
}
}
