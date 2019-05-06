package util;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RequestLineUtilsTest {
    @Test
    public void 요청URL가져오기() {
        String input = "GET /js/scripts.js HTTP/1.1";
        assertThat(RequestLineUtils.getPath(input)).isEqualTo("/js/scripts.js");
    }
}