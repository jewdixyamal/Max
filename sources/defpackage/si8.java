package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: si8  reason: default package */
public final class si8 extends t68 {
    public static final int q = (oaf.a >= 31 ? 33554432 : 0);
    public final m5d e;
    public final ii8 f;
    public final xi8 g;
    public final qi8 h;
    public final cy i;
    public final bi8 j;
    public final an k;
    public final ComponentName l;
    public v4b m;
    public volatile long n = 300000;
    public z66 o;
    public int p;

    /* JADX WARNING: type inference failed for: r0v1, types: [qi8, java.lang.Object] */
    public si8(ii8 ii8, Uri uri, Handler handler) {
        ComponentName componentName;
        ComponentName componentName2;
        PendingIntent pendingIntent;
        this.f = ii8;
        Context context = ii8.f;
        this.g = xi8.a(context);
        ? obj = new Object();
        obj.X = this;
        obj.a = gd8.J;
        obj.b = "";
        obj.o = -9223372036854775807L;
        this.h = obj;
        m5d m5d = new m5d(ii8);
        this.e = m5d;
        this.i = new cy(ii8.l.getLooper(), m5d);
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        boolean z = true;
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.isEmpty()) {
            componentName = null;
        } else {
            throw new IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size());
        }
        this.l = componentName;
        if (componentName == null || oaf.a < 31) {
            componentName2 = P(context, "androidx.media3.session.MediaLibraryService");
            componentName2 = componentName2 == null ? P(context, "androidx.media3.session.MediaSessionService") : componentName2;
            if (componentName2 == null || componentName2.equals(componentName)) {
                z = false;
            }
        } else {
            z = false;
            componentName2 = componentName;
        }
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentName2 == null) {
            an anVar = new an(7, this);
            this.k = anVar;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme(uri.getScheme());
            if (oaf.a < 33) {
                context.registerReceiver(anVar, intentFilter);
            } else {
                context.registerReceiver(anVar, intentFilter, 4);
            }
            intent2.setPackage(context.getPackageName());
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, q);
            componentName2 = new ComponentName(context, context.getClass());
        } else {
            intent2.setComponent(componentName2);
            pendingIntent = z ? oaf.a >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, q) : PendingIntent.getService(context, 0, intent2, q) : PendingIntent.getBroadcast(context, 0, intent2, q);
            this.k = null;
        }
        String join = TextUtils.join(".", new String[]{"androidx.media3.session.id", ii8.i});
        int i2 = oaf.a;
        bi8 bi8 = new bi8(context, join, i2 < 31 ? componentName2 : null, i2 < 31 ? pendingIntent : null, ii8.j.a.getExtras());
        this.j = bi8;
        if (i2 >= 31 && componentName != null) {
            oi8.a(bi8, componentName);
        }
        PendingIntent pendingIntent2 = ii8.t;
        if (pendingIntent2 != null) {
            bi8.a.a.setSessionActivity(pendingIntent2);
        }
        bi8.a.c(this, handler);
    }

    /* JADX INFO: finally extract failed */
    public static void J(bi8 bi8, hd8 hd8) {
        wh8 wh8 = bi8.a;
        wh8.i = hd8;
        MediaMetadata mediaMetadata = hd8.b;
        if (mediaMetadata == null) {
            Parcel obtain = Parcel.obtain();
            try {
                hd8.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                MediaMetadata mediaMetadata2 = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                hd8.b = mediaMetadata2;
                obtain.recycle();
                mediaMetadata = mediaMetadata2;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        wh8.a.setMetadata(mediaMetadata);
    }

    public static void K(si8 si8, x4b x4b) {
        si8.getClass();
        int i2 = x4b.t1(20) ? 4 : 0;
        if (si8.p != i2) {
            si8.p = i2;
            si8.j.a.a.setFlags(i2 | 3);
        }
    }

    public static void L(bi8 bi8, ArrayList arrayList) {
        if (arrayList != null) {
            bi8.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yh8 yh8 = (yh8) it.next();
                if (yh8 != null) {
                    long j2 = yh8.b;
                    if (hashSet.contains(Long.valueOf(j2))) {
                        new IllegalArgumentException("id of each queue item should be unique");
                    }
                    hashSet.add(Long.valueOf(j2));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        wh8 wh8 = bi8.a;
        wh8.h = arrayList;
        MediaSession mediaSession = wh8.a;
        if (arrayList == null) {
            mediaSession.setQueue((List) null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            yh8 yh82 = (yh8) it2.next();
            MediaSession.QueueItem queueItem = yh82.c;
            if (queueItem == null) {
                queueItem = xh8.a(yh82.a.b(), yh82.b);
                yh82.c = queueItem;
            }
            queueItem.getClass();
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [bb8, db8] */
    public static tb8 M(String str, Uri uri, String str2, Bundle bundle) {
        za8 za8 = new za8();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        Collections.emptyList();
        ffc ffc2 = ffc.X;
        fb8 fb8 = new fb8();
        lb8 lb8 = lb8.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        nw4 nw4 = new nw4(8);
        nw4.b = uri;
        nw4.c = str2;
        nw4.o = bundle;
        return new tb8(str3, new bb8(za8), (ib8) null, new hb8(fb8), gd8.J, new lb8(nw4));
    }

    public static ComponentName P(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public final void A(int i2) {
        N(15, new mi8(this, i2, 0), this.j.b(), true);
    }

    public final void B(int i2) {
        N(14, new mi8(this, i2, 1), this.j.b(), true);
    }

    public final void C() {
        boolean t1 = this.f.s.t1(9);
        bi8 bi8 = this.j;
        if (t1) {
            N(9, new ji8(this, 8), bi8.b(), true);
        } else {
            N(8, new ji8(this, 9), bi8.b(), true);
        }
    }

    public final void D() {
        boolean t1 = this.f.s.t1(7);
        bi8 bi8 = this.j;
        if (t1) {
            N(7, new ji8(this, 2), bi8.b(), true);
        } else {
            N(6, new ji8(this, 3), bi8.b(), true);
        }
    }

    public final void E(long j2) {
        if (j2 >= 0) {
            N(10, new ki8(this, j2, 0), this.j.b(), true);
        }
    }

    public final void F() {
        N(3, new ji8(this, 6), this.j.b(), true);
    }

    public final void N(int i2, ri8 ri8, vi8 vi8, boolean z) {
        ii8 ii8 = this.f;
        if (!ii8.i()) {
            if (vi8 == null) {
                z04.t("RemoteUserInfo is null, ignoring command=" + i2);
                return;
            }
            oaf.W(ii8.l, new ni8(this, i2, vi8, ri8, z));
        }
    }

    public final void O(y9d y9d, int i2, ri8 ri8, vi8 vi8) {
        if (vi8 == null) {
            StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = y9d;
            if (y9d == null) {
                obj = Integer.valueOf(i2);
            }
            sb.append(obj);
            z04.t(sb.toString());
            return;
        }
        oaf.W(this.f.l, new cy0(this, y9d, i2, vi8, ri8, 3));
    }

    public final void Q(tb8 tb8, boolean z) {
        N(31, new xd5(this, tb8, z, 5), this.j.b(), false);
    }

    public final oh8 R(vi8 vi8) {
        oh8 z = this.e.z(vi8);
        if (z == null) {
            vi8 vi82 = vi8;
            z = new oh8(vi82, 0, 0, this.g.b(vi8), new pi8(vi8), Bundle.EMPTY);
            mh8 l2 = this.f.l(z);
            this.e.p(vi8, z, l2.a, l2.b);
        }
        cy cyVar = this.i;
        long j2 = this.n;
        cyVar.removeMessages(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, z);
        cyVar.sendMessageDelayed(cyVar.obtainMessage(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, z), j2);
        return z;
    }

    public final void S(x4b x4b) {
        oaf.W(this.f.l, new li8(this, x4b, 1));
    }

    public final void f(ja8 ja8) {
        if (ja8 != null) {
            N(20, new ui0((Object) this, (Object) ja8, -1, 10), this.j.b(), false);
        }
    }

    public final void g(ja8 ja8, int i2) {
        if (ja8 == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            N(20, new ui0((Object) this, (Object) ja8, i2, 10), this.j.b(), false);
        }
    }

    public final void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
        fm9.l(str);
        if (!TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) || resultReceiver == null) {
            y9d y9d = new y9d(str, Bundle.EMPTY);
            O(y9d, 0, new u00(this, y9d, bundle, resultReceiver), this.j.b());
            return;
        }
        resultReceiver.send(0, this.f.j.b());
    }

    public final void i(String str, Bundle bundle) {
        y9d y9d = new y9d(str, Bundle.EMPTY);
        O(y9d, 0, new y98(this, y9d, bundle), this.j.b());
    }

    public final void j() {
        N(12, new ji8(this, 0), this.j.b(), true);
    }

    public final boolean k(Intent intent) {
        vi8 b = this.j.b();
        b.getClass();
        return this.f.n(new oh8(b, 0, 0, false, (nh8) null, Bundle.EMPTY), intent);
    }

    public final void l() {
        N(1, new ji8(this, 11), this.j.b(), true);
    }

    public final void m() {
        N(1, new ji8(this, 10), this.j.b(), false);
    }

    public final void n(String str, Bundle bundle) {
        Q(M(str, (Uri) null, (String) null, bundle), true);
    }

    public final void o(String str, Bundle bundle) {
        Q(M((String) null, (Uri) null, str, bundle), true);
    }

    public final void p(Uri uri, Bundle bundle) {
        Q(M((String) null, uri, (String) null, bundle), true);
    }

    public final void q() {
        N(2, new ji8(this, 5), this.j.b(), true);
    }

    public final void r(String str, Bundle bundle) {
        Q(M(str, (Uri) null, (String) null, bundle), false);
    }

    public final void s(String str, Bundle bundle) {
        Q(M((String) null, (Uri) null, str, bundle), false);
    }

    public final void t(Uri uri, Bundle bundle) {
        Q(M((String) null, uri, (String) null, bundle), false);
    }

    public final void u(ja8 ja8) {
        if (ja8 != null) {
            N(20, new y98((Object) this, 4, (Object) ja8), this.j.b(), true);
        }
    }

    public final void v() {
        N(11, new ji8(this, 4), this.j.b(), true);
    }

    public final void w(long j2) {
        N(5, new ki8(this, j2, 1), this.j.b(), true);
    }

    public final void x(float f2) {
        if (f2 > 0.0f) {
            N(13, new c74(this, f2), this.j.b(), true);
        }
    }

    public final void y(h5c h5c) {
        z(h5c);
    }

    public final void z(h5c h5c) {
        e5c q2 = gf7.q(h5c);
        if (q2 == null) {
            z04.c0("Ignoring invalid RatingCompat " + h5c);
            return;
        }
        O((y9d) null, 40010, new ji8(this, q2), this.j.b());
    }
}
