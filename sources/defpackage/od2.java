package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* renamed from: od2  reason: default package */
public abstract class od2 {
    public static final Object a = new Object();
    public static final ob6 b = new Object();
    public static final Object c = new Object();

    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v7, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A(defpackage.mn5 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.aq5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            aq5 r0 = (defpackage.aq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            aq5 r0 = new aq5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            xp5 r5 = r0.X
            mec r0 = r0.o
            a0(r6)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005e
        L_0x002b:
            r6 = move-exception
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            a0(r6)
            mec r6 = new mec
            r6.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ay9.a
            r6.a = r2
            xp5 r2 = new xp5
            r4 = 0
            r2.<init>(r6, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x0056 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0056 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0056 }
            java.lang.Object r5 = r5.d(r2, r0)     // Catch:{ AbortFlowException -> 0x0056 }
            if (r5 != r1) goto L_0x0054
            goto L_0x0064
        L_0x0054:
            r0 = r6
            goto L_0x005e
        L_0x0056:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x005a:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L_0x006d
        L_0x005e:
            java.lang.Object r1 = r0.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ay9.a
            if (r1 == r5) goto L_0x0065
        L_0x0064:
            return r1
        L_0x0065:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L_0x006d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.A(mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v3, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object B(defpackage.mn5 r5, defpackage.yif r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.eq5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            eq5 r0 = (defpackage.eq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            eq5 r0 = new eq5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            zp5 r5 = r0.X
            mec r6 = r0.o
            a0(r7)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005a
        L_0x002b:
            r7 = move-exception
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            a0(r7)
            mec r7 = new mec
            r7.<init>()
            zp5 r2 = new zp5
            r4 = 1
            r2.<init>(r6, r7, r4)
            r0.o = r7     // Catch:{ AbortFlowException -> 0x0052 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0052 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0052 }
            java.lang.Object r5 = r5.d(r2, r0)     // Catch:{ AbortFlowException -> 0x0052 }
            if (r5 != r1) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r6 = r7
            goto L_0x005a
        L_0x0052:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L_0x0056:
            java.lang.Object r0 = r7.a
            if (r0 != r5) goto L_0x005d
        L_0x005a:
            java.lang.Object r1 = r6.a
        L_0x005c:
            return r1
        L_0x005d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.B(mn5, yif, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v7, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object C(defpackage.mn5 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.dq5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            dq5 r0 = (defpackage.dq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            dq5 r0 = new dq5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            xp5 r5 = r0.X
            mec r0 = r0.o
            a0(r6)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005a
        L_0x002b:
            r6 = move-exception
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            a0(r6)
            mec r6 = new mec
            r6.<init>()
            xp5 r2 = new xp5
            r4 = 1
            r2.<init>(r6, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x0052 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0052 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0052 }
            java.lang.Object r5 = r5.d(r2, r0)     // Catch:{ AbortFlowException -> 0x0052 }
            if (r5 != r1) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r0 = r6
            goto L_0x005a
        L_0x0052:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x0056:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L_0x005d
        L_0x005a:
            java.lang.Object r1 = r0.a
        L_0x005c:
            return r1
        L_0x005d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.C(mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final t03 D(mn5 mn5, a66 a66) {
        int i = wp5.a;
        return new t03(new zn5(mn5, a66, 4), 10);
    }

    public static mn5 E(mn5 mn5) {
        int i = wp5.a;
        if (i > 0) {
            return i == 1 ? new t03(mn5, 10) : new q32(i, -2, 1, hz4.a, mn5);
        }
        throw new IllegalArgumentException(zr6.h(i, "Expected positive concurrency level, but had ").toString());
    }

    public static final mn5 F(mn5 mn5, lx3 lx3) {
        if (lx3.get(c32.X) == null) {
            return lx3.equals(hz4.a) ? mn5 : mn5 instanceof y66 ? np8.r((y66) mn5, lx3, 0, 0, 6) : new t32(0, 0, 12, lx3, mn5);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + lx3).toString());
    }

    public static String G(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static Set H() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static Intent I(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String K = K(activity, activity.getComponentName());
            if (K == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, K);
            try {
                return K(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent J(Context context, ComponentName componentName) {
        String K = K(context, componentName);
        if (K == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), K);
        return K(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String K(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final vxd L(mn5 mn5, sx3 sx3) {
        return j47.T(sx3, (lx3) null, (vx3) null, new so5(mn5, (Continuation) null), 3);
    }

    public static final x32 M(mn5 mn5, a66 a66) {
        int i = wp5.a;
        return d0(mn5, new vp5((Object) a66, (Continuation) null, 0));
    }

    public static final m32 N(mn5... mn5Arr) {
        int i = wp5.a;
        return new m32(mn5Arr.length == 0 ? nz4.a : new zs(0, mn5Arr), hz4.a, -2, 1, 1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:23|24)|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != null) goto L_0x003e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void O(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r5 = move-exception
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch:{ FileNotFoundException -> 0x004e }
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch:{ all -> 0x0012 }
            r2 = 0
            r1.setOutput(r5, r2)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            r1.startDocument(r3, r4)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            r1.endDocument()     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            if (r5 == 0) goto L_0x004c
        L_0x003e:
            r5.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004c
        L_0x0042:
            r6 = move-exception
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r6     // Catch:{ all -> 0x0012 }
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x003e
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.O(android.content.Context, java.lang.String):void");
    }

    public static final void P(Continuation continuation) {
        boolean z = x44.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w44.a;
        w44 w44 = x44.c;
        if (atomicIntegerFieldUpdater.get(w44) <= 0) {
            return;
        }
        if (!x44.a || continuation.getContext() != hz4.a) {
            ux3 ux3 = null;
            if ("RUNNING".equals("RUNNING")) {
                if (continuation instanceof ux3) {
                    ux3 = (ux3) continuation;
                }
                if (ux3 != null && atomicIntegerFieldUpdater.get(w44) > 0) {
                    au1.r(x44.b.remove(ux3));
                    do {
                        ux3 = ux3.getCallerFrame();
                    } while (ux3 != null);
                    return;
                }
                return;
            }
            if (continuation instanceof ux3) {
                ux3 = (ux3) continuation;
            }
            if (ux3 != null) {
                do {
                    ux3 = ux3.getCallerFrame();
                } while (ux3 != null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String Q(android.content.Context r8) {
        /*
            java.lang.Object r0 = a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x0063 }
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            int r4 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
        L_0x0018:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            r6 = 1
            if (r5 == r6) goto L_0x0044
            r6 = 3
            if (r5 != r6) goto L_0x002b
            int r7 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            if (r7 <= r4) goto L_0x0044
            goto L_0x002b
        L_0x0029:
            r8 = move-exception
            goto L_0x004c
        L_0x002b:
            if (r5 == r6) goto L_0x0018
            r6 = 4
            if (r5 != r6) goto L_0x0031
            goto L_0x0018
        L_0x0031:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            if (r5 == 0) goto L_0x0018
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
        L_0x0044:
            if (r2 == 0) goto L_0x0055
        L_0x0046:
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0055
        L_0x004a:
            r8 = move-exception
            goto L_0x0065
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r8     // Catch:{ all -> 0x004a }
        L_0x0052:
            if (r2 == 0) goto L_0x0055
            goto L_0x0046
        L_0x0055:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch:{ all -> 0x004a }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.Q(android.content.Context):java.lang.String");
    }

    public static final f32 R(e32 e32) {
        return new f32(e32, false);
    }

    public static final ac S(mqc mqc, long j, a66 a66) {
        if (j > 0) {
            return new ac(mqc, 19, new hp5(j, a66, (Continuation) null));
        }
        throw new IllegalArgumentException(ey8.h(j, "Expected positive amount of retries, but had ").toString());
    }

    public static final void T(vte vte, long j) {
        if (vte instanceof wte) {
            wte wte = (wte) vte;
            synchronized (wte) {
                if (j != 0) {
                    if (wte.a == null) {
                        wte.a = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j));
                        wte.b = Long.valueOf(SystemClock.elapsedRealtime());
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v7, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object U(defpackage.t03 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.fq5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            fq5 r0 = (defpackage.fq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            fq5 r0 = new fq5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            xp5 r5 = r0.X
            mec r0 = r0.o
            a0(r6)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005e
        L_0x002b:
            r6 = move-exception
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            a0(r6)
            mec r6 = new mec
            r6.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ay9.a
            r6.a = r2
            xp5 r2 = new xp5
            r4 = 2
            r2.<init>(r6, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x0056 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0056 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0056 }
            java.lang.Object r5 = r5.d(r2, r0)     // Catch:{ AbortFlowException -> 0x0056 }
            if (r5 != r1) goto L_0x0054
            goto L_0x0066
        L_0x0054:
            r0 = r6
            goto L_0x005e
        L_0x0056:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x005a:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L_0x0067
        L_0x005e:
            java.lang.Object r5 = r0.a
            kotlinx.coroutines.internal.Symbol r6 = defpackage.ay9.a
            if (r5 != r6) goto L_0x0065
            r5 = 0
        L_0x0065:
            r1 = r5
        L_0x0066:
            return r1
        L_0x0067:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.U(t03, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void V(p5b p5b, long j) {
        if (j >= 0) {
            while (j > 0) {
                long skip = p5b.skip(j);
                if (skip <= 0) {
                    if (p5b.read() != -1) {
                        skip = 1;
                    } else {
                        return;
                    }
                }
                j -= skip;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static final void W(View view, Layout layout, ImageReceiver imageReceiver) {
        CharSequence text = layout.getText();
        int length = text.length();
        Object[] objArr = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, length, ak.class);
            }
        } catch (Throwable unused) {
        }
        if (objArr == null) {
            objArr = new ak[0];
        }
        for (Object obj : objArr) {
            ak akVar = (ak) obj;
            zj zjVar = akVar.s0;
            Drawable b2 = zjVar.b();
            RLottieDrawable rLottieDrawable = zjVar.x0;
            if (b2 == rLottieDrawable && rLottieDrawable != null) {
                rLottieDrawable.addParentView(imageReceiver);
            }
            zj zjVar2 = akVar.s0;
            zjVar2.setCallback(view);
            zjVar2.start();
        }
    }

    public static final w7c X(mn5 mn5, sx3 sx3, xld xld, Object obj) {
        ty j = i24.j(mn5, 1);
        q0e a2 = r0e.a(obj);
        j47.S(sx3, (lx3) j.o, tpa.f(xld, wld.a) ? vx3.a : vx3.o, new iq5(xld, (mn5) j.c, a2, obj, (Continuation) null));
        return new w7c(a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Y(android.text.Layout r6, one.me.rlottie.ImageReceiver r7) {
        /*
            java.lang.CharSequence r6 = r6.getText()
            int r0 = r6.length()
            r1 = 0
            r2 = 0
            boolean r3 = r6 instanceof android.text.Spanned     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0011
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x001b }
            goto L_0x0012
        L_0x0011:
            r6 = r1
        L_0x0012:
            if (r6 == 0) goto L_0x001b
            java.lang.Class<ak> r3 = defpackage.ak.class
            java.lang.Object[] r6 = r6.getSpans(r2, r0, r3)     // Catch:{ all -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r6 = r1
        L_0x001c:
            if (r6 != 0) goto L_0x0020
            ak[] r6 = new defpackage.ak[r2]
        L_0x0020:
            int r0 = r6.length
        L_0x0021:
            if (r2 >= r0) goto L_0x0047
            r3 = r6[r2]
            ak r3 = (defpackage.ak) r3
            zj r4 = r3.s0
            r4.setCallback(r1)
            zj r3 = r3.s0
            one.me.rlottie.RLottieDrawable r4 = r3.x0
            if (r4 == 0) goto L_0x0035
            r4.removeParentView(r7)
        L_0x0035:
            one.me.rlottie.RLottieDrawable r4 = r3.x0
            if (r4 == 0) goto L_0x0041
            boolean r4 = r4.hasParentViews()
            r5 = 1
            if (r4 != r5) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r3.stop()
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.Y(android.text.Layout, one.me.rlottie.ImageReceiver):void");
    }

    public static final jp5 Z(mn5 mn5, int i) {
        if (i > 0) {
            return new jp5(mn5, i, 1);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " should be positive").toString());
    }

    public static lg3 a(jqe jqe, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return new lg3(jqe, bundle, (wuc) null);
    }

    public static final void a0(Object obj) {
        if (obj instanceof njc) {
            throw ((njc) obj).a;
        }
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b0(iv1 iv1, ArrayList arrayList) {
        if (iv1 instanceof jv1) {
            Iterator it = ((jv1) iv1).a.iterator();
            while (it.hasNext()) {
                b0((iv1) it.next(), arrayList);
            }
        } else if (iv1 instanceof jz1) {
            arrayList.add(((jz1) iv1).a);
        } else {
            arrayList.add(new ju1(iv1));
        }
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static final qre c0(gbf gbf, kge kge) {
        pre pre;
        ArrayList arrayList;
        gbf gbf2 = gbf;
        kge kge2 = kge;
        ArrayList arrayList2 = null;
        dbf dbf = gbf2.b;
        nre nre = dbf != null ? new nre(dbf.a, dbf.b) : null;
        if (gbf2.a != null) {
            pre = kge2 != null ? new pre(kge2) : null;
        } else {
            pre = null;
        }
        List<ebf> list = gbf2.c;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(z53.S(list, 10));
            for (ebf ebf : list) {
                arrayList3.add(new ore(ebf.a, ebf.b, ebf.c, ebf.d, ebf.e, ebf.g, ebf.f));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<ebf> list2 = gbf2.d;
        if (list2 != null) {
            arrayList2 = new ArrayList(z53.S(list2, 10));
            for (ebf ebf2 : list2) {
                arrayList2.add(new ore(ebf2.a, ebf2.b, ebf2.c, ebf2.d, ebf2.e, ebf2.g, ebf2.f));
            }
        }
        return new qre(pre, nre, arrayList, arrayList2, gbf2.e);
    }

    public static final du4 d(int i) {
        if (i == 0) {
            return du4.a;
        }
        if (i == 1) {
            return du4.b;
        }
        if (i == 2) {
            return du4.c;
        }
        if (i == 3) {
            return du4.o;
        }
        if (i == 4) {
            return du4.X;
        }
        du4 du4 = du4.Y;
        if (i == 5) {
            return du4;
        }
        hm9.p("OneMeDynamicFont", zr6.h(i, "unknown font size mode "), new IllegalStateException(zr6.h(i, "unknown font size mode ")));
        return du4;
    }

    public static final x32 d0(mn5 mn5, c66 c66) {
        int i = wp5.a;
        return new x32(c66, mn5, hz4.a, -2, 1);
    }

    public static final mn5 e(mn5 mn5, int i, int i2) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(zr6.h(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        } else if (i != -1 || i2 == 1) {
            if (i == -1) {
                i2 = 2;
                i = 0;
            }
            int i3 = i;
            int i4 = i2;
            return mn5 instanceof y66 ? np8.r((y66) mn5, (lx3) null, i3, i4, 1) : new t32(i3, i4, 2, (lx3) null, mn5);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static final void e0(y5f y5f) {
        y5f.c(b64.class, new lxc(11));
    }

    public static /* synthetic */ mn5 f(mn5 mn5, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return e(mn5, i, 1);
    }

    public static final void f0(y5f y5f) {
        y5f.e(ejf.class, new mxc(10));
        y5f.e(ygf.class, new mxc(11));
        y5f.e(o60.class, new mxc(12));
        y5f.e(pk7.class, new mxc(13));
        y5f.e(lac.class, new mxc(14));
    }

    public static final kq1 g(a66 a66) {
        return new kq1(a66, hz4.a, -2, 1);
    }

    public static final vy1 h(mn5 mn5) {
        if (!(mn5 instanceof vy1)) {
            mn5 = new xy1(mn5);
        }
        return (vy1) mn5;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v2, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable i(defpackage.mn5 r5, defpackage.on5 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.fp5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            fp5 r0 = (defpackage.fp5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            fp5 r0 = new fp5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            mec r5 = r0.o
            a0(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x004e
        L_0x0029:
            r6 = move-exception
            r1 = r6
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            a0(r7)
            mec r7 = new mec
            r7.<init>()
            zb r2 = new zb     // Catch:{ all -> 0x0050 }
            r4 = 20
            r2.<init>(r6, r4, r7)     // Catch:{ all -> 0x0050 }
            r0.o = r7     // Catch:{ all -> 0x0050 }
            r0.Y = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r5.d(r2, r0)     // Catch:{ all -> 0x0050 }
            if (r5 != r1) goto L_0x004e
            goto L_0x0082
        L_0x004e:
            r1 = 0
            goto L_0x0082
        L_0x0050:
            r5 = move-exception
            r1 = r5
            r5 = r7
        L_0x0053:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L_0x005f
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto L_0x007f
        L_0x005f:
            c32 r6 = defpackage.c32.X
            lx3 r7 = r0.b
            jx3 r6 = r7.get(r6)
            x77 r6 = (defpackage.x77) r6
            if (r6 == 0) goto L_0x0080
            boolean r7 = r6.isCancelled()
            if (r7 != 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L_0x0080
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            throw r1
        L_0x0080:
            if (r5 != 0) goto L_0x0083
        L_0x0082:
            return r1
        L_0x0083:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x008b
            defpackage.j47.e(r5, r1)
            throw r5
        L_0x008b:
            defpackage.j47.e(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.i(mn5, on5, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public static void j(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void k(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void l(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(G(str, objArr));
        }
    }

    public static void m(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = G("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = G("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(zr6.h(i2, "negative size: "));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void n(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void p(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static final Object q(mn5 mn5, Continuation continuation) {
        Object d = mn5.d(gr9.a, continuation);
        return d == tx3.a ? d : e5f.a;
    }

    public static final Object r(mn5 mn5, a66 a66, Continuation continuation) {
        Object q = q(f(M(mn5, a66), 0, 2), continuation);
        return q == tx3.a ? q : e5f.a;
    }

    public static final ac s(mn5 mn5, mn5 mn52, mn5 mn53, mn5 mn54, g66 g66) {
        return new ac(new mn5[]{mn5, mn52, mn53, mn54}, 21, g66);
    }

    public static final ac t(mn5 mn5, mn5 mn52, mn5 mn53, e66 e66) {
        return new ac(new mn5[]{mn5, mn52, mn53}, 20, e66);
    }

    public static final mn5 u(mn5 mn5, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? mn5 : new qn5(0, new wo5(new jh2(j, 1), mn5, (Continuation) null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static boolean v(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z = true;
            for (int i = 0; i < length; i++) {
                z = v(listFiles[i]) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.c == r4) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.im4 w(defpackage.mn5 r3, defpackage.a66 r4) {
        /*
            r0 = 2
            defpackage.f8.c(r0, r4)
            pz2 r0 = defpackage.ngg.a
            boolean r1 = r3 instanceof defpackage.im4
            if (r1 == 0) goto L_0x0016
            r1 = r3
            im4 r1 = (defpackage.im4) r1
            m56 r2 = r1.b
            if (r2 != r0) goto L_0x0016
            a66 r0 = r1.c
            if (r0 != r4) goto L_0x0016
            goto L_0x001c
        L_0x0016:
            im4 r0 = new im4
            r0.<init>(r3, r4)
            r3 = r0
        L_0x001c:
            im4 r3 = (defpackage.im4) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.w(mn5, a66):im4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r2.c == r0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.mn5 x(defpackage.mn5 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.j0e
            if (r0 == 0) goto L_0x0005
            goto L_0x0021
        L_0x0005:
            ai0 r0 = defpackage.ngg.b
            pz2 r1 = defpackage.ngg.a
            boolean r2 = r4 instanceof defpackage.im4
            if (r2 == 0) goto L_0x0019
            r2 = r4
            im4 r2 = (defpackage.im4) r2
            m56 r3 = r2.b
            if (r3 != r1) goto L_0x0019
            a66 r1 = r2.c
            if (r1 != r0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            im4 r1 = new im4
            r1.<init>(r4, r0)
            r4 = r1
        L_0x001f:
            im4 r4 = (defpackage.im4) r4
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.x(mn5):mn5");
    }

    public static final Object y(mn5 mn5, on5 on5, Continuation continuation) {
        if (!(on5 instanceof jte)) {
            Object d = mn5.d(on5, continuation);
            return d == tx3.a ? d : e5f.a;
        }
        throw ((jte) on5).a;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v7, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object z(defpackage.mn5 r5, defpackage.a66 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.bq5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            bq5 r0 = (defpackage.bq5) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            bq5 r0 = new bq5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            zp5 r5 = r0.Y
            mec r6 = r0.X
            a66 r0 = r0.o
            a0(r7)     // Catch:{ AbortFlowException -> 0x002d }
            goto L_0x0064
        L_0x002d:
            r7 = move-exception
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            a0(r7)
            mec r7 = new mec
            r7.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ay9.a
            r7.a = r2
            zp5 r2 = new zp5
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x005b }
            r0.X = r7     // Catch:{ AbortFlowException -> 0x005b }
            r0.Y = r2     // Catch:{ AbortFlowException -> 0x005b }
            r0.s0 = r3     // Catch:{ AbortFlowException -> 0x005b }
            java.lang.Object r5 = r5.d(r2, r0)     // Catch:{ AbortFlowException -> 0x005b }
            if (r5 != r1) goto L_0x0058
            goto L_0x006a
        L_0x0058:
            r0 = r6
            r6 = r7
            goto L_0x0064
        L_0x005b:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L_0x0060:
            java.lang.Object r1 = r7.a
            if (r1 != r5) goto L_0x007f
        L_0x0064:
            java.lang.Object r1 = r6.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ay9.a
            if (r1 == r5) goto L_0x006b
        L_0x006a:
            return r1
        L_0x006b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x007f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.z(mn5, a66, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
