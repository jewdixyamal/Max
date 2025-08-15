package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: yd3  reason: default package */
public final class yd3 extends s2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    private volatile /* synthetic */ int _size$volatile;
    public final ReferenceQueue a;
    private volatile /* synthetic */ Object core$volatile = new vd3(this, 16);

    static {
        Class<yd3> cls = yd3.class;
        b = AtomicIntegerFieldUpdater.newUpdater(cls, "_size$volatile");
        c = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "core$volatile");
    }

    public yd3(boolean z) {
        this.a = z ? new ReferenceQueue() : null;
    }

    public final synchronized Object a(Object obj, Object obj2) {
        Object a2;
        vd3 vd3 = (vd3) c.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vd3.g;
            a2 = vd3.a(obj, obj2, (ui6) null);
            if (a2 == zd3.a) {
                vd3 = vd3.b();
                c.set(this, vd3);
            }
        }
        return a2;
    }

    public final void clear() {
        Iterator it = ((xd3) keySet()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        vd3 vd3 = (vd3) c.get(this);
        vd3.getClass();
        int hashCode = (obj.hashCode() * -1640531527) >>> vd3.b;
        while (true) {
            ui6 ui6 = (ui6) vd3.d.get(hashCode);
            if (ui6 == null) {
                return null;
            }
            Object obj2 = ui6.get();
            if (obj.equals(obj2)) {
                Object obj3 = vd3.e.get(hashCode);
                if (obj3 instanceof a08) {
                    obj3 = ((a08) obj3).a;
                }
                return obj3;
            }
            if (obj2 == null) {
                vd3.c(hashCode);
            }
            if (hashCode == 0) {
                hashCode = vd3.a;
            }
            hashCode--;
        }
    }

    public final Object put(Object obj, Object obj2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vd3.g;
        Object a2 = ((vd3) c.get(this)).a(obj, obj2, (ui6) null);
        if (a2 == zd3.a) {
            a2 = a(obj, obj2);
        }
        if (a2 == null) {
            b.incrementAndGet(this);
        }
        return a2;
    }

    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vd3.g;
        Object a2 = ((vd3) c.get(this)).a(obj, (Object) null, (ui6) null);
        if (a2 == zd3.a) {
            a2 = a(obj, (Object) null);
        }
        if (a2 != null) {
            b.decrementAndGet(this);
        }
        return a2;
    }
}
