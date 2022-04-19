package Chapter10.scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 배분 방식을 선택해주세요. R, L, P");
        int ch= System.in.read();

        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }else if(ch=='L'||ch=='l'){
            scheduler = new LeastJob();
        }else if(ch=='P'|| ch == 'p'){
            scheduler = new Priority();
        }else{
            System.out.println("올바르지 않은 방식입니다. 전화 상담 배분 방식을 다시 한 번 확인해주세요.");
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }

}
