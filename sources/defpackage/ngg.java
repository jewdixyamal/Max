package defpackage;

import android.animation.ObjectAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ngg  reason: default package */
public abstract class ngg {
    public static final pz2 a = new pz2(21);
    public static final ai0 b = new ai0(15);
    public static final Object c = new Object();

    public static final ArrayList A(int i) {
        h37 h37 = new h37(i, 59, 1);
        ArrayList arrayList = new ArrayList(z53.S(h37, 10));
        Iterator it = h37.iterator();
        while (((i37) it).c) {
            arrayList.add(new qte(((i37) it).a()));
        }
        return arrayList;
    }

    public static Set B() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static cj6 C(String... strArr) {
        if (strArr.length % 2 == 0) {
            Object clone = strArr.clone();
            if (clone != null) {
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    String str = strArr2[i];
                    if (str == null) {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    } else if (str != null) {
                        strArr2[i] = w9e.b1(str).toString();
                        i++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                h37 X = ote.X(new h37(0, strArr2.length - 1, 1), 2);
                int i2 = X.a;
                int i3 = X.b;
                int i4 = X.c;
                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                    while (true) {
                        String str2 = strArr2[i2];
                        String str3 = strArr2[i2 + 1];
                        l(str2);
                        n(str3, str2);
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                return new cj6(strArr2);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static void D(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 - j;
                if (j3 < 0) {
                    j47.Z(new IllegalStateException(ey8.h(j3, "More produced than requested: ")));
                    j3 = 0;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static int E(int i, yaf yaf) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return yaf.v() + 1;
            case 7:
                return yaf.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case Protos.Attaches.Attach.PRESENT /*12*/:
            case 13:
            case Protos.Attaches.Attach.LOCATION /*14*/:
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static final kl7 F(View view, float f, float f2, long j, long j2) {
        kl7 l = j1e.l();
        l.add(e(view, View.SCALE_X, f, f2, j, j2, 96));
        l.add(e(view, View.SCALE_Y, f, f2, j, j2, 96));
        return j1e.d(l);
    }

    public static final void G(Drawable drawable, int i) {
        if (drawable != null) {
            aq4.g(drawable, i);
            aq4.i(drawable, PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void H(ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            indeterminateDrawable = progressBar.getProgressDrawable();
        }
        if (indeterminateDrawable != null) {
            G(indeterminateDrawable, i);
        }
    }

    public static ArrayList I(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(jSONArray.getLong(i)));
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static RectF J(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float round = ((float) Math.round(fArr[i - 1] * 10.0f)) / 10.0f;
            float round2 = ((float) Math.round(fArr[i] * 10.0f)) / 10.0f;
            float f = rectF.left;
            if (round < f) {
                f = round;
            }
            rectF.left = f;
            float f2 = rectF.top;
            if (round2 < f2) {
                f2 = round2;
            }
            rectF.top = f2;
            float f3 = rectF.right;
            if (round <= f3) {
                round = f3;
            }
            rectF.right = round;
            float f4 = rectF.bottom;
            if (round2 <= f4) {
                round2 = f4;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }

    public static final void K(y5f y5f) {
        y5f.c(b64.class, new xsf(1));
    }

    public static void L(String str, Writer writer) {
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '\"' || charAt <= 31) {
                if (i2 > i) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(92);
                if (charAt == 12) {
                    writer.write(HttpStatus.SC_PROCESSING);
                } else if (charAt != 13) {
                    if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                writer.write(98);
                                break;
                            case 9:
                                writer.write(116);
                                break;
                            case 10:
                                writer.write(110);
                                break;
                            default:
                                writer.write(117);
                                writer.write(z7.F((charAt >> 12) & 15));
                                writer.write(z7.F((charAt >> 8) & 15));
                                writer.write(z7.F((charAt >> 4) & 15));
                                writer.write(z7.F(charAt & 15));
                                break;
                        }
                    } else {
                        writer.write(charAt);
                    }
                } else {
                    writer.write(114);
                }
                i = i2 + 1;
            }
        }
        if (length > i) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public static Parcelable M(String str, Bundle bundle) {
        ClassLoader classLoader = ngg.class.getClassLoader();
        fp3.n(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void N(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable M = M("MapOptions", bundle);
            if (M != null) {
                O(bundle2, "MapOptions", M);
            }
            Parcelable M2 = M("StreetViewPanoramaOptions", bundle);
            if (M2 != null) {
                O(bundle2, "StreetViewPanoramaOptions", M2);
            }
            Parcelable M3 = M("camera", bundle);
            if (M3 != null) {
                O(bundle2, "camera", M3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void O(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = ngg.class.getClassLoader();
        fp3.n(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static ua3 a() {
        return new ua3((x77) null);
    }

    public static long b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, c(j2, j)));
        return j2;
    }

    public static long c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static final ObjectAnimator d(View view, Property property, float f, float f2, long j, long j2, int i, int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        ofFloat.setRepeatMode(i);
        ofFloat.setRepeatCount(i2);
        return ofFloat;
    }

    public static /* synthetic */ ObjectAnimator e(View view, Property property, float f, float f2, long j, long j2, int i) {
        return d(view, property, f, f2, j, (i & 16) != 0 ? 0 : j2, 1, 0);
    }

    public static void f(sme sme, TextView textView, int i) {
        int i2 = sme.k;
        int i3 = sme.l;
        textView.setBackground(hm9.f(i2, sme.i, ote.b0(i2, 0.3f), i));
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[0]}, new int[]{i3, i3, i3}));
    }

    public static final void g(sme sme, Menu menu, Integer num) {
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                Drawable icon = menu.getItem(i).getIcon();
                if (icon != null) {
                    G(icon, num != null ? num.intValue() : sme.w);
                }
            }
        }
    }

    public static final void h(sme sme, SwitchCompat switchCompat) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        switchCompat.setTextColor(sme.F);
        if (!sme.equals(ee4.e0) && (num = sme.W) != null && (num2 = sme.V) != null && (num3 = sme.Y) != null && (num4 = sme.X) != null) {
            switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num.intValue(), num2.intValue()}));
            switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num3.intValue(), num4.intValue()}));
        }
    }

    public static final void i(sme sme, Toolbar toolbar, TextView textView, TextView textView2, int i, int i2) {
        if (toolbar != null) {
            toolbar.setPopupTheme(sme.j);
            toolbar.setBackgroundColor(sme.N);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            int i3 = sme.w;
            if (navigationIcon != null) {
                navigationIcon.mutate();
                navigationIcon.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            }
            Drawable overflowIcon = toolbar.getOverflowIcon();
            if (overflowIcon != null) {
                G(overflowIcon, i3);
            }
            try {
                Field declaredField = Toolbar.class.getDeclaredField("t0");
                declaredField.setAccessible(true);
                ((Drawable) declaredField.get(toolbar)).mutate().setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            } catch (Exception e) {
                hm9.p("ThemeHelper", "applyToToolbar: ", e);
            }
        }
        if (textView != null) {
            textView.setTextColor(i);
        }
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    public static int j(int i) {
        if (i < 3) {
            wmd.i(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r13 == r1.g) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if ((r20.v() * 1000) == r1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r6 == r1) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean k(defpackage.yaf r20, defpackage.qm5 r21, int r22, defpackage.lh4 r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = 10
            r3 = 1
            int r4 = r0.b
            long r5 = r20.w()
            r7 = 16
            long r7 = r5 >>> r7
            r9 = r22
            long r9 = (long) r9
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L_0x001a
            return r10
        L_0x001a:
            r11 = 1
            long r7 = r7 & r11
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
            r7 = r3
            goto L_0x0024
        L_0x0023:
            r7 = r10
        L_0x0024:
            r8 = 12
            long r13 = r5 >> r8
            r15 = 15
            long r13 = r13 & r15
            int r9 = (int) r13
            r13 = 8
            long r13 = r5 >> r13
            long r13 = r13 & r15
            int r13 = (int) r13
            r14 = 4
            long r17 = r5 >> r14
            long r14 = r17 & r15
            int r14 = (int) r14
            long r15 = r5 >> r3
            r17 = 7
            r19 = r9
            long r8 = r15 & r17
            int r8 = (int) r8
            long r5 = r5 & r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0048
            r5 = r3
            goto L_0x0049
        L_0x0048:
            r5 = r10
        L_0x0049:
            r6 = 7
            if (r14 > r6) goto L_0x0052
            int r6 = r1.h
            int r6 = r6 - r3
            if (r14 != r6) goto L_0x00c3
            goto L_0x0059
        L_0x0052:
            if (r14 > r2) goto L_0x00c3
            int r6 = r1.h
            r9 = 2
            if (r6 != r9) goto L_0x00c3
        L_0x0059:
            if (r8 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            int r6 = r1.j
            if (r8 != r6) goto L_0x00c3
        L_0x0060:
            if (r5 != 0) goto L_0x00c3
            long r5 = r20.D()     // Catch:{ NumberFormatException -> 0x00c3 }
            if (r7 == 0) goto L_0x006b
        L_0x0068:
            r7 = r23
            goto L_0x0070
        L_0x006b:
            int r7 = r1.c
            long r7 = (long) r7
            long r5 = r5 * r7
            goto L_0x0068
        L_0x0070:
            r7.a = r5
            r5 = r19
            int r5 = E(r5, r0)
            r6 = -1
            if (r5 == r6) goto L_0x00c3
            int r6 = r1.c
            if (r5 > r6) goto L_0x00c3
            if (r13 != 0) goto L_0x0082
            goto L_0x00a7
        L_0x0082:
            r5 = 11
            if (r13 > r5) goto L_0x008b
            int r1 = r1.g
            if (r13 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x008b:
            int r1 = r1.f
            r5 = 12
            if (r13 != r5) goto L_0x009a
            int r2 = r20.v()
            int r2 = r2 * 1000
            if (r2 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x009a:
            r5 = 14
            if (r13 > r5) goto L_0x00c3
            int r6 = r20.A()
            if (r13 != r5) goto L_0x00a5
            int r6 = r6 * r2
        L_0x00a5:
            if (r6 != r1) goto L_0x00c3
        L_0x00a7:
            int r1 = r20.v()
            int r2 = r0.b
            byte[] r0 = r0.a
            int r2 = r2 - r3
            int r5 = defpackage.maf.a
            r5 = r10
        L_0x00b3:
            if (r4 >= r2) goto L_0x00c0
            byte r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = defpackage.maf.n
            r5 = r6[r5]
            int r4 = r4 + r3
            goto L_0x00b3
        L_0x00c0:
            if (r1 != r5) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r10
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngg.k(yaf, qm5, int, lh4):boolean");
    }

    public static void l(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || '~' < charAt) {
                    throw new IllegalArgumentException(naf.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static int m(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d = fp.d(str);
        if (d != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                i = fp.c((AppOpsManager) fp.a(context, AppOpsManager.class), d, packageName);
            } else {
                AppOpsManager c2 = gp.c(context);
                i = gp.a(c2, d, Binder.getCallingUid(), packageName);
                if (i == 0) {
                    i = gp.a(c2, d, myUid, gp.b(context));
                }
            }
            if (i != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void n(String str, String str2) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(naf.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(naf.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static e0a o(OneMeRoomDatabase oneMeRoomDatabase, String[] strArr, Callable callable) {
        Executor executor = oneMeRoomDatabase.b;
        if (executor == null) {
            executor = null;
        }
        trd trd = muc.a;
        f55 f55 = new f55(executor, false);
        return new e0a(new s1a(new hb3(2, new ypc(strArr, 0, oneMeRoomDatabase)).r(f55), f55, 1).n(f55), new yt8(29, (Object) new t28(callable)), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        defpackage.v3c.i(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(defpackage.k36 r4) {
        /*
            kl7 r0 = defpackage.j1e.l()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r4.q0(r1)
        L_0x000a:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0019 }
            r3 = 0
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = r1.getString(r3)     // Catch:{ all -> 0x0019 }
            r0.add(r2)     // Catch:{ all -> 0x0019 }
            goto L_0x000a
        L_0x0019:
            r4 = move-exception
            goto L_0x0049
        L_0x001b:
            r2 = 0
            defpackage.v3c.i(r1, r2)
            kl7 r0 = defpackage.j1e.d(r0)
            java.util.ListIterator r0 = r0.listIterator(r3)
        L_0x0027:
            r1 = r0
            il7 r1 = (defpackage.il7) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0048
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "room_fts_content_sync_"
            boolean r2 = defpackage.eae.o0(r1, r2, r3)
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = "DROP TRIGGER IF EXISTS "
            java.lang.String r1 = r2.concat(r1)
            r4.U(r1)
            goto L_0x0027
        L_0x0048:
            return
        L_0x0049:
            throw r4     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            defpackage.v3c.i(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngg.p(k36):void");
    }

    public static boolean q(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean r(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static ybd s(Set set, a7b a7b) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof ybd) {
                ybd ybd = (ybd) sortedSet;
                a7b a7b2 = ybd.b;
                a7b2.getClass();
                return new ybd((SortedSet) ybd.a, new e7b(Arrays.asList(new a7b[]{a7b2, a7b})));
            }
            sortedSet.getClass();
            return new ybd(sortedSet, a7b);
        } else if (set instanceof ybd) {
            ybd ybd2 = (ybd) set;
            a7b a7b3 = ybd2.b;
            a7b3.getClass();
            return new ybd((Set) ybd2.a, new e7b(Arrays.asList(new a7b[]{a7b3, a7b})));
        } else {
            set.getClass();
            return new ybd(set, a7b);
        }
    }

    public static float[] t(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    public static final Drawable u(int i, int i2, Context context) {
        Drawable b2 = kt3.b(context, i);
        if (b2 != null) {
            Drawable mutate = b2.mutate();
            G(mutate, i2);
            return mutate;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static int v(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static final ArrayList w(int i) {
        h37 h37 = new h37(i, 23, 1);
        ArrayList arrayList = new ArrayList(z53.S(h37, 10));
        Iterator it = h37.iterator();
        while (((i37) it).c) {
            arrayList.add(new qte(((i37) it).a()));
        }
        return arrayList;
    }

    public static int x(Integer num) {
        int intValue = num.intValue();
        int[] v = au1.v(9);
        int length = v.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = v[i2];
            if (au1.s(i3) == intValue) {
                i = i3;
                break;
            }
            i2++;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static xbd y(Set set, jx6 jx6) {
        z04.l(set, "set1");
        z04.l(jx6, "set2");
        return new xbd(set, jx6);
    }

    public static boolean z(dx1 dx1, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) dx1.a(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new Exception(new Exception(e));
        }
    }
}
