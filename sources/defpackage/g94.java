package defpackage;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g94  reason: default package */
public final class g94 {
    public final lo7 a;
    public final die b;
    public final int[] c;
    public final int d;
    public final t24 e;
    public final long f;
    public final int g;
    public final d4b h;
    public final c94[] i;
    public n85 j;
    public i14 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public g94(cb4 cb4, lo7 lo7, i14 i14, die die, int i2, int[] iArr, n85 n85, int i3, t24 t24, long j2, int i4, boolean z, ArrayList arrayList, d4b d4b) {
        i14 i142 = i14;
        die die2 = die;
        int i5 = i2;
        n85 n852 = n85;
        this.a = lo7;
        this.k = i142;
        this.b = die2;
        this.c = iArr;
        this.j = n852;
        this.d = i3;
        this.e = t24;
        this.l = i5;
        this.f = j2;
        this.g = i4;
        this.h = d4b;
        long d2 = i142.d(i5);
        ArrayList a2 = a();
        this.i = new c94[n85.length()];
        int i6 = 0;
        while (i6 < this.i.length) {
            lhc lhc = (lhc) a2.get(n852.f(i6));
            mk0 O = die2.O(lhc.b);
            int i7 = i6;
            this.i[i7] = new c94(d2, lhc, O == null ? (mk0) lhc.b.get(0) : O, cb4.b(i3, lhc.a, z, arrayList, d4b), 0, lhc.c(), 1);
            i6 = i7 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.c) {
            arrayList.addAll(((u8) list.get(i2)).c);
        }
        return arrayList;
    }

    public final c94 b(int i2) {
        c94[] c94Arr = this.i;
        c94 c94 = c94Arr[i2];
        mk0 O = this.b.O(((lhc) c94.e).b);
        if (O == null || O.equals((mk0) c94.f)) {
            return c94;
        }
        c94 c942 = new c94(c94.b, (lhc) c94.e, O, (k13) c94.d, c94.c, (a24) c94.g, 1);
        c94Arr[i2] = c942;
        return c942;
    }

    public final void c(n85 n85) {
        this.j = n85;
    }
}
