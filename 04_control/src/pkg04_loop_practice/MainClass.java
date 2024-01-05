package pkg04_loop_practice;

public class MainClass {
  
  public static void method1() {
    // 100 ~ 1 출력하기
    
    int n = 100;
    
    while(n >= 1) {
      System.out.println(n--); // 출력 후 감소하기
    }
  }
  
  public static void method2() {
    // 5 ~ 20 사이 모든 정수의 평균
    
    int n = 5;
    int total = 0;
    
    // 1. 갯수 처음에 0으로 시작
    int count=0;
    
    while(n <= 20) {
     // total += n++; 가능
      total += n;
      count++;
      n++;
     int total2 = total;
     total2 /= n-4;
     System.out.println(total);
     System.out.println(total2);
    }
    
    // 2.
    /*
    int begin= 5;
    int end = 20;
    int n= bigin;
    int total = 0;
    while(n <= end) {
      total += n;
      n++;
     }
     
    double average = toal /( end - begin + 1.0);  // 실수값의 도메인 범위가 더 넓어서 ... 더 넓은 실수값으로 인식함.
        System.out.println(average);

    */
    
    
    
    
    
  }

  
  public static void method3() {
    
    // 3단 출력하기
    int dan = 3;
    //int n = 9;
    /*
    for(int i=1;i <= n; i++) {
      int result = dan * i;
      System.out.println(result);
    }
    *
   */
    
    /*
      for(int i=0;i<=9;i++){
       if(dan%3 == 0){
       System.out.println(dan*i);
       }
      } 
     */
    
    for(int n=1;n<=9;n++) {
     System.out.println(dan + "x" + n + "=" + dan * n);
    }
    
       
  }
  
  public static void method4() {
    // 70원씩 모금하기
    // 목표는 100,000 원 이상
    
    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    // ... 
    // n회 모금액 100,000원 이상 금액

  
    int n = 100000;
    int r = 70;
    int result=0;
    /*
    for(int i=1; result < n; i++) {
      result= r*i;
      System.out.println(result);
    }
    */
    
    /*
     for(int i=1; result < n; i++) {
      
       if(10000 % 7 == 0)  ;
      System.out.println(result);
      
     }
     */
/* 선생님답
 * int money = 70; // 1회모금액
 * int total = 0; //전체모금액
 * final int GOAL = 100_000; // 모금액 목표 
 * int nth = 0;
 *      
     
   while(total < GOAL) {
     total+= money;
     nth++;
     System.out.println(nth+"회 모금액"+total+"원");
   }
     
 */    
     
  }
  
  public static void method5() {
    // 2x 1 = 2
    // 2x 2 = 4
    // ...
    // 9x 9 = 81
    
    // 5x5 = 25
    
    
    
    //
    
    outer :     // 라벨 ->중첩문일시, 바깥쪽 for문을 빠져나가고싶을때 
    for(int n = 2; n <= 9; n++) {
      System.out.println(n+"단");
      for(int j = 1; j <= 9; j++) {
        //int result = n*j;
        System.out.println(n + "*" + j + "=" + n*j);
        if(j == 5 && n==5) {
          break outer;
        }
      }
    }
    
    
  }
  
  public static void method6(){
    // 2x1=2 3x1 = 3...... 9x1=9
    // 2x2=4 3x2=6 ...9x2 =18
    //...
    //2x9 = 18 3x9=27 ...
    
    for(int n=1; n <= 9; n++) {
      
      for(int j=2;j<=9;j++) {
        System.out.print( j +"*"+ n+"=" +n*j+"\t");
      }
      System.out.println(); // 줄 바꿈
    }
    
    
  }
  
  public static void method7() {

    /*
     * 삼각별 출력하기-1
     *        star=12345 
     * row=1       *        1*1
     * row=2       **       1*2
     * row=3       ***      1*3
     * row=4       ****     1*4
     * row=5       *****    1*5
     * 
     * row=1, star=1~1 
     * row=2, star=1~2 
     * row=3, star=1~3 
     * row=4, star=1~4 
     * row=5, star=1~5
      * row = 1~5, star=1~row
     * fix값  inner값
     * 
     
     */
    
    for(int row =1; row <=5; row ++) {
      for(int star=1; star<=row;star++) {
        System.out.print("*"); 
      }
        System.out.println();
    }
    
    
    
    
  }
  
  public static void method8() {
    
    /*
     * 삼각별 출력하기-2
     *        star=12345
     * row=1       *****
     * row=2       ****
     * row=3       ***
     * row=4       **
     * row=5       *
     * 
     * row=1, star=1~5    1+5 =6
     * row=2, star=1~4    2+4 =6
     * row=3, star=1~3    3+3 =6
     * row=4, star=1~2    2+4 =6
     * row=5, star=1~1
     * 
     * row = 1~5 , start= 1 ~ 6-row
     */
    
    for(int row = 1; row <= 5; row++) {
       for(int star = 1; star <= 6 - row; star++) {
         System.out.println("*");
       }
       System.out.println(); 
       
    }
    
    
  }
  
  public static void method9() {
    
    /*
     * 삼각별 출력하기-3
     * space/star=123456789
     * row=1          *
     * row=2         ***
     * row=3        *****
     * row=4       *******
     * row=5      *********
     * 
     * 
     *        띄어쓰기개수  
     * row=1, space=1~4,    star=5~5    1
     * row=2, space=1~3,    star=4~6    3
     * row=3, space=1~2,    star=3~7    5
     * row=4, space=1~1,    star=2~8    7
     * row=5, space=1~0,    star=1~9    9
    
      row = 1~5, space = 1~5-row, star = 6-row   ~ row+4
         
     */
    
    for(int row = 1; row <= 5; row++) {
      for(int space = 1; space <= 5-row; space++) {
        System.out.println("");
      }
      for(int star=6-row; star<=row+4;star++) {
        System.out.println("*");
      }
      System.out.println();
    }
    
    
    

  }
  
  public static void method10() {
    
    /*
     * 삼각별 출력하기-4
     * space/star=123456789
     * row=1      *********
     * row=2       *******
     * row=3        *****
     * row=4         ***
     * row=5          *
     * 
     * row=1, space=1~0, star=1~9
     * row=2, space=1~1, star=2~8
     * row=3, space=1~2, star=3~7
     * row=4, space=1~3, star=4~6
     * row=5, space=1~4, star=5~5
     * 
     * row =  1~5 / space = 1 ~ row-1; star = row ~ 10 - row
     */
    for(int row = 1; row <= 5;row++ ) {
      for(int space=1; space <= row-1; space++) {
        System.out.println(" ");
      }
      for(int star =row; star<=10-row;star++) {
        System.out.println("*");
      }
      System.out.println();
      
    }
    
    
  }  
  
  
  
  
  
  public static void main(String[] args) {
    method3();
  
  }

}
