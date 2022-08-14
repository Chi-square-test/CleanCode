package com.company.MeaningfulName;

import java.util.ArrayList;
import java.util.List;

public class ClearIntention {

/*

    잘못된 예시

*/
    ArrayList<int[]> theList = new ArrayList<>();

    public List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<>();
        for (int[] x: theList) {
            if(x[0] ==4) list1.add(x);
        }
        return list1;
    }

/*

    옳은 예시
    변수가 무엇을 의미하는지 의미를 밝혀라
    이름만으로 맥락을 파악 할 수 있게 하자

*/

    ArrayList<int[]> gameBoard1 = new ArrayList<>();
    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    public List<int[]> getFlaggedCellsGood(){
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell: gameBoard1) {
            if(cell[STATUS_VALUE] == FLAGGED) flaggedCells.add(cell);
        }
        return flaggedCells;
    }


/*

    조금 더 개선된 예시
    DDD에서도 설명하는 이야기지만 의미가 확실한 클래스는 단순할지라도 클래스로 만드는것이 의미전달에 좋다.
    ex) class Money{int amount}

*/
    static class Cell{
        int[] cells;
        public boolean isFlagged(){
            return cells[STATUS_VALUE] == FLAGGED;
        }
    }

    ArrayList<Cell> gameBoard2 = new ArrayList<>();

    public List<Cell> getFlaggedCellsBetter(){
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell: gameBoard2) {
            if(cell.isFlagged()) flaggedCells.add(cell);
        }
        return flaggedCells;
    }

}
