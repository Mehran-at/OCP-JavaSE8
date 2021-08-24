package advancedClassDesign._7seven;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolver {

    void printPath() throws IOException {
//    void printPath() {
        Path path1 = Paths.get("/bat/night", "../.").resolve(Paths.get("./sleep.txt")).normalize();
        Path path2 = new File("../sleep.txt").toPath().toRealPath();
        System.out.println(Files.isSameFile(path1, path2));
        System.out.println(" " + path1.equals(path2));
    }
}