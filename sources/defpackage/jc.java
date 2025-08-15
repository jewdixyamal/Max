package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: jc  reason: default package */
public final class jc implements t24 {
    public final t24 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream o;

    public jc(t24 t24, byte[] bArr, byte[] bArr2) {
        this.a = t24;
        this.b = bArr;
        this.c = bArr2;
    }

    public final long G(a34 a34) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                w24 w24 = new w24(this.a, a34);
                this.o = new CipherInputStream(w24, instance);
                w24.m();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void H(z0f z0f) {
        z0f.getClass();
        this.a.H(z0f);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        if (this.o != null) {
            this.o = null;
            this.a.close();
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        this.o.getClass();
        int read = this.o.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
