package com.som.android.livevideo;

import java.security.GeneralSecurityException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * A PlayActivity variant that plays an encrypted video.
 */
public class VideoActivity2 extends AVideoActivity {

	@Override
	protected Cipher getCipher() throws GeneralSecurityException {
		final Cipher c = Cipher.getInstance("ARC4");	// NoSuchAlgorithmException, NoSuchPaddingException AES ARC4
		c.init(Cipher.DECRYPT_MODE, new SecretKeySpec("1234567890123456".getBytes(), "ARC4"));	// InvalidKeyException
		//0xqo5T9Op9v9+UiUtqkcZA==
		//BrianIsInTheKitchen
		return c;
	}

	@Override
	protected String getPath() {
		// to have a self-contained application, get the media from the assets directory.
		return "asset://cartenc.MP4";
		//return "asset://encrypted.MP4";    //this is working
	}
}
