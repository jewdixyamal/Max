package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: vd3  reason: default package */
public final class vd3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(vd3.class, "load$volatile");
    public final int a;
    public final int b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public final /* synthetic */ AtomicReferenceArray e;
    public final /* synthetic */ yd3 f;
    private volatile /* synthetic */ int load$volatile;

    public vd3(yd3 yd3, int i) {
        this.f = yd3;
        this.a = i;
        this.b = Integer.numberOfLeadingZeros(i) + 1;
        this.c = (i * 2) / 3;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReferenceArray(i);
    }

    public final Object a(Object obj, Object obj2, ui6 ui6) {
        Reference reference;
        int i;
        int hashCode = (obj.hashCode() * -1640531527) >>> this.b;
        boolean z = false;
        Reference reference2 = ui6;
        loop0:
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.d;
            ui6 ui62 = (ui6) atomicReferenceArray.get(hashCode);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            if (ui62 == null) {
                if (obj2 != null) {
                    if (!z) {
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.c) {
                                return zd3.a;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    boolean z2 = z;
                    Reference reference3 = reference2;
                    if (reference2 == null) {
                        Reference weakReference = new WeakReference(obj, this.f.a);
                        obj.hashCode();
                        reference3 = weakReference;
                    }
                    Reference reference4 = reference3;
                    while (!atomicReferenceArray.compareAndSet(hashCode, (Object) null, reference4)) {
                        if (atomicReferenceArray.get(hashCode) != null) {
                            z = z2;
                            reference = reference4;
                        }
                    }
                    break loop0;
                }
                return null;
            }
            Object obj3 = ui62.get();
            if (!obj.equals(obj3)) {
                if (obj3 == null) {
                    c(hashCode);
                }
                if (hashCode == 0) {
                    hashCode = this.a;
                }
                hashCode--;
                reference = reference2;
            } else if (z) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
            }
            reference2 = reference;
        }
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            Object obj4 = atomicReferenceArray2.get(hashCode);
            if (obj4 instanceof a08) {
                return zd3.a;
            }
            while (true) {
                if (atomicReferenceArray2.compareAndSet(hashCode, obj4, obj2)) {
                    return obj4;
                }
                if (atomicReferenceArray2.get(hashCode) != obj4) {
                }
            }
        }
    }

    public final vd3 b() {
        Object obj;
        a08 a08;
        while (true) {
            yd3 yd3 = this.f;
            int size = yd3.size();
            if (size < 4) {
                size = 4;
            }
            vd3 vd3 = new vd3(yd3, Integer.highestOneBit(size) * 4);
            int i = 0;
            while (true) {
                if (i >= this.a) {
                    return vd3;
                }
                ui6 ui6 = (ui6) this.d.get(i);
                Object obj2 = ui6 != null ? ui6.get() : null;
                if (ui6 != null && obj2 == null) {
                    c(i);
                }
                while (true) {
                    AtomicReferenceArray atomicReferenceArray = this.e;
                    obj = atomicReferenceArray.get(i);
                    if (obj instanceof a08) {
                        obj = ((a08) obj).a;
                        break;
                    }
                    if (obj == null) {
                        a08 = zd3.b;
                    } else {
                        Symbol symbol = zd3.a;
                        a08 = obj.equals(Boolean.TRUE) ? zd3.c : new a08(obj);
                    }
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(i, obj, a08)) {
                            break;
                        } else if (atomicReferenceArray.get(i) != obj) {
                        }
                    }
                }
                if (obj2 == null || obj == null || vd3.a(obj2, obj, ui6) != zd3.a) {
                    i++;
                }
            }
        }
    }

    public final void c(int i) {
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            Object obj = atomicReferenceArray.get(i);
            if (obj != null && !(obj instanceof a08)) {
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, obj, (Object) null)) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yd3.b;
                        yd3 yd3 = this.f;
                        yd3.getClass();
                        yd3.b.decrementAndGet(yd3);
                        return;
                    } else if (atomicReferenceArray.get(i) != obj) {
                    }
                }
            } else {
                return;
            }
        }
    }
}
