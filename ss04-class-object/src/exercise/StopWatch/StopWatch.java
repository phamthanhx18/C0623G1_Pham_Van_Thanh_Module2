package exercise.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
    }


    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }


    public int getElapsedTime() {
        int miliSecond = ((getEndTime().getHour() - getStartTime().getHour()) * 3600 + (getEndTime().getMinute() - getStartTime().getMinute()) * 60 + (getEndTime().getSecond() - getStartTime().getSecond()) * 1000);
        return miliSecond;
    }
}
