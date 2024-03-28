package Ex03_API_Util;

import Ex01_API_Lang.Person;

public class Ex09_RefArrayTest {
    public static void main(String[] args) {
        // Person을 참조하는 참조변수들을 배열로 관리
        // 배열의 모든 요소에는 Person을 참조하는 주소값이 저장됨
        Person[] personlist = new Person[5];
        System.out.println(personlist[0]);
        personlist[0] = new Person("제이홉","광주",30);
        personlist[1] = new Person("뷔","서울",28);
        personlist[2] = new Person("슈가","용인",29);
        personlist[3] = new Person("지민","수원",24);
        personlist[4] = new Person("RM","성남",33);
        // 나머지 Person객체를 할당
        /* [출력행태]
         * 제이홉 - 광주
         * ''''
         * ''''
         * ''''
         */
        printPerson(personlist);
    }
        // Person[]의 정보를 출력하는 print메소드를 정의하고 구현
        private static void printPerson(Person[] personlist) {
            for(int i = 0; i<personlist.length; i++){
                // personlist[i]가 Person을 참조하는 변수이므로
                // Person p = new Person(...)
                // personlist[i]가 p변수와 같은 개념
                System.out.println(personlist[i].getName()+"-----"+personlist[i].getAddr());
            }
            System.out.println("---------------------------");
            for(Person p:personlist){
                System.out.println(p.getName()+"-----"+p.getAddr());
            }
        }
    }
