package iteカフェ;

import java.util.Scanner;
import java.util.Calendar;

public class ITEカフェ {

    public static void main(String[] args) {
        
        //準備
        Item hotcoffee=new Item(1, "ホットコーヒー", 280);
        Item tea=new Item(2, "紅茶", 260);
        Item icecoffee=new Item(3,"アイスコーヒー",200);      
        Item iceTea = new Item(4, "アイスティー", 260);
        Item shortCake = new Item(5, "ショートケーキ", 400);
        Item cheeseCake = new Item(6, "チーズケーキ", 400);
        Item chocolateCake = new Item(7, "チョコレートケーキ", 450);
        Item chocolateBananaParfait = new Item(8, "チョコレートバナナパフェ", 390);
        Item StrawberryParfait = new Item(9, "いちごパフェ", 390);
        Item meatPasta = new Item(10, "ミートパスタ", 650);
        Item mixPizza = new Item(11, "ミックスピザ", 700);
        Item croissant = new Item(12, "クロワッサン", 180);
        Item toastSandwich = new Item(13, "トーストサンド", 200);
        Item frenchToast = new Item(14, "フレンチトースト", 210);
       
        Item[] items = new Item[14];
        items[0]=hotcoffee;
        items[1]=tea;
        items[2]=icecoffee;
        items[3]=iceTea;
        items[4]=shortCake;
        items[5]=cheeseCake;
        items[6]=chocolateCake;
        items[7]=chocolateBananaParfait;
        items[8]=StrawberryParfait;
        items[9]=meatPasta;
        items[10]=mixPizza;
        items[11]=croissant;
        items[12]=toastSandwich;
        items[13]=frenchToast;
        
        Scanner scan=new Scanner(System.in);
        
        int inputNum;
        int kaikeiNo = 1;
        Calendar cal = Calendar.getInstance();
        while(true){
                        System.out.println("ITECafeシステム");
            for (int i = 0; i < items.length; i++) {
                        if ((i + 1) % 4 != 0) {
                            System.out.printf("%-20s", items[i].getNo() + ":" + items[i].getName());
                        } else {
                            System.out.printf("%-20s%n", items[i].getNo() + ":" + items[i].getName());
                        }
                    }
            System.out.print("");
            System.out.print("商品番号を入力してください");
            
            try{
                String inputStr;
                inputStr = scan.next();
                inputNum = Integer.parseInt(inputStr);
                System.out.println(inputNum);

                System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName()
                        + "" + items[inputNum - 1].getPrice() + "円が入力されました");
             System.out.print("商品の数量を入力してください");
                int input=new java.util.Scanner(System.in).nextInt();
                //数量を入力させる
                int g=input*items[inputNum - 1].getPrice();
                System.out.println("合計金額は"+g+"円です");
                //合計金額を表示
                System.out.print("預り金を入力してください");
                int m=new java.util.Scanner(System.in).nextInt();
                //預り金を入力
                
            if(m-g>=0) {
                if(m<2000){
                   System.out.println("お釣りは"+(m-g)+"円です");
                   //お釣りを表示する
                   System.out.println(cal.get(Calendar.YEAR) + "年"
                           + cal.get(Calendar.MONTH) + "月"
                           + cal.get(Calendar.DATE) + "日"
                           + cal.get(Calendar.HOUR_OF_DAY) + "時"
                           + cal.get(Calendar.MINUTE) + "分");
                   
                   System.out.printf("お会計番号：%06d\n", kaikeiNo);
                   kaikeiNo++;
                   System.out.println("ありがとうございました！");
                   //正しく処理されたらループを抜ける
                   break;
                }else
                    System.out.println("お釣りは"+(m-g)+"円です");
                     System.out.println("こちら次回から使える１０％OFFクーポンです。");
                   System.out.println(cal.get(Calendar.YEAR) + "年"
                           + cal.get(Calendar.MONTH) + "月"
                           + cal.get(Calendar.DATE) + "日"
                           + cal.get(Calendar.HOUR_OF_DAY) + "時"
                           + cal.get(Calendar.MINUTE) + "分");
                   
                   System.out.printf("お会計番号：%06d\n", kaikeiNo);
                   kaikeiNo++;
                   System.out.println("ありがとうございました！");
                   //正しく処理されたらループを抜ける
                   break;
               }else 
                   System.out.println("お金が足りません"); 
                  
                  
            } catch (NumberFormatException e) {
                System.out.println("[入力エラー：数値を入力してください]");
            }
    }
}
}