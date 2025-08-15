package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: ajg  reason: default package */
public final /* synthetic */ class ajg implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ajg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                mkg mkg = (mkg) obj;
                mkg.b.b("reportBinderDeath", new Object[0]);
                au1.r(mkg.i.get());
                mkg.b.b("%s : Binder has died.", mkg.c);
                Iterator it = mkg.d.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(mkg.c).concat(" : Binder has died."));
                    qne qne = ((sig) it.next()).a;
                    if (qne != null) {
                        qne.c(remoteException);
                    }
                }
                mkg.d.clear();
                synchronized (mkg.f) {
                    mkg.c();
                }
                return;
            default:
                ykg ykg = (ykg) obj;
                ykg.b.b("reportBinderDeath", new Object[0]);
                au1.r(ykg.i.get());
                ykg.b.b("%s : Binder has died.", ykg.c);
                Iterator it2 = ykg.d.iterator();
                while (it2.hasNext()) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(ykg.c).concat(" : Binder has died."));
                    qne qne2 = ((pjg) it2.next()).a;
                    if (qne2 != null) {
                        qne2.c(remoteException2);
                    }
                }
                ykg.d.clear();
                synchronized (ykg.f) {
                    ykg.d();
                }
                return;
        }
    }
}
