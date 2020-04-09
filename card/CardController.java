package com.jse.card;
import java.util.Scanner;

public class CardController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardService();
		
		while(true) {
			System.out.println("\n아래의 숫자중에서 선택해주세요.");
			System.out.println("0.Exit 1.카드3장 받기 2.카드확인");
			
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("카드3장 받기");
				for(int i=0; i<3; i++) {	
					System.out.println("카드 모양, 숫자를 입력해주세요 : ");				
					service.add(new Card(scanner.next(),scanner.nextInt()));
				}
				break;
			case 2:
				System.out.println("카드확인");
				Card[] cards = service.getCards();
				for(int i=0; i<3; i++) {
					System.out.println(String.format("[카드모양 : %s, 카드넘버 : %d]", 
							cards[i].getKind(),cards[i].getNumber()));
				}
				break;
			default:
				break;
			}
		}
	}
	}
