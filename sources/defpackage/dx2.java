package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: dx2  reason: default package */
public final class dx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nx2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx2(nx2 nx2, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dx2) n((mt2) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dx2 dx2 = new dx2(this.Y, continuation);
        dx2.X = obj;
        return dx2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        mt2 mt2 = (mt2) this.X;
        if (nx2.q(this.Y, mt2)) {
            gi9 a = vv7.a();
            pk5 pk5 = new pk5(l6d.a0(new r1f(new at(2, mt2.a), new we1(28)), n71.v0));
            while (pk5.hasNext()) {
                a.a(((Number) pk5.next()).longValue());
            }
            gi9 gi9 = this.Y.Q0;
            long[] jArr = gi9.b;
            long[] jArr2 = gi9.a;
            int length = jArr2.length - 2;
            boolean z = false;
            if (length >= 0) {
                int i = 0;
                loop1:
                while (true) {
                    long j = jArr2[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                if (i2 != 8) {
                                    break;
                                }
                            } else if ((255 & j) < 128 && (!a.d(jArr[(i << 3) + i3]))) {
                                z = true;
                                break loop1;
                            } else {
                                j >>= 8;
                                i3++;
                            }
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            this.Y.Q0 = a;
            if (!z) {
                Iterable iterable = (Iterable) this.Y.K0.a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (a.d(((fb5) it.next()).a)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Iterable iterable2 = (Iterable) this.Y.L0.a.getValue();
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it2 = iterable2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (a.d(((fb5) it2.next()).a)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else {
                this.Y.u();
            }
            nx2 nx2 = this.Y;
            nx2.J0.setValue(nx2.I0.getValue());
        } else {
            this.Y.Q0 = vv7.a;
            this.Y.J0.m((Object) null, nz4.a);
        }
        return e5f.a;
    }
}
