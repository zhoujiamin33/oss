package com.example.demo2.adapter;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2023/2/7 16:39
 */
public class caiquanGame {

    public static void main(String[] args) {
        //电脑
        String comName;
        //玩家
        String playName;
        //继续
        String goOn ;
        //游戏次数
        int count = 0;
        //玩家出拳
        int play ;
        //电脑出拳
        int com;
        //玩家分数
        int playResult = 0;
        //电脑分数
        int comResult = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("------------欢 迎 进 入 游 戏 世 界------------");
        System.out.println("\n\t\t\t******************");
        System.out.println("\n\t\t\t**  猜拳，开始 **");
        System.out.println("\n\t\t\t******************");

        System.out.println("");
        Map<Integer,String> rule = new HashMap<>();
        rule.put(1,"剪刀");
        rule.put(2,"石头");
        rule.put(3,"布");
        System.out.println("出拳规则： 1.剪刀 2.石头 3.布");
        System.out.println("");
        Map<Integer,String> role = new HashMap<>();
        role.put(1,"刘备");
        role.put(2,"孙权");
        role.put(3,"曹操");
        System.out.println("请输入玩家一姓名:");
        playName = input.next();
        System.out.print("请选择玩家二角色（1：刘备 2.孙权 3.曹操）：");
        comName = role.get(input.nextInt());
        System.out.print(comName +"\tVS\t" + playName +"\t对战");

        System.out.print("要开始吗?(y/n):");
        goOn = input.next();
        goOn = isCurrent(goOn, input);
        while (goOn.equals("y")){
            System.out.println("玩家一出拳:1.剪刀 2.石头 3.布(输入相应的数字)");
            play = input.nextInt();
            System.out.println("玩家一出:"+rule.get(play));
            com = (int) (Math.random() * 3 + 1);
            System.out.println(com);
            System.out.println("玩家二出:"+rule.get(com));
            count++;
            if(play == com){
                System.out.println("平手哦继续加油！");
            }else if(play == 1 && com ==2){
                System.out.println("玩家二胜！");
                comResult++;
            }else if(play == 1 && com ==3){
                System.out.println("玩家一胜！");
                playResult++;
            }else if(play == 2 && com ==1){
                System.out.println("玩家一胜！");
                playResult++;
            }else if(play == 2 && com ==3){
                System.out.println("玩家二胜！");
                comResult++;
            }else if(play == 3 && com ==1){
                System.out.println("玩家二胜！");
                comResult++;
            }else if(play == 3 && com ==2){
                System.out.println("玩家一胜！");
                playResult++;
            }
            System.out.println("再来一局?(y/n)");
            goOn = input.next();
            goOn = isCurrent(goOn, input);
        }
        System.out.println("----------------------------");
        System.out.println(comName +"\tVS\t" + playName);
        System.out.println("对战次数:" + count);
        System.out.println("姓名" + "\t \t" +"得分");
        System.out.println(comName +"\t \t" + playResult);
        System.out.println(playName +"\t \t" + comResult);
        if(playResult > comResult){
            System.out.println("结果：恭喜恭喜！");
        }else if(comResult == playResult){
            System.out.println("结果：平手，继续加油");
        }else{
            System.out.println("结果：输了，很遗憾！");
        }
    }

    @NotNull
    private static String isCurrent(String goOn, Scanner input) {
        while (!goOn.equals("y") && !goOn.equals("n")){
            System.out.println("输入错误,请重新输入\n"+"要开始吗?(y/n)");
            goOn = input.next();
        }
        return goOn;
    }
}