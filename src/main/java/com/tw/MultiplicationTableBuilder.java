package com.tw;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }

    public boolean isStarterNoBiggerthanEnd(int start, int end) {
        return start<=end;
    }

    public boolean isValid(int start, int end) {
        return isInRange(start)&&isInRange(end)&&isStarterNoBiggerthanEnd(start,end);
    }

    public String generateLine(int start,int end){
        //todo Stringbuilder
        //todo format
        StringBuilder testLine=new StringBuilder();
        String line="";
        for(int i=start;i<=end;i++){
            int result=i*end;
            if(i!=end){
                String.format("%d*%d=%d",i,end,result);
                line=line+Integer.toString(i)+'*'+ Integer.toString(end)+'='+ Integer.toString(result)+" ";
            }else{
                line=line+Integer.toString(i)+'*'+ Integer.toString(end)+'='+ Integer.toString(result);
            }
        }
        return line;
    }
}
