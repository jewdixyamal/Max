package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* renamed from: tec  reason: default package */
public final class tec implements IBinder.DeathRecipient {
    public final Messenger a;
    public final pc b;
    public final Messenger c;
    public int d = 1;
    public int e = 1;
    public int f;
    public int g;
    public final SparseArray h = new SparseArray();
    public final /* synthetic */ yec i;

    public tec(yec yec, Messenger messenger) {
        this.i = yec;
        this.a = messenger;
        pc pcVar = new pc(this);
        this.b = pcVar;
        this.c = new Messenger(pcVar);
    }

    public final void a(int i2) {
        int i3 = this.d;
        this.d = i3 + 1;
        b(5, i3, i2, (Bundle) null, (Bundle) null);
    }

    public final boolean b(int i2, int i3, int i4, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.arg1 = i3;
        obtain.arg2 = i4;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    public final void binderDied() {
        this.i.u0.post(new sec(this, 1));
    }

    public final void c(int i2, int i3) {
        Bundle g2 = zr6.g(i3, "volume");
        int i4 = this.d;
        this.d = i4 + 1;
        b(7, i4, i2, (Bundle) null, g2);
    }

    public final void d(int i2, int i3) {
        Bundle g2 = zr6.g(i3, "volume");
        int i4 = this.d;
        this.d = i4 + 1;
        b(8, i4, i2, (Bundle) null, g2);
    }
}
