package cgginterns.hibernate.map;

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
		
		//creating answer object
		
		Answer a1 = new Answer();
		a1.setAnswerId(343);
		a1.setAnswer("Java is a Programming language");
		
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		
		//creating second question object
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("What is Collection framework?");
		
		//creating second answer object
		
		Answer a2 = new Answer();
		a2.setAnswerId(344);
		a2.setAnswer("APi to work with group of objects");
		
		q2.setAnswer(a2);
		a2.setQuestion(q2);
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		
		session.save(a1);
		session.save(a2);
		
		tx.commit();
		
		
//		fetching q&a with questions..
		
		Question question = (Question)session.get(Question.class,1212);
		System.out.println(question.getQuestion());
		System.out.println(question.getAnswer().getAnswer());
		
		
		//fetching q&a with answers..
		Answer answer = (Answer)session.get(Answer.class, 344);
		System.out.println(answer.getAnswer());
		System.out.println(answer.getQuestion().getQuestion());

		
		
		session.close();
		factory.close();
	}

}
