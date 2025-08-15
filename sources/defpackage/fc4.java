package defpackage;

import java.util.HashMap;
import org.apache.http.entity.ContentLengthStrategy;

/* renamed from: fc4  reason: default package */
public final class fc4 implements pn7 {
    public final n64 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f = -1;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final HashMap j;
    public long k;

    public fc4(n64 n64, int i2, int i3, int i4, int i5, boolean z) {
        l("bufferForPlaybackMs", i4, 0, "0");
        l("bufferForPlaybackAfterRebufferMs", i5, 0, "0");
        l("minBufferMs", i2, i4, "bufferForPlaybackMs");
        l("minBufferMs", i2, i5, "bufferForPlaybackAfterRebufferMs");
        l("maxBufferMs", i3, i2, "minBufferMs");
        l("backBufferDurationMs", 0, 0, "0");
        this.a = n64;
        this.b = oaf.S((long) i2);
        this.c = oaf.S((long) i3);
        this.d = oaf.S((long) i4);
        this.e = oaf.S((long) i5);
        this.g = z;
        this.h = oaf.S((long) 0);
        this.i = false;
        this.j = new HashMap();
        this.k = -1;
    }

    public static void l(String str, int i2, int i3, String str2) {
        boolean z = i2 >= i3;
        fm9.e(str + " cannot be less than " + str2, z);
    }

    public final boolean a() {
        return this.i;
    }

    public final void c(j4b j4b) {
        if (this.j.remove(j4b) != null) {
            boolean isEmpty = this.j.isEmpty();
            n64 n64 = this.a;
            if (isEmpty) {
                synchronized (n64) {
                    if (n64.b) {
                        n64.c(0);
                    }
                }
            } else {
                n64.c(m());
            }
        }
        if (this.j.isEmpty()) {
            this.k = -1;
        }
    }

    public final void d(j4b j4b) {
        if (this.j.remove(j4b) != null) {
            boolean isEmpty = this.j.isEmpty();
            n64 n64 = this.a;
            if (isEmpty) {
                synchronized (n64) {
                    if (n64.b) {
                        n64.c(0);
                    }
                }
                return;
            }
            n64.c(m());
        }
    }

    public final long f() {
        return this.h;
    }

    public final void g(j4b j4b) {
        long id = Thread.currentThread().getId();
        long j2 = this.k;
        fm9.j("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j2 == -1 || j2 == id);
        this.k = id;
        HashMap hashMap = this.j;
        if (!hashMap.containsKey(j4b)) {
            hashMap.put(j4b, new Object());
        }
        dc4 dc4 = (dc4) hashMap.get(j4b);
        dc4.getClass();
        int i2 = this.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        dc4.b = i2;
        dc4.a = false;
    }

    public final void h(j4b j4b, vj0[] vj0Arr, n85[] n85Arr) {
        dc4 dc4 = (dc4) this.j.get(j4b);
        dc4.getClass();
        int i2 = this.f;
        if (i2 == -1) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 13107200;
                if (i3 < vj0Arr.length) {
                    if (n85Arr[i3] != null) {
                        switch (vj0Arr[i3].b) {
                            case ContentLengthStrategy.CHUNKED /*-2*/:
                                i5 = 0;
                                break;
                            case 0:
                                i5 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i5 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i5 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i4 += i5;
                    }
                    i3++;
                } else {
                    i2 = Math.max(13107200, i4);
                }
            }
        }
        dc4.b = i2;
        boolean isEmpty = this.j.isEmpty();
        n64 n64 = this.a;
        if (isEmpty) {
            synchronized (n64) {
                if (n64.b) {
                    n64.c(0);
                }
            }
            return;
        }
        n64.c(m());
    }

    public final boolean i(on7 on7) {
        dc4 dc4 = (dc4) this.j.get(on7.a);
        dc4.getClass();
        boolean z = true;
        boolean z2 = this.a.a() >= m();
        float f2 = on7.c;
        int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        long j2 = this.c;
        long j3 = this.b;
        if (i2 > 0) {
            j3 = Math.min(oaf.A(f2, j3), j2);
        }
        long max = Math.max(j3, 500000);
        long j4 = on7.b;
        if (j4 < max) {
            if (!this.g && z2) {
                z = false;
            }
            dc4.a = z;
            if (!z && j4 < 500000) {
                z04.c0("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= j2 || z2) {
            dc4.a = false;
        }
        return dc4.a;
    }

    public final n64 j() {
        return this.a;
    }

    public final boolean k(on7 on7) {
        long E = oaf.E(on7.c, on7.b);
        long j2 = on7.d ? this.e : this.d;
        long j3 = on7.e;
        if (j3 != -9223372036854775807L) {
            j2 = Math.min(j3 / 2, j2);
        }
        return j2 <= 0 || E >= j2 || (!this.g && this.a.a() >= m());
    }

    public final int m() {
        int i2 = 0;
        for (dc4 dc4 : this.j.values()) {
            i2 += dc4.b;
        }
        return i2;
    }
}
