package com.traindo.common;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;

public class TokenUtil {

	/**
	 * 生成token
	 * @param userId
	 * @param password
	 * @return
	 */
	public static String getToken(String userId,String password) {
		String token = "";
		token = JWT.create().withAudience(userId).sign(Algorithm.HMAC256(password));
		return token;
	}

	/**
	 * 根据token获取用户id
	 * @param token
	 * @return
	 */
	public static String getUserIdByToken(String token) {
		// 获取 token 中的 user id
		String userId = JWT.decode(token).getAudience().get(0);
		return userId;
	}
	/**
	 * 验证token是否有效
	 * @param token
	 * @throws Exception
	 */
	public static void checkToken(String token) throws Exception {
		Algorithm algorithm = Algorithm.HMAC256("secret");
	    JWTVerifier verifier = JWT.require(algorithm)
	        .withIssuer("auth0")
	        .build(); //Reusable verifier instance
	    verifier.verify(token);
	}

}
