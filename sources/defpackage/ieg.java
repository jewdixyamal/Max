package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: ieg  reason: default package */
public final class ieg extends odg {
    public final qne b;
    public final /* synthetic */ int c;
    public final Object d;

    public ieg(int i, qne qne) {
        super(i);
        this.b = qne;
    }

    private final /* bridge */ /* synthetic */ void i(aab aab, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(aab aab, boolean z) {
    }

    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.b.c(runtimeException);
    }

    public final void c(kdg kdg) {
        try {
            h(kdg);
        } catch (DeadObjectException e) {
            a(peg.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(peg.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public final /* bridge */ /* synthetic */ void d(aab aab, boolean z) {
        int i = this.c;
    }

    public final boolean f(kdg kdg) {
        switch (this.c) {
            case 0:
                ((vdg) this.d).a.getClass();
                return true;
            default:
                vdg vdg = (vdg) kdg.h.get((hm7) this.d);
                if (vdg == null) {
                    return false;
                }
                vdg.a.getClass();
                return true;
        }
    }

    public final pe5[] g(kdg kdg) {
        switch (this.c) {
            case 0:
                ((vdg) this.d).a.getClass();
                return null;
            default:
                vdg vdg = (vdg) kdg.h.get((hm7) this.d);
                if (vdg != null) {
                    vdg.a.getClass();
                }
                return null;
        }
    }

    public final void h(kdg kdg) {
        switch (this.c) {
            case 0:
                bdb bdb = ((vdg) this.d).a;
                ((ofc) ((pkg) bdb.c).a).accept(kdg.d, this.b);
                hm7 hm7 = (hm7) ((rw4) ((vdg) this.d).a.b).c;
                if (hm7 != null) {
                    kdg.h.put(hm7, (vdg) this.d);
                    return;
                }
                return;
            default:
                vdg vdg = (vdg) kdg.h.remove((hm7) this.d);
                qne qne = this.b;
                if (vdg != null) {
                    ((ofc) ((pkg) vdg.b.a).c).accept(kdg.d, qne);
                    rw4 rw4 = (rw4) vdg.a.b;
                    rw4.b = null;
                    rw4.c = null;
                    return;
                }
                qne.d(Boolean.FALSE);
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ieg(hm7 hm7, qne qne) {
        this(4, qne);
        this.c = 1;
        this.d = hm7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ieg(vdg vdg, qne qne) {
        this(3, qne);
        this.c = 0;
        this.d = vdg;
    }
}
