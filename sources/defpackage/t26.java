package defpackage;

/* renamed from: t26  reason: default package */
public final class t26 {
    public final i63 a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public t26(i63 i63, int i, int i2, float f, long j) {
        boolean z = false;
        boolean z2 = i > 0;
        fm9.e("width must be positive, but is: " + i, z2);
        z = i2 > 0 ? true : z;
        fm9.e("height must be positive, but is: " + i2, z);
        this.a = i63;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = j;
    }
}
