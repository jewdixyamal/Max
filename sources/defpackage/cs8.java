package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: cs8  reason: default package */
public final class cs8 extends pc3 {
    public static final tb8 r;
    public final ej0[] k;
    public final mue[] l;
    public final ArrayList m;
    public final oq9 n;
    public int o = -1;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    static {
        za8 za8 = new za8();
        s74 s74 = new s74();
        Collections.emptyList();
        ffc ffc = ffc.X;
        fb8 fb8 = new fb8();
        lb8 lb8 = lb8.d;
        fm9.k(((Uri) s74.e) == null || ((UUID) s74.d) != null);
        r = new tb8("MergingMediaSource", za8.c(), (ib8) null, fb8.a(), gd8.J, lb8);
    }

    public cs8(ej0... ej0Arr) {
        oq9 oq9 = new oq9(9);
        this.k = ej0Arr;
        this.n = oq9;
        this.m = new ArrayList(Arrays.asList(ej0Arr));
        this.l = new mue[ej0Arr.length];
        this.p = new long[0][];
        new HashMap();
        wmd.i(8, "expectedKeys");
        new mg9().c().g();
    }

    public final boolean a(tb8 tb8) {
        ej0[] ej0Arr = this.k;
        return ej0Arr.length > 0 && ej0Arr[0].a(tb8);
    }

    public final zd8 c(yj8 yj8, n64 n64, long j) {
        ej0[] ej0Arr = this.k;
        int length = ej0Arr.length;
        zd8[] zd8Arr = new zd8[length];
        mue[] mueArr = this.l;
        int b = mueArr[0].b(yj8.a);
        for (int i = 0; i < length; i++) {
            zd8Arr[i] = ej0Arr[i].c(yj8.a(mueArr[i].m(b)), n64, j - this.p[b][i]);
        }
        return new as8(this.n, this.p[b], zd8Arr);
    }

    public final tb8 i() {
        ej0[] ej0Arr = this.k;
        return ej0Arr.length > 0 ? ej0Arr[0].i() : r;
    }

    public final void k() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.k();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    public final void m(z0f z0f) {
        this.j = z0f;
        this.i = oaf.o((Handler.Callback) null);
        int i = 0;
        while (true) {
            ej0[] ej0Arr = this.k;
            if (i < ej0Arr.length) {
                y(Integer.valueOf(i), ej0Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void o(zd8 zd8) {
        as8 as8 = (as8) zd8;
        int i = 0;
        while (true) {
            ej0[] ej0Arr = this.k;
            if (i < ej0Arr.length) {
                ej0 ej0 = ej0Arr[i];
                zd8 zd82 = as8.a[i];
                if (zd82 instanceof ute) {
                    zd82 = ((ute) zd82).a;
                }
                ej0.o(zd82);
                i++;
            } else {
                return;
            }
        }
    }

    public final void q() {
        super.q();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    public final void t(tb8 tb8) {
        this.k[0].t(tb8);
    }

    public final yj8 u(Object obj, yj8 yj8) {
        if (((Integer) obj).intValue() == 0) {
            return yj8;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException, java.io.IOException] */
    public final void x(Object obj, ej0 ej0, mue mue) {
        Integer num = (Integer) obj;
        if (this.q == null) {
            if (this.o == -1) {
                this.o = mue.i();
            } else if (mue.i() != this.o) {
                this.q = new IOException();
                return;
            }
            int length = this.p.length;
            mue[] mueArr = this.l;
            if (length == 0) {
                int i = this.o;
                int[] iArr = new int[2];
                iArr[1] = mueArr.length;
                iArr[0] = i;
                this.p = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.m;
            arrayList.remove(ej0);
            mueArr[num.intValue()] = mue;
            if (arrayList.isEmpty()) {
                n(mueArr[0]);
            }
        }
    }
}
