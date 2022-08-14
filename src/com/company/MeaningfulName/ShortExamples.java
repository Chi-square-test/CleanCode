package com.company.MeaningfulName;

public class ShortExamples {
/*

    그릇된 정보를 피해야 한다.

    1. 널리 쓰이는 단어를 다른 의미로 사용하면 안된다
    ex) hp 등
    약어는 확실하게 분간이 갈때만 사용하자.

    2. 실제 어떤것이 아닌데 그 단어를 붙이지 말자.
    ex) List가 아닌데 이름 뒤에 List가 붙는다던가

    3. 안비슷한 기능인데 비슷한 이름을 사용하지 말자.
    ex) AControllerForEfficientHandlingDfStrings
        AControllerForEfficientStorageDfStrings

    4. 끔찍한 네이밍을 하지 말자.

    int a = l;
    if( O == l) a = Ol;
    else l - 01;

    으악

*/

/*

    의미있게 구분하라

    연속된 숫자를 덧붙이거나 불용어를 사용하지 마라

    숫자는 의미파악을 힘들게 하고 불용어는 결국 중복되는 단어이다.
    Account와 Accounts와 AccountInfo 이 셋은 무슨 차이인지 파악하기 힘들다.
    MoneyAmount와 Money도 마찬가지이다.

    차이는 확실하게 지어야한다.

*/

    public static void copyCharsBad(char[] a1,char[] a2){
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

    public static void copyCharsGood(char[] source,char[] dest){
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
    }

/*

    변수는 입으로 발음하기 쉽게

    genymdhms -> generationTimestamp

*/

/*

    검색하기 쉽게

    숫자 단독이다 e 단독같이 검색하면 오만가지가 다 나오는것은 쓰면 안된다.
    한 문자를 사용할때는 간단한 메서드에서 로컬 변수정도만...
    변수의 커버리지가 클 수록 이름도 길어지는것이 좋다.

*/

    public void badSearchMethod(){
        int s = 0;
        int[] t = new int[34];
        for (int i = 0; i < 34; i++) {
            s+=(t[i]*4)/5;
        }
    }

    public void goodSearchMethod(){

        final int WORK_DAYS_PER_WEEK = 5;
        final int NUMBER_OF_TASKS = 34;

        int realDaysPerIdealDay = 4;
        int sum = 0;
        int[] taskEstimate = new int[NUMBER_OF_TASKS];

        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            int realTaskDays = taskEstimate[i] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays/WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }

/*

    인코딩 하지 말자
    이름에 String이니 char이니 붙이지 말자.
    언제나 바뀔것을 염두해둬야한다.
    낚일수도 있고.

    물론 인터페이스 구현은 Impl같은걸 붙여도 좋다.

    접두어도 넣지말자.
    m_dsc 이런거
    어차피 안읽힌다.

*/

/*

    사람 기억력 자랑하지 말자.
    반복문 ijk는 괜찮은데(l은 저어얼대 쓰지 말자)
    괴상한 변수 만들지 말자.
    단순히 똑똑한거랑 전문가의 차이점 중 하나는 명료함이다.

    클래스 이름은 명사나 명사구
    ex) Customer , Account 등 동사 없이
    Data, Info 같은 불용어는 상기했듯이 금지

    메서드 이름은 동사나 동사구
    ex)deletePage, savePage

*/

/*

    생성자를 중복정의할때는 정적 팩토리 메서드를 사용하자. (이펙티브 자바)

    기발한 이름은 피하자.
    기발하기만 할뿐....
    ex) kill 대신 whack 라던가
    농담따먹기 금지


*/

/*


    한 개념은 한 단어를 일관성있게 사용하자
    get fetch retrieve 분명 의미가 같은데 다 있으면 매우매우 혼란스럽다.

    아니 그렇다고 개념이라는 범위를 너무 늘리지 말라.
    값을 더하는거랑 값을 추가하는걸 add뜻에 다 맞는다고 add를 붙히면 그건 일관성에 안맞는거다.
    추가하는건 append같이 분히해야한다.
    말장난 ㄴㄴ


*/

/*


    전산용어는 괜찮다
    Queue Stack Observer Controller
    프로그래머라면 알만한 단어는 괜찮다.


*/

/*

    의미 있는 맥락을 추가해야 한다.
    이건 DDD위주 개발에서 자세하게 다룬다.

    그리고 불필요한 네이밍은 하지 말자.
    Parkinson 어플을 만든다 할때 모든 클래스에 PKS를 붙힌다던가...

    다른데도 가져다 쓸걸 생각하자.

*/

}
