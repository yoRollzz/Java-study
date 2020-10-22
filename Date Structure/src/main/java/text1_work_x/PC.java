package text1_work_x;

/**
 * @ClassName PC
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/21
 **/

public class PC {
    public CPU cpu;
    public HardDisk HD;

    public PC() {
    }

//    public PC(CPU cpu, HardDisk HD) {
//        this.cpu = cpu;
//        this.HD = HD;
//    }

    public  void setCPU(CPU c) {
        this.cpu=c;
    }

    public void setHardDisk(HardDisk HD) {
        this.HD = HD;
    }

    public void show(){
        System.out.println("CPU的运行速度："+cpu.getSpeed()+"MHz");
        System.out.println("HD的容量："+HD.getAmount()+"G");
    }
}
