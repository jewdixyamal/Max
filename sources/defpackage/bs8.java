package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: bs8  reason: default package */
public final class bs8 extends oc3 {
    public static final rb8 r;
    public final dj0[] k;
    public final lue[] l;
    public final ArrayList m;
    public final mq9 n;
    public int o = -1;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    /* JADX WARNING: type inference failed for: r4v0, types: [ab8, cb8] */
    static {
        za8 za8 = new za8();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        Collections.emptyList();
        ffc ffc2 = ffc.X;
        r = new rb8("MergingMediaSource", new ab8(za8), (kb8) null, new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), fd8.S0);
    }

    public bs8(dj0... dj0Arr) {
        mq9 mq9 = new mq9(9);
        this.k = dj0Arr;
        this.n = mq9;
        this.m = new ArrayList(Arrays.asList(dj0Arr));
        this.l = new lue[dj0Arr.length];
        this.p = new long[0][];
        new HashMap();
        wmd.i(8, "expectedKeys");
        new mg9().c().g();
    }

    public final yd8 a(xj8 xj8, n64 n64, long j) {
        dj0[] dj0Arr = this.k;
        int length = dj0Arr.length;
        yd8[] yd8Arr = new yd8[length];
        lue[] lueArr = this.l;
        int b = lueArr[0].b(xj8.a);
        for (int i = 0; i < length; i++) {
            yd8Arr[i] = dj0Arr[i].a(xj8.b(lueArr[i].m(b)), n64, j - this.p[b][i]);
        }
        return new zr8(this.n, this.p[b], yd8Arr);
    }

    public final rb8 f() {
        dj0[] dj0Arr = this.k;
        return dj0Arr.length > 0 ? dj0Arr[0].f() : r;
    }

    public final void g() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.g();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    public final void i(y0f y0f) {
        this.j = y0f;
        this.i = maf.m((Handler.Callback) null);
        int i = 0;
        while (true) {
            dj0[] dj0Arr = this.k;
            if (i < dj0Arr.length) {
                r(Integer.valueOf(i), dj0Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void k(yd8 yd8) {
        zr8 zr8 = (zr8) yd8;
        int i = 0;
        while (true) {
            dj0[] dj0Arr = this.k;
            if (i < dj0Arr.length) {
                dj0 dj0 = dj0Arr[i];
                yd8 yd82 = zr8.a[i];
                if (yd82 instanceof xr8) {
                    yd82 = ((xr8) yd82).a;
                }
                dj0.k(yd82);
                i++;
            } else {
                return;
            }
        }
    }

    public final void m() {
        super.m();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    public final xj8 p(Object obj, xj8 xj8) {
        if (((Integer) obj).intValue() == 0) {
            return xj8;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.io.IOException, com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException] */
    public final void q(Integer num, dj0 dj0, lue lue) {
        if (this.q == null) {
            if (this.o == -1) {
                this.o = lue.i();
            } else if (lue.i() != this.o) {
                this.q = new IOException();
                return;
            }
            int length = this.p.length;
            lue[] lueArr = this.l;
            if (length == 0) {
                int i = this.o;
                int[] iArr = new int[2];
                iArr[1] = lueArr.length;
                iArr[0] = i;
                this.p = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.m;
            arrayList.remove(dj0);
            lueArr[num.intValue()] = lue;
            if (arrayList.isEmpty()) {
                j(lueArr[0]);
            }
        }
    }
}
