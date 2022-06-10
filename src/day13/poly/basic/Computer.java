package day13.poly.basic;

class  Monitor {}
class LGMonitor extends Monitor{}
class HPMonitor extends Monitor{}


public class Computer {

    Monitor monitor ;

    Computer(){
        this.monitor = new LGMonitor();
    }

    void ChangeToMonitor(){
        this.monitor = new HPMonitor();
    }
}
