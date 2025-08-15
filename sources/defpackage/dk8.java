package defpackage;

import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* renamed from: dk8  reason: default package */
public final /* synthetic */ class dk8 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ dk8(WorkDatabase workDatabase, h8g h8g, h8g h8g2, List list, String str, Set set, boolean z) {
        this.a = 3;
        this.o = workDatabase;
        this.X = h8g;
        this.Y = h8g2;
        this.Z = str;
        this.b = set;
        this.c = z;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        switch (this.a) {
            case 0:
                gk8 gk8 = (gk8) this.o;
                ((hk8) this.X).u(gk8.b, (xj8) gk8.c, (xn7) this.Y, (pc8) this.Z, (IOException) this.b, this.c);
                return;
            case 1:
                jn jnVar = (jn) this.o;
                ((ik8) this.X).e(jnVar.b, (yj8) jnVar.c, (yn7) this.Y, (pc8) this.Z, (IOException) this.b, this.c);
                return;
            case 2:
                Pair pair = (Pair) this.X;
                ((i74) ((vk8) ((imc) this.o).c).j).e(((Integer) pair.first).intValue(), (yj8) pair.second, (yn7) this.Y, (pc8) this.Z, (IOException) this.b, this.c);
                return;
            default:
                WorkDatabase workDatabase = (WorkDatabase) this.o;
                i8g y = workDatabase.y();
                k8g z = workDatabase.z();
                h8g h8g = (h8g) this.Y;
                h8g b2 = h8g.b((h8g) this.X, (String) null, h8g.b, (String) null, (d24) null, h8g.k, h8g.n, h8g.t + 1, 515069);
                ilc ilc = (ilc) y.a;
                ilc.b();
                ilc.c();
                try {
                    ((ha4) y.c).B(b2);
                    ilc.r();
                    ilc.l();
                    ilc ilc2 = (ilc) z.a;
                    ilc2.b();
                    ktf ktf = (ktf) z.c;
                    q36 f = ktf.f();
                    String str = (String) this.Z;
                    f.f(1, str);
                    ilc2.c();
                    try {
                        f.n();
                        ilc2.r();
                        ilc2.l();
                        ktf.t(f);
                        z.v(str, (Set) this.b);
                        if (!this.c) {
                            y.n(-1, str);
                            workDatabase.x().f(str);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        ilc2.l();
                        ktf.t(f);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ilc.l();
                    throw th2;
                }
        }
    }

    public /* synthetic */ dk8(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z, int i) {
        this.a = i;
        this.o = obj;
        this.X = obj2;
        this.Y = obj3;
        this.Z = obj4;
        this.b = iOException;
        this.c = z;
    }
}
