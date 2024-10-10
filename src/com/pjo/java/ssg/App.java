package com.pjo.java.ssg;

import java.util.Scanner;

import com.pjo.java.ssg.controller.ArticleController;
import com.pjo.java.ssg.controller.Controller;
import com.pjo.java.ssg.controller.MemberController;
import com.pjo.java.ssg.dto.Article;
import com.pjo.java.ssg.util.Util;

public class App {
	
	public App() {
		
	}
	
	public void start() {
			
			System.out.println("== 프로그램 시작 ==");
			
			Scanner sc = new Scanner(System.in);

			MemberController memberController = new MemberController(sc);
			ArticleController articleController = new ArticleController(sc);
			
			articleController.makeTestData();
			
			while (true) { 
				System.out.printf("명령어) ");
				String command = sc.nextLine();

				command = command.trim();

				if (command.length() == 0) {
					continue;
				}
				
				if (command.equals("system exit")) {
					break;
				}
				
				String[] commandBits = command.split(" ");
				
				if ( commandBits.length == 1) { 
					System.out.println("존재하지 않는 명령어입니다.");
					continue;
				}
				
				String controllerName = commandBits[0];
				String actionMethodName = commandBits[1];
				
				Controller controller = null;

				if (controllerName.equals("article")) {
					controller = articleController;
				}
				
				else if (controllerName.equals("member")) {
					controller = memberController;
				}
				
				else {
					System.out.println("존재하지 않는 명령어 입니다.");
					continue;
				}
				
				controller.doAction(command, actionMethodName);
				
			}
			
			sc.close();
			System.out.println("== 프로그램 끝 ==");
		}

}