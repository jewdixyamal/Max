package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f94  reason: default package */
public final class f94 {
    public final ko7 a;
    public final c8d b;
    public final int[] c;
    public final int d;
    public final r24 e;
    public final long f;
    public final c4b g;
    public final c94[] h;
    public m85 i;
    public h14 j;
    public int k;
    public BehindLiveWindowException l;
    public boolean m;

    public f94(ko7 ko7, h14 h14, c8d c8d, int i2, int[] iArr, m85 m85, int i3, r24 r24, long j2, boolean z, ArrayList arrayList, c4b c4b) {
        ka5 ka5;
        h14 h142 = h14;
        c8d c8d2 = c8d;
        int i4 = i2;
        m85 m852 = m85;
        int i5 = i3;
        c4b c4b2 = c4b;
        this.a = ko7;
        this.j = h142;
        this.b = c8d2;
        this.c = iArr;
        this.i = m852;
        this.d = i5;
        this.e = r24;
        this.k = i4;
        this.f = j2;
        this.g = c4b2;
        long d2 = h142.d(i4);
        ArrayList a2 = a();
        this.h = new c94[m85.length()];
        int i6 = 0;
        while (i6 < this.h.length) {
            khc khc = (khc) a2.get(m852.f(i6));
            lk0 A = c8d2.A(khc.b);
            c94[] c94Arr = this.h;
            lk0 lk0 = A == null ? (lk0) khc.b.get(0) : A;
            oy5 oy5 = khc.a;
            String str = oy5.v0;
            wu0 wu0 = null;
            if (ha9.i(str)) {
                if ("application/x-rawcc".equals(str)) {
                    ka5 = new i5c(oy5);
                    ArrayList arrayList2 = arrayList;
                } else {
                    ArrayList arrayList3 = arrayList;
                    int i7 = i6;
                    c94Arr[i7] = new c94(d2, khc, lk0, wu0, 0, khc.c(), 0);
                    i6 = i7 + 1;
                }
            } else if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                ArrayList arrayList4 = arrayList;
                ka5 = new c28(1);
            } else {
                ka5 = new e26(z ? 4 : 0, (sue) null, arrayList, c4b2);
            }
            wu0 = new wu0(ka5, i5, oy5);
            int i72 = i6;
            c94Arr[i72] = new c94(d2, khc, lk0, wu0, 0, khc.c(), 0);
            i6 = i72 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.c) {
            arrayList.addAll(((t8) list.get(i2)).c);
        }
        return arrayList;
    }

    public final c94 b(int i2) {
        c94[] c94Arr = this.h;
        c94 c94 = c94Arr[i2];
        lk0 A = this.b.A(((khc) c94.e).b);
        if (A == null || A.equals((lk0) c94.f)) {
            return c94;
        }
        c94 c942 = new c94(c94.b, (khc) c94.e, A, (wu0) c94.d, c94.c, (z14) c94.g, 0);
        c94Arr[i2] = c942;
        return c942;
    }
}
