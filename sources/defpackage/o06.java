package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o06  reason: default package */
public final class o06 implements thc {
    public final ArrayList a;

    public o06(Set set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        for (Object next : set) {
            if (next != null) {
                arrayList.add(next);
            }
        }
    }

    public final void a(eab eab, String str, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).a(eab, str, map);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void b(eab eab) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).b(eab);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public final void c(eab eab) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).c(eab);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    public final void d(eab eab, String str, Throwable th, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).d(eab, str, th, map);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public final void e(eab eab, String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).e(eab, str, z);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void f(eab eab, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).f(eab, th);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public final void g(eab eab) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).g(eab);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public final void h(eab eab) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).h(eab);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public final boolean i(eab eab, String str) {
        ArrayList arrayList = this.a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((thc) it.next()).i(eab, str)) {
                return true;
            }
        }
        return false;
    }

    public final void j(eab eab, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).j(eab, str);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    public final void k(eab eab, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).k(eab, str);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }
}
