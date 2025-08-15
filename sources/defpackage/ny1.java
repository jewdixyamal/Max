package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import org.webrtc.PeerConnection;

/* renamed from: ny1  reason: default package */
public abstract class ny1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public ny1(nsa nsa) {
        this.a = 1;
        this.b = nsa;
    }

    public static void b(s7g s7g, String str) {
        v8g v8g;
        boolean z;
        WorkDatabase workDatabase = s7g.c;
        i8g y = workDatabase.y();
        ph4 t = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            m7g j = y.j(str2);
            if (!(j == m7g.c || j == m7g.o)) {
                y.q(m7g.Y, str2);
            }
            linkedList.addAll(t.n(str2));
        }
        y9b y9b = s7g.f;
        synchronized (y9b.w0) {
            try {
                a14 u = a14.u();
                String str3 = y9b.x0;
                u.n(str3, "Processor cancelling " + str);
                y9b.u0.add(str);
                v8g = (v8g) y9b.Y.remove(str);
                z = v8g != null;
                if (v8g == null) {
                    v8g = (v8g) y9b.Z.remove(str);
                }
                if (v8g != null) {
                    y9b.s0.remove(str);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        y9b.c(str, v8g);
        if (z) {
            y9b.i();
        }
        for (auc d : s7g.e) {
            d.d(str);
        }
    }

    public abstract void a(PeerConnection peerConnection);

    public abstract void c();

    public final void run() {
        switch (this.a) {
            case 0:
                imc imc = (imc) this.b;
                try {
                    c();
                    imc.V(pma.Q);
                    return;
                } catch (Throwable th) {
                    imc.V(new mma(th));
                    return;
                }
            default:
                PeerConnection G = ((nsa) this.b).G();
                if (G != null) {
                    a(G);
                    return;
                }
                return;
        }
    }

    public ny1() {
        this.a = 0;
        this.b = new imc(28);
    }
}
