package com.dyong.chapter03.method_and_api.level02;

public class RandomMaker {

    public static int randomNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String randomUpperAlpabet(int length){
        String word = "";
        for(int i = 0; i < length; i++){
            char alphabet = (char) (int) (Math.random() * (90-65+1) + 65);
            word += alphabet;
        }
        return word;
    }

    public static String rockPaperScissors(){
        int random1 = (int) (Math.random() * 3 + 1);
        String hand = "";

        if (random1 == 1){
            hand = "가위";
        } else if(random1 == 2){
            hand = "바위";
        } else {
            hand = "보";
        }

        return hand;
    }

    public static String tossCoin(){
        int random1 = (int) (Math.random() * 2 + 1);
        String coin = "";

        if (random1 == 1){
            coin = "앞면";
        } else {
            coin = "뒷면";
        }

        return coin;
    }

}
