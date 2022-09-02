package com.company.Comment;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class ShortExamples {
    /*
    주석 이야기를 해보자.

    기본적이 정보를 주석으로 제공하면 편리하다.
    하지만 함수 이름에 정보를 담을 수 있다면 그리 하는 편이 좋다.
     */
    //설명
//    protected Responder responderInstance() {
//        return null;
//    }
//    //보다는
//    protected Responder responderBeingTested() {
//        return null;
//    }
    //이런식으로 이름에 어떤건지 명시.
    //주석이 들어갈 상황보단 그 상황을 없애게끔 무언가를 더 추가하는것이 좋다.

    /*
    의도를 드러내고자 하는 주석이나 의미를 명료하게 밝히는 주석도 괜찮다.
    하지만 이는 위험하기도 하다. 올바른지 검증하기 쉽지 않기 떄문이다.

    assertTrue(a.compareTo(a) == 0); //a == a
    assertTrue(a.compareTo(b) == 0); //a != a
    assertTrue(a.compareTo(ab) == 0); //ab == ab
    assertTrue(a.compareTo() == -1); //a < b

    더 나은 방법을 생객해보자

     */
    /*
    결과를 경고하는 목적으로도 주석이 사용되곤 한다.

     */
    public static SimpleDateFormat makeStandardHttpDateFormat()
    {
        //SimpleDateFormat은 스레드에 안전하지 못하다.
        //따라서 각 인스턴스를 독립적으로 생성해야 한다.
        SimpleDateFormat df = new SimpleDateFormat("EEE, dd MMM  yyyy HH:mm:ss z");
        df.setTimeZone(TimeZone.getTimeZone("KST"));
        return df;
    }

    /*
    이로서 효율을 높이기 위해 정적 초기화를 도입할려는 실수는 막을 수 있을것이다.

     */
    /*
    TODO 아주 좋은 주석이다
    필요한데 바로 구현이 힘들거나 삭제 알림, 문제 요청, 변수 이름 요청 등 다재다능하게 유용하다.
    그렇다고 이것이 나쁜코드를 남기는 핑계가 되어선 안된다.
     */
    /*
    대수롭지 않게 느껴질 수 있는 무언가의 중요성을 강조할때도 주석을 사용한다.
     */

    /*
    대다수의 주석은 보통 나쁘다. 허술한 코드를 지탱하거나 엉성한 코드를 변명하거나 미숙한 결정을 합리화시킨다.

    괴상한 주석은 바이트를 낭비할 뿐이다. 위치도 내용도 중요하다.

    그리고 제발 실제 코드 내용을 그대로 주석으로 옮기지 말자. 시간만 더 걸리고 의미도 없다.
    죄 설명을 써두지 말자.

    오해의 여지가 있거나 너무 의무적으로 다는 주석은 재고해보자.

    이력을 기록하는 주석은... 지금은 VCS가 있다. 제발 하지 말자.

    너무나 당연한 정보도 적지 말자.
    분풀이도 하지 말자.

    위에서도 몇번 적었지만 함수나 변수로 표현할 수 있다면 주석을 달지 말자.
    //전역 목록 <smodule> 에 속하는 모듈이 우리가 속한 하위 시스템에 의존하는가?
    if (smodule.getDependSubSystem().contains(subSysMod.getSubSystem())
    이러지 말고
    ArrayList moduleDependees = smodule.getDependSubSystem();
    String ourSubSystem = subSysMod.getSubSystem();
    if(moduleDependees.contains(ourSubSystem_;
     */

    /*
    위치를 표현하려는 주석도 있다.
    가급적 쓰지말자. 특히 의미없이 ////////////////////남발은 더더욱
     */
    /*
    닫는 괄호에 닫는 주석도 있는데 보통 잘 캡슐화된 함수라면 의미없는짓이다.
    달고싶으면 함수를 줄이는걸로 대신해보라.

    버전관리시스템은 누가 언제 무엇을 추가했는지 매우 잘 기억한다. 저자 표시좀 하지 말자.

    주석으로 코드를 처리하지 말자.
    버전관리시스템은 신이다. 지웠던거 다 기억한다.
    마음놓고 지워둬라.

    HTML주석은 저어어어얼대 달지 말자.

    전역 정보 역시 좋지 않다. 그리고 주석정보는 자동으로 업데이트가 불가능하다.

    너무 장황한 정보 역시 좋지 않다.

    그리고 주석을 적었으면 코드랑 관련이 있어야 한다. 어정쩡하게 설명 해서 다시 설명이 필요한건 안된다.
     */
}
