package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: qm5  reason: default package */
public final class qm5 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Parcelable m;

    public qm5(byte[] bArr, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                s02 s02 = new s02(bArr, bArr.length, 2, (byte) 0);
                s02.q(i2 * 8);
                this.b = s02.i(16);
                this.c = s02.i(16);
                this.d = s02.i(24);
                this.e = s02.i(24);
                int i4 = s02.i(20);
                this.f = i4;
                this.g = g(i4);
                this.h = s02.i(3) + 1;
                int i5 = s02.i(5) + 1;
                this.i = i5;
                this.j = b(i5);
                this.k = s02.k(36);
                this.l = null;
                this.m = null;
                return;
            default:
                s02 s022 = new s02(bArr, bArr.length, 1, (byte) 0);
                s022.q(i2 * 8);
                this.b = s022.i(16);
                this.c = s022.i(16);
                this.d = s022.i(24);
                this.e = s022.i(24);
                int i6 = s022.i(20);
                this.f = i6;
                this.g = f(i6);
                this.h = s022.i(3) + 1;
                int i7 = s022.i(5) + 1;
                this.i = i7;
                this.j = a(i7);
                int i8 = s022.i(4);
                int i9 = s022.i(32);
                int i10 = maf.a;
                this.k = ((((long) i8) & 4294967295L) << 32) | (((long) i9) & 4294967295L);
                this.l = null;
                this.m = null;
                return;
        }
    }

    public static int a(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int f(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        switch (this.a) {
            case 0:
                long j2 = this.k;
                if (j2 == 0) {
                    return -9223372036854775807L;
                }
                return (j2 * 1000000) / ((long) this.f);
            default:
                long j3 = this.k;
                if (j3 == 0) {
                    return -9223372036854775807L;
                }
                return (j3 * 1000000) / ((long) this.f);
        }
    }

    public oy5 d(byte[] bArr, e99 e99) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.e;
        if (i2 <= 0) {
            i2 = -1;
        }
        e99 e992 = (e99) this.m;
        if (e992 != null) {
            if (e99 != null) {
                c99[] c99Arr = e99.a;
                if (c99Arr.length != 0) {
                    int i3 = maf.a;
                    c99[] c99Arr2 = e992.a;
                    Object[] copyOf = Arrays.copyOf(c99Arr2, c99Arr2.length + c99Arr.length);
                    System.arraycopy(c99Arr, 0, copyOf, c99Arr2.length, c99Arr.length);
                    e992 = new e99((c99[]) copyOf);
                }
            }
            e99 = e992;
        }
        my5 my5 = new my5();
        my5.k = "audio/flac";
        my5.l = i2;
        my5.x = this.h;
        my5.y = this.f;
        my5.m = Collections.singletonList(bArr);
        my5.i = e99;
        return new oy5(my5);
    }

    public qy5 e(byte[] bArr, f99 f99) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.e;
        if (i2 <= 0) {
            i2 = -1;
        }
        f99 f992 = (f99) this.m;
        if (f992 != null) {
            f99 = f992.b(f99);
        }
        ny5 ny5 = new ny5();
        ny5.m = ia9.l("audio/flac");
        ny5.n = i2;
        ny5.A = this.h;
        ny5.B = this.f;
        ny5.C = oaf.C(this.i);
        ny5.p = Collections.singletonList(bArr);
        ny5.j = f99;
        return new qy5(ny5);
    }

    public qm5(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, va8 va8, e99 e99) {
        this.a = 0;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = f(i6);
        this.h = i7;
        this.i = i8;
        this.j = a(i8);
        this.k = j2;
        this.l = va8;
        this.m = e99;
    }

    public qm5(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, h7b h7b, f99 f99) {
        this.a = 1;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = g(i6);
        this.h = i7;
        this.i = i8;
        this.j = b(i8);
        this.k = j2;
        this.l = h7b;
        this.m = f99;
    }
}
