package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ay7  reason: default package */
public abstract class ay7 {
    public static final int[] A = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] B = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] C = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final String[] D = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] E = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] F = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static volatile Handler a;
    public static SimpleDateFormat b;
    public static final Object c = new Object();
    public static SimpleDateFormat d;
    public static final Object e = new Object();
    public static SimpleDateFormat f;
    public static final Object g = new Object();
    public static SimpleDateFormat h;
    public static final Object i = new Object();
    public static SimpleDateFormat j;
    public static final Object k = new Object();
    public static SimpleDateFormat l;
    public static final Object m = new Object();
    public static SimpleDateFormat n;
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static SimpleDateFormat q;
    public static SimpleDateFormat r;
    public static Boolean s;
    public static final Object t = new Object();
    public static SimpleDateFormat u;
    public static final Object v = new Object();
    public static final String[] w = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] x = {44100, 48000, 32000};
    public static final int[] y = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] z = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    public static boolean A(n34 n34, n34 n342) {
        return n34.c.equals(n342.c) && n34.b.equals(n342.b) && n34.a.equals(n342.a);
    }

    public static final int B(Context context) {
        return Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 == -1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tc9 C(java.lang.String r20) {
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
            boolean r3 = defpackage.a14.D(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cd
            ls5 r3 = defpackage.zw6.b
            ffc r3 = defpackage.ffc.X
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L_0x0029:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = defpackage.a14.D(r1, r9)
            if (r9 == 0) goto L_0x0099
            java.lang.String[] r3 = D
            r7 = 0
            r8 = r7
        L_0x0038:
            r9 = 4
            if (r8 >= r9) goto L_0x0098
            r10 = r3[r8]
            java.lang.String r10 = defpackage.a14.v(r1, r10)
            if (r10 == 0) goto L_0x0096
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L_0x0098
            java.lang.String[] r3 = E
            r8 = r7
        L_0x004c:
            if (r8 >= r9) goto L_0x0063
            r10 = r3[r8]
            java.lang.String r10 = defpackage.a14.v(r1, r10)
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
            java.lang.String[] r3 = F
        L_0x0066:
            r10 = 2
            if (r7 >= r10) goto L_0x0090
            r10 = r3[r7]
            java.lang.String r10 = defpackage.a14.v(r1, r10)
            if (r10 == 0) goto L_0x008e
            long r12 = java.lang.Long.parseLong(r10)
            sc9 r3 = new sc9
            r15 = 0
            r18 = 0
            java.lang.String r17 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r18)
            sc9 r7 = new sc9
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
            boolean r9 = defpackage.a14.D(r1, r9)
            if (r9 == 0) goto L_0x00aa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            ffc r3 = D(r1, r3, r9)
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = defpackage.a14.D(r1, r9)
            if (r9 == 0) goto L_0x00ba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            ffc r3 = D(r1, r3, r9)
        L_0x00ba:
            boolean r9 = defpackage.a14.B(r1, r2)
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
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay7.C(java.lang.String):tc9");
    }

    public static ffc D(XmlPullParser xmlPullParser, String str, String str2) {
        ww6 i2 = zw6.i();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (a14.D(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String v2 = a14.v(xmlPullParser, concat3);
                String v3 = a14.v(xmlPullParser, concat4);
                String v4 = a14.v(xmlPullParser, concat5);
                String v5 = a14.v(xmlPullParser, concat6);
                if (v2 == null || v3 == null) {
                    return ffc.X;
                }
                i2.a(new sc9(v4 != null ? Long.parseLong(v4) : 0, v2, v5 != null ? Long.parseLong(v5) : 0));
            }
        } while (!a14.B(xmlPullParser, concat2));
        return i2.j();
    }

    public static int E(int i2) {
        int i3;
        int i4;
        if (!((i2 & -2097152) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 == 1) {
            return i3 == 3 ? 1152 : 576;
        }
        if (i4 == 2) {
            return 1152;
        }
        if (i4 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static final Activity F(znc znc) {
        Activity d2 = znc.d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final Uri G(Uri uri, tb8 tb8) {
        String str;
        Uri.Builder buildUpon = uri.buildUpon();
        ub8.a.getClass();
        Integer num = tb8.d.H;
        if (num == null || (str = num.toString()) == null) {
            str = String.valueOf(0);
        }
        return buildUpon.appendQueryParameter("MediaItemType", str).build();
    }

    public static up7 H(zp7 zp7) {
        int i2;
        zp7 zp72 = zp7;
        int s2 = au1.s(zp72.w0);
        int i3 = 0;
        if (s2 != 0) {
            i2 = 1;
            if (!(s2 == 1 || s2 == 2)) {
                i2 = 3;
                if (s2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i2 = 0;
        }
        String uri = zp72.b.toString();
        Integer num = zp72.Y;
        if (num != null) {
            i3 = num.intValue();
        }
        int i4 = i3;
        Long l2 = zp72.Z;
        long longValue = l2 != null ? l2.longValue() : 0;
        return new up7(i2, zp72.a, uri, zp72.v0.toString(), i4, longValue, zp72.c, zp72.X, zp72.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = android.net.Uri.parse(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.zp7 I(defpackage.up7 r18) {
        /*
            r0 = r18
            java.lang.String r1 = r0.c
            java.lang.String r2 = r0.o
            if (r2 == 0) goto L_0x0012
            android.net.Uri r2 = android.net.Uri.parse(r2)
            if (r2 != 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r17 = r2
            goto L_0x0017
        L_0x0012:
            android.net.Uri r2 = android.net.Uri.parse(r1)
            goto L_0x000f
        L_0x0017:
            zp7 r2 = new zp7
            if (r1 == 0) goto L_0x0024
            android.net.Uri r3 = android.net.Uri.parse(r1)
            if (r3 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = r3
            goto L_0x0026
        L_0x0024:
            r6 = r17
        L_0x0026:
            java.lang.String r3 = r0.Z
            if (r3 != 0) goto L_0x00b2
            r3 = 2
            if (r1 != 0) goto L_0x002f
            goto L_0x00ac
        L_0x002f:
            java.lang.String r4 = "."
            r5 = 6
            int r4 = defpackage.w9e.F0(r4, r1, r5)
            r5 = -1
            if (r4 != r5) goto L_0x003b
            goto L_0x00ac
        L_0x003b:
            int r5 = r1.length()     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.substring(r4, r5)     // Catch:{ all -> 0x00ac }
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.toLowerCase(r4)     // Catch:{ all -> 0x00ac }
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r4.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L_0x00ac
            int r4 = r1.length()
            if (r4 != 0) goto L_0x005c
            goto L_0x00ac
        L_0x005c:
            r4 = 11
            int[] r4 = defpackage.au1.v(r4)
            int r5 = r4.length
            r7 = 0
            r8 = r7
        L_0x0065:
            if (r8 >= r5) goto L_0x0077
            r9 = r4[r8]
            java.lang.String r10 = defpackage.ey8.f(r9)
            boolean r10 = r10.equalsIgnoreCase(r1)
            if (r10 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            int r8 = r8 + 1
            goto L_0x0065
        L_0x0077:
            r9 = r7
        L_0x0078:
            r1 = 1
            if (r9 != 0) goto L_0x007c
            r9 = r1
        L_0x007c:
            java.lang.String r4 = defpackage.ey8.f(r9)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0087
            goto L_0x0098
        L_0x0087:
            java.lang.String r5 = "image/"
            boolean r5 = defpackage.eae.o0(r4, r5, r1)
            if (r5 == 0) goto L_0x0098
            java.lang.String r5 = "djvu"
            boolean r5 = defpackage.w9e.p0(r4, r5, r1)
            if (r5 != 0) goto L_0x0098
            goto L_0x00a7
        L_0x0098:
            int r5 = r4.length()
            if (r5 != 0) goto L_0x009f
            goto L_0x00a8
        L_0x009f:
            java.lang.String r5 = "video/"
            boolean r1 = defpackage.eae.o0(r4, r5, r1)
            if (r1 == 0) goto L_0x00a8
        L_0x00a7:
            r7 = r9
        L_0x00a8:
            if (r7 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r3 = r7
        L_0x00ac:
            java.lang.String r1 = defpackage.ey8.f(r3)
            r7 = r1
            goto L_0x00b3
        L_0x00b2:
            r7 = r3
        L_0x00b3:
            int r1 = r0.X
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            long r3 = r0.Y
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            long r9 = r0.s0
            r13 = 0
            long r4 = r0.b
            r8 = -1
            r14 = 0
            r15 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9, r11, r12, r13, r14, r15, r17)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay7.I(up7):zp7");
    }

    public static final String J(Bitmap bitmap) {
        String h2 = zr6.h(System.identityHashCode(bitmap), "@");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String str = bitmap.isRecycled() ? "|recycled" : "";
        int generationId = bitmap.getGenerationId();
        return "Bitmap" + h2 + "(" + width + "x" + height + str + "|genId=" + generationId + ")";
    }

    public static final void K(y5f y5f) {
        y5f.c(b64.class, new dcb(1));
        y5f.e(dfb.class, new uza(7));
        y5f.e(qab.class, new dcb(6));
        Class<pi4> cls = pi4.class;
        y5f.c(cls, new dcb(2));
        y5f.c(cls, new dcb(3));
        y5f.c(cls, new dcb(4));
        y5f.c(cls, new dcb(5));
        y5f.e(ea.class, new uza(8));
    }

    public static final void L(y5f y5f) {
        y5f.c(pi4.class, new lxc(12));
    }

    public static void M(Parcel parcel, int i2, Bundle bundle) {
        if (bundle != null) {
            int T = T(parcel, i2);
            parcel.writeBundle(bundle);
            W(parcel, T);
        }
    }

    public static void N(Parcel parcel, int i2, Float f2) {
        if (f2 != null) {
            X(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        }
    }

    public static void O(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder != null) {
            int T = T(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            W(parcel, T);
        }
    }

    public static void P(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable != null) {
            int T = T(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            W(parcel, T);
        }
    }

    public static void Q(Parcel parcel, int i2, String str) {
        if (str != null) {
            int T = T(parcel, i2);
            parcel.writeString(str);
            W(parcel, T);
        }
    }

    public static void R(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr != null) {
            int T = T(parcel, i2);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i3);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            W(parcel, T);
        }
    }

    public static void S(Parcel parcel, List list, int i2) {
        if (list != null) {
            int T = T(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            W(parcel, T);
        }
    }

    public static int T(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void U(int i2) {
        boolean z2 = true;
        if (!(i2 == 100 || i2 == 102 || i2 == 104)) {
            if (i2 == 105) {
                i2 = 105;
            } else {
                z2 = false;
            }
        }
        fp3.h(z2, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i2));
    }

    public static String V(int i2) {
        if (i2 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i2 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i2 == 104) {
            return "LOW_POWER";
        }
        if (i2 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static void W(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void X(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static final void a(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (view.getParent() == null) {
            viewGroup.addView(view, layoutParams);
        }
    }

    public static final void b(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static final xs d(Object... objArr) {
        xs xsVar = new xs(objArr.length);
        for (Object add : objArr) {
            xsVar.add(add);
        }
        return xsVar;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Integer[], java.io.Serializable] */
    public static final Bundle e(Collection collection) {
        Bundle bundle = new Bundle((collection.size() * 5) + 1);
        bundle.putInt("size", collection.size());
        int[] iArr = new int[collection.size()];
        ? r2 = new Integer[collection.size()];
        ? r3 = new Integer[collection.size()];
        ? r4 = new Integer[collection.size()];
        int i2 = 0;
        for (Object next : collection) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                tt3 tt3 = (tt3) next;
                iArr[i2] = tt3.a;
                bundle.putParcelable(zr6.h(i2, "text_"), tt3.b);
                r2[i2] = tt3.c;
                r3[i2] = tt3.d;
                r4[i2] = tt3.e;
                i2 = i3;
            } else {
                y53.R();
                throw null;
            }
        }
        bundle.putIntArray("ids", iArr);
        bundle.putSerializable("textColors", r2);
        bundle.putSerializable("icons", r3);
        bundle.putSerializable("iconColors", r4);
        return bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: njc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: njc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: njc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List f(android.os.Bundle r15) {
        /*
            java.lang.String r0 = "size"
            int r0 = r15.getInt(r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "ids"
            int[] r1 = r15.getIntArray(r1)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0082
            java.lang.String r3 = "textColors"
            java.io.Serializable r3 = r15.getSerializable(r3)     // Catch:{ all -> 0x0076 }
            java.lang.Integer[] r3 = (java.lang.Integer[]) r3     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "icons"
            java.io.Serializable r4 = r15.getSerializable(r4)     // Catch:{ all -> 0x0076 }
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4     // Catch:{ all -> 0x0076 }
            java.lang.String r5 = "iconColors"
            java.io.Serializable r5 = r15.getSerializable(r5)     // Catch:{ all -> 0x0076 }
            java.lang.Integer[] r5 = (java.lang.Integer[]) r5     // Catch:{ all -> 0x0076 }
            r6 = 0
            j37 r0 = defpackage.ote.Y(r6, r0)     // Catch:{ all -> 0x0076 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0076 }
            r7 = 10
            int r7 = defpackage.z53.S(r0, r7)     // Catch:{ all -> 0x0076 }
            r6.<init>(r7)     // Catch:{ all -> 0x0076 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0076 }
        L_0x003c:
            r7 = r0
            i37 r7 = (defpackage.i37) r7     // Catch:{ all -> 0x0076 }
            boolean r7 = r7.c     // Catch:{ all -> 0x0076 }
            if (r7 == 0) goto L_0x0091
            r7 = r0
            i37 r7 = (defpackage.i37) r7     // Catch:{ all -> 0x0076 }
            int r7 = r7.a()     // Catch:{ all -> 0x0076 }
            tt3 r14 = new tt3     // Catch:{ all -> 0x0076 }
            r9 = r1[r7]     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r8.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r10 = "text_"
            r8.append(r10)     // Catch:{ all -> 0x0076 }
            r8.append(r7)     // Catch:{ all -> 0x0076 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0076 }
            android.os.Parcelable r8 = r15.getParcelable(r8)     // Catch:{ all -> 0x0076 }
            if (r8 == 0) goto L_0x0078
            r10 = r8
            jqe r10 = (defpackage.jqe) r10     // Catch:{ all -> 0x0076 }
            r11 = r3[r7]     // Catch:{ all -> 0x0076 }
            r12 = r4[r7]     // Catch:{ all -> 0x0076 }
            r13 = r5[r7]     // Catch:{ all -> 0x0076 }
            r8 = r14
            r8.<init>((int) r9, (defpackage.jqe) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13)     // Catch:{ all -> 0x0076 }
            r6.add(r14)     // Catch:{ all -> 0x0076 }
            goto L_0x003c
        L_0x0076:
            r15 = move-exception
            goto L_0x008c
        L_0x0078:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0076 }
            r15.<init>(r0)     // Catch:{ all -> 0x0076 }
            throw r15     // Catch:{ all -> 0x0076 }
        L_0x0082:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0076 }
            r15.<init>(r0)     // Catch:{ all -> 0x0076 }
            throw r15     // Catch:{ all -> 0x0076 }
        L_0x008c:
            njc r6 = new njc
            r6.<init>(r15)
        L_0x0091:
            java.lang.Throwable r15 = defpackage.pjc.a(r6)
            if (r15 == 0) goto L_0x009a
            r15.printStackTrace()
        L_0x009a:
            boolean r15 = r6 instanceof defpackage.njc
            if (r15 == 0) goto L_0x009f
            r6 = 0
        L_0x009f:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x00a5
            nz4 r6 = defpackage.nz4.a
        L_0x00a5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay7.f(android.os.Bundle):java.util.List");
    }

    public static Object g(b8c b8c, hu3 hu3) {
        sy1 sy1 = new sy1(1, v3c.u(hu3));
        sy1.n();
        b8c.e(new h7b(sy1, (Object) null, false, 27));
        sy1.d(new c01(6, b8c));
        return sy1.m();
    }

    public static ty4 h(m85 m85) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = m85.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (m85.s(i3, elapsedRealtime)) {
                i2++;
            }
        }
        return new ty4(1, 0, length, i2, 1);
    }

    public static boolean i(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    int i5 = i4 + 1;
                    if (i4 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i3 - 1 == 0 && i4 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                    i2++;
                    i4 = i5;
                } else if (i3 == 0) {
                    return tpa.f(w9e.b1(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static String j(Context context, Locale locale, long j2, long j3, boolean z2) {
        Context context2 = context;
        Locale locale2 = locale;
        long j4 = j2;
        long j5 = j3;
        long j6 = j5 - j4;
        n34 g2 = n34.g(j4, TimeZone.getDefault());
        if (j6 < 86400000) {
            return A(n34.g(j5, TimeZone.getDefault()), n34.g(j4, TimeZone.getDefault())) ? k(context2, j4, locale2) : z2 ? j6 < 14400000 ? k(context2, j4, locale2) : context2.getString(c2c.tt_dates_yesterday) : String.format(context2.getString(c2c.tt_dates_yesterday_at), new Object[]{k(context2, j4, locale2)});
        }
        n34 g3 = n34.g(j5, TimeZone.getDefault());
        g2.f();
        Integer num = g2.c;
        g2.f();
        n34 l2 = new n34(g2.a, g2.b, num, (Integer) null, (Integer) null, (Integer) null, 0).l(1);
        g3.f();
        Integer num2 = g3.c;
        g3.f();
        n34 n34 = r9;
        n34 n342 = new n34(g3.a, g3.b, num2, (Integer) null, (Integer) null, (Integer) null, 0);
        return l2.equals(n34) ? z2 ? context2.getString(c2c.tt_dates_yesterday) : String.format(context2.getString(c2c.tt_dates_yesterday_at), new Object[]{k(context2, j4, locale2)}) : g2.a.equals(g3.a) ? r(locale2, j4, false) : r(locale2, j4, true);
    }

    public static String k(Context context, long j2, Locale locale) {
        String format;
        synchronized (c) {
            format = n(context, locale).format(Long.valueOf(j2));
        }
        return format;
    }

    public static String l(long j2) {
        int i2 = ((int) j2) / 60;
        long j3 = j2 - ((long) (i2 * 60));
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(":");
        sb.append(j3 < 10 ? "0" : "");
        sb.append(j3);
        return sb.toString();
    }

    public static String m(int i2, int i3, Context context) {
        String[] strArr = are.b;
        return String.format(context.getResources().getQuantityString(i2, i3), new Object[]{Integer.valueOf(i3)});
    }

    public static DateFormat n(Context context, Locale locale) {
        boolean booleanValue;
        if (b == null) {
            synchronized (t) {
                try {
                    if (s == null) {
                        s = Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context));
                    }
                    booleanValue = s.booleanValue();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            b = new SimpleDateFormat(booleanValue ? "HH:mm" : "h:mm a", locale);
        }
        return b;
    }

    public static b11 o(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (j4 <= 0) {
            return new b11(0, 10, 1, false);
        }
        long j6 = j5 - j4;
        if (j6 < 0) {
            return new b11(0, 10, 1, false);
        }
        if (A(n34.g(j5, TimeZone.getDefault()), n34.g(j4, TimeZone.getDefault()))) {
            if (j6 < 60000) {
                return new b11(0, 1, 1, false);
            }
            if (j6 < 3600000) {
                return new b11((long) ((int) (j6 / 60000)), 2, 1, false);
            }
            if (j6 < 86400000) {
                return new b11((long) ((int) (j6 / 3600000)), 3, 1, false);
            }
        }
        if (j6 < 3600000) {
            return new b11((long) ((int) (j6 / 60000)), 2, 1, false);
        }
        if (j6 < 86400000) {
            return new b11(j2, 4, 1, false);
        }
        if (j6 < 129600000) {
            return new b11(0, 4, 1, false);
        }
        return n34.g(j4, TimeZone.getDefault()).a.equals(n34.g(j5, TimeZone.getDefault()).a) ? new b11(j2, 9, 1, false) : new b11(j2, 8, 1, false);
    }

    public static int p(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i2 & -2097152) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = x[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? y[i5 - 1] : z[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? A[i5 - 1] : B[i5 - 1] : C[i5 - 1];
        int i10 = 144;
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return ((i10 * i9) / i7) + i8;
    }

    public static String q(Locale locale, long j2, boolean z2) {
        String str;
        if (z2) {
            synchronized (k) {
                if (j == null) {
                    j = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str = j.format(Long.valueOf(j2));
            }
        } else {
            synchronized (i) {
                if (h == null) {
                    h = new SimpleDateFormat("d MMM", locale);
                }
                str = h.format(Long.valueOf(j2));
            }
        }
        return str;
    }

    public static String r(Locale locale, long j2, boolean z2) {
        String format;
        String format2;
        if (z2) {
            synchronized (g) {
                if (f == null) {
                    f = new SimpleDateFormat("d MMM yyyy", locale);
                }
                format2 = f.format(Long.valueOf(j2));
            }
            return format2;
        }
        synchronized (e) {
            if (d == null) {
                d = new SimpleDateFormat("d MMM", locale);
            }
            format = d.format(Long.valueOf(j2));
        }
        return format;
    }

    public static String s(Context context, Locale locale, long j2, boolean z2) {
        String str;
        String string = context.getString(c2c.tt_at);
        if (z2) {
            synchronized (m) {
                if (l == null) {
                    l = new SimpleDateFormat("dd.MM.yy", locale);
                }
                str = l.format(Long.valueOf(j2));
            }
        } else {
            str = q(locale, j2, false);
        }
        return String.format(string, new Object[]{str, k(context, j2, locale)});
    }

    public static Handler t() {
        if (a != null) {
            return a;
        }
        synchronized (ay7.class) {
            try {
                if (a == null) {
                    a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return a;
    }

    public static final ViewGroup u(View view) {
        ViewGroup u2;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (u2 = u(viewGroup)) != null) {
            return u2;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static Object v(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ou0.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int w(xs xsVar, Object obj, int i2) {
        int i3 = xsVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int l2 = j47.l(i3, i2, xsVar.a);
            if (l2 < 0 || tpa.f(obj, xsVar.b[l2])) {
                return l2;
            }
            int i4 = l2 + 1;
            while (i4 < i3 && xsVar.a[i4] == i2) {
                if (tpa.f(obj, xsVar.b[i4])) {
                    return i4;
                }
                i4++;
            }
            int i5 = l2 - 1;
            while (i5 >= 0 && xsVar.a[i5] == i2) {
                if (tpa.f(obj, xsVar.b[i5])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final yh9 x(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        yh9 yh9 = new yh9();
        int i18 = i2;
        yh9.e(1, i2);
        int i19 = i3;
        yh9.e(131072, i3);
        int i20 = i4;
        yh9.e(2, i4);
        int i21 = i5;
        yh9.e(4, i5);
        int i22 = i6;
        yh9.e(8, i6);
        int i23 = i7;
        yh9.e(16, i7);
        int i24 = i8;
        yh9.e(64, i8);
        int i25 = i9;
        yh9.e(128, i9);
        int i26 = i10;
        yh9.e(256, i10);
        int i27 = i11;
        int i28 = i12;
        yh9.e(i11, i12);
        int i29 = i13;
        int i30 = i14;
        yh9.e(i13, i14);
        yh9.e(2048, i15);
        yh9.e(8192, i16);
        yh9.e(65536, i17);
        return yh9;
    }

    public static final yh9 y(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        yh9 yh9 = new yh9();
        int i20 = i2;
        yh9.e(1, i2);
        int i21 = i3;
        yh9.e(2, i3);
        int i22 = i4;
        yh9.e(4, i4);
        int i23 = i5;
        yh9.e(8, i5);
        int i24 = i6;
        yh9.e(65536, i6);
        int i25 = i7;
        yh9.e(16, i7);
        int i26 = i8;
        yh9.e(32768, i8);
        int i27 = i9;
        yh9.e(32, i9);
        int i28 = i10;
        yh9.e(64, i10);
        int i29 = i11;
        yh9.e(256, i11);
        int i30 = i12;
        yh9.e(128, i12);
        int i31 = i13;
        int i32 = i14;
        yh9.e(i13, i14);
        yh9.e(i15, i16);
        yh9.e(i17, i18);
        yh9.e(2048, i19);
        return yh9;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x06ce A[Catch:{ all -> 0x06db }, LOOP:32: B:486:0x06c8->B:488:0x06ce, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0709 A[LOOP:33: B:501:0x0703->B:503:0x0709, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x072c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x06e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x06f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:594:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.qa2 z(defpackage.gy8 r27) {
        /*
            r1 = r27
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            xs r4 = new xs
            r5 = 0
            r4.<init>((java.lang.Object) r5)
            xs r6 = new xs
            r6.<init>((java.lang.Object) r5)
            java.lang.Class<pa2> r0 = defpackage.pa2.class
            java.util.EnumSet r13 = java.util.EnumSet.noneOf(r0)
            nz4 r7 = defpackage.nz4.a
            java.util.EnumMap r15 = new java.util.EnumMap
            r15.<init>(r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.Class<cv5> r0 = defpackage.cv5.class
            java.util.EnumSet r12 = java.util.EnumSet.noneOf(r0)
            r9 = 1
            int r0 = defpackage.lz7.N(r27)     // Catch:{ all -> 0x0032 }
            r10 = r0
            r16 = r6
            goto L_0x0066
        L_0x0032:
            r0 = move-exception
            r10 = r0
            defpackage.hm9.l0(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0052
            java.lang.Object r11 = r0.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r10)
            goto L_0x003f
        L_0x0052:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0063
            if (r0 == r9) goto L_0x0062
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0062:
            throw r10
        L_0x0063:
            r16 = r6
            r10 = 0
        L_0x0066:
            r21 = r7
            r7 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
        L_0x0073:
            if (r7 >= r10) goto L_0x0728
            java.lang.String r0 = defpackage.lz7.P(r27)     // Catch:{ all -> 0x007a }
            goto L_0x00b2
        L_0x007a:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)     // Catch:{ all -> 0x009e }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x009e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009e }
        L_0x0087:
            boolean r24 = r0.hasNext()     // Catch:{ all -> 0x009e }
            if (r24 == 0) goto L_0x00a0
            java.lang.Object r24 = r0.next()     // Catch:{ all -> 0x009e }
            r4a r24 = (defpackage.r4a) r24     // Catch:{ all -> 0x009e }
            r24.getClass()     // Catch:{ all -> 0x009e }
            defpackage.r4a.a(r8)     // Catch:{ all -> 0x009e }
            goto L_0x0087
        L_0x009a:
            r8 = r16
            goto L_0x06f8
        L_0x009e:
            r0 = move-exception
            goto L_0x009a
        L_0x00a0:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x009e }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x00b1
            if (r0 == r9) goto L_0x00b0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x009e }
            r0.<init>()     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x00b0:
            throw r8     // Catch:{ all -> 0x009e }
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x06ef
            int r8 = r0.hashCode()     // Catch:{ all -> 0x00f1 }
            switch(r8) {
                case -1785238953: goto L_0x05f8;
                case -1249474914: goto L_0x0519;
                case -854547461: goto L_0x0480;
                case -8339209: goto L_0x0442;
                case 3355: goto L_0x03f9;
                case 96632902: goto L_0x03b0;
                case 110371416: goto L_0x0367;
                case 598683239: goto L_0x031b;
                case 829468971: goto L_0x02d4;
                case 1340337839: goto L_0x0252;
                case 1942574248: goto L_0x01ce;
                case 2023524447: goto L_0x00bd;
                default: goto L_0x00bb;
            }     // Catch:{ all -> 0x00f1 }
        L_0x00bb:
            goto L_0x0600
        L_0x00bd:
            java.lang.String r8 = "filterSubjects"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00c7
            goto L_0x0600
        L_0x00c7:
            int r0 = defpackage.lz7.N(r27)     // Catch:{ all -> 0x00cd }
            r8 = r0
            goto L_0x0105
        L_0x00cd:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x00da:
            boolean r24 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r24 == 0) goto L_0x00f3
            java.lang.Object r24 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r24 = (defpackage.r4a) r24     // Catch:{ all -> 0x00f1 }
            r24.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x00da
        L_0x00ed:
            r8 = r16
            goto L_0x06bd
        L_0x00f1:
            r0 = move-exception
            goto L_0x00ed
        L_0x00f3:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0104
            if (r0 == r9) goto L_0x0103
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0103:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x0104:
            r8 = 0
        L_0x0105:
            r11 = 0
        L_0x0106:
            if (r11 >= r8) goto L_0x06ef
            java.lang.String r0 = defpackage.lz7.P(r27)     // Catch:{ all -> 0x010d }
            goto L_0x0142
        L_0x010d:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x012d }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x012d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x012d }
        L_0x011a:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x012d }
            if (r6 == 0) goto L_0x0130
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x012d }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x012d }
            r6.getClass()     // Catch:{ all -> 0x012d }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x012d }
            goto L_0x011a
        L_0x012d:
            r0 = move-exception
            goto L_0x019f
        L_0x0130:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x012d }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x0141
            if (r0 == r9) goto L_0x0140
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x012d }
            r0.<init>()     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x0140:
            throw r5     // Catch:{ all -> 0x012d }
        L_0x0141:
            r0 = 0
        L_0x0142:
            if (r0 != 0) goto L_0x0145
            goto L_0x019b
        L_0x0145:
            pa2 r0 = defpackage.pa2.valueOf(r0)     // Catch:{ all -> 0x014a }
            goto L_0x0151
        L_0x014a:
            r0 = move-exception
            r5 = r0
            njc r0 = new njc     // Catch:{ all -> 0x012d }
            r0.<init>(r5)     // Catch:{ all -> 0x012d }
        L_0x0151:
            boolean r5 = r0 instanceof defpackage.njc     // Catch:{ all -> 0x012d }
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x0160
            r5 = r0
            pa2 r5 = (defpackage.pa2) r5     // Catch:{ all -> 0x012d }
            java.lang.Object r6 = defpackage.xfg.w(r5, r1)     // Catch:{ all -> 0x012d }
            r15.put(r5, r6)     // Catch:{ all -> 0x012d }
        L_0x0160:
            java.lang.Throwable r0 = defpackage.pjc.a(r0)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x019b
            r27.z()     // Catch:{ all -> 0x016a }
            goto L_0x019b
        L_0x016a:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x012d }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x012d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x012d }
        L_0x0177:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x012d }
            if (r6 == 0) goto L_0x018a
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x012d }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x012d }
            r6.getClass()     // Catch:{ all -> 0x012d }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x012d }
            goto L_0x0177
        L_0x018a:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x012d }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x019b
            if (r0 == r9) goto L_0x019a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x012d }
            r0.<init>()     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x019a:
            throw r5     // Catch:{ all -> 0x012d }
        L_0x019b:
            int r11 = r11 + 1
            goto L_0x0106
        L_0x019f:
            defpackage.hm9.l0(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x01aa:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x01bd
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x01aa
        L_0x01bd:
            int r5 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r5 = defpackage.au1.s(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x06ef
            if (r5 == r9) goto L_0x01cd
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x01cd:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x01ce:
            java.lang.String r5 = "include"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x01d8
            goto L_0x0600
        L_0x01d8:
            int r0 = defpackage.lz7.G(r27)     // Catch:{ all -> 0x01de }
            r5 = r0
            goto L_0x0210
        L_0x01de:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x01eb:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x01fe
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x01eb
        L_0x01fe:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x020f
            if (r0 == r9) goto L_0x020e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x020e:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x020f:
            r5 = 0
        L_0x0210:
            r6 = 0
        L_0x0211:
            if (r6 >= r5) goto L_0x06ef
            long r25 = defpackage.lz7.Y(r27)     // Catch:{ all -> 0x021f }
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x021f }
            r4.add(r0)     // Catch:{ all -> 0x021f }
            goto L_0x024f
        L_0x021f:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r8 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x022b:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x023e
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x00f1 }
            r4a r11 = (defpackage.r4a) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x022b
        L_0x023e:
            int r8 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r8 = defpackage.au1.s(r8)     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x024f
            if (r8 == r9) goto L_0x024e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x024e:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x024f:
            int r6 = r6 + 1
            goto L_0x0211
        L_0x0252:
            java.lang.String r5 = "widgets"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x025c
            goto L_0x0600
        L_0x025c:
            int r0 = defpackage.lz7.G(r27)     // Catch:{ all -> 0x0261 }
            goto L_0x0293
        L_0x0261:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x026e:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0281
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x026e
        L_0x0281:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0292
            if (r0 == r9) goto L_0x0291
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0291:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x0292:
            r0 = 0
        L_0x0293:
            r5 = 0
        L_0x0294:
            if (r5 >= r0) goto L_0x06ef
            hv5 r6 = defpackage.f46.T(r27)     // Catch:{ all -> 0x02a0 }
            if (r6 == 0) goto L_0x02a2
            r14.add(r6)     // Catch:{ all -> 0x02a0 }
            goto L_0x02a2
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a5
        L_0x02a2:
            int r5 = r5 + 1
            goto L_0x0294
        L_0x02a5:
            defpackage.hm9.l0(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x02b0:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x02c3
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x02b0
        L_0x02c3:
            int r5 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r5 = defpackage.au1.s(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x06ef
            if (r5 == r9) goto L_0x02d3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x02d3:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x02d4:
            java.lang.String r5 = "hideEmpty"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x02de
            goto L_0x0600
        L_0x02de:
            boolean r0 = defpackage.lz7.H(r27)     // Catch:{ all -> 0x02e6 }
            r20 = r0
            goto L_0x06ef
        L_0x02e6:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x02f3:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0306
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x02f3
        L_0x0306:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0317
            if (r0 == r9) goto L_0x0316
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0316:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x0317:
            r20 = 0
            goto L_0x06ef
        L_0x031b:
            java.lang.String r5 = "creatorId"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0362 }
            if (r0 != 0) goto L_0x0325
            goto L_0x0600
        L_0x0325:
            r5 = 0
            long r22 = defpackage.lz7.M(r1, r5)     // Catch:{ all -> 0x032d }
            goto L_0x06ef
        L_0x032d:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x033a:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x034d
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r11 = (defpackage.r4a) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x033a
        L_0x034d:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x035e
            if (r0 == r9) goto L_0x035d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x035d:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x035e:
            r22 = r5
            goto L_0x06ef
        L_0x0362:
            r0 = move-exception
            r5 = 0
            goto L_0x00ed
        L_0x0367:
            r5 = 0
            java.lang.String r8 = "title"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0373
            goto L_0x0600
        L_0x0373:
            java.lang.String r0 = defpackage.lz7.P(r27)     // Catch:{ all -> 0x037b }
            r18 = r0
            goto L_0x06ef
        L_0x037b:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0388:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x039b
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r11 = (defpackage.r4a) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x0388
        L_0x039b:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x03ac
            if (r0 == r9) goto L_0x03ab
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x03ab:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x03ac:
            r18 = 0
            goto L_0x06ef
        L_0x03b0:
            r5 = 0
            java.lang.String r8 = "emoji"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x03bc
            goto L_0x0600
        L_0x03bc:
            java.lang.String r0 = defpackage.lz7.P(r27)     // Catch:{ all -> 0x03c4 }
            r19 = r0
            goto L_0x06ef
        L_0x03c4:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x03d1:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x03e4
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r11 = (defpackage.r4a) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x03d1
        L_0x03e4:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x03f5
            if (r0 == r9) goto L_0x03f4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x03f4:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x03f5:
            r19 = 0
            goto L_0x06ef
        L_0x03f9:
            r5 = 0
            java.lang.String r8 = "id"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0405
            goto L_0x0600
        L_0x0405:
            java.lang.String r0 = defpackage.lz7.P(r27)     // Catch:{ all -> 0x040d }
            r17 = r0
            goto L_0x06ef
        L_0x040d:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x041a:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x042d
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r11 = (defpackage.r4a) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x041a
        L_0x042d:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x043e
            if (r0 == r9) goto L_0x043d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x043d:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x043e:
            r17 = 0
            goto L_0x06ef
        L_0x0442:
            r5 = 0
            java.lang.String r8 = "elements"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x044e
            goto L_0x0600
        L_0x044e:
            av8 r0 = r27.n()     // Catch:{ all -> 0x00f1 }
            int r0 = r0.a()     // Catch:{ all -> 0x00f1 }
            r8 = 7
            if (r0 != r8) goto L_0x0473
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            int r8 = r27.s0()     // Catch:{ all -> 0x00f1 }
            r11 = 0
        L_0x0463:
            if (r11 >= r8) goto L_0x047a
            lu8 r5 = defpackage.ku8.a(r27)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x046e
            r0.add(r5)     // Catch:{ all -> 0x00f1 }
        L_0x046e:
            int r11 = r11 + 1
            r5 = 0
            goto L_0x0463
        L_0x0473:
            r27.z()     // Catch:{ all -> 0x00f1 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00f1 }
        L_0x047a:
            java.util.List r21 = defpackage.x53.e0(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x06ef
        L_0x0480:
            java.lang.String r5 = "filters"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x048a
            goto L_0x0600
        L_0x048a:
            int r0 = defpackage.lz7.G(r27)     // Catch:{ all -> 0x0490 }
            r5 = r0
            goto L_0x04c2
        L_0x0490:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x049d:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x04b0
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x049d
        L_0x04b0:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x04c1
            if (r0 == r9) goto L_0x04c0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x04c0:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x04c1:
            r5 = 0
        L_0x04c2:
            r6 = 0
        L_0x04c3:
            if (r6 >= r5) goto L_0x06ef
            java.lang.String r0 = defpackage.lz7.P(r27)     // Catch:{ all -> 0x04ca }
            goto L_0x04fc
        L_0x04ca:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x04d7:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x04ea
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r11 = (defpackage.r4a) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x04d7
        L_0x04ea:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x04fb
            if (r0 == r9) goto L_0x04fa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x04fa:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x04fb:
            r0 = 0
        L_0x04fc:
            if (r0 == 0) goto L_0x0516
            pa2 r0 = defpackage.pa2.valueOf(r0)     // Catch:{ all -> 0x0503 }
            goto L_0x050a
        L_0x0503:
            r0 = move-exception
            r8 = r0
            njc r0 = new njc     // Catch:{ all -> 0x00f1 }
            r0.<init>(r8)     // Catch:{ all -> 0x00f1 }
        L_0x050a:
            boolean r8 = r0 instanceof defpackage.njc     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x050f
            r0 = 0
        L_0x050f:
            pa2 r0 = (defpackage.pa2) r0     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0516
            r13.add(r0)     // Catch:{ all -> 0x00f1 }
        L_0x0516:
            int r6 = r6 + 1
            goto L_0x04c3
        L_0x0519:
            java.lang.String r5 = "options"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0523
            goto L_0x0600
        L_0x0523:
            int r0 = defpackage.lz7.G(r27)     // Catch:{ all -> 0x0529 }
            r5 = r0
            goto L_0x055b
        L_0x0529:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0536:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0549
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x0536
        L_0x0549:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x055a
            if (r0 == r9) goto L_0x0559
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0559:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x055a:
            r5 = 0
        L_0x055b:
            r6 = 0
        L_0x055c:
            if (r6 >= r5) goto L_0x06ef
            r8 = -1
            int r0 = defpackage.lz7.L(r27)     // Catch:{ all -> 0x0564 }
            goto L_0x0598
        L_0x0564:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r3, r2, r11)     // Catch:{ all -> 0x0584 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x0584 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0584 }
        L_0x0571:
            boolean r25 = r0.hasNext()     // Catch:{ all -> 0x0584 }
            if (r25 == 0) goto L_0x0586
            java.lang.Object r25 = r0.next()     // Catch:{ all -> 0x0584 }
            r4a r25 = (defpackage.r4a) r25     // Catch:{ all -> 0x0584 }
            r25.getClass()     // Catch:{ all -> 0x0584 }
            defpackage.r4a.a(r11)     // Catch:{ all -> 0x0584 }
            goto L_0x0571
        L_0x0584:
            r0 = move-exception
            goto L_0x05c8
        L_0x0586:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x0584 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x0584 }
            if (r0 == 0) goto L_0x0597
            if (r0 == r9) goto L_0x0596
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0584 }
            r0.<init>()     // Catch:{ all -> 0x0584 }
            throw r0     // Catch:{ all -> 0x0584 }
        L_0x0596:
            throw r11     // Catch:{ all -> 0x0584 }
        L_0x0597:
            r0 = r8
        L_0x0598:
            if (r0 == r8) goto L_0x05c4
            c32 r8 = defpackage.cv5.b     // Catch:{ all -> 0x0584 }
            r8.getClass()     // Catch:{ all -> 0x0584 }
            v25 r8 = defpackage.cv5.Y     // Catch:{ all -> 0x0584 }
            r8.getClass()     // Catch:{ all -> 0x0584 }
            u1 r11 = new u1     // Catch:{ all -> 0x0584 }
            r9 = 0
            r11.<init>(r9, r8)     // Catch:{ all -> 0x0584 }
        L_0x05aa:
            boolean r8 = r11.hasNext()     // Catch:{ all -> 0x0584 }
            if (r8 == 0) goto L_0x05bc
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x0584 }
            r9 = r8
            cv5 r9 = (defpackage.cv5) r9     // Catch:{ all -> 0x0584 }
            int r9 = r9.a     // Catch:{ all -> 0x0584 }
            if (r9 != r0) goto L_0x05aa
            goto L_0x05bd
        L_0x05bc:
            r8 = 0
        L_0x05bd:
            cv5 r8 = (defpackage.cv5) r8     // Catch:{ all -> 0x0584 }
            if (r8 == 0) goto L_0x05c4
            r12.add(r8)     // Catch:{ all -> 0x0584 }
        L_0x05c4:
            int r6 = r6 + 1
            r9 = 1
            goto L_0x055c
        L_0x05c8:
            defpackage.hm9.l0(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x05d3:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x05e6
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x05d3
        L_0x05e6:
            int r5 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r5 = defpackage.au1.s(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x06ef
            r6 = 1
            if (r5 == r6) goto L_0x05f7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x05f7:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x05f8:
            java.lang.String r5 = "favorites"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0637
        L_0x0600:
            r27.z()     // Catch:{ all -> 0x0605 }
            goto L_0x06ef
        L_0x0605:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0612:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0625
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x0612
        L_0x0625:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x06ef
            r6 = 1
            if (r0 == r6) goto L_0x0636
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0636:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x0637:
            int r0 = defpackage.lz7.G(r27)     // Catch:{ all -> 0x063d }
            r5 = r0
            goto L_0x0670
        L_0x063d:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x064a:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x065d
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.r4a.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x064a
        L_0x065d:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x066f
            r6 = 1
            if (r0 == r6) goto L_0x066e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x066e:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x066f:
            r5 = 0
        L_0x0670:
            r6 = 0
        L_0x0671:
            if (r6 >= r5) goto L_0x06ef
            long r8 = defpackage.lz7.Y(r27)     // Catch:{ all -> 0x0683 }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0683 }
            r8 = r16
            r8.add(r0)     // Catch:{ all -> 0x0681 }
            goto L_0x06b8
        L_0x0681:
            r0 = move-exception
            goto L_0x0686
        L_0x0683:
            r0 = move-exception
            r8 = r16
        L_0x0686:
            defpackage.hm9.l0(r3, r2, r0)     // Catch:{ all -> 0x06a4 }
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.u7d.a     // Catch:{ all -> 0x06a4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x06a4 }
        L_0x0691:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x06a4 }
            if (r11 == 0) goto L_0x06a6
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x06a4 }
            r4a r11 = (defpackage.r4a) r11     // Catch:{ all -> 0x06a4 }
            r11.getClass()     // Catch:{ all -> 0x06a4 }
            defpackage.r4a.a(r0)     // Catch:{ all -> 0x06a4 }
            goto L_0x0691
        L_0x06a4:
            r0 = move-exception
            goto L_0x06bd
        L_0x06a6:
            int r9 = defpackage.k7d.a     // Catch:{ all -> 0x06a4 }
            int r9 = defpackage.au1.s(r9)     // Catch:{ all -> 0x06a4 }
            if (r9 == 0) goto L_0x06b8
            r11 = 1
            if (r9 == r11) goto L_0x06b7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x06a4 }
            r0.<init>()     // Catch:{ all -> 0x06a4 }
            throw r0     // Catch:{ all -> 0x06a4 }
        L_0x06b7:
            throw r0     // Catch:{ all -> 0x06a4 }
        L_0x06b8:
            int r6 = r6 + 1
            r16 = r8
            goto L_0x0671
        L_0x06bd:
            defpackage.hm9.l0(r3, r2, r0)     // Catch:{ all -> 0x06db }
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.u7d.a     // Catch:{ all -> 0x06db }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x06db }
        L_0x06c8:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x06db }
            if (r6 == 0) goto L_0x06dd
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x06db }
            r4a r6 = (defpackage.r4a) r6     // Catch:{ all -> 0x06db }
            r6.getClass()     // Catch:{ all -> 0x06db }
            defpackage.r4a.a(r0)     // Catch:{ all -> 0x06db }
            goto L_0x06c8
        L_0x06db:
            r0 = move-exception
            goto L_0x06f8
        L_0x06dd:
            int r5 = defpackage.k7d.a     // Catch:{ all -> 0x06db }
            int r5 = defpackage.au1.s(r5)     // Catch:{ all -> 0x06db }
            if (r5 == 0) goto L_0x06f1
            r6 = 1
            if (r5 == r6) goto L_0x06ee
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x06db }
            r0.<init>()     // Catch:{ all -> 0x06db }
            throw r0     // Catch:{ all -> 0x06db }
        L_0x06ee:
            throw r0     // Catch:{ all -> 0x06db }
        L_0x06ef:
            r8 = r16
        L_0x06f1:
            int r7 = r7 + 1
            r16 = r8
            r9 = 1
            goto L_0x0073
        L_0x06f8:
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.u7d.a
            java.util.Iterator r1 = r1.iterator()
        L_0x0703:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0716
            java.lang.Object r2 = r1.next()
            r4a r2 = (defpackage.r4a) r2
            r2.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0703
        L_0x0716:
            int r1 = defpackage.k7d.a
            int r1 = defpackage.au1.s(r1)
            if (r1 == 0) goto L_0x072a
            r2 = 1
            if (r1 == r2) goto L_0x0727
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0727:
            throw r0
        L_0x0728:
            r8 = r16
        L_0x072a:
            if (r17 == 0) goto L_0x072e
            if (r18 != 0) goto L_0x0730
        L_0x072e:
            r1 = 0
            goto L_0x0755
        L_0x0730:
            qa2 r0 = new qa2
            java.util.Set r11 = java.util.Collections.unmodifiableSet(r4)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r8)
            r7 = r0
            r8 = r17
            r9 = r18
            r10 = r19
            r2 = r12
            r12 = r1
            r1 = r14
            r14 = r20
            r3 = r15
            r15 = r21
            r16 = r22
            r18 = r3
            r19 = r1
            r20 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            return r0
        L_0x0755:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay7.z(gy8):qa2");
    }
}
