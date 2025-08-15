package defpackage;

import android.content.Context;
import android.media.MediaCodec;

/* renamed from: rz3  reason: default package */
public final class rz3 {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public final Object i;
    public Object j;

    public rz3(qld qld, Context context, ag1 ag1, a4c a4c) {
        this.a = qld;
        this.b = context;
        this.d = ag1;
        this.e = a4c;
        this.i = new a8d();
    }

    public rz3(int i2) {
        switch (i2) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                this.j = oaf.a >= 24 ? new h7b(cryptoInfo) : null;
                return;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                this.j = maf.a >= 24 ? new va8(cryptoInfo2) : null;
                return;
        }
    }
}
