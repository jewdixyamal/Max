package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: xrb  reason: default package */
public final class xrb implements py9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xrb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Throwable th) {
    }

    private final void c(Throwable th) {
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((tj3) this.b).accept(obj);
                return;
            case 1:
                ((adc) this.b).b.v((Boolean) obj);
                return;
            default:
                ub0 ub0 = (ub0) obj;
                if (ub0 != null) {
                    rdf rdf = (rdf) this.b;
                    if (rdf.v != 3) {
                        Objects.toString(rdf.r);
                        ub0.toString();
                        ub0 ub02 = rdf.r;
                        rdf.r = ub0;
                        vb0 vb0 = rdf.g;
                        vb0.getClass();
                        int i = ub02.a;
                        Set set = ub0.e;
                        boolean contains = set.contains(Integer.valueOf(i));
                        int i2 = ub0.a;
                        if ((contains || set.contains(Integer.valueOf(i2)) || i == i2) && (!rdf.z || ub02.c == null || ub0.c != null)) {
                            int i3 = ub02.a;
                            if ((i3 != -1 && i2 == -1) || (i3 == -1 && i2 != -1)) {
                                rdf.H(rdf.s, ub0, vb0);
                                ArrayList arrayList = new ArrayList(1);
                                Object obj2 = new Object[]{rdf.s.c()}[0];
                                Objects.requireNonNull(obj2);
                                arrayList.add(obj2);
                                rdf.E(Collections.unmodifiableList(arrayList));
                                rdf.q();
                                return;
                            } else if (ub02.b != ub0.b) {
                                rdf.H(rdf.s, ub0, vb0);
                                ArrayList arrayList2 = new ArrayList(1);
                                Object obj3 = new Object[]{rdf.s.c()}[0];
                                Objects.requireNonNull(obj3);
                                arrayList2.add(obj3);
                                rdf.E(Collections.unmodifiableList(arrayList2));
                                Iterator it = rdf.a.iterator();
                                while (it.hasNext()) {
                                    ((k9f) it.next()).i(rdf);
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            rdf.N();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                cd6 cd6 = ((adc) this.b).b;
                cd6.getClass();
                cd6.v(new tb0(th));
                return;
            default:
                return;
        }
    }
}
