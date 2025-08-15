package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: uhg  reason: default package */
public final class uhg extends sig {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uhg(mig mig, qne qne, qne qne2) {
        super(qne);
        this.c = qne2;
        this.o = mig;
    }

    public final void a() {
        HashMap hashMap;
        Parcel obtain;
        IInterface iInterface = null;
        switch (this.b) {
            case 0:
                try {
                    mig mig = (mig) this.o;
                    vhg vhg = (vhg) mig.a.m;
                    String str = mig.b;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = rig.a;
                    synchronized (rig.class) {
                        hashMap = rig.a;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    mig mig2 = (mig) this.o;
                    String str2 = mig2.b;
                    hig hig = new hig(mig2, (qne) this.c);
                    qgg qgg = (qgg) vhg;
                    qgg.getClass();
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i = egg.a;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(hig);
                    qgg.c.transact(2, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    qm4 qm4 = mig.c;
                    Object[] objArr = {((mig) this.o).b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        qm4.d(qm4.a, "error requesting in-app review for %s", objArr);
                    } else {
                        qm4.getClass();
                    }
                    ((qne) this.c).c(new RuntimeException(e));
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                int i2 = chg.d;
                IBinder iBinder = (IBinder) this.c;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    iInterface = queryLocalInterface instanceof vhg ? (vhg) queryLocalInterface : new qgg(iBinder);
                }
                hkg hkg = (hkg) this.o;
                mkg mkg = (mkg) hkg.b;
                mkg.m = iInterface;
                qm4 qm42 = mkg.b;
                qm42.b("linkToDeath", new Object[0]);
                try {
                    mkg.m.asBinder().linkToDeath(mkg.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        qm4.d(qm42.a, "linkToDeath failed", objArr2);
                    } else {
                        qm42.getClass();
                    }
                }
                mkg mkg2 = (mkg) hkg.b;
                mkg2.g = false;
                Iterator it = mkg2.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                mkg2.d.clear();
                return;
        }
    }

    public uhg(hkg hkg, IBinder iBinder) {
        this.c = iBinder;
        this.o = hkg;
    }
}
