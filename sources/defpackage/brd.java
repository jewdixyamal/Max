package defpackage;

/* renamed from: brd  reason: default package */
public abstract class brd implements b37 {
    public volatile Object a = kq0.h;

    public final Object a(v4 v4Var) {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = kq0.h;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.a;
            if (obj == obj3) {
                obj = b(v4Var);
                this.a = obj;
            }
        }
        return obj;
    }

    public abstract Object b(v4 v4Var);
}
