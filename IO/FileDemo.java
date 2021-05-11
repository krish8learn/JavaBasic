import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("870886.jpg");
        System.out.println("Absoluteapth: "+f.getAbsolutePath());
        System.out.println("Canonical path: "+f.getCanonicalPath());
        System.out.println("Separator :"+f.separator);
        System.out.println("Last Modified :"+f.lastModified());
        System.out.println("My working directory: "+System.getProperty("user.dir"));
        System.out.println("Creation of New File: "+f.createNewFile());
        System.out.println("Creating directories:"+ new File("testdir\\test").mkdir());
        System.out.println("Deletion: "+ new File("testdir").delete());
        dirfilter(false);
    }
    public static void dirfilter(boolean filter){
        System.out.println("Inside dirFilter");
        File path = new File(".");
        String[] list;
        if(!filter){
            list = path.list();
        }else {
            list = path.list(new DirFilter());
        }

        for (String dirItem : list){
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter{
    public boolean accept(File file, String name){
        return name.endsWith(".jpg");
    }
}
