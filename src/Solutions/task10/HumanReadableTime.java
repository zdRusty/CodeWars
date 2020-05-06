package Solutions.task10;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = (seconds/60)/60;
        int min = (seconds-hours*60*60)/60;
        int sec = seconds-hours*60*60-min*60;
        return toStr(hours) +":"+ toStr(min) +":"+ toStr(sec);
    }

    private static String toStr(int num){
        if(String.valueOf(num).length()==1) return "0"+num;
        return String.valueOf(num);
    }
}
