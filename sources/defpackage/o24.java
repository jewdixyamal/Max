package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;

/* renamed from: o24  reason: default package */
public final class o24 extends ki0 {
    public a34 X;
    public byte[] Y;
    public int Z;
    public int s0;

    public final long G(a34 a34) {
        d();
        this.X = a34;
        Uri normalizeScheme = a34.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        fm9.e("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = oaf.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.Y = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new ParserException(wg0.i("Error while parsing Base64 encoded string: ", str), e, true, 0);
                }
            } else {
                this.Y = URLDecoder.decode(str, b52.a.name()).getBytes(b52.c);
            }
            byte[] bArr = this.Y;
            long j = a34.f;
            if (j <= ((long) bArr.length)) {
                int i2 = (int) j;
                this.Z = i2;
                int length = bArr.length - i2;
                this.s0 = length;
                long j2 = a34.g;
                int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i3 != 0) {
                    this.s0 = (int) Math.min((long) length, j2);
                }
                f(a34);
                return i3 != 0 ? j2 : (long) this.s0;
            }
            this.Y = null;
            throw new DataSourceException(2008);
        }
        throw new ParserException("Unexpected URI format: " + normalizeScheme, (Exception) null, true, 0);
    }

    public final void close() {
        if (this.Y != null) {
            this.Y = null;
            c();
        }
        this.X = null;
    }

    public final Uri getUri() {
        a34 a34 = this.X;
        if (a34 != null) {
            return a34.a;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.s0;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.Y;
        int i4 = oaf.a;
        System.arraycopy(bArr2, this.Z, bArr, i, min);
        this.Z += min;
        this.s0 -= min;
        b(min);
        return min;
    }
}
