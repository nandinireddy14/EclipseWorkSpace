package cgginterns.hibernate.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
public static void main(String[] args) {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	//creating question object
	Question q1 = new Question();
	q1.setQuestionId(1212);
	q1.setQuestion("What is Java?");
	
	//creating answer objects
	Answer a1=new Answer();
	a1.setAnswerId(343);
	a1.setAnswer("Java is a programming language");
	a1.setQuestion(q1);
	
	Answer a2=new Answer();
	a2.setAnswerId(344);
	a2.setAnswer("Java is a platform independent");
	a2.setQuestion(q1);
	
	Answer a3=new Answer();
	a3.setAnswerId(345);
	a3.setAnswer("Java is a Strongly Typed Language");
	a3.setQuestion(q1);
	
	ArrayList<Answer> list = new ArrayList<Answer>();
	list.add(a1);
	list.add(a2);
	list.add(a3);
	q1.setAnswers(list);
	
	//creating question-2 object
	Question q2 = new Question();
	q2.setQuestionId(234);
	q2.setQuestion("What is NetBeans?");
	
	
	//creating answer objects
	Answer a21=new Answer();
	a21.setAnswerId(123);
	a21.setAnswer("NetBeans is an IDE");
	a21.setQuestion(q2);
	
	Answer a22=new Answer();
	a22.setAnswerId(124);
	a22.setAnswer("NetBeans can be used to build any type of app ");
	a22.setQuestion(q2);
	
	Answer a23=new Answer();
	a23.setAnswerId(125);
	a23.setAnswer("NetBeans is a popular IDE");
	a23.setQuestion(q2);
	
	ArrayList<Answer> list1 = new ArrayList<Answer>();
	list1.add(a21);
	list1.add(a22);
	list1.add(a23);
	q2.setAnswers(list1);
	
	
	
	Session session = factory.openSession();
	
	Transaction tx = session.beginTransaction();
	
	session.save(q1);
	session.save(a1);
	session.save(a2);
	session.save(a3);
	
	session.save(q2);
	session.save(a21);
	session.save(a22);
	session.save(a23);
	
	tx.commit();
	
	
	//q&multiple answers with question id
	Question question =(Question) session.load(Question.class, 234);
	System.out.println(question.getQuestion());
	List<Answer> answers= question.getAnswers();
	
	for(Answer answer:answers) {
		System.out.println(answer.getAnswer());
	}
	
	
	//question with answer id
	Answer answer =(Answer) session.load(Answer.class, 123);
	System.out.println(answer.getQuestion().getQuestion());
	
	session.close();
	factory.close();
}
}
