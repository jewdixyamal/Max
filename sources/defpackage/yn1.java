package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.SessionDescription;

/* renamed from: yn1  reason: default package */
public abstract class yn1 implements zy0, ep1, ii9, n38 {
    public boolean A0;
    public ssa B0;
    public final yuc C0;
    public final d4c X;
    public final a4c Y;
    public final pl5 Z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean b;
    public Runnable c;
    public final ag1 o;
    public final d s0;
    public final ArrayList t0 = new ArrayList();
    public final ji9 u0;
    public final kg1 v0;
    public final id1 w0;
    public final u38 x0;
    public xn1 y0;
    public int z0 = 0;

    public yn1(kg1 kg1, ji9 ji9, ag1 ag1, a4c a4c, d4c d4c, pl5 pl5, d dVar, id1 id1, u38 u38, yuc yuc) {
        jb9.e();
        this.o = ag1;
        this.Y = a4c;
        this.X = d4c;
        this.Z = pl5;
        this.v0 = kg1;
        this.u0 = ji9;
        this.w0 = id1;
        id1.a.a.add(this);
        id1.l.a.add(this);
        ji9.a.add(this);
        this.s0 = dVar;
        this.x0 = u38;
        this.C0 = yuc;
    }

    public static String B(int i) {
        return i == 0 ? "PASSIVE" : "ACTIVE";
    }

    public Map A() {
        return null;
    }

    public void C(y1e y1e) {
    }

    public abstract String D();

    public void E(bg1 bg1, List list, boolean z, ay0 ay0) {
    }

    public void F() {
    }

    public void G() {
    }

    public final boolean H(xxe xxe) {
        return y().equals(xxe);
    }

    public final boolean I() {
        return this.z0 == 1;
    }

    public final void J() {
        if (!this.b) {
            ag1 ag1 = this.o;
            ag1.b.getClass();
            if (this.c == null) {
                this.c = w();
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                Handler handler = this.a;
                ag1.b.getClass();
                handler.postDelayed(runnable, WorkRequest.MIN_BACKOFF_MILLIS);
            }
        }
    }

    public void K(bg1 bg1, zad zad, boolean z, by0 by0) {
    }

    public void L() {
        jb9.e();
        u38 u38 = this.x0;
        if (u38 != null) {
            u38.d.log("MediaAdaptation", "Releasing media adaptation controller");
            u38.a.j.remove(u38);
        }
        this.u0.a.remove(this);
        this.w0.a.a.remove(this);
        this.y0 = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public void M(long j, long j2) {
    }

    public void N(c4c c4c) {
    }

    public void O(boolean z) {
    }

    public void P(o1e o1e) {
    }

    public void Q(List list) {
        jb9.e();
        ArrayList arrayList = this.t0;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public void R(fp1 fp1, List list) {
    }

    public final void S(String str) {
        this.Y.log(D(), str);
    }

    public void T(List list) {
    }

    public abstract void U(ssa ssa);

    public final void V(String str) {
        this.Y.log(D(), str);
    }

    public void i(ji9 ji9) {
    }

    public void onActiveParticipantUpdated(yy0 yy0) {
    }

    public void onActiveParticipantsAdded(uy0 uy0) {
    }

    public void onActiveParticipantsChanged(vy0 vy0) {
    }

    public void onActiveParticipantsDeAnonimized(wy0 wy0) {
    }

    public void onActiveParticipantsRemoved(xy0 xy0) {
    }

    public final void p(o38 o38) {
        if (I()) {
            ssa ssa = o38.b;
            if (ssa == null) {
                ssa = this.B0;
            }
            U(ssa);
        }
    }

    public void r(y8 y8Var) {
    }

    public void s() {
    }

    public void t(bg1 bg1, SessionDescription sessionDescription) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('@');
        boolean z = jb9.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('{');
        sb.append(B(this.z0));
        sb.append('}');
        return sb.toString();
    }

    public void u(fg1 fg1, boolean z) {
    }

    public final void v(String str) {
        this.Y.log(D(), str);
    }

    public abstract Runnable w();

    public long x() {
        return -1;
    }

    public abstract xxe y();

    public final fg1 z(bg1 bg1) {
        if (bg1 != null) {
            return this.v0.j(bg1);
        }
        return null;
    }
}
