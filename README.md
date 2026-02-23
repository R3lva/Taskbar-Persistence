# Taskbar-Persistence
This method replace the LNK taskbar to get persistence in the windows system
![SpainFlagOfSpainGIF](https://github.com/user-attachments/assets/bee168a3-f643-4f35-8c17-4f76e0e130ca)
Con este método podemos lograr persistencia cuando el usuario interactúa con la barra de tareas. Básicamente, el método reemplaza los archivos LNK de la barra de tareas por el ejecutable que se desee.

Todo esto ocurre en la ruta \AppData\Roaming\Microsoft\Internet Explorer\Quick Launch\User Pinned\TaskBar. Al ser reemplazado con el mismo nombre, Windows continúa utilizando la misma entrada del registro, pero apuntando a otra dirección.

Esto provoca que en la barra de tareas todo se vea igual (mismo icono y mismas propiedades), pero con una ruta de ejecución diferente. De esta forma, es posible ejecutar código malicioso para obtener persistencia, haciéndolo pasar por otra aplicación del sistema operativo.
![UsaNavyGIF](https://github.com/user-attachments/assets/58d90992-aacf-4950-9ac9-04ab5e42e5fc)

With this method, persistence can be achieved when the user interacts with the taskbar. Essentially, the technique replaces the taskbar LNK files with any executable of your choice.

This occurs in the following path:
\AppData\Roaming\Microsoft\Internet Explorer\Quick Launch\User Pinned\TaskBar.
When the file is replaced using the same name, Windows continues using the same registry entry, but it now points to a different location.

As a result, the taskbar appears unchanged (same icon and properties), but the execution path is different. This allows malicious executable code to run and maintain persistence while appearing to be another operating system application.
