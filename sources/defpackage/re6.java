package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.facebook.animated.gif.GifImage;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.jakewharton.processphoenix.ProcessPhoenix;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import org.apache.http.util.LangUtils;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;

/* renamed from: re6  reason: default package */
public class re6 implements gg, lv, b4c, vg1, x85, t7c, qt3, ko7, a76, wu, qj3, Loggable, noc, z14, lxd {
    public static re6 X;
    public static int Y;
    public static re6 c;
    public static final Object o = new Object();
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ re6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        defpackage.v3c.i(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.sh0 i0(long r4, defpackage.hoc r6) {
        /*
            if (r6 == 0) goto L_0x0048
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.msgpack.core.buffer.OutputStreamBufferOutput r1 = new org.msgpack.core.buffer.OutputStreamBufferOutput     // Catch:{ JSONException -> 0x0027 }
            tw8 r2 = defpackage.vw8.b     // Catch:{ JSONException -> 0x0027 }
            int r3 = r2.c     // Catch:{ JSONException -> 0x0027 }
            r1.<init>(r0, r3)     // Catch:{ JSONException -> 0x0027 }
            ww8 r3 = new ww8     // Catch:{ JSONException -> 0x0027 }
            r3.<init>(r1, r2)     // Catch:{ JSONException -> 0x0027 }
            l0(r3, r4, r6)     // Catch:{ all -> 0x0029 }
            r4 = 0
            defpackage.v3c.i(r3, r4)     // Catch:{ JSONException -> 0x0027 }
            sh0 r4 = new sh0
            byte[] r5 = r0.toByteArray()
            r6 = 2
            r4.<init>((int) r6, (byte[]) r5)
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x0030
        L_0x0029:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002b }
        L_0x002b:
            r5 = move-exception
            defpackage.v3c.i(r3, r4)     // Catch:{ JSONException -> 0x0027 }
            throw r5     // Catch:{ JSONException -> 0x0027 }
        L_0x0030:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Class r6 = r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to serialize command: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6, r4)
            throw r5
        L_0x0048:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Illegal 'command' value: null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re6.i0(long, hoc):sh0");
    }

    public static void l0(ww8 ww8, long j, hoc hoc) {
        if (hoc instanceof ehc) {
            ehc ehc = (ehc) hoc;
            ww8.m(1);
            ww8.m(0);
            ww8.n(j);
            ww8.n(ehc.b);
            ww8.n(ehc.a);
            return;
        }
        byte b2 = -62;
        if (hoc instanceof d6f) {
            d6f d6f = (d6f) hoc;
            ww8.m(0);
            ww8.m(0);
            ww8.n(j);
            if (d6f.b) {
                b2 = -61;
            }
            ww8.m0(b2);
            List<m7d> list = d6f.a;
            int size = list.size();
            if (size == 0) {
                ww8.m0((byte) -64);
            } else {
                ww8.g(size * 2);
                for (m7d m7d : list) {
                    ww8.U(f46.P(m7d));
                    l7d l7d = m7d.b;
                    if (l7d.a) {
                        ww8.m(1);
                    } else {
                        ww8.m(0);
                        ww8.m0((byte) -64);
                        ww8.m(l7d.b);
                        ww8.m(l7d.c);
                        ww8.m(au1.s(l7d.d));
                    }
                }
            }
            ww8.m0((byte) -64);
        } else if (hoc instanceof nhc) {
            ww8.m(3);
            ww8.m(0);
            ww8.n(j);
            if (((nhc) hoc).a) {
                b2 = -61;
            }
            ww8.m0(b2);
        } else if (hoc instanceof chc) {
            chc chc = (chc) hoc;
            ww8.m(4);
            ww8.m(0);
            ww8.n(j);
            ww8.n(chc.a);
            ww8.n(chc.b);
        } else {
            throw new IllegalArgumentException("No serializer for command: " + j + " " + hoc.getClass());
        }
    }

    public static String m0(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public static re6 n0(Context context) {
        fp3.n(context);
        synchronized (re6.class) {
            if (c == null) {
                whg whg = mjg.a;
                synchronized (mjg.class) {
                    try {
                        if (mjg.c == null) {
                            mjg.c = context.getApplicationContext();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                c = new re6(context, 0);
            }
        }
        return c;
    }

    public static re6 p0() {
        synchronized (o) {
            try {
                re6 re6 = X;
                if (re6 == null) {
                    return new re6(1, false);
                }
                X = (re6) re6.b;
                re6.b = null;
                Y--;
                return re6;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static final pig t0(PackageInfo packageInfo, pig... pigArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        uig uig = new uig(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < pigArr.length; i++) {
            if (pigArr[i].equals(uig)) {
                return pigArr[i];
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean u0(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0027
        L_0x001a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L_0x0020
        L_0x001e:
            r5 = r1
            goto L_0x0027
        L_0x0020:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x001e
            r5 = r0
        L_0x0027:
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0048
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0039
            pig[] r4 = defpackage.hjg.a
            pig r4 = t0(r2, r4)
            goto L_0x0045
        L_0x0039:
            pig[] r4 = defpackage.hjg.a
            r4 = r4[r1]
            pig[] r4 = new defpackage.pig[]{r4}
            pig r4 = t0(r2, r4)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re6.u0(android.content.pm.PackageInfo, boolean):boolean");
    }

    public boolean A() {
        return true;
    }

    public long C() {
        return 0;
    }

    public long D(long j) {
        return 1;
    }

    public long E(long j, long j2) {
        return 1;
    }

    public vh9 F() {
        throw null;
    }

    public int G() {
        return ((ue) this.b).a;
    }

    public qt3 I(Collection collection) {
        ((Bundle) this.b).putBundle("actions", ay7.e(collection));
        return this;
    }

    public qt3 L(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Bundle bundle = (Bundle) this.b;
        bundle.putFloat("x", f);
        bundle.putFloat("y", f2);
        return this;
    }

    public int M(int i) {
        return ((int[]) ((ue) this.b).g)[i];
    }

    public kxd Q() {
        return (xxc) this.b;
    }

    public qt3 R(float f) {
        Rect rect = fk6.b;
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public qt3 S(Bundle bundle) {
        ((Bundle) this.b).putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    public void T(float f, float f2) {
        xg1 xg1 = (xg1) this.b;
        vg1 applicationPipDepended = xg1.getApplicationPipDepended();
        if (applicationPipDepended != null) {
            applicationPipDepended.T(f, f2);
        }
        PointF pointF = xg1.s0;
        pointF.x = f;
        pointF.y = f2;
    }

    public qt3 U(iqe iqe) {
        ((Bundle) this.b).putParcelable("header", iqe);
        return this;
    }

    public sh0 W(long j, hoc hoc) {
        try {
            return i0(j, hoc);
        } catch (Throwable th) {
            throw new RtcCommandException(Long.valueOf(j), false, th);
        }
    }

    public qt3 Y(View view) {
        if (view.getId() != -1) {
            int id = view.getId();
            Bundle bundle = (Bundle) this.b;
            bundle.putInt("anchor_id", id);
            bundle.putSerializable("anchor_class", view.getClass());
            return this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void a(Object obj) {
        f17 f17 = (f17) obj;
        d15 d15 = (d15) this.b;
        d15.q.getClass();
        long u = pq9.u();
        if (!f17.f.get()) {
            c54.k(u >= 0);
            f17.g = u;
            if (!f17.f.get()) {
                f17.h = true;
                f17.b();
                kq0.a(kq0.w(f17.d), new wd6(14, (Object) this), d15.h);
                return;
            }
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        throw new IllegalStateException("The buffer is submitted or canceled.");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                bt9 bt9 = (bt9) obj;
                d47 d47 = (d47) this.b;
                d47.d.f(d47);
                d47.l.compareAndSet(true, false);
                return;
            default:
                Throwable th = (Throwable) obj;
                if ((th instanceof OnErrorNotImplementedException) || (th instanceof UndeliverableException)) {
                    hm9.p("RxJavaErrorHandler", "rxjava undeliverable error", th);
                    ((ri4) bcf.a.getAccessor().c(ri4.class)).e();
                    return;
                } else if (th instanceof SQLiteDatabaseCorruptException) {
                    ProcessPhoenix.b((OneMeApplication) this.b);
                    return;
                } else {
                    Thread currentThread = Thread.currentThread();
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(currentThread, th);
                        return;
                    }
                    return;
                }
        }
    }

    public bm7 apply(Object obj) {
        return kq0.r(((l66) this.b).apply(obj));
    }

    public long b(long j) {
        return 0;
    }

    public rt3 build() {
        return new ContextMenuPopupWindow(new Bundle((Bundle) this.b));
    }

    public void c() {
        x14 x14 = (x14) this.b;
        x14.A.c();
        DashManifestStaleException dashManifestStaleException = x14.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    public void d(Throwable th) {
        ((d15) this.b).b(0, "Unable to acquire InputBuffer.", th);
    }

    public qt3 d0() {
        ((Bundle) this.b).putBoolean("dim", true);
        return this;
    }

    public int g0() {
        return ((GifImage) ((ue) this.b).e).i();
    }

    public ce3 getConfig() {
        return (ce3) this.b;
    }

    public e5f h0(long j, List list) {
        ((ua3) ((ta3) this.b)).makeCompleting$kotlinx_coroutines_core(list);
        return e5f.a;
    }

    public long j(long j, long j2) {
        return j2;
    }

    public g03 j0(int i, byte[] bArr) {
        if (i == 0) {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        } else if (i == 2) {
            try {
                gy8 a2 = vw8.a(bArr);
                try {
                    int v0 = a2.v0();
                    int v02 = a2.v0();
                    int v03 = a2.v0();
                    if (v02 != 0) {
                        throw new UnsupportedOperationException("Unsupported version: " + v02 + " for command " + v0);
                    } else if (v03 == 0) {
                        g03 g03 = v0 != 0 ? v0 != 1 ? null : new g03(a2.w0(), (Object) new fhc(Integer.valueOf(a2.v0())), 8) : k0(a2);
                        v3c.i(a2, (Throwable) null);
                        return g03;
                    } else {
                        throw new IllegalArgumentException("Error code " + v03 + " for command " + v0);
                    }
                } catch (Throwable th) {
                    v3c.i(a2, th);
                    throw th;
                }
            } catch (Throwable th2) {
                throw new IllegalArgumentException("Unable to decode command body: ".concat(xj6.a(bArr)), th2);
            }
        } else {
            throw new UnsupportedOperationException("Only binary format is supported");
        }
    }

    public long k(long j, long j2) {
        return 0;
    }

    public g03 k0(gy8 gy8) {
        fp1 fp1;
        long w0 = gy8.w0();
        HashMap hashMap = new HashMap();
        int x0 = gy8.x0();
        for (int i = 0; i < x0; i++) {
            if (gy8.n().a() == 5) {
                String z0 = gy8.z0();
                fp1 = f46.Z(z0);
                if (fp1 == null) {
                    throw new IllegalArgumentException("Not found video track participant key for ".concat(z0));
                }
            } else {
                int v0 = gy8.v0();
                fp1 = (fp1) ((ConcurrentHashMap) ((o9g) this.b).b).get(Integer.valueOf(v0));
                if (fp1 == null) {
                    throw new IllegalArgumentException(zr6.h(v0, "Not found video track participant key for "));
                }
            }
            hashMap.put(fp1, gy8.v0() == -1 ? e6f.b : e6f.a);
        }
        return new g03(w0, (Object) new f6f(hashMap), 8);
    }

    public long m(long j, long j2) {
        return -9223372036854775807L;
    }

    public q4c n(long j) {
        return (q4c) this.b;
    }

    public int o0() {
        return ((GifImage) ((ue) this.b).e).h();
    }

    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        a4c a4c;
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference != null && str != null && str2 != null && (a4c = (a4c) weakReference.get()) != null) {
            a4c.log(str2, str);
        }
    }

    public void q0() {
        synchronized (o) {
            try {
                int i = Y;
                if (i < 5) {
                    Y = i + 1;
                    re6 re6 = X;
                    if (re6 != null) {
                        this.b = re6;
                    }
                    X = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public qt3 r() {
        Rect rect = fk6.b;
        Rect rect2 = fk6.b;
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect2);
        bundle.remove("highlight_radius");
        return this;
    }

    public void r0(CaptureRequest.Key key, Object obj) {
        be3 be3 = be3.c;
        ((mi9) this.b).d(cv1.v0(key), be3, obj);
    }

    public qt3 s() {
        Bundle bundle = (Bundle) this.b;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    public int s0() {
        return ((GifImage) ((ue) this.b).e).k();
    }

    public boolean shouldHideSensitiveInformation() {
        ((x6a) ((je7) this.b).getValue()).getClass();
        return true;
    }

    public g03 t(int i, byte[] bArr) {
        try {
            return j0(i, bArr);
        } catch (Throwable th) {
            throw new RtcCommandException((Long) null, false, th);
        }
    }

    public long v(long j, long j2) {
        return 0;
    }

    public qt3 w(Rect rect, float f) {
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public int x() {
        return ((GifImage) ((ue) this.b).e).e();
    }

    public qt3 y() {
        ((Bundle) this.b).putBoolean("dark_theme", true);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.z();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF z() {
        /*
            r1 = this;
            java.lang.Object r1 = r1.b
            xg1 r1 = (defpackage.xg1) r1
            vg1 r0 = r1.getApplicationPipDepended()
            if (r0 == 0) goto L_0x0010
            android.graphics.PointF r0 = r0.z()
            if (r0 != 0) goto L_0x0018
        L_0x0010:
            android.content.Context r1 = r1.getContext()
            android.graphics.PointF r0 = defpackage.dy7.y(r1)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re6.z():android.graphics.PointF");
    }

    public /* synthetic */ re6(int i, boolean z) {
        this.a = i;
    }

    public re6(Context context, int i) {
        boolean isEmpty;
        this.a = i;
        switch (i) {
            case 29:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.b = sharedPreferences;
                File file = new File(kt3.c(context), "com.google.android.gms.appid-no-backup");
                if (!file.exists()) {
                    try {
                        if (file.createNewFile()) {
                            synchronized (this) {
                                isEmpty = sharedPreferences.getAll().isEmpty();
                            }
                            if (!isEmpty) {
                                synchronized (this) {
                                    sharedPreferences.edit().clear().commit();
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (IOException e) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            e.getMessage();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            default:
                this.b = context.getApplicationContext();
                return;
        }
    }

    public re6(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = mi9.b();
                return;
            case 9:
                this.b = new khe(new ie(13, (Object) this));
                return;
            case 10:
                this.b = new Bundle();
                return;
            case 19:
                this.b = (ExtraCroppingQuirk) zi4.a.e(ExtraCroppingQuirk.class);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                this.b = new b9b();
                return;
            case 28:
                this.b = new Object();
                return;
            default:
                this.b = new CopyOnWriteArrayList();
                return;
        }
    }
}
