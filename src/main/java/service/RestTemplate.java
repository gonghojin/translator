package service;

import java.io.UnsupportedEncodingException;

/**
 * Created by jojoldu@gmail.com on 2017. 5. 19.
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

public interface RestTemplate {
    String translate(String text) throws UnsupportedEncodingException;
}
