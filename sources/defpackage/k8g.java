package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.fragment.app.b;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.api.ResolvableApiException;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: k8g  reason: default package */
public final class k8g implements v43, Provider, s7c, pr7, pa5 {
    public static final /* synthetic */ int o = 0;
    public final Object a;
    public Object b;
    public Object c;

    public /* synthetic */ k8g(Object obj) {
        this.a = obj;
    }

    public static k8g x(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new k8g((Object) context, (Object) context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public void A() {
        FrgBase frgBase = (FrgBase) this.b;
        Context d0 = frgBase.d0();
        String[] strArr = wmd.f;
        if (wmd.j(d0, strArr)) {
            Context d02 = frgBase.d0();
            if (d02 != null) {
                q().getClass();
                oe6.a(d02, this);
                return;
            }
            return;
        }
        FrgDlgPermissions n1 = FrgDlgPermissions.n1(strArr, jpc.e2, jpc.c2, jpc.d2, false);
        n1.b1(169, frgBase);
        n1.k1(frgBase.f0(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
    }

    public yze B(int i, int i2) {
        pa5 pa5 = (pa5) this.a;
        if (i2 != 3) {
            return pa5.B(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.c;
        qbe qbe = (qbe) sparseArray.get(i);
        if (qbe != null) {
            return qbe;
        }
        qbe qbe2 = new qbe(pa5.B(i, i2), (mbe) this.b);
        sparseArray.put(i, qbe2);
        return qbe2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m20] */
    public m20 C() {
        ? obj = new Object();
        obj.a = new ArrayList((List) this.a);
        obj.b = (z07) this.b;
        return obj;
    }

    public void J(v1d v1d) {
        ((pa5) this.a).J(v1d);
    }

    public Object T0(Object obj, bc7 bc7) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        try {
            Object invoke = ((k56) this.a).invoke();
            this.b = invoke;
            ((ia5) this.c).b.add(new ha5(invoke, new es3(12, this)));
            return invoke;
        } catch (Throwable th) {
            throw new RuntimeException("could not extract value for name ".concat(bc7.getName()), th);
        }
    }

    public boolean a() {
        return ((v43) this.a).a();
    }

    public y84 b(qy5 qy5) {
        y84 b2 = ((v43) this.a).b(qy5);
        this.b = b2.b();
        return b2;
    }

    public boolean c() {
        return ((v43) this.a).c();
    }

    public y84 d(qy5 qy5) {
        y84 d = ((v43) this.a).d(qy5);
        this.c = d.b();
        return d;
    }

    public void e(hoc hoc) {
        ((Handler) this.c).post(new gbg(this, hoc, 1));
    }

    public void f() {
        hm9.m("k8g", "onSuccessCheckSettings", new Object[0]);
    }

    public void g(Exception exc) {
        b b0;
        hm9.p("k8g", "onFailureCheckSettings", exc);
        q().getClass();
        if ((exc instanceof ResolvableApiException) && (b0 = ((FrgBase) this.b).b0()) != null) {
            try {
                q().getClass();
                if (exc instanceof ResolvableApiException) {
                    PendingIntent pendingIntent = ((ResolvableApiException) exc).a.c;
                    if (pendingIntent != null) {
                        fp3.n(pendingIntent);
                        b0.startIntentSenderForResult(pendingIntent.getIntentSender(), HttpStatus.SC_MOVED_PERMANENTLY, (Intent) null, 0, 0, 0);
                    }
                }
            } catch (IntentSender.SendIntentException unused) {
                hm9.p("k8g", "Can't resolve check settings error", exc);
                ((cba) ((o45) this.a)).c(new Exception("Can't resolve check settings error"), true);
            }
        }
    }

    public Object get() {
        return new iz3((Context) ((Provider) this.a).get(), (d9f) ((Provider) this.b).get(), (d9f) ((Provider) this.c).get());
    }

    public l20 h(int i) {
        if (i < 0) {
            return null;
        }
        List list = (List) this.a;
        if (i >= list.size()) {
            return null;
        }
        return (l20) list.get(i);
    }

    public int i() {
        List list = (List) this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public l20 j(String str) {
        for (l20 l20 : (List) this.a) {
            if (oag.d(str, l20.r)) {
                return l20;
            }
        }
        return null;
    }

    public l20 k(g20 g20) {
        for (l20 l20 : (List) this.a) {
            if (l20.a == g20) {
                return l20;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = defpackage.z7.n((android.content.Context) r2.a, (r1 = r0.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList l(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x001c
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x001c
            java.lang.Object r2 = r2.a
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r2 = defpackage.z7.n(r2, r1)
            if (r2 == 0) goto L_0x001c
            return r2
        L_0x001c:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8g.l(int):android.content.res.ColorStateList");
    }

    public long m() {
        sa4 sa4 = (sa4) this.c;
        if (sa4 != null) {
            return sa4.o;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r0.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable n(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x001a
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x001a
            java.lang.Object r2 = r2.a
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r2 = defpackage.s36.n(r2, r1)
            return r2
        L_0x001a:
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8g.n(int):android.graphics.drawable.Drawable");
    }

    public Drawable o(int i) {
        int resourceId;
        Drawable e;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        gn a2 = gn.a();
        Context context = (Context) this.a;
        synchronized (a2) {
            e = a2.a.e(resourceId, context, true);
        }
        return e;
    }

    public void o1(Object obj, bc7 bc7, Object obj2) {
        if (obj2 == null) {
            this.b = null;
        }
    }

    public Typeface p(int i, int i2, co coVar) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = vic.a;
        Context context = (Context) this.a;
        if (context.isRestricted()) {
            return null;
        }
        return vic.b(context, resourceId, typedValue, i2, coVar, true, false);
    }

    public oe6 q() {
        if (((oe6) this.c) == null) {
            this.c = (oe6) ((y8a) ((ed3) ((FrgBase) this.b).p1.b)).getAccessor().c(oe6.class);
        }
        return (oe6) this.c;
    }

    public ArrayList r(String str) {
        xlc a2 = xlc.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : o2.getString(0));
            }
            return arrayList;
        } finally {
            o2.close();
            a2.n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r3 = (defpackage.jsc) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4 = r3.b(r5.a(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r4 = r3.a(r5.a());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.qnf s(defpackage.h23 r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            xnf r0 = (defpackage.xnf) r0
            java.util.LinkedHashMap r1 = r0.a
            java.lang.Object r1 = r1.get(r6)
            qnf r1 = (defpackage.qnf) r1
            java.util.Map r2 = defpackage.h23.b
            java.lang.Class r3 = r5.a
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0021
            int r2 = r2.intValue()
            boolean r2 = defpackage.f8.n(r2, r1)
            goto L_0x0033
        L_0x0021:
            boolean r2 = r3.isPrimitive()
            if (r2 == 0) goto L_0x002f
            h23 r2 = defpackage.nec.a(r3)
            java.lang.Class r3 = defpackage.ft.j(r2)
        L_0x002f:
            boolean r2 = r3.isInstance(r1)
        L_0x0033:
            java.lang.Object r3 = r4.b
            vnf r3 = (defpackage.vnf) r3
            if (r2 == 0) goto L_0x0049
            boolean r4 = r3 instanceof defpackage.jsc
            if (r4 == 0) goto L_0x0048
            jsc r3 = (defpackage.jsc) r3
            gh7 r4 = r3.d
            if (r4 == 0) goto L_0x0048
            mm r5 = r3.e
            defpackage.fp3.e(r1, r5, r4)
        L_0x0048:
            return r1
        L_0x0049:
            wh9 r1 = new wh9
            java.lang.Object r4 = r4.c
            lz3 r4 = (defpackage.lz3) r4
            r1.<init>((defpackage.lz3) r4)
            xxc r4 = defpackage.xxc.Z
            r1.a(r4, r6)
            qnf r4 = r3.c(r5, r1)     // Catch:{ AbstractMethodError -> 0x005c }
            goto L_0x006d
        L_0x005c:
            java.lang.Class r4 = r5.a()     // Catch:{ AbstractMethodError -> 0x0065 }
            qnf r4 = r3.b(r4, r1)     // Catch:{ AbstractMethodError -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            java.lang.Class r4 = r5.a()
            qnf r4 = r3.a(r4)
        L_0x006d:
            java.util.LinkedHashMap r5 = r0.a
            java.lang.Object r5 = r5.put(r6, r4)
            qnf r5 = (defpackage.qnf) r5
            if (r5 == 0) goto L_0x007a
            r5.b()
        L_0x007a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8g.s(h23, java.lang.String):qnf");
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [pu9, yt9] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        if (r0 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e0 A[SYNTHETIC, Splitter:B:128:0x02e0] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02f1 A[SYNTHETIC, Splitter:B:133:0x02f1] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x038d A[SYNTHETIC, Splitter:B:169:0x038d] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03b0 A[SYNTHETIC, Splitter:B:179:0x03b0] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0484 A[SYNTHETIC, Splitter:B:228:0x0484] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[Catch:{ NameNotFoundException -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0182 A[SYNTHETIC, Splitter:B:69:0x0182] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean t() {
        /*
            r17 = this;
            r1 = r17
            r2 = 2
            r3 = 0
            java.lang.Object r0 = r1.c
            sy4 r0 = (defpackage.sy4) r0
            java.lang.String r4 = "gcm.n.noui"
            boolean r0 = r0.s(r4)
            r4 = 1
            if (r0 == 0) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.Object r0 = r1.b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r5 = "keyguard"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.app.KeyguardManager r5 = (android.app.KeyguardManager) r5
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x0025
            goto L_0x0052
        L_0x0025:
            int r5 = android.os.Process.myPid()
            java.lang.String r6 = "activity"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0052
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6
            int r7 = r6.pid
            if (r7 != r5) goto L_0x003b
            int r0 = r6.importance
            r5 = 100
            if (r0 != r5) goto L_0x0052
            return r3
        L_0x0052:
            java.lang.Object r0 = r1.c
            sy4 r0 = (defpackage.sy4) r0
            java.lang.String r5 = "gcm.n.image"
            java.lang.String r0 = r0.B(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0064
        L_0x0062:
            r5 = 0
            goto L_0x006e
        L_0x0064:
            mu6 r5 = new mu6     // Catch:{ MalformedURLException -> 0x0062 }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0062 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x0062 }
            r5.<init>(r7)     // Catch:{ MalformedURLException -> 0x0062 }
        L_0x006e:
            if (r5 == 0) goto L_0x0089
            java.lang.Object r0 = r1.a
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            qne r7 = new qne
            r7.<init>()
            vs5 r8 = new vs5
            r9 = 5
            r8.<init>(r5, r9, r7)
            java.util.concurrent.Future r0 = r0.submit(r8)
            r5.b = r0
            ukg r0 = r7.a
            r5.c = r0
        L_0x0089:
            java.lang.Object r0 = r1.b
            r7 = r0
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r0 = r1.c
            r8 = r0
            sy4 r8 = (defpackage.sy4) r8
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.z83.a
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.lang.String r9 = r7.getPackageName()
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00ab }
            if (r0 == 0) goto L_0x00af
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00ab }
            if (r0 == 0) goto L_0x00af
        L_0x00a9:
            r9 = r0
            goto L_0x00b2
        L_0x00ab:
            r0 = move-exception
            r0.toString()
        L_0x00af:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            goto L_0x00a9
        L_0x00b2:
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r8.B(r0)
            r10 = 3
            android.content.pm.PackageManager r11 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00cb }
            java.lang.String r12 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x00cb }
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r12, r3)     // Catch:{ NameNotFoundException -> 0x00cb }
            int r11 = r11.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00cb }
            r12 = 26
            if (r11 >= r12) goto L_0x00cd
        L_0x00cb:
            r0 = 0
            goto L_0x011e
        L_0x00cd:
            java.lang.Class<android.app.NotificationManager> r11 = android.app.NotificationManager.class
            java.lang.Object r11 = r7.getSystemService(r11)
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00e2
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 == 0) goto L_0x00e2
            goto L_0x011e
        L_0x00e2:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r0 = r9.getString(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00f5
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 == 0) goto L_0x00f5
            goto L_0x011e
        L_0x00f5:
            java.lang.String r0 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 != 0) goto L_0x011e
            android.content.res.Resources r12 = r7.getResources()
            java.lang.String r13 = r7.getPackageName()
            java.lang.String r14 = "fcm_fallback_notification_channel_label"
            java.lang.String r15 = "string"
            int r12 = r12.getIdentifier(r14, r15, r13)
            if (r12 != 0) goto L_0x0112
            java.lang.String r12 = "Misc"
            goto L_0x0116
        L_0x0112:
            java.lang.String r12 = r7.getString(r12)
        L_0x0116:
            android.app.NotificationChannel r13 = new android.app.NotificationChannel
            r13.<init>(r0, r12, r10)
            r11.createNotificationChannel(r13)
        L_0x011e:
            java.lang.String r11 = r7.getPackageName()
            android.content.res.Resources r12 = r7.getResources()
            android.content.pm.PackageManager r13 = r7.getPackageManager()
            bu9 r14 = new bu9
            r14.<init>(r7, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r8.x(r12, r11, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x013e
            r14.f(r0)
        L_0x013e:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r8.x(r12, r11, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x015b
            r14.e(r0)
            zt9 r15 = new zt9
            r15.<init>(r3)
            java.lang.CharSequence r0 = defpackage.bu9.c(r0)
            r15.f = r0
            r14.q(r15)
        L_0x015b:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r8.B(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x0179
            java.lang.String r15 = "drawable"
            int r15 = r12.getIdentifier(r0, r15, r11)
            if (r15 == 0) goto L_0x0170
            goto L_0x0194
        L_0x0170:
            java.lang.String r15 = "mipmap"
            int r15 = r12.getIdentifier(r0, r15, r11)
            if (r15 == 0) goto L_0x0179
            goto L_0x0194
        L_0x0179:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r15 = r9.getInt(r0, r3)
            if (r15 == 0) goto L_0x0182
            goto L_0x018d
        L_0x0182:
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r11, r3)     // Catch:{ NameNotFoundException -> 0x0189 }
            int r15 = r0.icon     // Catch:{ NameNotFoundException -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            r0.toString()
        L_0x018d:
            if (r15 == 0) goto L_0x0190
            goto L_0x0194
        L_0x0190:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r15 = r0
        L_0x0194:
            android.app.Notification r0 = r14.F
            r0.icon = r15
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r8.B(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 == 0) goto L_0x01aa
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r8.B(r0)
        L_0x01aa:
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 == 0) goto L_0x01b2
            r0 = 0
            goto L_0x01e1
        L_0x01b2:
            java.lang.String r15 = "default"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L_0x01dd
            java.lang.String r15 = "raw"
            int r12 = r12.getIdentifier(r0, r15, r11)
            if (r12 == 0) goto L_0x01dd
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r15 = "android.resource://"
            r12.<init>(r15)
            r12.append(r11)
            java.lang.String r15 = "/raw/"
            r12.append(r15)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01e1
        L_0x01dd:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r2)
        L_0x01e1:
            if (r0 == 0) goto L_0x01e6
            r14.p(r0)
        L_0x01e6:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r8.B(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x0200
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r0)
            r12.setPackage(r11)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r12.setFlags(r0)
            goto L_0x0232
        L_0x0200:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r8.B(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x0212
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r8.B(r0)
        L_0x0212:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x021d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x021e
        L_0x021d:
            r0 = 0
        L_0x021e:
            if (r0 == 0) goto L_0x022e
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "android.intent.action.VIEW"
            r12.<init>(r13)
            r12.setPackage(r11)
            r12.setData(r0)
            goto L_0x0232
        L_0x022e:
            android.content.Intent r12 = r13.getLaunchIntentForPackage(r11)
        L_0x0232:
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.z83.a
            r11 = 1140850688(0x44000000, float:512.0)
            java.lang.String r13 = "google.c.a.e"
            if (r12 != 0) goto L_0x023c
            r2 = 0
            goto L_0x0298
        L_0x023c:
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            r12.addFlags(r15)
            android.os.Bundle r15 = new android.os.Bundle
            java.lang.Object r6 = r8.b
            android.os.Bundle r6 = (android.os.Bundle) r6
            r15.<init>(r6)
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0252:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x027e
            java.lang.Object r16 = r6.next()
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r2 = "google.c."
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x0278
            java.lang.String r2 = "gcm.n."
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x0278
            java.lang.String r2 = "gcm.notification."
            boolean r2 = r10.startsWith(r2)
            if (r2 == 0) goto L_0x027b
        L_0x0278:
            r15.remove(r10)
        L_0x027b:
            r2 = 2
            r10 = 3
            goto L_0x0252
        L_0x027e:
            r12.putExtras(r15)
            boolean r2 = r8.s(r13)
            if (r2 == 0) goto L_0x0290
            android.os.Bundle r2 = r8.J()
            java.lang.String r6 = "gcm.n.analytics_data"
            r12.putExtra(r6, r2)
        L_0x0290:
            int r2 = r0.incrementAndGet()
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r7, r2, r12, r11)
        L_0x0298:
            r14.g = r2
            boolean r2 = r8.s(r13)
            if (r2 != 0) goto L_0x02a2
            r0 = 0
            goto L_0x02ce
        L_0x02a2:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r2.<init>(r6)
            android.os.Bundle r6 = r8.J()
            android.content.Intent r2 = r2.putExtras(r6)
            int r0 = r0.incrementAndGet()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r10 = "com.google.android.c2dm.intent.RECEIVE"
            r6.<init>(r10)
            java.lang.String r10 = r7.getPackageName()
            android.content.Intent r6 = r6.setPackage(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r2 = r6.putExtra(r10, r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r7, r0, r2, r11)
        L_0x02ce:
            if (r0 == 0) goto L_0x02d4
            android.app.Notification r2 = r14.F
            r2.deleteIntent = r0
        L_0x02d4:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r8.B(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x02e9
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x02e9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x02e9 }
            goto L_0x02fb
        L_0x02e9:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r9.getInt(r0, r3)
            if (r0 == 0) goto L_0x02fa
            int r0 = defpackage.lt3.a(r7, r0)     // Catch:{ NotFoundException -> 0x02fa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x02fa }
            goto L_0x02fb
        L_0x02fa:
            r0 = 0
        L_0x02fb:
            if (r0 == 0) goto L_0x0303
            int r0 = r0.intValue()
            r14.x = r0
        L_0x0303:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r8.s(r0)
            r0 = r0 ^ r4
            r2 = 16
            r14.i(r2, r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r8.s(r0)
            r14.u = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r8.B(r0)
            if (r0 == 0) goto L_0x0327
            android.app.Notification r2 = r14.F
            java.lang.CharSequence r0 = defpackage.bu9.c(r0)
            r2.tickerText = r0
        L_0x0327:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r8.u(r0)
            r2 = -2
            if (r0 != 0) goto L_0x0332
        L_0x0330:
            r0 = 0
            goto L_0x0340
        L_0x0332:
            int r6 = r0.intValue()
            if (r6 < r2) goto L_0x0330
            int r6 = r0.intValue()
            r7 = 2
            if (r6 <= r7) goto L_0x0340
            goto L_0x0330
        L_0x0340:
            if (r0 == 0) goto L_0x0348
            int r0 = r0.intValue()
            r14.k = r0
        L_0x0348:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r8.u(r0)
            if (r0 != 0) goto L_0x0352
        L_0x0350:
            r0 = 0
            goto L_0x0360
        L_0x0352:
            int r6 = r0.intValue()
            r7 = -1
            if (r6 < r7) goto L_0x0350
            int r6 = r0.intValue()
            if (r6 <= r4) goto L_0x0360
            goto L_0x0350
        L_0x0360:
            if (r0 == 0) goto L_0x0368
            int r0 = r0.intValue()
            r14.y = r0
        L_0x0368:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r8.u(r0)
            if (r0 != 0) goto L_0x0372
        L_0x0370:
            r0 = 0
            goto L_0x0379
        L_0x0372:
            int r6 = r0.intValue()
            if (r6 >= 0) goto L_0x0379
            goto L_0x0370
        L_0x0379:
            if (r0 == 0) goto L_0x0381
            int r0 = r0.intValue()
            r14.j = r0
        L_0x0381:
            java.lang.String r0 = "gcm.n.event_time"
            java.lang.String r6 = r8.B(r0)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0399
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0396 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0396 }
            goto L_0x039a
        L_0x0396:
            defpackage.sy4.R(r0)
        L_0x0399:
            r0 = 0
        L_0x039a:
            if (r0 == 0) goto L_0x03a6
            r14.l = r4
            long r6 = r0.longValue()
            android.app.Notification r0 = r14.F
            r0.when = r6
        L_0x03a6:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r0 = r8.v(r0)
            if (r0 != 0) goto L_0x03b0
        L_0x03ae:
            r7 = 0
            goto L_0x03d3
        L_0x03b0:
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
            if (r6 <= r4) goto L_0x03c7
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
            long[] r7 = new long[r6]     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
            r9 = r3
        L_0x03bd:
            if (r9 >= r6) goto L_0x03d3
            long r10 = r0.optLong(r9)     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
            r7[r9] = r10     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
            int r9 = r9 + r4
            goto L_0x03bd
        L_0x03c7:
            org.json.JSONException r6 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
            java.lang.String r7 = "vibrateTimings have invalid length"
            r6.<init>((java.lang.String) r7)     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
            throw r6     // Catch:{ NumberFormatException | JSONException -> 0x03cf }
        L_0x03cf:
            r0.toString()
            goto L_0x03ae
        L_0x03d3:
            if (r7 == 0) goto L_0x03d9
            android.app.Notification r0 = r14.F
            r0.vibrate = r7
        L_0x03d9:
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r6 = r8.v(r0)
            if (r6 != 0) goto L_0x03e3
        L_0x03e1:
            r0 = 0
            goto L_0x0425
        L_0x03e3:
            r7 = 3
            int[] r0 = new int[r7]
            int r9 = r6.length()     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            if (r9 != r7) goto L_0x0412
            java.lang.String r7 = r6.optString(r3)     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r7 == r9) goto L_0x040a
            r0[r3] = r7     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            int r7 = r6.optInt(r4)     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            r0[r4] = r7     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            r7 = 2
            int r9 = r6.optInt(r7)     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            r0[r7] = r9     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            goto L_0x0425
        L_0x0408:
            r0 = move-exception
            goto L_0x041a
        L_0x040a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            java.lang.String r7 = "Transparent color is invalid"
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            throw r0     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
        L_0x0412:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            java.lang.String r7 = "lightSettings don't have all three fields"
            r0.<init>((java.lang.String) r7)     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
            throw r0     // Catch:{ JSONException -> 0x0421, IllegalArgumentException -> 0x0408 }
        L_0x041a:
            r6.toString()
            r0.getMessage()
            goto L_0x03e1
        L_0x0421:
            r6.toString()
            goto L_0x03e1
        L_0x0425:
            if (r0 == 0) goto L_0x0443
            r6 = r0[r3]
            r7 = r0[r4]
            r9 = 2
            r0 = r0[r9]
            android.app.Notification r9 = r14.F
            r9.ledARGB = r6
            r9.ledOnMS = r7
            r9.ledOffMS = r0
            if (r7 == 0) goto L_0x043c
            if (r0 == 0) goto L_0x043c
            r0 = r4
            goto L_0x043d
        L_0x043c:
            r0 = r3
        L_0x043d:
            int r6 = r9.flags
            r2 = r2 & r6
            r0 = r0 | r2
            r9.flags = r0
        L_0x0443:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r8.s(r0)
            java.lang.String r2 = "gcm.n.default_vibrate_timings"
            boolean r2 = r8.s(r2)
            if (r2 == 0) goto L_0x0453
            r2 = 2
            r0 = r0 | r2
        L_0x0453:
            java.lang.String r2 = "gcm.n.default_light_settings"
            boolean r2 = r8.s(r2)
            if (r2 == 0) goto L_0x045d
            r0 = r0 | 4
        L_0x045d:
            r14.g(r0)
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r8.B(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x046e
        L_0x046c:
            r2 = r0
            goto L_0x0481
        L_0x046e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FCM-Notification:"
            r0.<init>(r2)
            long r6 = android.os.SystemClock.uptimeMillis()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x046c
        L_0x0481:
            if (r5 != 0) goto L_0x0484
            goto L_0x04c6
        L_0x0484:
            ukg r0 = r5.c     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            defpackage.fp3.n(r0)     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            r7 = 5
            java.lang.Object r0 = defpackage.j1e.c(r0, r7, r6)     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            r14.k(r0)     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            yt9 r6 = new yt9     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            r6.<init>()     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            if (r0 != 0) goto L_0x049f
            r0 = 0
            goto L_0x04a3
        L_0x049f:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
        L_0x04a3:
            r6.e = r0     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            r7 = 0
            r6.f = r7     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            r6.g = r4     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            r14.q(r6)     // Catch:{ ExecutionException -> 0x04ae, InterruptedException -> 0x04b4, TimeoutException -> 0x04b0 }
            goto L_0x04c6
        L_0x04ae:
            r0 = move-exception
            goto L_0x04bf
        L_0x04b0:
            r5.close()
            goto L_0x04c6
        L_0x04b4:
            r5.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x04c6
        L_0x04bf:
            java.lang.Throwable r0 = r0.getCause()
            java.util.Objects.toString(r0)
        L_0x04c6:
            java.lang.Object r0 = r1.b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.Notification r1 = r14.b()
            r0.notify(r2, r3, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8g.t():boolean");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [ww6, pw6] */
    public void u(t24 t24, Uri uri, Map map, long j, long j2, pa5 pa5) {
        boolean z;
        boolean z2 = true;
        sa4 sa4 = new sa4(t24, j, j2);
        this.c = sa4;
        if (((la5) this.b) == null) {
            Uri uri2 = uri;
            Map map2 = map;
            la5[] b2 = ((ra5) this.a).b(uri, map);
            int length = b2.length;
            ls5 ls5 = zw6.b;
            wmd.i(length, "expectedSize");
            ? pw6 = new pw6(length);
            if (b2.length == 1) {
                this.b = b2[0];
            } else {
                int length2 = b2.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    la5 la5 = b2[i];
                    try {
                        if (la5.n(sa4)) {
                            this.b = la5;
                            sa4.Y = 0;
                            break;
                        }
                        pw6.e(la5.o());
                        z = ((la5) this.b) != null || sa4.o == j;
                        fm9.k(z);
                        sa4.Y = 0;
                        i++;
                    } catch (EOFException unused) {
                        z = ((la5) this.b) != null || sa4.o == j;
                    } catch (Throwable th) {
                        if (((la5) this.b) == null && sa4.o != j) {
                            z2 = false;
                        }
                        fm9.k(z2);
                        sa4.Y = 0;
                        throw th;
                    }
                }
                if (((la5) this.b) == null) {
                    StringBuilder sb = new StringBuilder("None of the available extractors (");
                    o97 o97 = new o97(", ", 0);
                    Iterator it = br7.Z(new un0(4), zw6.k(b2)).iterator();
                    StringBuilder sb2 = new StringBuilder();
                    o97.a(sb2, it);
                    sb.append(sb2.toString());
                    sb.append(") could read the stream.");
                    String sb3 = sb.toString();
                    uri.getClass();
                    ffc j3 = pw6.j();
                    ParserException parserException = new ParserException(sb3, (Exception) null, false, 1);
                    zw6.j(j3);
                    throw parserException;
                }
            }
            ((la5) this.b).S(pa5);
        }
    }

    public void v(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            j8g j8g = new j8g((String) it.next(), str);
            ilc ilc = (ilc) this.a;
            ilc.b();
            ilc.c();
            try {
                ((x7g) this.b).C(j8g);
                ilc.r();
            } finally {
                ilc.l();
            }
        }
    }

    public void w() {
        ((pa5) this.a).w();
    }

    public void y(int i, String[] strArr, int[] iArr) {
        Context d0;
        Context d02;
        FrgBase frgBase = (FrgBase) this.b;
        if (i == 169) {
            if (wmd.O((FrgBase) this.b, strArr, iArr, wmd.f, jpc.a2, jpc.b2) && (d02 = frgBase.d0()) != null) {
                q().getClass();
                oe6.a(d02, this);
            }
        } else if (i == 175) {
            if (wmd.O((FrgBase) this.b, strArr, iArr, wmd.g, jpc.T1, jpc.b2) && (d0 = frgBase.d0()) != null) {
                q().getClass();
                oe6.a(d0, this);
            }
        }
    }

    public void z() {
        ((TypedArray) this.b).recycle();
    }

    public /* synthetic */ k8g(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ k8g(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public k8g(a4c a4c) {
        this.b = new CopyOnWriteArrayList();
        this.c = new Handler(Looper.getMainLooper());
        if (a4c != null) {
            this.a = a4c;
            return;
        }
        throw new IllegalArgumentException("Illegal 'uncaughtExceptionHandler' value: null");
    }

    public k8g(sy4 sy4) {
        c32 c32 = z04.c;
        nd2 nd2 = a14.g;
        this.a = sy4;
        this.b = c32;
        this.c = nd2;
    }

    public k8g(ilc ilc) {
        this.a = ilc;
        this.b = new x7g(ilc, 3);
        this.c = new ktf(ilc, 14);
    }

    public k8g(m20 m20) {
        this.a = m20.a;
        this.b = m20.b;
        this.c = m20.c;
    }

    public k8g(pa5 pa5, mbe mbe) {
        this.a = pa5;
        this.b = mbe;
        this.c = new SparseArray();
    }

    public k8g(Context context, sy4 sy4, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = sy4;
    }

    public k8g(ia5 ia5, ga5 ga5) {
        this.c = ia5;
        this.a = ga5;
    }

    public k8g(Context context) {
        this.a = new Object();
        this.c = new HashMap();
        this.b = new bnc(this, context);
    }
}
