package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bi8  reason: default package */
public final class bi8 {
    public static int d;
    public final wh8 a;
    public final qz7 b;
    public final ArrayList c = new ArrayList();

    /* JADX WARNING: type inference failed for: r8v2, types: [wh8, vh8] */
    public bi8(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i = dl8.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    queryBroadcastReceivers.size();
                    componentName = null;
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            ? vh8 = new vh8(context, str, bundle);
            this.a = vh8;
            Looper myLooper = Looper.myLooper();
            vh8.c(new t68(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            vh8.a.setMediaButtonReceiver(pendingIntent);
            this.b = new qz7(context, vh8.c);
            if (d == 0) {
                d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = bi8.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public final vi8 b() {
        return new vi8(this.a.a.getCurrentControllerInfo());
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.util.AbstractCollection, java.util.List] */
    public final void c(i3b i3b) {
        wh8 wh8 = this.a;
        wh8.g = i3b;
        synchronized (wh8.d) {
            for (int beginBroadcast = wh8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((mr6) wh8.f.getBroadcastItem(beginBroadcast)).f(i3b);
                } catch (RemoteException unused) {
                }
            }
            wh8.f.finishBroadcast();
        }
        MediaSession mediaSession = wh8.a;
        if (i3b.w0 == null) {
            PlaybackState.Builder d2 = e3b.d();
            e3b.x(d2, i3b.a, i3b.b, i3b.o, i3b.s0);
            e3b.u(d2, i3b.c);
            e3b.s(d2, i3b.X);
            e3b.v(d2, i3b.Z);
            for (h3b h3b : i3b.t0) {
                PlaybackState.CustomAction customAction = h3b.X;
                if (customAction == null) {
                    PlaybackState.CustomAction.Builder e = e3b.e(h3b.a, h3b.b, h3b.c);
                    e3b.w(e, h3b.o);
                    customAction = e3b.b(e);
                }
                if (customAction != null) {
                    e3b.a(d2, customAction);
                }
            }
            e3b.t(d2, i3b.u0);
            f3b.b(d2, i3b.v0);
            i3b.w0 = e3b.c(d2);
        }
        mediaSession.setPlaybackState(i3b.w0);
    }
}
