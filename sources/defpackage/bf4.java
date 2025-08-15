package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bf4  reason: default package */
public final class bf4 extends gz7 {
    public static final zma f = zma.a(new v00(18));
    public static final zma g = zma.a(new v00(20));
    public final ob6 d;
    public final AtomicReference e;

    public bf4(Context context, ob6 ob6) {
        int i = ne4.Z0;
        ne4 ne4 = new ne4(new pe4(context));
        this.d = ob6;
        this.e = new AtomicReference(ne4);
    }

    public static int a(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static int c(oy5 oy5, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(oy5.c)) {
            return 4;
        }
        String f2 = f(str);
        String f3 = f(oy5.c);
        if (f3 == null || f2 == null) {
            return (!z || f3 != null) ? 0 : 1;
        }
        if (f3.startsWith(f2) || f2.startsWith(f3)) {
            return 3;
        }
        int i = maf.a;
        return f3.split("-", 2)[0].equals(f2.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean d(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static void e(SparseArray sparseArray, d0f d0f, int i) {
        if (d0f != null) {
            int g2 = ha9.g(d0f.a.c[0].w0);
            Pair pair = (Pair) sparseArray.get(g2);
            if (pair == null || ((d0f) pair.first).b.isEmpty()) {
                sparseArray.put(g2, Pair.create(d0f, Integer.valueOf(i)));
            }
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair g(int i, ez7 ez7, int[][][] iArr, ue4 ue4, Comparator comparator) {
        Object obj;
        boolean z;
        ez7 ez72 = ez7;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < ez72.a) {
            if (i == ez72.b[i2]) {
                sze sze = ez72.c[i2];
                int i3 = 0;
                while (i3 < sze.a) {
                    qze a = sze.a(i3);
                    ffc i4 = ue4.i(i2, a, iArr[i2][i3]);
                    int i5 = a.a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        we4 we4 = (we4) i4.get(i6);
                        int a2 = we4.a();
                        if (!zArr[i6] && a2 != 0) {
                            if (a2 == 1) {
                                obj = zw6.n(we4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(we4);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    we4 we42 = (we4) i4.get(i7);
                                    if (we42.a() != 2 || !we4.b(we42)) {
                                        z = true;
                                    } else {
                                        arrayList2.add(we42);
                                        z = true;
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    boolean z2 = z;
                                    ez7 ez73 = ez7;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        ez7 ez74 = ez7;
                    }
                    i3++;
                    ez7 ez75 = ez7;
                }
            }
            ue4 ue42 = ue4;
            i2++;
            ez72 = ez7;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((we4) list.get(i8)).c;
        }
        we4 we43 = (we4) list.get(0);
        return Pair.create(new k85(0, we43.b, iArr2), Integer.valueOf(we43.a));
    }

    public final pe4 b() {
        ne4 ne4 = (ne4) this.e.get();
        ne4.getClass();
        return new pe4(ne4);
    }

    public final void h(pe4 pe4) {
        f85 f85;
        ne4 ne4 = new ne4(pe4);
        if (!((ne4) this.e.getAndSet(ne4)).equals(ne4) && (f85 = this.a) != null) {
            f85.s0.c(10);
        }
    }
}
