package cn.codekong.md;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import cn.codekong.util.MDKind;
import cn.codekong.util.Utils;

/**
 * MD������㷨
 * @author szh
 *
 */
public class MDEncrypt {
	
	/**
	 * ��ָ���ַ�������MD2��MD4��MD5���м���
	 * @param src
	 * @param method
	 * @return
	 */
	public static String mdEncrypt(String src, MDKind mdKind){
		String method = mdKind.toString();
		String res = null;
		if(method.equals("MD2") || method.equals("MD5")){
			try {
				MessageDigest md = MessageDigest.getInstance(method);
				byte[] mdBytes = md.digest(src.getBytes());
				res = Utils.bytesToHexString(mdBytes);
			} catch (NoSuchAlgorithmException e) {
			}
		}
		/*else if(method.equals("MD4")){
			Digest digest = new MD4Digest();
			digest.update(src.getBytes(), 0, src.getBytes().length);
			byte[] md4Bytes = new byte[digest.getDigestSize()];
			digest.doFinal(md4Bytes, 0);
			res = org.bouncycastle.util.encoders.Hex.toHexString(md4Bytes);
		}*/
		return res;
	}
}
