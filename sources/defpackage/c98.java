package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;

/* renamed from: c98  reason: default package */
public final class c98 extends ResultReceiver {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c98(int i, Handler handler, Object obj) {
        super(handler);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [nr6, java.lang.Object] */
    public final void onReceiveResult(int i, Bundle bundle) {
        pr6 pr6 = null;
        switch (this.a) {
            case 0:
                e98 e98 = (e98) ((WeakReference) this.b).get();
                if (e98 != null && bundle != null) {
                    synchronized (e98.b) {
                        ai8 ai8 = e98.e;
                        IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                        int i2 = uh8.d;
                        if (binder != null) {
                            IInterface queryLocalInterface = binder.queryLocalInterface(IMediaSession.DESCRIPTOR);
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof pr6)) {
                                ? obj = new Object();
                                obj.c = binder;
                                pr6 = obj;
                            } else {
                                pr6 = (pr6) queryLocalInterface;
                            }
                        }
                        synchronized (ai8.a) {
                            ai8.c = pr6;
                        }
                        ai8 ai82 = e98.e;
                        lcf w = tpa.w(bundle);
                        synchronized (ai82.a) {
                            ai82.o = w;
                        }
                        e98.a();
                    }
                    return;
                }
                return;
            case 1:
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                ((ccd) this.b).l(new sad(i, bundle));
                return;
            default:
                ((qne) this.b).d((Object) null);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c98(Handler handler) {
        super(handler);
        this.a = 0;
    }
}
