package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//在filter下新建一个EncodingFilter用来解决中文字符集乱码，它需要实现Filter接口，并重写doFilter函数


