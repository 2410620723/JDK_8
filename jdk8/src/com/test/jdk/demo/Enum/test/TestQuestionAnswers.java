package com.test.jdk.demo.Enum.test;

import com.test.jdk.demo.Enum.demo.Answers;
import com.test.jdk.demo.Enum.demo.Question;

public class TestQuestionAnswers {
	public static void answer(Answers result){
		switch (result) {
		case NO:
			System.out.println("NO");
			break;
		case YES:
			System.out.println("YES");
			break;
		case MAYBE:
			System.out.println("MAYBE");
			break;
		case LATER:
			System.out.println("LATER");
			break;
		case SOON:
			System.out.println("SOON");
			break;
		case NEVER:
			System.out.println("NEVER");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}
