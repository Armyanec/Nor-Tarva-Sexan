package com.company.receptner;

public class Plane {

    private String title ;
    private Integer count ;
    private Integer speed;

    private String x = speed.toString();


    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public Integer getCount(){
        return count;
    }

    public  void setCount(Integer count){
        if (count.equals(100)) {
            this.count = count;
        }
    }

    public Integer getSpeed(){

      return speed;

    }

    public  void setSpeed(Integer speed) {
        if (speed < 1500) {
            this.speed = speed;
        }

    }

}
