package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cj8  reason: default package */
public final class cj8 extends Service {
    public static final /* synthetic */ int w0 = 0;
    public final us X = new qpd(0);
    public s68 Y;
    public final cy Z;
    public x68 a;
    public final gaa b = new gaa((Object) this);
    public final s68 c = new s68(this, "android.media.session.MediaController", -1, -1, (c78) null);
    public final ArrayList o = new ArrayList();
    public ai8 s0;
    public final xi8 t0;
    public final ii8 u0;
    public final m5d v0;

    /* JADX WARNING: type inference failed for: r0v3, types: [qpd, us] */
    public cj8(ii8 ii8) {
        cy cyVar = new cy();
        cyVar.b = this;
        this.Z = cyVar;
        this.t0 = xi8.a(ii8.f);
        this.u0 = ii8;
        this.v0 = new m5d(ii8);
    }

    public final void a(ai8 ai8) {
        attachBaseContext(this.u0.f);
        onCreate();
        if (ai8 == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.s0 == null) {
            this.s0 = ai8;
            x68 x68 = this.a;
            x68.getClass();
            ((cj8) x68.d).Z.d(new i76((Object) x68, (Object) ai8, false, 8));
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public final ph4 b(Bundle bundle) {
        x68 x68 = this.a;
        x68.getClass();
        vi8 K = x68.K();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        oh8 oh8 = new oh8(K, 0, 0, this.t0.b(K), (nh8) null, bundle);
        AtomicReference atomicReference = new AtomicReference();
        ae3 ae3 = new ae3(false, 1);
        oaf.W(this.u0.l, new yg3((Object) this, (Object) atomicReference, (Object) oh8, (Object) ae3, 8));
        try {
            ae3.a();
            mh8 mh8 = (mh8) atomicReference.get();
            mh8.getClass();
            this.v0.p(K, oh8, mh8.a, mh8.b);
            return j47.X;
        } catch (InterruptedException e) {
            z04.v("Couldn't get a result from onConnect", e);
            return null;
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final IBinder onBind(Intent intent) {
        x68 x68 = this.a;
        x68.getClass();
        v68 v68 = (v68) x68.b;
        v68.getClass();
        return v68.onBind(intent);
    }

    public final void onCreate() {
        super.onCreate();
        x68 x68 = new x68(this);
        this.a = x68;
        x68.J();
    }

    public final void onDestroy() {
        this.Z.b = null;
    }
}
