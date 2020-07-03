import java.io.File;

public class rename {
    public static void main(String[] args){
        File folder = new File("/Backup/Armin-Storage/test");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
                File f1 = new File("/Backup/Armin-Storage/test/" + listOfFiles[i].getName());
                
                
                
                String rename = listOfFiles[i].getName();

                int lastDot = rename.lastIndexOf('.');
                String s = rename.substring(0,lastDot) + "_72020" + rename.substring(lastDot);

                System.out.println(s);
                File f2 = new File("/Backup/Armin-Storage/test/" + s);
                f1.renameTo(f2);
                System.out.println("File " + listOfFiles[i].getName());
            } 
            else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}