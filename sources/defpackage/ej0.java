package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ej0  reason: default package */
public abstract class ej0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final jn c = new jn(new CopyOnWriteArrayList(), 0, (yj8) null);
    public final lr4 d = new lr4(new CopyOnWriteArrayList(), 0, (yj8) null);
    public Looper e;
    public mue f;
    public j4b g;

    public boolean a(tb8 tb8) {
        return false;
    }

    public final jn b(yj8 yj8) {
        return new jn((CopyOnWriteArrayList) this.c.o, 0, yj8);
    }

    public abstract zd8 c(yj8 yj8, n64 n64, long j);

    public final void d(ak8 ak8) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(ak8);
        if (z && hashSet.isEmpty()) {
            e();
        }
    }

    public void e() {
    }

    public final void f(ak8 ak8) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(ak8);
        if (isEmpty) {
            g();
        }
    }

    public void g() {
    }

    public mue h() {
        return null;
    }

    public abstract tb8 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(ak8 ak8, z0f z0f, j4b j4b) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        fm9.f(looper == null || looper == myLooper);
        this.g = j4b;
        mue mue = this.f;
        this.a.add(ak8);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(ak8);
            m(z0f);
        } else if (mue != null) {
            f(ak8);
            ak8.a(this, mue);
        }
    }

    public abstract void m(z0f z0f);

    public final void n(mue mue) {
        this.f = mue;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ak8) it.next()).a(this, mue);
        }
    }

    public abstract void o(zd8 zd8);

    public final void p(ak8 ak8) {
        ArrayList arrayList = this.a;
        arrayList.remove(ak8);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            q();
            return;
        }
        d(ak8);
    }

    public abstract void q();

    public final void r(nr4 nr4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            jr4 jr4 = (jr4) it.next();
            if (jr4.b == nr4) {
                copyOnWriteArrayList.remove(jr4);
            }
        }
    }

    public final void s(ik8 ik8) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.o;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fk8 fk8 = (fk8) it.next();
            if (fk8.b == ik8) {
                copyOnWriteArrayList.remove(fk8);
            }
        }
    }

    public void t(tb8 tb8) {
    }
}
