package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: hf8  reason: default package */
public final class hf8 extends tg8 {
    public final String a;
    public final gf8 b;

    public hf8(String str, gf8 gf8) {
        this.a = str;
        this.b = gf8;
    }

    public final void f(int i) {
        gf8 gf8;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str != null && (gf8 = this.b) != null && (routingController = gf8.g) != null && !routingController.isReleased() && (messenger = gf8.h) != null) {
            int andIncrement = gf8.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = gf8.i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }

    public final void i(int i) {
        gf8 gf8;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str != null && (gf8 = this.b) != null && (routingController = gf8.g) != null && !routingController.isReleased() && (messenger = gf8.h) != null) {
            int andIncrement = gf8.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = gf8.i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }
}
