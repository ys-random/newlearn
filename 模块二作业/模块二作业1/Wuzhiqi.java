package com.lagou.zuoye01;

import java.util.Scanner;

public class Wuzhiqi {
    public static String qipan [] [];
    int size=17;//棋盘大小
    public static final String Heiqi="○";
    public static final String Baiqi="△";
    //棋盘初始化
    public  Wuzhiqi(){
        Qipanchushihua();
    }
    private void Qipanchushihua() {

        qipan = new String[size][size];//创建棋盘规格
        for (int i = 0; i < qipan.length; i++) {//棋盘样式初始化
            for (int j = 0; j < qipan[i].length; j++) {
                if(i == 0&&j == 0){
                    qipan[i][j]=" ";
                }
                else if (i == 0&&j>0) {
                    qipan[i][j] = Integer.toHexString(j-1);
                } else if (j == 0&&i>0) {
                    qipan[i][j] = Integer.toHexString(i-1);
                } else { qipan[i][j] = "+";
                  }
            }
        }
    }

    public void Begin() {
         int people =1;
        while(isgamecontinue()) {//判断下棋是否继续,每下一次棋，对整个棋盘判断一次。遍历每个棋子。
            print();
            if(people>0) {
                System.out.println("------------------请圆圈下棋:");
                if(!Xiaqi(Heiqi)) {//下棋失败
                    continue;//继续让黑方下棋
                }
            }else {
                System.out.println("------------------请三角下棋:");
                if(!Xiaqi(Baiqi)) {//下棋失败
                    continue;//同上
                }
            }
            people=-people;//黑白方轮换
        }
    }
    private boolean Xiaqi(String Qizi) {

        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------请输入x:");
        int x=sc.nextInt();
        System.out.println("-----------------请输入y:");
        int y=sc.nextInt();
        // x和y的范围
        if(x<1 || x>size || y<1 || y> size) {
            System.out.println("错误输入，请重新输入！");
            return false;
        }
        if(!qipan[x][y].equals("+")) {
            System.out.println("已存在棋子，请重新落子！");
            return false;
        }
        qipan[x][y]=Qizi;
        return true;
    }
    private boolean isgamecontinue() {//以最左边的棋子为起点判断，向右，向下，向右上，向右下
        // TODO Auto-generated method stub
        int count=0;
        for(int i=1;i<qipan.length;i++) {
            for(int j=1;j<qipan[i].length;j++) {
                if(!qipan[i][j].equals("+")) {//判断五子连珠
                    count++;
                    if(j<=16) {//向右判断
                        boolean flag=true;//默认n子连珠
                        for(int y=1;y<=4;y++) {
                            if(!qipan[i][j].equals(qipan[i][j+y])) {
                                flag=false;
                                break;
                            }
                        }
                        if(flag) {//五子连珠，游戏结束。
                            print();//打印结果
                            if(qipan[i][j].equals(Heiqi)) {
                                System.out.println("----------圆圈获胜");
                            }else {
                                System.out.println("----------三角获胜");
                            }
                            return !flag;
                        }
                    }
                    if(i<=16) {//向下判断
                        boolean flag=true;//默认n子连珠
                        for(int x=1;x<=4;x++) {
                            if(!qipan[i][j].equals(qipan[x+i][j])) {
                                flag=false;
                                break;
                            }
                        }
                        if(flag) {//五子连珠，游戏结束。
                            print();//打印结果
                            if(qipan[i][j].equals(Heiqi)) {
                                System.out.println("----------圆圈获胜");
                            }else {
                                System.out.println("----------三角获胜");
                            }
                            return !flag;

                        }
                    }
                    if(i<=16&&j<=16) {//向右下判断
                        boolean flag=true;
                        for(int x=1,y=1;x<=4&&y<=4;x++,y++) {
                            if(!qipan[i][j].equals(qipan[i+x][j+y])) {
                                flag=false;
                                break;
                            }
                        }
                        if(flag) {
                            print();//打印结果
                            if(qipan[i][j].equals(Heiqi)) {
                                System.out.println("----------圆圈获胜");
                            }else {
                                System.out.println("----------三角获胜");
                            }
                            return !flag;
                        }
                    }
                    if(j<=16&&i>=16) {//向右上判断
                        boolean flag=true;
                        for(int x=1,y=1;x<=4&&y<=4;x++,y++) {
                            if(!qipan[i][j].equals(qipan[x+i][y+j])) {
                                flag=false;
                                break;
                            }
                        }
                        if(flag) {
                            print();//打印结果
                            if(qipan[i][j].equals(Heiqi)) {
                                System.out.println("----------圆圈获胜");
                            }else {
                                System.out.println("----------三角获胜");
                            }
                            return !flag;
                        }
                    }
                }
                if(count==Math.pow(16, 2)) {
                    print();
                    System.out.println("----------和棋");
                    return false;
                }
            }
        }
        return true;//
    }

    private void print() {
        for (String[] row : qipan) {
            for (String col : row) {
                System.out.print(col+" ");
            }
            System.out.print("\n");
        }
    }

}
