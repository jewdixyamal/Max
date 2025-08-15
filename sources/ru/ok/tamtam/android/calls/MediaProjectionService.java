package ru.ok.tamtam.android.calls;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/tamtam/android/calls/MediaProjectionService;", "Landroid/app/Service;", "<init>", "()V", "df8", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class MediaProjectionService extends Service {
    public static final /* synthetic */ int X = 0;
    public final khe a = new khe(new cf8(this, 0));
    public final khe b = new khe(new cf8(this, 1));
    public final df8 c = new Binder();
    public final String o = MediaProjectionService.class.getName();

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public final void onCreate() {
        super.onCreate();
        String str = this.o;
        hm9.m(str, "onCreate", new Object[0]);
        ((ri4) this.a.getValue()).f(str);
        bf8 bf8 = (bf8) ((ep) ((lle) this.b.getValue())).o.getValue();
        bu9 h = ((bea) bf8.b.getValue()).h(bf8.a, true, true);
        dp dpVar = bf8.c;
        dpVar.getClass();
        h.f = bu9.c(dpVar.a.getString(jpc.y2));
        startForeground(12, h.b());
    }

    public final void onDestroy() {
        super.onDestroy();
        String str = this.o;
        hm9.m(str, "onDestroy", new Object[0]);
        ((ri4) this.a.getValue()).g(str);
    }
}
