package park.mycommunitysite.config.jwt;

/**
 * Json web token 설정값
 */
public interface JwtProperties {
    String tokenSubject  = "parkToken";
    String SECRET = "parkCommunity"; // 우리 서버만 알고있는 비밀값
    int EXPIRATION_TIME = 60000*180; // 180분
    String TOKEN_PREFIX = "BEARER ";
    String HEADER_STRING = "Authorization";
}
