package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.ImageReader;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: s36  reason: default package */
public abstract class s36 {
    public static f2b a = null;
    public static volatile boolean b = false;
    public static final float[] c = new float[0];
    public static volatile py7 d = new yxc(13);
    public static final Object e = new Object();
    public static final /* synthetic */ int f = 0;
    public static Boolean g;

    public static void A(vz3 vz3) {
        vz3.k = -3.4028235E38f;
        vz3.j = Integer.MIN_VALUE;
        CharSequence charSequence = vz3.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                vz3.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = vz3.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float B(float f2, int i, int i2, int i3) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f3 = (float) i3;
        } else if (i == 1) {
            f3 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f2;
        }
        return f2 * f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List C(java.util.List r18, defpackage.v02 r19, defpackage.v02 r20, defpackage.ol3 r21, long r22, long r24) {
        /*
            r0 = 2
            r1 = 1
            if (r18 == 0) goto L_0x0247
            boolean r3 = r18.isEmpty()
            if (r3 == 0) goto L_0x000c
            goto L_0x0247
        L_0x000c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r18.iterator()
        L_0x001a:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0036
            java.lang.Object r6 = r5.next()
            wm3 r6 = (defpackage.wm3) r6
            long r9 = r6.Z
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x001a
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r4.add(r6)
            goto L_0x001a
        L_0x0036:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0053
            r5 = r20
            java.lang.Object r5 = r5.b
            el3 r5 = (defpackage.el3) r5
            rm4 r5 = r5.f
            java.lang.Object r5 = r5.get()
            c34 r5 = (defpackage.c34) r5
            k24 r5 = (defpackage.k24) r5
            wlc r5 = r5.e
            java.util.ArrayList r4 = r5.f(r4)
            goto L_0x0057
        L_0x0053:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0057:
            java.util.Iterator r5 = r18.iterator()
        L_0x005b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0245
            java.lang.Object r6 = r5.next()
            wm3 r6 = (defpackage.wm3) r6
            long r9 = r6.a
            r15 = r19
            java.lang.Object r11 = r15.b
            el3 r11 = (defpackage.el3) r11
            r13 = 0
            uj3 r9 = r11.i(r9, r13)
            long r11 = r6.b
            if (r9 == 0) goto L_0x0083
            ql3 r10 = r9.a
            pl3 r10 = r10.c
            long r13 = r10.g
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0083
            goto L_0x005b
        L_0x0083:
            if (r9 == 0) goto L_0x008d
            ql3 r9 = r9.a
            long r13 = r9.b
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
        L_0x008d:
            r16 = r3
            r2 = r11
            r17 = 0
            goto L_0x00bb
        L_0x0093:
            pl3 r9 = r9.c
            long r13 = r9.s
            long r13 = r13 + r22
            int r10 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r10 > 0) goto L_0x00b5
            java.lang.String r10 = "s36"
            java.lang.String r13 = "force update non-contact"
            defpackage.hm9.m(r10, r13, new java.lang.Object[0])
            long r13 = r9.t
            r9 = r6
            r10 = r21
            r16 = r3
            r2 = r11
            r11 = r24
            r17 = 0
            pl3 r9 = j(r9, r10, r11, r13)
            goto L_0x00c6
        L_0x00b5:
            r16 = r3
            r2 = r11
            r17 = 0
            goto L_0x00c6
        L_0x00bb:
            r13 = 0
            r9 = r6
            r10 = r21
            r11 = r24
            pl3 r9 = j(r9, r10, r11, r13)
        L_0x00c6:
            long r10 = r6.Z
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r13 = 0
            if (r12 != 0) goto L_0x00cf
        L_0x00cd:
            r14 = r13
            goto L_0x00e9
        L_0x00cf:
            java.util.Iterator r12 = r4.iterator()
        L_0x00d3:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00cd
            java.lang.Object r14 = r12.next()
            wua r14 = (defpackage.wua) r14
            long r7 = r14.Y
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x00e6
            goto L_0x00e9
        L_0x00e6:
            r7 = 0
            goto L_0x00d3
        L_0x00e9:
            hl3 r7 = r9.c()
            long r8 = r6.a
            r7.a = r8
            r7.g = r2
            r7.h = r10
            int r2 = r6.t0
            int r3 = defpackage.au1.s(r2)
            java.lang.String r8 = " in proto model"
            java.lang.String r9 = "No such value for "
            if (r3 == 0) goto L_0x0130
            if (r3 == r1) goto L_0x012e
            if (r3 != r0) goto L_0x0107
            r2 = 3
            goto L_0x0131
        L_0x0107:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r9)
            if (r2 == r1) goto L_0x011e
            if (r2 == r0) goto L_0x011b
            r0 = 3
            if (r2 == r0) goto L_0x0118
            java.lang.String r0 = "null"
            goto L_0x0120
        L_0x0118:
            java.lang.String r0 = "FEMALE"
            goto L_0x0120
        L_0x011b:
            java.lang.String r0 = "MALE"
            goto L_0x0120
        L_0x011e:
            java.lang.String r0 = "UNKNOWN"
        L_0x0120:
            r4.append(r0)
            r4.append(r8)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x012e:
            r2 = r0
            goto L_0x0131
        L_0x0130:
            r2 = r1
        L_0x0131:
            r7.l = r2
            java.lang.String r2 = r6.v0
            r7.o = r2
            java.lang.String r2 = r6.w0
            r7.p = r2
            long r2 = r6.Y
            r7.e = r2
            java.lang.String r2 = r6.x0
            r7.q = r2
            jc7 r2 = r6.y0
            if (r2 != 0) goto L_0x0149
            r3 = r13
            goto L_0x0152
        L_0x0149:
            kl3 r3 = new kl3
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r2)
        L_0x0152:
            r7.u = r3
            int[] r2 = r6.z0
            r7.v = r2
            nl3 r2 = defpackage.nl3.b
            pq3 r3 = r6.s0
            if (r3 != 0) goto L_0x015f
            goto L_0x0181
        L_0x015f:
            int r10 = r3.ordinal()
            if (r10 == 0) goto L_0x017e
            if (r10 != r1) goto L_0x0169
            r13 = r2
            goto L_0x0181
        L_0x0169:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017e:
            nl3 r3 = defpackage.nl3.a
            r13 = r3
        L_0x0181:
            r7.i = r13
            if (r13 == 0) goto L_0x018c
            ol3 r3 = defpackage.ol3.b
            r7.k = r3
            r3 = r21
            goto L_0x0190
        L_0x018c:
            r3 = r21
            r7.k = r3
        L_0x0190:
            java.lang.String r8 = r6.c
            boolean r9 = defpackage.oag.t(r8)
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x019d
            r7.b = r8
            goto L_0x01a1
        L_0x019d:
            if (r13 == r2) goto L_0x01a1
            r7.b = r10
        L_0x01a1:
            java.lang.String r8 = r6.o
            boolean r9 = defpackage.oag.t(r8)
            if (r9 != 0) goto L_0x01ac
            r7.c = r8
            goto L_0x01b0
        L_0x01ac:
            if (r13 == r2) goto L_0x01b0
            r7.c = r10
        L_0x01b0:
            java.util.List r2 = r6.X
            java.util.ArrayList r2 = defpackage.iz7.j(r2)
            r7.f = r2
            if (r14 == 0) goto L_0x01ee
            java.lang.String r2 = r14.u0
            boolean r8 = defpackage.oag.t(r2)
            if (r8 != 0) goto L_0x01c6
            r7.d = r2
            r13 = r1
            goto L_0x01c8
        L_0x01c6:
            r13 = r17
        L_0x01c8:
            java.lang.String r2 = r14.s0
            boolean r8 = defpackage.oag.t(r2)
            if (r8 != 0) goto L_0x01f0
            java.lang.String r8 = r14.t0
            if (r8 == 0) goto L_0x01d5
            goto L_0x01d6
        L_0x01d5:
            r8 = r10
        L_0x01d6:
            jl3 r9 = new jl3
            il3 r11 = defpackage.il3.b
            r9.<init>(r2, r11, r8)
            java.util.List r2 = r7.f
            if (r2 != 0) goto L_0x01e8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.f = r2
        L_0x01e8:
            java.util.List r2 = r7.f
            r2.add(r9)
            goto L_0x01f0
        L_0x01ee:
            r13 = r17
        L_0x01f0:
            if (r13 != 0) goto L_0x01f4
            r7.d = r10
        L_0x01f4:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r6 = r6.u0
            java.util.Iterator r6 = r6.iterator()
        L_0x01ff:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r6.next()
            vm3 r8 = (defpackage.vm3) r8
            int r8 = r8.ordinal()
            if (r8 == r1) goto L_0x022d
            r9 = 3
            if (r8 == r9) goto L_0x0227
            r10 = 4
            if (r8 == r10) goto L_0x0221
            r10 = 5
            if (r8 == r10) goto L_0x021b
            goto L_0x01ff
        L_0x021b:
            ll3 r8 = defpackage.ll3.o
            r2.add(r8)
            goto L_0x01ff
        L_0x0221:
            ll3 r8 = defpackage.ll3.c
            r2.add(r8)
            goto L_0x01ff
        L_0x0227:
            ll3 r8 = defpackage.ll3.b
            r2.add(r8)
            goto L_0x01ff
        L_0x022d:
            r9 = 3
            ll3 r8 = defpackage.ll3.a
            r2.add(r8)
            goto L_0x01ff
        L_0x0234:
            r9 = 3
            r7.n = r2
            pl3 r2 = r7.a()
            r6 = r16
            r6.add(r2)
            r3 = r6
            r7 = 0
            goto L_0x005b
        L_0x0245:
            r6 = r3
            return r6
        L_0x0247:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s36.C(java.util.List, v02, v02, ol3, long, long):java.util.List");
    }

    public static final dh7 D(em emVar, fm fmVar, eh7 eh7) {
        return new dh7(fmVar, eh7.Q(), emVar);
    }

    public static Drawable a(Context context, int i, float f2, boolean z) {
        return z ? new sp0(context, i, f2, true, false) : new ColorDrawable(i);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.widget.FrameLayout, w12] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.FrameLayout, w12] */
    public static final w12 b(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? new FrameLayout(context) : new FrameLayout(context, (AttributeSet) null, 0);
    }

    public static int c(int i, int i2) {
        return k7d.e(i, i2, 31);
    }

    public static final LinkedHashMap d(AttributeSet attributeSet) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            linkedHashMap.put(attributeSet.getAttributeName(i), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    public static final Object e(pa3 pa3, Continuation continuation) {
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        pa3.i(new spc(sy1, 0));
        Object m = sy1.m();
        return m == tx3.a ? m : e5f.a;
    }

    public static final Object f(iqd iqd, Continuation continuation) {
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        iqd.k(new spc(sy1, 1));
        return sy1.m();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [cd6, f2a, java.lang.Object] */
    public static final Object g(qy9 qy9, Continuation continuation) {
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        ? obj = new Object();
        obj.c = sy1;
        obj.a = 1;
        obj.Y = null;
        qy9.a(obj);
        return sy1.m();
    }

    public static void h(hl3 hl3, String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                str2 = "";
            }
            il3 il3 = il3.o;
            if (!hl3.f.isEmpty()) {
                hl3.f.set(0, new jl3(str, ((jl3) hl3.f.get(0)).c, str2));
                return;
            }
            hl3.f.add(0, new jl3(str, il3, str2));
            return;
        }
        hl3.f.remove(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.mx5 i(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            defpackage.c54.o(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0019:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L_0x0019
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L_0x0019
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0019
            goto L_0x0036
        L_0x0035:
            r3 = r4
        L_0x0036:
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r2 = r4
            goto L_0x006d
        L_0x003a:
            java.lang.String r1 = r3.authority     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.String r3 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0066 }
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch:{ NameNotFoundException -> 0x0066 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0066 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0066 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0066 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0066 }
        L_0x004c:
            if (r2 >= r6) goto L_0x005a
            r7 = r0[r2]     // Catch:{ NameNotFoundException -> 0x0066 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0066 }
            r5.add(r7)     // Catch:{ NameNotFoundException -> 0x0066 }
            int r2 = r2 + 1
            goto L_0x004c
        L_0x005a:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ NameNotFoundException -> 0x0066 }
            bg4 r2 = new bg4     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r1, r3, r5, r0)     // Catch:{ NameNotFoundException -> 0x0066 }
            goto L_0x006d
        L_0x0066:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L_0x0038
        L_0x006d:
            if (r2 != 0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            mx5 r4 = new mx5
            lx5 r0 = new lx5
            r0.<init>(r8, r2)
            r4.<init>(r0)
        L_0x007a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s36.i(android.content.Context):mx5");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, hl3] */
    public static pl3 j(wm3 wm3, ol3 ol3, long j, long j2) {
        ArrayList j3 = iz7.j(wm3.X);
        jc7 jc7 = wm3.y0;
        kl3 kl3 = jc7 == null ? null : new kl3((String) jc7.a);
        ? obj = new Object();
        obj.a = wm3.a;
        obj.f = j3;
        obj.o = wm3.v0;
        obj.p = wm3.w0;
        obj.k = ol3;
        obj.b = null;
        obj.c = null;
        obj.e = wm3.Y;
        obj.s = j;
        obj.t = j2;
        obj.u = kl3;
        obj.v = wm3.z0;
        return obj.a();
    }

    public static td k(int i, int i2, int i3, int i4) {
        return new td(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static final boolean m(int i, int i2) {
        return i == i2;
    }

    public static Drawable n(Context context, int i) {
        return oic.c().f(context, i);
    }

    public static iv6 o() {
        return lv6.g().f();
    }

    public static k12 p(Context context) {
        oq1 oq1;
        k9b k9b = k9b.f;
        synchronized (k9b.a) {
            oq1 = k9b.b;
            if (oq1 == null) {
                oq1 = f8.g(new y98((Object) k9b, 20, (Object) new ay1(context)));
                k9b.b = oq1;
            }
        }
        iw1 iw1 = new iw1(3, new c0(4, context));
        return kq0.K(oq1, new re6(15, (Object) iw1), ju0.k());
    }

    public static int r(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Throwable th) {
            hm9.p("s36", "getVideoBitrate: failed", th);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public static long s(Context context, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever2.setDataSource(context, uri);
                long t = t(mediaMetadataRetriever2);
                z(mediaMetadataRetriever2);
                return t;
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    hm9.p("s36", "getVideoDuration from uri: failed", th);
                    z(mediaMetadataRetriever);
                    return 0;
                } catch (Throwable th2) {
                    z(mediaMetadataRetriever);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            hm9.p("s36", "getVideoDuration from uri: failed", th);
            z(mediaMetadataRetriever);
            return 0;
        }
    }

    public static long t(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Throwable th) {
            hm9.p("s36", "getVideoDuration: failed ", th);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r19 = r4;
        r4 = r3;
        r3 = r8;
        r5 = r10;
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r9 = null;
        r10 = 0;
        r5 = 0;
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f A[SYNTHETIC, Splitter:B:35:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.em5 u(android.content.Context r21, android.net.Uri r22) {
        /*
            java.lang.String r1 = "s36"
            java.lang.String r2 = "getVideoParams: failed"
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 1
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever     // Catch:{ RuntimeException -> 0x0060 }
            r8.<init>()     // Catch:{ RuntimeException -> 0x0060 }
            r0 = r21
            r9 = r22
            r8.setDataSource(r0, r9)     // Catch:{ RuntimeException -> 0x0057, all -> 0x004f }
            r9 = -1
            android.graphics.Bitmap r9 = r8.getFrameAtTime(r9)     // Catch:{ RuntimeException -> 0x0057, all -> 0x004f }
            long r4 = t(r8)     // Catch:{ RuntimeException -> 0x0051, all -> 0x004f }
            android.graphics.Point r3 = v(r8)     // Catch:{ RuntimeException -> 0x0051, all -> 0x004f }
            int r10 = r(r8)     // Catch:{ RuntimeException -> 0x0051, all -> 0x004f }
            r0 = 16
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            r0 = r6
            goto L_0x003a
        L_0x0032:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = "getVideoBitrate: failed"
            defpackage.hm9.p(r1, r0, r11)     // Catch:{ RuntimeException -> 0x0046, all -> 0x004f }
        L_0x0039:
            r0 = r7
        L_0x003a:
            z(r8)
            r18 = r0
            r14 = r4
            r17 = r10
            goto L_0x007d
        L_0x0043:
            r3 = r8
            goto L_0x00c1
        L_0x0046:
            r0 = move-exception
            r19 = r4
            r4 = r3
            r3 = r8
            r5 = r10
            r10 = r19
            goto L_0x0065
        L_0x004f:
            r0 = move-exception
            goto L_0x0043
        L_0x0051:
            r0 = move-exception
            r10 = r4
            r5 = r6
            r4 = r3
        L_0x0055:
            r3 = r8
            goto L_0x0065
        L_0x0057:
            r0 = move-exception
            r9 = r3
            r10 = r4
            r5 = r6
            r4 = r9
            goto L_0x0055
        L_0x005d:
            r0 = move-exception
            goto L_0x00c1
        L_0x0060:
            r0 = move-exception
            r9 = r3
            r10 = r4
            r5 = r6
            r4 = r9
        L_0x0065:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r8.<init>(r2)     // Catch:{ all -> 0x005d }
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x005d }
            defpackage.hm9.o(r1, r0)     // Catch:{ all -> 0x005d }
            z(r3)
            r3 = r4
            r17 = r5
            r18 = r7
            r14 = r10
        L_0x007d:
            if (r9 == 0) goto L_0x00a6
            int r0 = r9.getWidth()     // Catch:{ all -> 0x00a4 }
            int r2 = r9.getHeight()     // Catch:{ all -> 0x00a4 }
            int r4 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x00a4 }
            r5 = 512(0x200, float:7.175E-43)
            if (r4 <= r5) goto L_0x00a6
            r5 = 1140850688(0x44000000, float:512.0)
            float r4 = (float) r4     // Catch:{ all -> 0x00a4 }
            float r5 = r5 / r4
            float r0 = (float) r0     // Catch:{ all -> 0x00a4 }
            float r0 = r0 * r5
            int r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x00a4 }
            float r2 = (float) r2     // Catch:{ all -> 0x00a4 }
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)     // Catch:{ all -> 0x00a4 }
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r9, r0, r2, r7)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a6
        L_0x00a4:
            r0 = move-exception
            goto L_0x00a8
        L_0x00a6:
            r13 = r9
            goto L_0x00ae
        L_0x00a8:
            java.lang.String r2 = "getVideoParams: failed to resize to thumbnail"
            defpackage.hm9.p(r1, r2, r0)
            goto L_0x00a6
        L_0x00ae:
            if (r3 == 0) goto L_0x00b3
            r16 = r3
            goto L_0x00ba
        L_0x00b3:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r6, r6)
            r16 = r0
        L_0x00ba:
            em5 r0 = new em5
            r12 = r0
            r12.<init>((android.graphics.Bitmap) r13, (long) r14, (android.graphics.Point) r16, (int) r17, (boolean) r18)
            return r0
        L_0x00c1:
            z(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s36.u(android.content.Context, android.net.Uri):em5");
    }

    public static Point v(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt == 90 || parseInt == 270) {
                String str = extractMetadata2;
                extractMetadata2 = extractMetadata;
                extractMetadata = str;
            }
            return new Point(Integer.parseInt(extractMetadata), Integer.parseInt(extractMetadata2));
        } catch (Throwable th) {
            hm9.p("s36", "getVideoSize: failed", th);
            return new Point(0, 0);
        }
    }

    public static final int x(String str) {
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 8; i++) {
                sb.append(str.charAt(1));
            }
            return Color.parseColor(sb.toString());
        } else if (length == 4) {
            return Color.parseColor("#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3));
        } else if (length == 7) {
            return Color.parseColor(str);
        } else {
            if (length != 9) {
                return 0;
            }
            return Color.parseColor(str);
        }
    }

    public static void y(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (e) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                uncaughtExceptionHandler = new h12(uncaughtExceptionHandler, defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public static void z(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused) {
            }
        }
    }

    public abstract CharSequence q();

    public abstract apd w(uod uod);
}
