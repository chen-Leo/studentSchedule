package com.example.demo.Crawler;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 通过网站域名URL获取该网站的源码
 *
 * @author Administrator
 */
public class HtmlRequest {

    public static void main(String[] args) throws Exception {

//        String filePar = "d:\\studentFile";// 文件夹路径
//        File myPath = new File(filePar);
//        if (!myPath.exists()) {//若此目录不存在，则创建之
//            myPath.mkdir();
//        }
//
        int n = 0, m = 0, j = 0, s = 1;
        for (; n <= 4; ) {
            String studentNum = "201821" + n + m + j + s;

//            URL url = new URL("http://jwzx.cqupt.edu.cn/kebiao/kb_stu.php?xh=" + studentNum);
//            String fileName = studentNum + ".text";
//            FileWriter out = new FileWriter(filePar + "\\" + fileName);    这里是读取了源代码并存入了text文件
//            String urlSource = getURLSource(url);
//            out.write(urlSource);
//            out.close();

            System.out.println("this is the " +studentNum);
            String filePath = "D:\\studentFile\\" + studentNum+".text";
            String htmlString = FileUtils.readFile(filePath);
            htmlFilterClassesUtils.htmlFilterClasses(htmlString,studentNum);
            s++;

            if (s == 10) {
                s = 0;
                j++;
            }
            if (j == 10) {
                j = 0;
                m++;
            }
            if (m == 10) {
                m = 0;
                n++;
            }
        }


//        //该方案实现了时间冲突
//        String a = "07,03,08,09,04,17,";
//        String c = "11,12,14,17,07,08,09";
//        int s = a.indexOf(',');
//       System.out.print(c.indexOf(a.substring(0,s)));
    }

    /**
     * 读取网页源代码
     */
    public static String getURLSource(URL url) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(5 * 1000);
        InputStream inStream = conn.getInputStream();
        byte[] data = readInputStream(inStream);
        String htmlSource = new String(data);
        return htmlSource;
    }


    public static byte[] readInputStream(InputStream instream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1204];
        int len = 0;
        while ((len = instream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        instream.close();
        return outStream.toByteArray();
    }


                    }

