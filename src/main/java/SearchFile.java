import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchFile {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        search(new File("D:\\"), fileList);
        for( File file: fileList){
            System.out.println(file.getAbsolutePath());
        }
    }
    public static void search(File rootFile, List<File> fileList){
        if(rootFile.isDirectory()){ //проверяем является ли корневая папка папкой
            System.out.println("searching at: " + rootFile.getAbsolutePath()); // вывод папки в которой происходит поиск
            File[] derectoryFiles = rootFile.listFiles(); //получаем все файлы внутри папки
            if(derectoryFiles != null){ // если удалось получить эти файлы,то
                for( File file: derectoryFiles){ //для каждого файла проверяем, является ли он тпапкой
                    if(file.isDirectory()){
                        search(file, fileList); //функция вызывает саму себя и передает в список файлы
                    }else { // если файл не является папкой, то проверяем на условие и добавляем в список
                        if(file.getName().toLowerCase().endsWith(".java")){
                            fileList.add(file);
                        }
                    }
                }
            }

        }
    }
}
