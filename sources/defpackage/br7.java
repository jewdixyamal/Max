package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowInsets;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.ServiceConfigurationError;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.tamtam.nano.Protos;

/* renamed from: br7  reason: default package */
public abstract class br7 {
    public static final String[] X = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] Y = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] Z = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static String a;
    public static final String[] b = {"com.sec.android.app.sbrowser"};
    public static final bkb c = new bkb((Object) null, (Object) null, (Object) null);
    public static bkb o;
    public static volatile kl7 s0;

    public static final int A(je7 je7) {
        if (je7.a()) {
            return ((View) je7.getValue()).getMeasuredHeight();
        }
        return 0;
    }

    public static final int B(je7 je7) {
        if (je7.a()) {
            return ((View) je7.getValue()).getMeasuredWidth();
        }
        return 0;
    }

    public static final cc7 C() {
        s9e s9e = s9e.a;
        s9e s9e2 = s9e.a;
        return new by9();
    }

    public static final int D(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final Integer E(View view) {
        Insets f;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (f = rootWindowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
                return null;
            }
            return Integer.valueOf(f.top);
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 != null) {
            return Integer.valueOf(rootWindowInsets2.getStableInsetTop());
        }
        return null;
    }

    public static final void F(ViewStub viewStub, View view, k56 k56) {
        if (!G(viewStub)) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int indexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.height = view.getLayoutParams().height;
            layoutParams.width = view.getLayoutParams().width;
            view.setId(viewStub.getId());
            viewGroup.addView(view, indexOfChild, layoutParams);
            if (k56 != null) {
                k56.invoke();
            }
        }
    }

    public static final boolean G(ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean H(je7 je7) {
        return je7.a() && ((View) je7.getValue()).getVisibility() == 0;
    }

    public static ArrayList I(Object... objArr) {
        int length = objArr.length;
        wmd.i(length, "arraySize");
        ArrayList arrayList = new ArrayList(s5c.Y(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 == -1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tc9 L(java.lang.String r20) {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = defpackage.z04.P(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cd
            ls5 r3 = defpackage.zw6.b
            ffc r3 = defpackage.ffc.X
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L_0x0029:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = defpackage.z04.P(r1, r9)
            if (r9 == 0) goto L_0x0099
            java.lang.String[] r3 = X
            r7 = 0
            r8 = r7
        L_0x0038:
            r9 = 4
            if (r8 >= r9) goto L_0x0098
            r10 = r3[r8]
            java.lang.String r10 = defpackage.z04.x(r1, r10)
            if (r10 == 0) goto L_0x0096
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L_0x0098
            java.lang.String[] r3 = Y
            r8 = r7
        L_0x004c:
            if (r8 >= r9) goto L_0x0063
            r10 = r3[r8]
            java.lang.String r10 = defpackage.z04.x(r1, r10)
            if (r10 == 0) goto L_0x0061
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0061:
            int r8 = r8 + r0
            goto L_0x004c
        L_0x0063:
            r8 = r5
        L_0x0064:
            java.lang.String[] r3 = Z
        L_0x0066:
            r10 = 2
            if (r7 >= r10) goto L_0x0090
            r10 = r3[r7]
            java.lang.String r10 = defpackage.z04.x(r1, r10)
            if (r10 == 0) goto L_0x008e
            long r12 = java.lang.Long.parseLong(r10)
            rc9 r3 = new rc9
            r15 = 0
            r18 = 0
            java.lang.String r17 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r18)
            rc9 r7 = new rc9
            java.lang.String r14 = "video/mp4"
            r11 = r7
            r11.<init>(r12, r14, r15)
            ffc r3 = defpackage.zw6.o(r3, r7)
            goto L_0x0094
        L_0x008e:
            int r7 = r7 + r0
            goto L_0x0066
        L_0x0090:
            ls5 r3 = defpackage.zw6.b
            ffc r3 = defpackage.ffc.X
        L_0x0094:
            r7 = r8
            goto L_0x00ba
        L_0x0096:
            int r8 = r8 + r0
            goto L_0x0038
        L_0x0098:
            return r4
        L_0x0099:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = defpackage.z04.P(r1, r9)
            if (r9 == 0) goto L_0x00aa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            ffc r3 = M(r1, r3, r9)
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = defpackage.z04.P(r1, r9)
            if (r9 == 0) goto L_0x00ba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            ffc r3 = M(r1, r3, r9)
        L_0x00ba:
            boolean r9 = defpackage.z04.L(r1, r2)
            if (r9 == 0) goto L_0x0029
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00c7
            return r4
        L_0x00c7:
            tc9 r0 = new tc9
            r0.<init>(r7, r3)
            return r0
        L_0x00cd:
            java.lang.String r0 = "Couldn't find xmp metadata"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br7.L(java.lang.String):tc9");
    }

    public static ffc M(XmlPullParser xmlPullParser, String str, String str2) {
        ww6 i = zw6.i();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (z04.P(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String x = z04.x(xmlPullParser, concat3);
                String x2 = z04.x(xmlPullParser, concat4);
                String x3 = z04.x(xmlPullParser, concat5);
                String x4 = z04.x(xmlPullParser, concat6);
                if (x == null || x2 == null) {
                    return ffc.X;
                }
                i.a(new rc9(x3 != null ? Long.parseLong(x3) : 0, x, x4 != null ? Long.parseLong(x4) : 0));
            }
        } while (!z04.L(xmlPullParser, concat2));
        return i.j();
    }

    public static final void N(View view, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        Handler handler = view.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            view.post(runnable);
        }
    }

    public static boolean O(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte P(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static float R(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float S(Parcel parcel, int i) {
        int W = W(parcel, i);
        if (W == 0) {
            return null;
        }
        f0(parcel, W);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder T(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + W);
        return readStrongBinder;
    }

    public static int U(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return parcel.readInt();
    }

    public static long V(Parcel parcel, int i) {
        h0(parcel, i, 8);
        return parcel.readLong();
    }

    public static int W(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void X(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + W(parcel, i));
    }

    public static zie Y(int i, fka fka) {
        int s = au1.s(i);
        if (s == 0) {
            bs6 icon = fka.getIcon();
            xoe text = fka.getText();
            return new zie(icon.f, text.e, fka.b().a.m, true);
        } else if (s == 1) {
            bs6 icon2 = fka.getIcon();
            xoe text2 = fka.getText();
            return new zie(icon2.j, text2.g, fka.b().a.g, true);
        } else if (s == 2) {
            return new zie(fka.d().b.a.f, fka.d().c.b.e, fka.d().c.b.e, false);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static AbstractList Z(w56 w56, List list) {
        return list instanceof RandomAccess ? new sm7(w56, list) : new tm7(w56, list);
    }

    public static boolean a0(r1a r1a, f2a f2a, b66 b66) {
        if (!(r1a instanceof kde)) {
            return false;
        }
        try {
            Object obj = ((kde) r1a).get();
            if (obj == null) {
                iz4.a(f2a);
                return true;
            }
            try {
                Object apply = b66.apply(obj);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                r1a r1a2 = (r1a) apply;
                if (r1a2 instanceof kde) {
                    try {
                        Object obj2 = ((kde) r1a2).get();
                        if (obj2 == null) {
                            iz4.a(f2a);
                            return true;
                        }
                        p1a p1a = new p1a(f2a, obj2);
                        f2a.c(p1a);
                        p1a.run();
                    } catch (Throwable th) {
                        c37.B(th);
                        iz4.b(th, f2a);
                        return true;
                    }
                } else {
                    r1a2.a(f2a);
                }
                return true;
            } catch (Throwable th2) {
                c37.B(th2);
                iz4.b(th2, f2a);
                return true;
            }
        } catch (Throwable th3) {
            c37.B(th3);
            iz4.b(th3, f2a);
            return true;
        }
    }

    public static final void b(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static boolean b0(lr1 lr1) {
        if (Looper.myLooper() == null) {
            khe khe = bi4.c;
            if (((ThreadLocal) khe.getValue()) != null) {
                ThreadLocal threadLocal = (ThreadLocal) khe.getValue();
                bi4 bi4 = new bi4(threadLocal);
                Looper looper = bi4.b;
                try {
                    lr1.invoke(bi4);
                    if (tpa.f(looper.getThread(), Thread.currentThread())) {
                        threadLocal.remove();
                        return true;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                } catch (Throwable th) {
                    if (tpa.f(looper.getThread(), Thread.currentThread())) {
                        bi4.a.remove();
                        throw th;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                }
            }
        }
        return false;
    }

    public static final void c0(y5f y5f) {
        y5f.c(b64.class, new it7(27));
        y5f.e(d83.class, new uza(2));
        Class<pi4> cls = pi4.class;
        y5f.c(cls, new it7(28));
        y5f.e(ehb.class, new uza(3));
        y5f.e(ecb.class, new uza(4));
        y5f.e(pb.class, new uza(5));
        y5f.e(fcb.class, new uza(6));
        y5f.c(cls, new it7(29));
        y5f.c(cls, new dcb(0));
    }

    public static final void d(View view, x27 x27, m56 m56) {
        yq0 yq0 = x27.b;
        int i = yq0 != null ? yq0.b : 0;
        int i2 = i == 0 ? -1 : z27.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 == -1 || i2 == 1) {
            new g1e(view, x27, m56);
        } else if (i2 == 2) {
            new hf(view, x27, m56);
        } else if (i2 == 3) {
            new gf(view, x27, 1, m56, 40);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static int d0(Parcel parcel) {
        int readInt = parcel.readInt();
        int W = W(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 == 20293) {
            int i = W + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new SafeParcelReader$ParseException(parcel, rh4.h("Size read is invalid start=", dataPosition, i, " end="));
        }
        throw new SafeParcelReader$ParseException(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))));
    }

    public static void e(View view) {
        d(view, new x27(3, (yq0) null, 2), (m56) null);
    }

    public static byte e0(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qpd, us] */
    public static final us f(kpa... kpaArr) {
        ? qpd = new qpd(kpaArr.length);
        for (kpa kpa : kpaArr) {
            qpd.put(kpa.a, kpa.b);
        }
        return qpd;
    }

    public static void f0(Parcel parcel, int i) {
        if (i != 4) {
            String hexString = Integer.toHexString(i);
            throw new SafeParcelReader$ParseException(parcel, "Expected size 4 got " + i + " (0x" + hexString + ")");
        }
    }

    public static void g(yde yde, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                byte[] bArr = objArr[i];
                i++;
                if (bArr == null) {
                    yde.W(i);
                } else if (bArr instanceof byte[]) {
                    yde.k(i, bArr);
                } else if (bArr instanceof Float) {
                    yde.h(i, (double) ((Number) bArr).floatValue());
                } else if (bArr instanceof Double) {
                    yde.h(i, ((Number) bArr).doubleValue());
                } else if (bArr instanceof Long) {
                    yde.j(i, ((Number) bArr).longValue());
                } else if (bArr instanceof Integer) {
                    yde.j(i, (long) ((Number) bArr).intValue());
                } else if (bArr instanceof Short) {
                    yde.j(i, (long) ((Number) bArr).shortValue());
                } else if (bArr instanceof Byte) {
                    yde.j(i, (long) ((Number) bArr).byteValue());
                } else if (bArr instanceof String) {
                    yde.f(i, (String) bArr);
                } else if (bArr instanceof Boolean) {
                    yde.j(i, ((Boolean) bArr).booleanValue() ? 1 : 0);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + bArr + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    public static Boolean g0(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static String h(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte valueOf : bArr) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return sb.toString();
    }

    public static void h0(Parcel parcel, int i, int i2) {
        int W = W(parcel, i);
        if (W != i2) {
            throw new SafeParcelReader$ParseException(parcel, zr6.l(wg0.j("Expected size ", i2, " got ", W, " (0x"), Integer.toHexString(W), ")"));
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static tt3 j(g52 g52) {
        switch (g52.ordinal()) {
            case 0:
                return new tt3(p8a.x, (jqe) new eqe(yoc.j), Integer.valueOf(woc.c), Integer.valueOf(wfa.Q), 4);
            case 1:
                return new tt3(p8a.L, (jqe) new eqe(yoc.w), Integer.valueOf(woc.c), Integer.valueOf(wfa.Q), 4);
            case 2:
                return new tt3(p8a.w, (jqe) new eqe(yoc.t), Integer.valueOf(woc.E1), Integer.valueOf(wfa.Q), 4);
            case 3:
                return new tt3(p8a.K, (jqe) new eqe(yoc.u), Integer.valueOf(woc.C1), Integer.valueOf(wfa.Q), 4);
            case 4:
                return new tt3(p8a.H, (jqe) new eqe(yoc.s), Integer.valueOf(woc.m1), Integer.valueOf(wfa.Q), 4);
            case 5:
                return new tt3(p8a.G, (jqe) new eqe(yoc.r), Integer.valueOf(woc.m1), Integer.valueOf(wfa.Q), 4);
            case 6:
                return new tt3(p8a.J, (jqe) new eqe(yoc.v), Integer.valueOf(woc.v1), Integer.valueOf(wfa.Q), 4);
            case 7:
                return new tt3(p8a.P, (jqe) new eqe(yoc.C), Integer.valueOf(woc.w1), Integer.valueOf(wfa.Q), 4);
            case 8:
                return new tt3(p8a.F, (jqe) new eqe(yoc.q), Integer.valueOf(wfa.U), Integer.valueOf(woc.B), Integer.valueOf(wfa.P));
            case 9:
                return new tt3(p8a.F, (jqe) new eqe(yoc.p), Integer.valueOf(wfa.U), Integer.valueOf(woc.B), Integer.valueOf(wfa.P));
            case 10:
                return new tt3(p8a.F, (jqe) new eqe(yoc.D), Integer.valueOf(wfa.U), Integer.valueOf(woc.B), Integer.valueOf(wfa.P));
            case 11:
                return new tt3(p8a.D, (jqe) new eqe(yoc.n), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case Protos.Attaches.Attach.PRESENT /*12*/:
            case 13:
                return new tt3(p8a.E, (jqe) new eqe(yoc.o), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new tt3(p8a.y, (jqe) new eqe(yoc.k), Integer.valueOf(wfa.U), Integer.valueOf(woc.S), Integer.valueOf(wfa.P));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new tt3(p8a.M, (jqe) new eqe(yoc.y), Integer.valueOf(woc.l), Integer.valueOf(wfa.Q), 4);
            case 16:
                return new tt3(xoc.a, (jqe) new eqe(yoc.x), Integer.valueOf(woc.N0), Integer.valueOf(wfa.Q), 4);
            case LangUtils.HASH_SEED /*17*/:
                return new tt3(p8a.z, (jqe) new eqe(yoc.l), Integer.valueOf(woc.C0), Integer.valueOf(wfa.Q), 4);
            case 18:
                return new tt3(p8a.O, (jqe) new eqe(yoc.B), Integer.valueOf(wfa.U), Integer.valueOf(woc.p1), Integer.valueOf(wfa.P));
            case 19:
                return new tt3(p8a.N, (jqe) new eqe(yoc.A), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 20:
                return new tt3(p8a.A, (jqe) new eqe(yoc.m), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static long[] k(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static void l(x55 x55, OutputStream outputStream, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = x55.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static void m(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static Bundle n(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + W);
        return readBundle;
    }

    public static Parcelable o(Parcel parcel, int i, Parcelable.Creator creator) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + W);
        return parcelable;
    }

    public static String p(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + W);
        return readString;
    }

    public static Object[] q(Parcel parcel, int i, Parcelable.Creator creator) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + W);
        return createTypedArray;
    }

    public static ArrayList r(Parcel parcel, int i, Parcelable.Creator creator) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + W);
        return createTypedArrayList;
    }

    public static void s(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(parcel, zr6.h(i, "Overread allowed size end="));
        }
    }

    public static final View t(View view, int i) {
        if (view.getId() == i) {
            return view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getId() == i) {
                    return view2;
                }
            }
        }
        return null;
    }

    public static final zye u(String str) {
        kl7 kl7 = s0;
        if (kl7 == null) {
            kl7 l = j1e.l();
            try {
                for (Object add : Arrays.asList(new zye[]{new mye()})) {
                    l.add(add);
                }
                s0 = l;
                kl7 = j1e.d(l);
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
        if (kl7.getSize() > 1) {
            throw new IllegalStateException("More then one manifest found: ".concat(x53.n0(kl7, (String) null, (String) null, (String) null, n71.y0, 31)).toString());
        } else if (kl7.getSize() != 1) {
            return null;
        } else {
            zye zye = (zye) kl7.get(0);
            if (tpa.f(zye.a(), str)) {
                return zye;
            }
            throw new IllegalStateException(("Unexpected " + zye.getClass().getName() + ".applicationId()").toString());
        }
    }

    public static final Integer v(View view) {
        Insets e;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (e = rootWindowInsets.getInsets(8)) == null) {
                return null;
            }
            return Integer.valueOf(e.bottom);
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 != null) {
            return Integer.valueOf(rootWindowInsets2.getSystemWindowInsetBottom());
        }
        return null;
    }

    public static final Integer x(View view) {
        Insets f;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (f = rootWindowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
                return null;
            }
            return Integer.valueOf(f.bottom);
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 != null) {
            return Integer.valueOf(rootWindowInsets2.getStableInsetBottom());
        }
        return null;
    }

    public static final View z(je7 je7) {
        if (H(je7)) {
            return (View) je7.getValue();
        }
        return null;
    }

    public abstract View J(int i);

    public abstract boolean K();
}
