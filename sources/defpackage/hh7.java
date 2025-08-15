package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: hh7  reason: default package */
public abstract class hh7 extends Service implements eh7 {
    public final vq7 a = new vq7((eh7) this);

    public final gh7 Q() {
        return (gh7) this.a.b;
    }

    public final IBinder onBind(Intent intent) {
        this.a.r(eg7.ON_START);
        return null;
    }

    public void onCreate() {
        this.a.r(eg7.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        eg7 eg7 = eg7.ON_STOP;
        vq7 vq7 = this.a;
        vq7.r(eg7);
        vq7.r(eg7.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        this.a.r(eg7.ON_START);
        super.onStart(intent, i);
    }
}
