package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: jjg  reason: default package */
public final class jjg extends pjg {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ qne c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jjg(fkg fkg, qne qne, String str, qne qne2) {
        super(qne);
        this.X = fkg;
        this.o = str;
        this.c = qne2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [thg, android.os.IInterface] */
    public final void a() {
        switch (this.b) {
            case 0:
                qne qne = this.c;
                fkg fkg = (fkg) this.X;
                String str = (String) this.o;
                try {
                    fkg.a.m.o(fkg.b, fkg.a(fkg, str), new akg(fkg, qne, str));
                    return;
                } catch (RemoteException e) {
                    o97 o97 = fkg.e;
                    Object[] objArr = {str};
                    if (Log.isLoggable("PlayCore", 6)) {
                        o97.c(o97.b, "requestUpdateInfo(%s)", objArr);
                    } else {
                        o97.getClass();
                    }
                    qne.c(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((ykg) this.X).f) {
                    try {
                        ykg ykg = (ykg) this.X;
                        qne qne2 = this.c;
                        ykg.e.add(qne2);
                        qne2.a.i(new l7b(ykg, qne2, false, 18));
                        if (((ykg) this.X).k.getAndIncrement() > 0) {
                            ((ykg) this.X).b.b("Already connected to the service.", new Object[0]);
                        }
                        ykg.b((ykg) this.X, (pjg) this.o);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jjg(ykg ykg, qne qne, qne qne2, jjg jjg) {
        super(qne);
        this.X = ykg;
        this.c = qne2;
        this.o = jjg;
    }
}
