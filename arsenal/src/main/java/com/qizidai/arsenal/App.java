package com.qizidai.arsenal;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			java.net.ServerSocket serverSocket = new ServerSocket(8080);
			Random random = new Random();
			while(true) {
				java.net.Socket socket = serverSocket.accept();
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println("<!doctype html>");
				pw.println("<html><head>                 <meta http-equiv=Content-Type content=\"text/html;charset=utf-8\"><meta http-equiv=X-UA-Compatible content=\"IE=edge,chrome=1\"></head>");
				pw.println("<body>" + random.nextInt(100) + "</body>");
				pw.println("</html>");
				pw.close();
			}
        } catch (Exception e) {
			e.printStackTrace();
		}
    }
}
