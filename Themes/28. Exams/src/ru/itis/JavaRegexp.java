package ru.itis;

import java.awt.print.Pageable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 12.01.2019
 * JavaRegexp
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class JavaRegexp {
    public static void main(String[] args) {
        String logEntryPattern = "^(\\S+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(\\S+) (\\S+) (\\S+)\" (\\d{3}) (\\d+)";
        Pattern pattern = Pattern.compile(logEntryPattern);
        String line = "184.44.109.188 - - [1/May/2015:00:00:00 +0000] \"POST /catalog.phtml HTTP/1.1\" 200 2887";
        Matcher matcher = pattern.matcher(line);

        if (matcher.matches()) {
            String ip = matcher.group(1);
            String dateTime = matcher.group(4);
            String method = matcher.group(5);
            String url = matcher.group(6);
            String protocol = matcher.group(7);
            String status = matcher.group(8);
            String size = matcher.group(9);
            System.out.println(ip + " " + size);
        } else {
            System.out.println("All bad");
        }
    }
}
