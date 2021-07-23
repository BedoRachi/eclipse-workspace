package chapter6;

import java.util.stream.Stream;

public class Exercise6_8 {
	public static void main(String[] args) {
		Stream.of("1", "2", "3", "4", "5", "5")
        .parallel() // 병렬스트림으로 변경
        .filter(x -> {
            System.out.println("filter : " + x);
            return !x.equals("5");
        })
        .mapToInt(x -> {
            System.out.println("map : " + x);
            return Integer.parseInt(x);
        })
        .forEach(x -> {
            System.out.println("forEach : " + x);
        });
	}
}
