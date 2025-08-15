package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: qx7  reason: default package */
public final class qx7 implements s43, kx3, cc3, ypa, b66, iud {
    public static final qx7 X = new qx7(4);
    public static final qx7 Y = new qx7(5);
    public static final qx7 b = new qx7(1);
    public static final /* synthetic */ qx7 c = new qx7(2);
    public static final qx7 o = new qx7(3);
    public final /* synthetic */ int a;

    public /* synthetic */ qx7(int i) {
        this.a = i;
    }

    public static int a(View view) {
        return tu0.G(((float) (x6g.f(view, view.getRootWindowInsets()).a.f(2).d > 0 ? 52 : 60)) * fk4.d().getDisplayMetrics().density);
    }

    public static ArrayList b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(d((gg1) entry.getKey(), (bo1) entry.getValue()));
        }
        return arrayList;
    }

    public static z9f d(gg1 gg1, bo1 bo1) {
        iqe iqe = new iqe(bo1.getName());
        uc0 a2 = oag.a(bo1.getName(), Long.valueOf(gg1.a));
        String q = bo1.q();
        if (q == null) {
            q = "";
        }
        return new z9f(iqe, a2, q, gg1);
    }

    public static vs8 e(fka fka) {
        return new vs8(fka.a().g().a.o, fka.a().k().a.o, false, 3, false, false, 1008);
    }

    public static sn0 h() {
        try {
            xig xig = z04.d;
            fp3.o(xig, "IBitmapDescriptorFactory is not initialized");
            kig kig = (kig) xig;
            Parcel R = kig.R(kig.G0(), 4);
            xr6 K0 = oy9.K0(R.readStrongBinder());
            R.recycle();
            return new sn0(new rxd(K0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static sn0 i(Bitmap bitmap) {
        try {
            xig xig = z04.d;
            fp3.o(xig, "IBitmapDescriptorFactory is not initialized");
            kig kig = (kig) xig;
            Parcel G0 = kig.G0();
            agg.b(G0, bitmap);
            Parcel R = kig.R(G0, 6);
            xr6 K0 = oy9.K0(R.readStrongBinder());
            R.recycle();
            return new sn0(new rxd(K0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        if (r11 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean j(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00f3
            if (r7 != 0) goto L_0x0007
            goto L_0x00f3
        L_0x0007:
            if (r9 < 0) goto L_0x00f3
            if (r10 >= 0) goto L_0x000d
            goto L_0x00f3
        L_0x000d:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto L_0x00f3
            if (r2 == r3) goto L_0x00f3
            if (r1 == r2) goto L_0x001e
            goto L_0x00f3
        L_0x001e:
            r4 = 1
            if (r11 == 0) goto L_0x00a9
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x0030
            if (r11 >= r1) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            if (r9 >= 0) goto L_0x0032
        L_0x0030:
            r1 = r3
            goto L_0x0061
        L_0x0032:
            r11 = r0
        L_0x0033:
            if (r9 != 0) goto L_0x0036
            goto L_0x0061
        L_0x0036:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003f
            if (r11 == 0) goto L_0x003d
            goto L_0x0030
        L_0x003d:
            r1 = r0
            goto L_0x0061
        L_0x003f:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004f
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x004c
            goto L_0x0030
        L_0x004c:
            int r9 = r9 + -1
            goto L_0x0032
        L_0x004f:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0058
            int r9 = r9 + -1
            goto L_0x0033
        L_0x0058:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005f
            goto L_0x0030
        L_0x005f:
            r11 = r4
            goto L_0x0033
        L_0x0061:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x0070
            if (r10 >= r2) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            if (r9 >= 0) goto L_0x0072
        L_0x0070:
            r10 = r3
            goto L_0x00a4
        L_0x0072:
            r11 = r0
        L_0x0073:
            if (r9 != 0) goto L_0x0077
            r10 = r2
            goto L_0x00a4
        L_0x0077:
            if (r2 < r10) goto L_0x007c
            if (r11 == 0) goto L_0x00a4
            goto L_0x0070
        L_0x007c:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008e
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0089
            goto L_0x0070
        L_0x0089:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0072
        L_0x008e:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0099
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0099:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x00a0
            goto L_0x0070
        L_0x00a0:
            int r2 = r2 + 1
            r11 = r4
            goto L_0x0073
        L_0x00a4:
            if (r1 == r3) goto L_0x00f3
            if (r10 != r3) goto L_0x00b7
            goto L_0x00f3
        L_0x00a9:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b7:
            java.lang.Class<c4f> r9 = defpackage.c4f.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            c4f[] r9 = (defpackage.c4f[]) r9
            if (r9 == 0) goto L_0x00f3
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00f3
            int r11 = r9.length
            r2 = r0
        L_0x00c6:
            if (r2 >= r11) goto L_0x00dd
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto L_0x00c6
        L_0x00dd:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            r0 = r4
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx7.j(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static Spannable k(CharSequence charSequence, int i, boolean z, boolean z2, m56 m56) {
        if (!(charSequence instanceof Spannable) || charSequence.length() == 0) {
            return null;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        if (spans.length == 0) {
            return (Spannable) charSequence;
        }
        for (Object obj : spans) {
            if (obj instanceof cmb) {
                cmb cmb = (cmb) obj;
                cmb.b = i;
                cmb.c = z;
            } else if ((obj instanceof URLSpan) && !(obj instanceof gk7)) {
                Spannable spannable = (Spannable) charSequence;
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                try {
                    ((Spannable) charSequence).removeSpan(obj);
                    ((Spannable) charSequence).setSpan(new gk7(((URLSpan) obj).getURL(), i, z, z2), spanStart, spanEnd, 33);
                } catch (Throwable unused) {
                }
            }
            if (m56 != null) {
                m56.invoke(obj);
            }
        }
        return (Spannable) charSequence;
    }

    public static /* synthetic */ Spannable l(CharSequence charSequence, int i, int i2) {
        return k(charSequence, i, (i2 & 4) != 0, false, (m56) null);
    }

    public Object apply(Object obj) {
        return obj;
    }

    public /* bridge */ Object c(rjc rjc) {
        return null;
    }

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(le0.class, Executor.class)));
    }

    public Object g(Uri uri, w24 w24) {
        return Long.valueOf(maf.G(new BufferedReader(new InputStreamReader(w24)).readLine()));
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [df9, java.lang.Object] */
    public gle w(gy8 gy8) {
        int i;
        String str;
        if (!gy8.m()) {
            return null;
        }
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        List list = nz4.a;
        wm3 wm3 = null;
        qzd qzd = null;
        List list2 = list;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -602535288) {
                    if (hashCode != 820478277) {
                        if (hashCode == 951526432 && str.equals("contact")) {
                            try {
                                wm3 = wm3.e(gy8);
                            } catch (Throwable th3) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th3);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 == 0) {
                                    wm3 = null;
                                } else if (s3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th3;
                                }
                            }
                        }
                    } else if (str.equals("startMessage")) {
                        try {
                            qzd = f8.q(gy8);
                        } catch (Throwable th4) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th4);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 == 0) {
                                qzd = null;
                            } else if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th4;
                            }
                        }
                    }
                } else if (str.equals("commands")) {
                    try {
                        list2 = lz7.W(gy8, new Object());
                    } catch (Throwable th5) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th5);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 == 0) {
                            list2 = list;
                        } else if (s5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th5;
                        }
                    }
                }
                try {
                    gy8.z();
                } catch (Throwable th6) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                    Iterator it6 = u7d.a.iterator();
                    while (it6.hasNext()) {
                        ((r4a) it6.next()).getClass();
                        r4a.a(th6);
                    }
                    int s6 = au1.s(k7d.a);
                    if (s6 != 0) {
                        if (s6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th6;
                    }
                }
            }
        }
        return new hq0(list2, wm3, qzd);
    }
}
