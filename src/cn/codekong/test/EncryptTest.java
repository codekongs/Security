package cn.codekong.test;

import cn.codekong.mac.MACEncrypt;
import cn.codekong.md.MDEncrypt;
import cn.codekong.sha.SHAEncrypt;
import cn.codekong.util.MACKind;
import cn.codekong.util.MDKind;
import cn.codekong.util.SHAKind;

/**
 * �����㷨������
 * @author szh
 *
 */
public class EncryptTest {
	public static void main(String[] args) {
		/**
		 * MD���㷨ʹ��ʵ��
		 */
		//MD2����
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD2));
		//MD5����
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD5));
		
		/**
		 * SHA���㷨ʹ��ʵ��
		 */
		//SHA1����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA1));
		//SHA-224����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA224));
		//SHA-256����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA256));
		//SHA-384����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA384));
		//SHA-512����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA512));
		
		/**
		 * MAC���㷨����
		 */
		//HmacMD5����
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacMD5));
		//HmacSHA1����
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA1));
		//HmacSHA224����
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA224));
		//HmacSHA256����
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA256));
		//HmacSHA384����
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA384));
		//HmacSHA512����
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA512));
	}
}
