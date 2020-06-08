package IntroductionJava.BàiTap.Bai4;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    public StopWatch(){
        this.startTime = new Date();
    }
    public void setStartTime(Date time){
        this.startTime = time;
    }
    public void setEndTime(Date time){
        this.endTime = time;
    }
    public Date start(){
        this.startTime = new Date();
        return  this.startTime;
    }
    public Date stop(){
        this.endTime = new Date();
        return  this.endTime;
    }
    public Date getElapsedTime(){
        return endTime;  //sai
    }


}
