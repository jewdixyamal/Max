package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: jeg  reason: default package */
public final class jeg extends odg {
    public final pw6 b;
    public final qne c;
    public final rq9 d;

    public jeg(int i, pw6 pw6, qne qne, rq9 rq9) {
        super(i);
        this.c = qne;
        this.b = pw6;
        this.d = rq9;
        if (i == 2 && pw6.a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.d.getClass();
        this.c.c(i24.k(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.c.c(runtimeException);
    }

    public final void c(kdg kdg) {
        qne qne = this.c;
        try {
            this.b.g(kdg.d, qne);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(peg.e(e2));
        } catch (RuntimeException e3) {
            qne.c(e3);
        }
    }

    public final void d(aab aab, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        qne qne = this.c;
        ((Map) aab.b).put(qne, valueOf);
        qne.a.i(new wva(aab, qne, false, 17));
    }

    public final boolean f(kdg kdg) {
        return this.b.a;
    }

    public final pe5[] g(kdg kdg) {
        return (pe5[]) this.b.c;
    }
}
