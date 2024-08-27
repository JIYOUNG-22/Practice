package com.dyong.servletpractice01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 문자열을 이용해 사용자에게 내보내질 페이지를 작성한다. */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>")
                .append("<head>")
                .append("<title>로그인 페이지</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>사용자명과 비밀번호를 입력해주세요.</h1>")
                .append("<form action=\"login\" method=\"post\">\n" +
                        "    <label>사용자명 : </label><input type=\"text\" name=\"username\">\n" +
                        "    <br>\n" +
                        "    <label>비밀번호 : </label><input type=\"text\" name=\"password\">\n" +
                        "    <br>")
                .append(" <input type=\"submit\" value=\"Login\">")
                .append("</body>")
                .append("</html>");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println(stringBuilder);
        out.flush();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        System.out.println("username: " + username);
//        System.out.println("password: " + password);

        StringBuilder alertText = new StringBuilder();
        if(username.equals("admin") && password.equals("admin")) {
            alertText.append("<html>")
                    .append("<script>alert('로그인에 성공했습니다.');</script>");
        } else {
            alertText.append("<html>")
                    .append("<script>alert('로그인에 실패했습니다.');</script>");
        }

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println(alertText);
        out.flush();
        out.close();

    }
}
