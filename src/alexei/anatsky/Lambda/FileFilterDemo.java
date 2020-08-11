package alexei.anatsky.Lambda;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileFilterDemo {
    public static void main(String[] args) {
        File directoryLambda = new File("./src/alexei/anatsky/Lambda");
        File directoryMain = new File("src/alexei/anatsky");

        System.out.println("directory = " + directoryLambda);
        System.out.println("directory = " + directoryMain);

        String[] names = directoryLambda.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println("Inside Lambda FileFilter");
                return name.endsWith(".java");
            }
        });
        System.out.println(Arrays.toString(names));

        String[] namesWithMain = directoryMain.list((dir, name) -> {
            System.out.println("Inside Main FileFilter");
            return name.startsWith("Main");
        });
        System.out.println(Arrays.toString(namesWithMain));

    }
}
