package defpackage;

import android.util.Size;

/* renamed from: xb0  reason: default package */
public final class xb0 {
    public final int a;
    public final dee b;
    public final long c;

    public xb0(int i, dee dee, long j) {
        if (i != 0) {
            this.a = i;
            this.b = dee;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null configType");
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    public static xb0 b(int i, int i2, Size size, dc0 dc0) {
        int a2 = a(i2);
        dee dee = dee.NOT_SUPPORT;
        int a3 = msd.a(size);
        if (i == 1) {
            if (a3 <= msd.a((Size) dc0.b.get(Integer.valueOf(i2)))) {
                dee = dee.s720p;
            } else {
                if (a3 <= msd.a((Size) dc0.d.get(Integer.valueOf(i2)))) {
                    dee = dee.s1440p;
                }
            }
        } else if (a3 <= msd.a(dc0.a)) {
            dee = dee.VGA;
        } else if (a3 <= msd.a(dc0.c)) {
            dee = dee.PREVIEW;
        } else if (a3 <= msd.a(dc0.e)) {
            dee = dee.RECORD;
        } else {
            if (a3 <= msd.a((Size) dc0.f.get(Integer.valueOf(i2)))) {
                dee = dee.MAXIMUM;
            } else {
                Size size2 = (Size) dc0.g.get(Integer.valueOf(i2));
                if (size2 != null) {
                    if (a3 <= size2.getHeight() * size2.getWidth()) {
                        dee = dee.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new xb0(a2, dee, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0 = (xb0) obj;
        return au1.c(this.a, xb0.a) && this.b.equals(xb0.b) && this.c == xb0.c;
    }

    public final int hashCode() {
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ ((((au1.s(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return zr6.k(sb, this.c, "}");
    }
}
