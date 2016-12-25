package cn.codekong.test;

import cn.codekong.md.MDEncrypt;
import cn.codekong.sha.SHAEncrypt;
import cn.codekong.util.MDKind;
import cn.codekong.util.SHAKind;

public class MDTest {
	public static void main(String[] args) {
		/**
		 * MD���㷨ʹ��ʵ��
		 */
		//MD2����
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD2.toString()));
		//MD4����
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD4.toString()));
		//MD5����
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD5.toString()));
		
		/**
		 * SHA���㷨ʹ��ʵ��
		 */
		//SHA1����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA1.toString()));
		//SHA-224����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA224.toString()));
		//SHA-256����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA256.toString()));
		//SHA-512����
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA512.toString()));
	}
}
