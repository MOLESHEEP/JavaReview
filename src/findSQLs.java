import java.io.*;
import java.util.regex.*;

public class findSQLs {
        // 常见SQL关键字
        private static final String[] SQL_KEYWORDS = {
                "SELECT", "INSERT", "UPDATE", "DELETE", "REPLACE", "ALTER", "DROP", "CREATE"
        };

        // 构建正则表达式，匹配SQL语句
        private static final Pattern SQL_PATTERN = Pattern.compile(
                "\".*\\b(" + String.join("|", SQL_KEYWORDS) + ")\\b.*\"", Pattern.CASE_INSENSITIVE
        );

        public void findSQLmain(String[] args) {
            if (args.length != 1) {
                System.out.println("用法: php SqlUsageFinder <文件路径>");
                return;
            }
            File dir = new File(args[0]);
            if (!dir.isFile()) {
                System.out.println("请输入有效的文件路径！");
                return;
            }
            scanDirectory(dir);
        }

        // 递归遍历目录下所有文件和子目录
        private static void scanDirectory(File dir) {
            File[] files = dir.listFiles();
            if (files == null) return;
            for (File file : files) {
                if (file.isDirectory()) {
                    scanDirectory(file); // 递归子目录
                } else if (file.getName().endsWith(".php")) {
                    scanFile(file); // 只处理.java文件
                }
            }
        }

        // 扫描单个Java文件，查找包含SQL语句的行
        private static void scanFile(File file) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                int lineNumber = 0;
                while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    Matcher matcher = SQL_PATTERN.matcher(line);
                    if (matcher.find()) {
                        System.out.printf("文件: %s, 行号: %d, 内容: %s%n", file.getPath(), lineNumber, line.trim());
                    }
                }
            } catch (IOException e) {
                System.err.println("读取文件出错: " + file.getPath());
            }
        }

}
