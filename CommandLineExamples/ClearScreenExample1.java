import java.io.IOException; 
import sun.management.VMManagement;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.Method; 
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ClearScreenExample1 {  
    public static void main(String... arg) throws Exception {  
        Process p = null;
        try {
            p = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
            long pid = getCurrentProcessId();
            String str = String.valueOf(pid);
            String fileName = "log.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(str);
            writer.close();
            p.waitFor();
        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (p != null)
                p.destroy(); 
            if (p.isAlive()) {
                p.destroyForcibly();
            }
        }
    }  



	private static int getCurrentProcessId() throws Exception {

		RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
		Field jvm = runtime.getClass().getDeclaredField("jvm");
		jvm.setAccessible(true);

		VMManagement management = (VMManagement) jvm.get(runtime);
		Method method = management.getClass().getDeclaredMethod("getProcessId");
		method.setAccessible(true);

		return (Integer) method.invoke(management);
	}
}  