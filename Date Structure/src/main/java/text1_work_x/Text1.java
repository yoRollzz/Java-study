package text1_work_x;

/**
 * @ClassName Text1
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/21
 **/

public class Text1 {
    public static void main(String[] args) {
        CPU cpu=new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
