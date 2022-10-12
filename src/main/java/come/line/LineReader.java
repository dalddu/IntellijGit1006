package come.line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader {
    List<String> readLines(String filename) throws IOException { // List 형태의 String을 return할거임
        List<String> result = new ArrayList<>();

        //fileReader는 에러가 발생할 수 있으므로 에러를 밖으로 던져주게끔 처리한다
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        // 파일을 한줄씩 읽어올거임, null이 아닌동안 계속 루프를 돈다, null이면 루프가 멈춘다
        while ((str = br.readLine()) !=null) {
            result.add(str);
        }
        return result;
    }   // 이렇게 하면 readLine을 이용해서 입력받은 파일명에 있는 것을 String으로 다 리턴할 수 있음


    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\USER\\Desktop\\멋사_백엔드_교본\\김경록강사님 교안 220919\\서울시 병의원 위치 정보.csv";
        LineReader lr = new LineReader();
        List<String> lines = lr.readLines(filename);
        System.out.println(lines.size());
    }
}
