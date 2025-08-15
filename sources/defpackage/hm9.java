package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.apache.http.protocol.HTTP;
import org.webrtc.MediaStreamTrack;

/* renamed from: hm9  reason: default package */
public abstract class hm9 {
    public static im9 a;
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] e = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f = {5, 8, 10, 12};
    public static final int[] g = {6, 9, 12, 15};
    public static final int[] h = {2, 4, 6, 8};
    public static final int[] i = {9, 11, 13, 16};
    public static final int[] j = {5, 8, 10, 12};
    public static final /* synthetic */ int k = 0;
    public static ArrayList l;
    public static volatile ir6 m;
    public static boolean n;

    public static s02 E(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new s02(bArr, bArr.length, 2, (byte) 0);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        s02 s02 = new s02(copyOf, copyOf.length, 2, (byte) 0);
        if (copyOf[0] == 31) {
            s02 s022 = new s02(copyOf, copyOf.length, 2, (byte) 0);
            while (s022.b() >= 16) {
                s022.t(2);
                int i4 = s022.i(14) & 16383;
                int min = Math.min(8 - s02.d, 14);
                int i5 = s02.d;
                int i6 = (8 - i5) - min;
                byte[] bArr2 = s02.b;
                int i7 = s02.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                bArr2[i7] = b5;
                int i8 = 14 - min;
                bArr2[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (i8 > 8) {
                    s02.b[i9] = (byte) (i4 >>> (i8 - 8));
                    i8 -= 8;
                    i9++;
                }
                int i10 = 8 - i8;
                byte[] bArr3 = s02.b;
                byte b6 = (byte) (bArr3[i9] & ((1 << i10) - 1));
                bArr3[i9] = b6;
                bArr3[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                s02.t(14);
                s02.a();
            }
        }
        s02.o(copyOf.length, copyOf);
        return s02;
    }

    public static final void G(String str, String str2, Throwable th) {
        ir6 ir6 = m;
        if (ir6 != null) {
            us7 us7 = us7.Y;
            if (str2 == null) {
                str2 = "";
            }
            ir6.b(ir6, us7, str, str2, (Object[]) null, th, 8);
        }
    }

    public static final void H(String str, String str2, Object... objArr) {
        ir6 ir6 = m;
        if (ir6 != null) {
            if (objArr.length == 0) {
                ir6.d(us7.Y, str, str2, (Throwable) null);
            } else {
                ir6.b(ir6, us7.Y, str, str2, objArr, (Throwable) null, 16);
            }
        }
    }

    public static void I(im9 im9) {
        boolean z;
        synchronized (hm9.class) {
            z = a != null;
        }
        if (!z) {
            synchronized (hm9.class) {
                try {
                    if (a == null) {
                        a = im9;
                    } else {
                        throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void J(e92 e92, long j2, mg4 mg4) {
        if (((d92) u(j2, e92.d(mg4)).b) == null) {
            e92.a(new d92(j2, j2), mg4);
        }
    }

    public static boolean K(long j2, d92 d92) {
        return d92 != null && d92.a <= j2 && j2 <= d92.b;
    }

    public static final RippleDrawable L(int i2, int i3) {
        ColorStateList valueOf = ColorStateList.valueOf(i3);
        ColorDrawable colorDrawable = i2 != 0 ? new ColorDrawable(i2) : null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(-65536);
        return new RippleDrawable(valueOf, colorDrawable, shapeDrawable);
    }

    public static boolean M(String str) {
        im9 im9;
        synchronized (hm9.class) {
            im9 = a;
            if (im9 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return im9.b(str);
    }

    public static final void N(us7 us7, String str, String str2, Object... objArr) {
        int ordinal = us7.ordinal();
        if (ordinal == 0) {
            h0(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 1) {
            m(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 2) {
            H(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 3) {
            m0(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 4) {
            q(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 5) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            ir6 ir6 = m;
            if (ir6 != null) {
                ir6.b(ir6, us7.t0, str, str2, copyOf, (Throwable) null, 16);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static void O(ArrayList arrayList) {
        Iterator it;
        ArrayList arrayList2 = arrayList;
        int i2 = 1;
        if (arrayList.size() > 1) {
            ArrayList arrayList3 = null;
            boolean z = true;
            while (z && arrayList.size() > i2) {
                Iterator it2 = arrayList.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    d92 d92 = (d92) it2.next();
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    } else {
                        arrayList3.clear();
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            break;
                        }
                        d92 d922 = (d92) it3.next();
                        if (d92 != d922) {
                            long j2 = d92.a;
                            long j3 = d922.a;
                            int i3 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                            long j4 = d92.b;
                            it = it2;
                            long j5 = d922.b;
                            if ((i3 >= 0 && j2 <= j5) || (j4 >= j3 && j4 <= j5)) {
                                d92 d923 = new d92(Math.min(j2, j3), Math.max(j4, j5));
                                arrayList3.add(d92);
                                arrayList3.add(d922);
                                arrayList2.add(d923);
                                z2 = true;
                            }
                            if (z2) {
                                break;
                            }
                            it2 = it;
                        }
                    }
                    arrayList2.removeAll(arrayList3);
                    if (z2) {
                        break;
                    }
                    it2 = it;
                }
                z = z2;
                i2 = 1;
            }
            Collections.sort(arrayList2, new v00(16));
        }
    }

    public static e2f P(int i2, w1f... w1fArr) {
        e2f e2f = new e2f();
        for (w1f w1f : w1fArr) {
            if (w1f != null) {
                e2f.R(w1f);
            }
        }
        e2f.U(i2);
        return e2f;
    }

    public static void Q(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
            m("hm9", "openExternalBrowser: flagActivityNoHistory = false", new Object[0]);
        } catch (ActivityNotFoundException e2) {
            a14.N(0, context, context.getString(jpc.v));
            p("hm9", "openWebLink: " + e2.getMessage(), (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0141 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143 A[Catch:{ Exception -> 0x015c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void R(android.content.Context r14, java.lang.String r15) {
        /*
            r0 = 1
            r1 = 0
            boolean r2 = defpackage.oag.t(r15)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x0028
            android.text.Spannable$Factory r2 = android.text.Spannable.Factory.getInstance()     // Catch:{ all -> 0x0028 }
            android.text.Spannable r2 = r2.newSpannable(r15)     // Catch:{ all -> 0x0028 }
            android.text.util.Linkify.addLinks(r2, r0)     // Catch:{ all -> 0x0028 }
            int r3 = r2.length()     // Catch:{ all -> 0x0028 }
            java.lang.Class<android.text.style.URLSpan> r4 = android.text.style.URLSpan.class
            java.lang.Object[] r2 = r2.getSpans(r1, r3, r4)     // Catch:{ all -> 0x0028 }
            android.text.style.URLSpan[] r2 = (android.text.style.URLSpan[]) r2     // Catch:{ all -> 0x0028 }
            int r3 = r2.length     // Catch:{ all -> 0x0028 }
            if (r3 <= 0) goto L_0x0028
            r2 = r2[r1]     // Catch:{ all -> 0x0028 }
            java.lang.String r15 = r2.getURL()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = 0
            android.net.Uri r3 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x015c }
            fl7 r4 = defpackage.fl7.q     // Catch:{ Exception -> 0x015c }
            boolean r5 = r4.d(r3)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x015c
            ed3 r5 = defpackage.vl.b()     // Catch:{ Exception -> 0x015c }
            y8a r5 = (defpackage.y8a) r5     // Catch:{ Exception -> 0x015c }
            v4 r5 = r5.getAccessor()     // Catch:{ Exception -> 0x015c }
            java.lang.Class<el3> r6 = defpackage.el3.class
            java.lang.Object r5 = r5.c(r6)     // Catch:{ Exception -> 0x015c }
            el3 r5 = (defpackage.el3) r5     // Catch:{ Exception -> 0x015c }
            ed3 r6 = defpackage.vl.b()     // Catch:{ Exception -> 0x015c }
            y8a r6 = (defpackage.y8a) r6     // Catch:{ Exception -> 0x015c }
            p82 r6 = r6.e()     // Catch:{ Exception -> 0x015c }
            java.util.List r7 = r4.b(r6, r3)     // Catch:{ Exception -> 0x015c }
            boolean r8 = r7.isEmpty()     // Catch:{ Exception -> 0x015c }
            java.util.Set r9 = r6.k
            if (r8 != 0) goto L_0x0071
            java.lang.Object r8 = r7.get(r1)     // Catch:{ Exception -> 0x015c }
            e52 r8 = (defpackage.e52) r8     // Catch:{ Exception -> 0x015c }
            long r10 = r8.a     // Catch:{ Exception -> 0x015c }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x015c }
            boolean r8 = r9.contains(r8)     // Catch:{ Exception -> 0x015c }
            if (r8 == 0) goto L_0x0071
            r8 = r0
            goto L_0x0072
        L_0x0071:
            r8 = r1
        L_0x0072:
            sk7 r10 = new sk7     // Catch:{ Exception -> 0x015c }
            r10.<init>(r4, r0)     // Catch:{ Exception -> 0x015c }
            el7 r3 = r4.c(r3, r10)     // Catch:{ Exception -> 0x015c }
            boolean r10 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x015c }
            if (r10 != 0) goto L_0x0086
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x015c }
            goto L_0x00d1
        L_0x0086:
            java.util.concurrent.ConcurrentHashMap r5 = r5.b     // Catch:{ Exception -> 0x015c }
            java.util.Collection r5 = r5.values()     // Catch:{ Exception -> 0x015c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x015c }
            r10 = r2
        L_0x0091:
            boolean r11 = r5.hasNext()     // Catch:{ Exception -> 0x015c }
            if (r11 == 0) goto L_0x00c9
            java.lang.Object r11 = r5.next()     // Catch:{ Exception -> 0x015c }
            uj3 r11 = (defpackage.uj3) r11     // Catch:{ Exception -> 0x015c }
            ql3 r12 = r11.a     // Catch:{ Exception -> 0x015c }
            pl3 r12 = r12.c     // Catch:{ Exception -> 0x015c }
            java.lang.String r12 = r12.p     // Catch:{ Exception -> 0x015c }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x015c }
            if (r13 != 0) goto L_0x00bb
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x015c }
            sk7 r13 = new sk7     // Catch:{ Exception -> 0x015c }
            r13.<init>(r4, r0)     // Catch:{ Exception -> 0x015c }
            el7 r12 = r4.c(r12, r13)     // Catch:{ Exception -> 0x015c }
            boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x015c }
            goto L_0x00bc
        L_0x00bb:
            r12 = r1
        L_0x00bc:
            if (r12 == 0) goto L_0x0091
            if (r10 != 0) goto L_0x00c5
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x015c }
            r10.<init>()     // Catch:{ Exception -> 0x015c }
        L_0x00c5:
            r10.add(r11)     // Catch:{ Exception -> 0x015c }
            goto L_0x0091
        L_0x00c9:
            if (r10 != 0) goto L_0x00d0
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x015c }
            goto L_0x00d1
        L_0x00d0:
            r3 = r10
        L_0x00d1:
            boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x015c }
            if (r4 != 0) goto L_0x00f5
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Exception -> 0x015c }
            uj3 r3 = (defpackage.uj3) r3     // Catch:{ Exception -> 0x015c }
            long r3 = r3.n()     // Catch:{ Exception -> 0x015c }
            e52 r3 = r6.F(r3)     // Catch:{ Exception -> 0x015c }
            if (r3 == 0) goto L_0x00f6
            long r4 = r3.a     // Catch:{ Exception -> 0x015c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x015c }
            boolean r4 = r9.contains(r4)     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x00f6
            r8 = r0
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            if (r8 != 0) goto L_0x0391
            ll3 r4 = defpackage.ll3.o
            if (r3 == 0) goto L_0x0114
            uj3 r5 = r3.l()     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x0110
            ql3 r5 = r5.a     // Catch:{ Exception -> 0x015c }
            pl3 r5 = r5.c     // Catch:{ Exception -> 0x015c }
            java.util.List r5 = r5.n     // Catch:{ Exception -> 0x015c }
            boolean r5 = r5.contains(r4)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x0110
            r5 = r0
            goto L_0x0111
        L_0x0110:
            r5 = r1
        L_0x0111:
            if (r5 == 0) goto L_0x0114
            goto L_0x013f
        L_0x0114:
            boolean r3 = r7.isEmpty()     // Catch:{ Exception -> 0x015c }
            if (r3 != 0) goto L_0x013e
            java.lang.Object r3 = r7.get(r1)     // Catch:{ Exception -> 0x015c }
            e52 r3 = (defpackage.e52) r3     // Catch:{ Exception -> 0x015c }
            uj3 r3 = r3.l()     // Catch:{ Exception -> 0x015c }
            if (r3 == 0) goto L_0x0134
            ql3 r3 = r3.a     // Catch:{ Exception -> 0x015c }
            pl3 r3 = r3.c     // Catch:{ Exception -> 0x015c }
            java.util.List r3 = r3.n     // Catch:{ Exception -> 0x015c }
            boolean r3 = r3.contains(r4)     // Catch:{ Exception -> 0x015c }
            if (r3 == 0) goto L_0x0134
            r3 = r0
            goto L_0x0135
        L_0x0134:
            r3 = r1
        L_0x0135:
            if (r3 == 0) goto L_0x013e
            java.lang.Object r3 = r7.get(r1)     // Catch:{ Exception -> 0x015c }
            e52 r3 = (defpackage.e52) r3     // Catch:{ Exception -> 0x015c }
            goto L_0x013f
        L_0x013e:
            r3 = r2
        L_0x013f:
            if (r3 != 0) goto L_0x0143
            goto L_0x0391
        L_0x0143:
            ed3 r4 = defpackage.vl.b()     // Catch:{ Exception -> 0x015c }
            y8a r4 = (defpackage.y8a) r4     // Catch:{ Exception -> 0x015c }
            v4 r4 = r4.getAccessor()     // Catch:{ Exception -> 0x015c }
            java.lang.Class<lca> r5 = defpackage.lca.class
            java.lang.Object r4 = r4.c(r5)     // Catch:{ Exception -> 0x015c }
            lca r4 = (defpackage.lca) r4     // Catch:{ Exception -> 0x015c }
            long r5 = r3.a     // Catch:{ Exception -> 0x015c }
            r4.a(r5)     // Catch:{ Exception -> 0x015c }
            goto L_0x0391
        L_0x015c:
            android.content.pm.PackageManager r3 = r14.getPackageManager()
            java.util.ArrayList r4 = l
            java.lang.String r5 = "http://www.example.com"
            java.lang.String r6 = "android.intent.action.VIEW"
            if (r4 != 0) goto L_0x019c
            android.content.Intent r4 = new android.content.Intent
            android.net.Uri r7 = android.net.Uri.parse(r5)
            r4.<init>(r6, r7)
            java.util.List r4 = r3.queryIntentActivities(r4, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            l = r7
            java.util.Iterator r4 = r4.iterator()
        L_0x0180:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x019c
            java.lang.Object r7 = r4.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            if (r7 == 0) goto L_0x0180
            android.content.pm.ApplicationInfo r7 = r7.applicationInfo
            if (r7 == 0) goto L_0x0180
            java.util.ArrayList r8 = l
            java.lang.String r7 = r7.packageName
            r8.add(r7)
            goto L_0x0180
        L_0x019c:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r6)
            android.net.Uri r7 = android.net.Uri.parse(r15)
            r4.setData(r7)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r4.setFlags(r7)
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r4, r1)
            java.lang.String r7 = "hm9"
            if (r3 == 0) goto L_0x01c4
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 == 0) goto L_0x01c4
            java.util.ArrayList r8 = l
            java.lang.String r3 = r3.packageName
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x01c4
            goto L_0x01e1
        L_0x01c4:
            r14.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            r3.<init>()     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.String r4 = "openExternalApp started activity: "
            r3.append(r4)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.String r4 = defpackage.oag.x(r15)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            r3.append(r4)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.String r3 = r3.toString()     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            m(r7, r3, new java.lang.Object[0])     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            goto L_0x0391
        L_0x01e1:
            vl r3 = defpackage.vl.o
            p7b r3 = r3.a()
            jp r3 = r3.c
            ne7 r3 = r3.g
            java.lang.String r4 = "app.messages.inAppBrowser"
            boolean r3 = r3.getBoolean(r4, r0)
            if (r3 == 0) goto L_0x038e
            android.net.Uri r3 = android.net.Uri.parse(r15)
            java.lang.String r4 = defpackage.br7.a
            if (r4 == 0) goto L_0x01fd
            goto L_0x02f2
        L_0x01fd:
            android.content.pm.PackageManager r4 = r14.getPackageManager()
            android.content.Intent r8 = new android.content.Intent
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r8.<init>(r6, r5)
            android.content.pm.ResolveInfo r5 = r4.resolveActivity(r8, r1)
            if (r5 == 0) goto L_0x0215
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.packageName
            goto L_0x0216
        L_0x0215:
            r5 = r2
        L_0x0216:
            java.util.List r9 = r4.queryIntentActivities(r8, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0223:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x024e
            java.lang.Object r11 = r9.next()
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r13 = "android.support.customtabs.action.CustomTabsService"
            r12.setAction(r13)
            android.content.pm.ActivityInfo r13 = r11.activityInfo
            java.lang.String r13 = r13.packageName
            r12.setPackage(r13)
            android.content.pm.ResolveInfo r12 = r4.resolveService(r12, r1)
            if (r12 == 0) goto L_0x0223
            android.content.pm.ActivityInfo r11 = r11.activityInfo
            java.lang.String r11 = r11.packageName
            r10.add(r11)
            goto L_0x0223
        L_0x024e:
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x0258
            defpackage.br7.a = r2
            goto L_0x02f0
        L_0x0258:
            java.lang.String[] r4 = defpackage.br7.b
            r4 = r4[r1]
            boolean r9 = r10.contains(r4)
            if (r9 == 0) goto L_0x0265
            r10.remove(r4)
        L_0x0265:
            int r4 = r10.size()
            if (r4 != r0) goto L_0x0275
            java.lang.Object r4 = r10.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            defpackage.br7.a = r4
            goto L_0x02f0
        L_0x0275:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x02c5
            android.content.pm.PackageManager r4 = r14.getPackageManager()     // Catch:{ RuntimeException -> 0x02b5 }
            r9 = 64
            java.util.List r4 = r4.queryIntentActivities(r8, r9)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r4 == 0) goto L_0x02bc
            int r8 = r4.size()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r8 != 0) goto L_0x028e
            goto L_0x02bc
        L_0x028e:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x0292:
            boolean r8 = r4.hasNext()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r8 == 0) goto L_0x02bc
            java.lang.Object r8 = r4.next()     // Catch:{ RuntimeException -> 0x02b5 }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ RuntimeException -> 0x02b5 }
            android.content.IntentFilter r9 = r8.filter     // Catch:{ RuntimeException -> 0x02b5 }
            if (r9 != 0) goto L_0x02a3
            goto L_0x0292
        L_0x02a3:
            int r11 = r9.countDataAuthorities()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r11 == 0) goto L_0x0292
            int r9 = r9.countDataPaths()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r9 != 0) goto L_0x02b0
            goto L_0x0292
        L_0x02b0:
            android.content.pm.ActivityInfo r8 = r8.activityInfo     // Catch:{ RuntimeException -> 0x02b5 }
            if (r8 != 0) goto L_0x02c5
            goto L_0x0292
        L_0x02b5:
            java.lang.String r4 = "CustomTabsHelper"
            java.lang.String r8 = "Runtime exception while getting specialized handlers"
            p(r4, r8, r2)
        L_0x02bc:
            boolean r4 = r10.contains(r5)
            if (r4 == 0) goto L_0x02c5
            defpackage.br7.a = r5
            goto L_0x02f0
        L_0x02c5:
            java.lang.String r4 = "com.android.chrome"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02d0
            defpackage.br7.a = r4
            goto L_0x02f0
        L_0x02d0:
            java.lang.String r4 = "com.chrome.beta"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02db
            defpackage.br7.a = r4
            goto L_0x02f0
        L_0x02db:
            java.lang.String r4 = "com.chrome.dev"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02e6
            defpackage.br7.a = r4
            goto L_0x02f0
        L_0x02e6:
            java.lang.String r4 = "com.google.android.apps.chrome"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02f0
            defpackage.br7.a = r4
        L_0x02f0:
            java.lang.String r4 = defpackage.br7.a
        L_0x02f2:
            boolean r5 = defpackage.oag.t(r4)
            if (r5 == 0) goto L_0x030b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "openCustomTab: return false, empty packagename "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            m(r7, r0, new java.lang.Object[0])
            goto L_0x038a
        L_0x030b:
            khe r5 = defpackage.sme.a0
            sme r5 = defpackage.fm9.R(r14)
            int r5 = r5.N
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r6)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 | r6
            java.lang.String r6 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            android.os.Bundle r5 = defpackage.zr6.g(r5, r6)
            java.lang.String r6 = "android.support.customtabs.extra.SESSION"
            boolean r9 = r8.hasExtra(r6)
            if (r9 != 0) goto L_0x0334
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r9.putBinder(r6, r2)
            r8.putExtras(r9)
        L_0x0334:
            java.lang.String r6 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r8.putExtra(r6, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r8.putExtras(r0)
            r8.putExtras(r5)
            java.lang.String r0 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r8.putExtra(r0, r1)
            r8.setPackage(r4)
            boolean r0 = r14 instanceof android.app.Activity     // Catch:{ ActivityNotFoundException -> 0x0374 }
            if (r0 == 0) goto L_0x0357
            r8.setData(r3)     // Catch:{ ActivityNotFoundException -> 0x0374 }
            r14.startActivity(r8, r2)     // Catch:{ ActivityNotFoundException -> 0x0374 }
            goto L_0x035a
        L_0x0357:
            r14.startActivity(r8)     // Catch:{ ActivityNotFoundException -> 0x0374 }
        L_0x035a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "openCustomTab: "
            r14.<init>(r15)
            java.lang.String r15 = r3.toString()
            java.lang.String r15 = defpackage.oag.x(r15)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            m(r7, r14, new java.lang.Object[0])
            goto L_0x0391
        L_0x0374:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "openCustomTab: return false, exception "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m(r7, r0, new java.lang.Object[0])
        L_0x038a:
            Q(r14, r15)
            goto L_0x0391
        L_0x038e:
            Q(r14, r15)
        L_0x0391:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm9.R(android.content.Context, java.lang.String):void");
    }

    public static final GradientDrawable S(Integer num, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(num.intValue());
        if (!(num2 == null || num3 == null)) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList T(defpackage.yaf r28) {
        /*
            r0 = r28
            int r1 = r28.v()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 7
            r0.I(r1)
            int r3 = r28.h()
            r4 = 1684433976(0x64666c38, float:1.7002196E22)
            r5 = 1
            if (r3 != r4) goto L_0x0039
            yaf r3 = new yaf
            r4 = 3
            r6 = 0
            r3.<init>((int) r4, (boolean) r6)
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r5)
            boolean r0 = defpackage.maf.A(r0, r3, r4)     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002e
            r4.end()
            return r2
        L_0x002e:
            r4.end()
            r0 = r3
            goto L_0x003f
        L_0x0033:
            r0 = move-exception
            r1 = r0
            r4.end()
            throw r1
        L_0x0039:
            r4 = 1918990112(0x72617720, float:4.465801E30)
            if (r3 == r4) goto L_0x003f
            return r2
        L_0x003f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.b
            int r6 = r0.c
        L_0x0048:
            if (r4 >= r6) goto L_0x01cf
            int r7 = r0.h()
            int r7 = r7 + r4
            if (r7 <= r4) goto L_0x01b5
            if (r7 <= r6) goto L_0x0055
            goto L_0x01b5
        L_0x0055:
            int r4 = r0.h()
            r8 = 1835365224(0x6d657368, float:4.438224E27)
            if (r4 != r8) goto L_0x01bd
            int r4 = r0.h()
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r8) goto L_0x006f
        L_0x0066:
            r1 = r2
            r28 = r3
            r20 = r5
            r19 = r6
            goto L_0x01b3
        L_0x006f:
            float[] r8 = new float[r4]
            r10 = 0
        L_0x0072:
            if (r10 >= r4) goto L_0x0081
            int r11 = r0.h()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x0072
        L_0x0081:
            int r10 = r0.h()
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r10 <= r11) goto L_0x008a
            goto L_0x0066
        L_0x008a:
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.log(r11)
            r28 = r3
            double r2 = (double) r4
            double r2 = r2 * r11
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r13
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            s02 r3 = new s02
            byte[] r9 = r0.a
            int r15 = r9.length
            r11 = 1
            r12 = 0
            r3.<init>((byte[]) r9, (int) r15, (int) r11, (byte) r12)
            int r9 = r0.b
            r11 = 8
            int r9 = r9 * r11
            r3.q(r9)
            int r9 = r10 * 5
            float[] r9 = new float[r9]
            r12 = 5
            int[] r15 = new int[r12]
            r11 = 0
            r18 = 0
        L_0x00ba:
            if (r11 >= r10) goto L_0x00ed
            r1 = 0
        L_0x00bd:
            if (r1 >= r12) goto L_0x00e8
            r19 = r15[r1]
            int r20 = r3.i(r2)
            int r21 = r20 >> 1
            r12 = r20 & 1
            int r12 = -r12
            r12 = r21 ^ r12
            int r12 = r12 + r19
            if (r12 >= r4) goto L_0x00e1
            if (r12 >= 0) goto L_0x00d3
            goto L_0x00e1
        L_0x00d3:
            int r19 = r18 + 1
            r20 = r8[r12]
            r9[r18] = r20
            r15[r1] = r12
            int r1 = r1 + 1
            r18 = r19
            r12 = 5
            goto L_0x00bd
        L_0x00e1:
            r20 = r5
            r19 = r6
        L_0x00e5:
            r1 = 0
            goto L_0x01b3
        L_0x00e8:
            int r11 = r11 + 1
            r1 = 7
            r12 = 5
            goto L_0x00ba
        L_0x00ed:
            int r1 = r3.g()
            r2 = 7
            int r1 = r1 + r2
            r1 = r1 & -8
            r3.q(r1)
            r1 = 32
            int r4 = r3.i(r1)
            ty[] r8 = new defpackage.ty[r4]
            r11 = 0
        L_0x0101:
            if (r11 >= r4) goto L_0x01aa
            r12 = 8
            int r15 = r3.i(r12)
            int r2 = r3.i(r12)
            int r12 = r3.i(r1)
            r1 = 128000(0x1f400, float:1.79366E-40)
            if (r12 <= r1) goto L_0x0117
            goto L_0x00e1
        L_0x0117:
            r19 = r6
            double r5 = (double) r10
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r16
            double r5 = java.lang.Math.log(r5)
            double r5 = r5 / r13
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r6 = r12 * 3
            float[] r6 = new float[r6]
            int r1 = r12 * 2
            float[] r1 = new float[r1]
            r21 = r1
            r1 = 0
            r22 = 0
        L_0x0135:
            if (r1 >= r12) goto L_0x018c
            int r23 = r3.i(r5)
            int r24 = r23 >> 1
            r25 = r3
            r20 = 1
            r3 = r23 & 1
            r27 = r21
            r21 = r4
            r4 = r27
            int r3 = -r3
            r3 = r24 ^ r3
            int r3 = r3 + r22
            if (r3 < 0) goto L_0x0152
            if (r3 < r10) goto L_0x0155
        L_0x0152:
            r20 = 1
            goto L_0x00e5
        L_0x0155:
            int r22 = r1 * 3
            int r23 = r3 * 5
            r24 = r9[r23]
            r6[r22] = r24
            int r24 = r22 + 1
            int r26 = r23 + 1
            r26 = r9[r26]
            r6[r24] = r26
            int r22 = r22 + 2
            int r24 = r23 + 2
            r24 = r9[r24]
            r6[r22] = r24
            int r22 = r1 * 2
            int r24 = r23 + 3
            r24 = r9[r24]
            r4[r22] = r24
            r20 = 1
            int r22 = r22 + 1
            int r23 = r23 + 4
            r23 = r9[r23]
            r4[r22] = r23
            int r1 = r1 + 1
            r22 = r3
            r3 = r25
            r27 = r21
            r21 = r4
            r4 = r27
            goto L_0x0135
        L_0x018c:
            r25 = r3
            r20 = 1
            r27 = r21
            r21 = r4
            r4 = r27
            ty r1 = new ty
            r1.<init>((int) r15, (int) r2, (float[]) r6, (float[]) r4)
            r8[r11] = r1
            int r11 = r11 + 1
            r6 = r19
            r5 = r20
            r4 = r21
            r1 = 32
            r2 = 7
            goto L_0x0101
        L_0x01aa:
            r20 = r5
            r19 = r6
            bob r1 = new bob
            r1.<init>(r8)
        L_0x01b3:
            if (r1 != 0) goto L_0x01b7
        L_0x01b5:
            r2 = 0
            goto L_0x01d0
        L_0x01b7:
            r2 = r28
            r2.add(r1)
            goto L_0x01c2
        L_0x01bd:
            r2 = r3
            r20 = r5
            r19 = r6
        L_0x01c2:
            r0.H(r7)
            r3 = r2
            r4 = r7
            r6 = r19
            r5 = r20
            r1 = 7
            r2 = 0
            goto L_0x0048
        L_0x01cf:
            r2 = r3
        L_0x01d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm9.T(yaf):java.util.ArrayList");
    }

    public static int U(s02 s02, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && s02.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return s02.i(iArr[i2]) + i4;
    }

    public static void V(Context context, String str) {
        if (context == null) {
            o("hm9", "playVideoLink: can't play " + str + " on a null context");
            return;
        }
        ((y8a) vl.b()).b().g("MESSAGE_LINK_OPEN", MediaStreamTrack.VIDEO_TRACK_KIND);
        R(context, str);
    }

    public static String W(d92 d92) {
        if (d92 == null) {
            return null;
        }
        Date date = new Date(d92.a);
        Date date2 = new Date(d92.b);
        return String.format(Locale.ENGLISH, "time[%tF %tT %tL - %tF %tT %tL], millis[%d - %d]", new Object[]{date, date, date, date2, date2, date2, Long.valueOf(date.getTime()), Long.valueOf(date2.getTime())});
    }

    public static String X(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.size() <= 0) {
            sb.append("chunks count=0");
        } else {
            sb.append("chunks count=");
            sb.append(arrayList.size());
            sb.append(": ");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(W((d92) it.next()));
                sb.append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static int Y(InputStream inputStream, byte[] bArr, int i2) {
        inputStream.getClass();
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        defpackage.v3c.i(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] Z(java.io.File r3) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r0)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            defpackage.ema.l(r2, r1, 8192)     // Catch:{ all -> 0x001e }
            r3 = 0
            defpackage.v3c.i(r2, r3)
            r1.close()
            byte[] r3 = r0.toByteArray()
            return r3
        L_0x001e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            defpackage.v3c.i(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm9.Z(java.io.File):byte[]");
    }

    public static final int[] a(fka fka) {
        int ordinal = fka.h().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new int[]{f8.G(-1, 0.2f), 0};
            } else if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new int[]{f8.G(-1, 0.5f), 0};
    }

    public static void a0(w1f w1f, List list, ArrayList arrayList) {
        ArrayList arrayList2;
        int i2 = 0;
        if (w1f instanceof e2f) {
            e2f e2f = (e2f) w1f;
            int size = e2f.R0.size();
            while (i2 < size) {
                a0(e2f.S(i2), list, arrayList);
                i2++;
            }
            return;
        }
        ArrayList arrayList3 = w1f.X;
        if (!(!(arrayList3 == null || arrayList3.isEmpty())) && (arrayList2 = w1f.Y) != null && arrayList2.size() == list.size() && arrayList2.containsAll(list)) {
            int size2 = arrayList == null ? 0 : arrayList.size();
            while (i2 < size2) {
                w1f.b((View) arrayList.get(i2));
                i2++;
            }
            for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                w1f.E((View) list.get(size3));
            }
        }
    }

    public static void b(w1f w1f, ArrayList arrayList) {
        if (w1f != null) {
            int i2 = 0;
            if (w1f instanceof e2f) {
                e2f e2f = (e2f) w1f;
                int size = e2f.R0.size();
                while (i2 < size) {
                    b(e2f.S(i2), arrayList);
                    i2++;
                }
                return;
            }
            ArrayList arrayList2 = w1f.X;
            if (!(!(arrayList2 == null || arrayList2.isEmpty()))) {
                ArrayList arrayList3 = w1f.Y;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        w1f.b((View) arrayList.get(i2));
                        i2++;
                    }
                }
            }
        }
    }

    public static final GradientDrawable b0(Integer num, Integer num2, Integer num3, int i2) {
        float f2 = (float) i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = f2;
        }
        return c0(num, num2, num3, fArr);
    }

    public static final GradientDrawable c0(Integer num, Integer num2, Integer num3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (!(num2 == null || num3 == null)) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static void d0(b bVar, File file, kk5 kk5) {
        try {
            Uri f2 = kk5.f(bVar, file);
            die die = new die((Context) bVar, 13);
            ((Intent) die.b).setType("image/*");
            die.Q(f2);
            die.R((CharSequence) null);
            die.S();
        } catch (Exception e2) {
            p("hm9", "sharePhoto error", e2);
        }
    }

    public static wx e() {
        wx wxVar = wx.j.f;
        Class<wx> cls = wx.class;
        if (wxVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(wx.h);
            if (wx.j.f != null || System.nanoTime() - nanoTime < wx.i) {
                return null;
            }
            return wx.j;
        }
        long nanoTime2 = wxVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / 1000000;
            cls.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
            return null;
        }
        wx.j.f = wxVar.f;
        wxVar.f = null;
        return wxVar;
    }

    public static void e0(Context context, String str) {
        try {
            die die = new die(context, 13);
            ((Intent) die.b).setType(HTTP.PLAIN_TEXT_TYPE);
            die.R(str);
            die.S();
        } catch (Exception e2) {
            p("hm9", "shareText error", e2);
        }
    }

    public static final RippleDrawable f(int i2, int i3, int i4, int i5) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, (float) i5);
        return new RippleDrawable(ColorStateList.valueOf(i3), g0(c0(Integer.valueOf(i2), (Integer) null, (Integer) null, fArr), (GradientDrawable) null, c0(Integer.valueOf(i4), (Integer) null, (Integer) null, fArr)), c0(-65536, (Integer) null, (Integer) null, fArr));
    }

    public static void f0(Context context, File file, kk5 kk5) {
        try {
            Uri f2 = kk5.f(context, file);
            die die = new die(context, 13);
            ((Intent) die.b).setType("video/*");
            die.Q(f2);
            die.R((CharSequence) null);
            die.S();
        } catch (Exception e2) {
            p("hm9", "shareVideo error", e2);
        }
    }

    public static final void g(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder k2 = au1.k(j2, "size=", " offset=");
            k2.append(j3);
            k2.append(" byteCount=");
            k2.append(j4);
            throw new ArrayIndexOutOfBoundsException(k2.toString());
        }
    }

    public static final StateListDrawable g0(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (gradientDrawable2 != null) {
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
            stateListDrawable.addState(new int[]{16842908}, gradientDrawable2);
            stateListDrawable.addState(new int[]{16843518}, gradientDrawable2);
        }
        if (gradientDrawable3 != null) {
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        }
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public static ArrayList h(e92 e92, long j2, mg4 mg4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = e92.d(mg4).iterator();
        while (it.hasNext()) {
            d92 d92 = (d92) it.next();
            if (d92.b >= j2) {
                if (d92.a > j2) {
                    arrayList.add(d92);
                } else if (K(j2, d92)) {
                    long j3 = 1 + j2;
                    long j4 = d92.b;
                    if (j3 <= j4) {
                        if (j3 == -1) {
                            l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        if (j4 == -1) {
                            l0("Chunk.Builder", "", new IllegalStateException("end time is -1"));
                        }
                        arrayList.add(new d92(j3, j4));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void h0(String str, String str2, Object... objArr) {
        ir6 ir6 = m;
        if (ir6 != null) {
            if (objArr.length == 0) {
                ir6.d(us7.o, str, str2, (Throwable) null);
            } else {
                ir6.b(ir6, us7.o, str, str2, objArr, (Throwable) null, 16);
            }
        }
    }

    public static mud i(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        mud mud;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                matcher.group();
                mud = new mud(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                mud = new mud(str, unsatisfiedLinkError.toString());
            }
        } else {
            mud = new mud(str, unsatisfiedLinkError.toString());
        }
        mud.initCause(unsatisfiedLinkError);
        return mud;
    }

    public static final void j(String str, k56 k56) {
        ir6 ir6 = m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, (String) k56.invoke(), (Throwable) null);
        }
    }

    public static void j0(int i2, String str) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
        }
    }

    public static final void k(String str, String str2) {
        m(str, str2, new Object[0]);
    }

    public static final void k0(String str, Exception exc, String str2, Object... objArr) {
        ir6 ir6 = m;
        if (ir6 != null) {
            if (objArr.length == 0) {
                ir6.b(ir6, us7.Z, str, str2, (Object[]) null, exc, 8);
            } else {
                ir6.a(us7.Z, str, str2, objArr, exc);
            }
        }
    }

    public static final void l(String str, String str2, Throwable th) {
        ir6 ir6 = m;
        if (ir6 != null) {
            us7 us7 = us7.X;
            if (str2 == null) {
                str2 = "";
            }
            ir6.b(ir6, us7, str, str2, (Object[]) null, th, 8);
        }
    }

    public static final void l0(String str, String str2, Throwable th) {
        ir6 ir6 = m;
        if (ir6 != null) {
            ir6.b(ir6, us7.Z, str, str2, (Object[]) null, th, 8);
        }
    }

    public static final void m(String str, String str2, Object... objArr) {
        ir6 ir6 = m;
        if (ir6 != null) {
            if (objArr.length == 0) {
                ir6.d(us7.X, str, str2, (Throwable) null);
            } else {
                ir6.b(ir6, us7.X, str, str2, objArr, (Throwable) null, 16);
            }
        }
    }

    public static final void m0(String str, String str2, Object... objArr) {
        k0(str, (Exception) null, str2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void o(String str, String str2) {
        p(str, str2, (Throwable) null);
    }

    public static final void p(String str, String str2, Throwable th) {
        ir6 ir6 = m;
        if (ir6 != null) {
            us7 us7 = us7.s0;
            if (str2 == null) {
                str2 = "";
            }
            ir6.b(ir6, us7, str, str2, (Object[]) null, th, 8);
        }
    }

    public static final void q(String str, String str2, Object... objArr) {
        ir6 ir6 = m;
        if (ir6 != null) {
            ir6.b(ir6, us7.s0, str, str2, objArr, (Throwable) null, 16);
        }
    }

    public static final void r(String str, Throwable th, String str2, Object... objArr) {
        ir6 ir6 = m;
        if (ir6 != null) {
            ir6.a(us7.s0, str, str2, objArr, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r9 > 0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        if (r13 > 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        if (r13 > 0) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList s(java.util.List r5, java.util.List r6, long r7, int r9, long r10, int r12, long r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            int r5 = r6.size()
            r1 = 0
            if (r5 <= 0) goto L_0x0090
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            fs8 r5 = (defpackage.fs8) r5
            int r3 = r6.size()
            int r3 = r3 + -1
            java.lang.Object r6 = r6.get(r3)
            fs8 r6 = (defpackage.fs8) r6
            ng4 r3 = r5.D0
            if (r3 == 0) goto L_0x0027
            long r3 = r3.a
            goto L_0x0029
        L_0x0027:
            long r3 = r5.b
        L_0x0029:
            ng4 r5 = r6.D0
            if (r5 == 0) goto L_0x0030
            long r5 = r5.a
            goto L_0x0032
        L_0x0030:
            long r5 = r6.b
        L_0x0032:
            if (r9 <= 0) goto L_0x0066
            if (r12 <= 0) goto L_0x0066
            int r9 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0049
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x003f
            goto L_0x004d
        L_0x003f:
            if (r9 <= 0) goto L_0x0047
            long r9 = java.lang.Math.max(r10, r3)
            r10 = r9
            goto L_0x004d
        L_0x0047:
            r10 = r3
            goto L_0x004d
        L_0x0049:
            long r10 = java.lang.Math.min(r7, r3)
        L_0x004d:
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0060
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0058
            if (r9 <= 0) goto L_0x005e
            goto L_0x009a
        L_0x0058:
            if (r9 <= 0) goto L_0x005e
            long r5 = java.lang.Math.min(r13, r5)
        L_0x005e:
            r13 = r5
            goto L_0x009a
        L_0x0060:
            long r5 = java.lang.Math.max(r7, r5)
            r7 = r5
            goto L_0x009b
        L_0x0066:
            if (r12 <= 0) goto L_0x007c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0073
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0071
            goto L_0x009d
        L_0x0071:
            r13 = r5
            goto L_0x009d
        L_0x0073:
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0071
            long r5 = java.lang.Math.min(r13, r5)
            goto L_0x0071
        L_0x007c:
            if (r9 <= 0) goto L_0x008f
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0083
            goto L_0x009b
        L_0x0083:
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x008d
            long r5 = java.lang.Math.max(r10, r3)
            r10 = r5
            goto L_0x009b
        L_0x008d:
            r10 = r3
            goto L_0x009b
        L_0x008f:
            return r0
        L_0x0090:
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r10 = r7
        L_0x0096:
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x009b
        L_0x009a:
            r7 = r13
        L_0x009b:
            r13 = r7
            r7 = r10
        L_0x009d:
            r5 = -1
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            java.lang.String r10 = ""
            java.lang.String r11 = "Chunk.Builder"
            if (r9 != 0) goto L_0x00b1
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r12 = "start time is -1"
            r9.<init>(r12)
            l0(r11, r10, r9)
        L_0x00b1:
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x00bf
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "end time is -1"
            r5.<init>(r6)
            l0(r11, r10, r5)
        L_0x00bf:
            d92 r5 = new d92
            r5.<init>(r7, r13)
            r0.add(r5)
            O(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm9.s(java.util.List, java.util.List, long, int, long, int, long):java.util.ArrayList");
    }

    public static boolean t(e92 e92, long j2, long j3, mg4 mg4) {
        kpa u = u(j2, e92.d(mg4));
        Object obj = u.b;
        if (obj == null) {
            return false;
        }
        l7 c2 = ((d92) obj).c();
        c2.b(j3);
        e92.d(mg4).remove(((Integer) u.a).intValue());
        e92.e(mg4);
        e92.a(c2.a(), mg4);
        return true;
    }

    public static kpa u(long j2, ArrayList arrayList) {
        d92 d92;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                d92 = null;
                i2 = -1;
                break;
            }
            d92 = (d92) arrayList.get(i2);
            long j3 = d92.a;
            long j4 = d92.b;
            if (j3 != j4) {
                if (j2 >= j3 && j2 <= j4) {
                    break;
                }
            } else if (j2 == j3) {
                break;
            }
            i2++;
        }
        return new kpa(Integer.valueOf(i2), d92);
    }

    public static d92 v(long j2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        d92 d92 = null;
        while (it.hasNext()) {
            d92 d922 = (d92) it.next();
            long j3 = d922.b;
            if (j3 < j2 && (d92 == null || j3 > d92.b)) {
                d92 = d922;
            }
        }
        return d92;
    }

    public static kpa w(ArrayList arrayList) {
        d92 d92 = null;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            d92 d922 = (d92) arrayList.get(i3);
            if (d92 != null) {
                if (d92.b > d922.b) {
                }
            }
            i2 = i3;
            d92 = d922;
        }
        return new kpa(Integer.valueOf(i2), d92);
    }

    public static View x(View view, String str) {
        WeakHashMap weakHashMap = zmf.a;
        if (str.equals(omf.k(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View x = x(viewGroup.getChildAt(i2), str);
            if (x != null) {
                return x;
            }
        }
        return null;
    }

    public static void y(us usVar, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = zmf.a;
            String k2 = omf.k(view);
            if (k2 != null) {
                usVar.put(k2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    y(usVar, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public static final void z(int i2, int i3, int i4, int i5, int[] iArr) {
        if (iArr.length > 1) {
            float f2 = (float) i5;
            float f3 = (float) i4;
            int i6 = (int) ((f2 / f3) * ((float) i2));
            if (1 > i3 || i3 >= i6) {
                i3 = i6;
            } else {
                i2 = (int) ((f3 / f2) * ((float) i3));
            }
            iArr[0] = i2;
            iArr[1] = i3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object A(int i2, int i3) {
        return null;
    }

    public abstract void B(pjd pjd, float f2, float f3);

    public abstract jqe C();

    public abstract int D();

    public abstract int F();

    public abstract boolean c(int i2, int i3);

    public abstract boolean d(int i2, int i3);
}
