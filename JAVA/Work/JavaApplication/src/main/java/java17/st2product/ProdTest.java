package java17.st2product;

import java.util.Scanner;

public class ProdTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scn = new Scanner(System.in);
        
        Product[] p = new Product[10];
        
        for(int i=0;true;i=i+1) {
            if (i > 9) {
                System.out.println("최대 10개까지 입력 가능합니다!");
                break;
            }
            System.out.print("선택: 상품추가(1), 상품검색(2), 종료(0): ");
            int s = scn.nextInt();
            
            if (s == 1) {
                System.out.print("상품종류: 책(1), CD(2), 회화책(3): ");
                int t = scn.nextInt();
                if (t == 1) {
                    Book b = new Book();
                    b.id = i;
                    
                    System.out.print("책 제목: ");
                    b.booktl = scn.next();

                    System.out.print("책 설명: ");
                    b.explan = scn.next();

                    System.out.print("책 ISBN: ");
                    b.isbn   = scn.nextInt();

                    System.out.print("책 가격: ");
                    b.price = scn.nextInt();

                    System.out.print("책 저자: ");
                    b.writer = scn.next();

                    System.out.print("생산자: ");
                    b.producer = scn.next();
                }
                else if (t == 2) {
                    CompDisc cd = new CompDisc();
                    cd.id = i;
                    
                    System.out.print("엘범 제목: ");
                    cd.albumtl = scn.next();

                    System.out.print("엘범 설명: ");
                    cd.explan = scn.next();

                    System.out.print("엘범 가격: ");
                    cd.price = scn.nextInt();

                    System.out.print("엘범 저자: ");
                    cd.singer = scn.next();

                    System.out.print("생산자: ");
                    cd.producer = scn.next();
                }
                else if (t == 3) {
                    CorverBook cb = new CorverBook();
                    cb.id = i;
                    
                    System.out.print("책 제목: ");
                    cb.booktl = scn.next();

                    System.out.print("책 설명: ");
                    cb.explan = scn.next();

                    System.out.print("책 ISBN: ");
                    cb.isbn   = scn.nextInt();

                    System.out.print("책 가격: ");
                    cb.price = scn.nextInt();

                    System.out.print("책 저자: ");
                    cb.writer = scn.next();

                    System.out.print("생산자: ");
                    cb.producer = scn.next();
                }
            }
            else if (s == 2) {
                
            }
            else if (s == 0) {
                System.out.println("종료 합니다.");
                break;
            }
            else {
                System.out.println("선택 오류, 재입력 하세요");
            }
        }
    }

    
}
