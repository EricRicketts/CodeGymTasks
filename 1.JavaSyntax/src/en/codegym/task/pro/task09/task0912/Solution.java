package en.codegym.task.pro.task09.task0912;

/* 
URL validation
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        url = url.trim();
        if (url.startsWith("http") || url.startsWith("https")) {
            return url.split(":")[0];
        } else {
            return "unknown";
        }
    }

    public static String checkDomainExtension(String url) {
        url = url.trim();
        if (url.endsWith("com") || url.endsWith("net") || url.endsWith("org") || url.endsWith("us")) {
            String[] urlSplitOnDomainExtension = url.split("\\.");
            int splitUrlLength = urlSplitOnDomainExtension.length;
            return urlSplitOnDomainExtension[splitUrlLength - 1];
        } else {
            return "unknown";
        }
    }
}
