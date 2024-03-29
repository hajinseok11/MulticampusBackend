package Ex03_API_Util;

import java.util.ArrayList;

public class Ex19_BoardExam {
    public static void main(String[] args) {
        ArrayList<BoardDTO> boardList = new ArrayList<>();
        BoardDTO boardList1 = new BoardDTO(1, "안녕하세요", "저는 20살 입니다", "박해민");
        BoardDTO boardList2 = new BoardDTO(2, "안녕하십니까", "저는 야구선수입니다", "홍창기");
        BoardDTO boardList3 = new BoardDTO(3, "반갑습니다", "저는 서울 삽니다", "김현수");

        boardList.add(boardList1);
        boardList.add(boardList2);
        boardList.add(boardList3);
        System.out.println("번호\t제목\t\t내용\t\t\t작성자\t날짜");
        for (BoardDTO boards :boardList ){
            System.out.println(boards.getNum()+"\t"+boards.getTitle()+"\t"+boards.getContent()+"\t"
            +boards.getWriter()+"\t"+boards.getDate());
        }
    }
}
