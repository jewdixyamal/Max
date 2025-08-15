package defpackage;

import android.os.Parcel;

/* renamed from: frf  reason: default package */
public final class frf implements ofc {
    public final Object a;

    public /* synthetic */ frf(Object obj) {
        this.a = obj;
    }

    public void a(String str) {
        hrf hrf = ((grf) this.a).b;
        hrf.getClass();
        hrf.q.o("handleWebSocketClosed, reason=" + str);
        hrf.d();
    }

    public void accept(Object obj, Object obj2) {
        qne qne = (qne) obj2;
        bhg bhg = (bhg) obj;
        qr7 qr7 = (qr7) this.a;
        fp3.g("locationSettingsRequest can't be null", qr7 != null);
        nkg nkg = (nkg) bhg.o();
        xgg xgg = new xgg(0, qne);
        Parcel G0 = nkg.G0();
        zfg.b(G0, qr7);
        G0.writeStrongBinder(xgg);
        G0.writeString((String) null);
        nkg.H0(G0, 63);
    }

    public void b() {
        hrf hrf = ((grf) this.a).b;
        hrf.q.o("handleWebSocketOpen");
        hrf.n.onConnected();
        sy4 sy4 = hrf.m;
        if (sy4 != null) {
            synchronized (((rod) sy4.b).f) {
                try {
                    rod rod = (rod) sy4.b;
                    if (rod.q) {
                        rod.t = rod.s;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
