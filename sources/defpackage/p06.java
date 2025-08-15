package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: p06  reason: default package */
public final class p06 implements uhc {
    public final ArrayList a;

    public p06(Set set) {
        this.a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            uhc uhc = (uhc) it.next();
            if (uhc != null) {
                this.a.add(uhc);
            }
        }
    }

    public static void l(Exception exc, String str) {
        ta5.c("ForwardingRequestListener", str, exc);
    }

    public final void a(wv6 wv6, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).a(wv6, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestSuccess");
            }
        }
    }

    public final void b(wv6 wv6, Object obj, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).b(wv6, obj, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestStart");
            }
        }
    }

    public final void c(wv6 wv6, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).c(wv6, str, th, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestFailure");
            }
        }
    }

    public final void d(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).d(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerStart");
            }
        }
    }

    public final void e(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).e(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithCancellation");
            }
        }
    }

    public final void f(String str, String str2, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).f(str, str2, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    public final void g(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).g(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onIntermediateChunkStart");
            }
        }
    }

    public final boolean h(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((uhc) arrayList.get(i)).h(str)) {
                return true;
            }
        }
        return false;
    }

    public final void i(String str, String str2, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).i(str, str2, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    public final void j(String str, String str2, Throwable th, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).j(str, str2, th, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithFailure");
            }
        }
    }

    public final void k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).k(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestCancellation");
            }
        }
    }

    public p06(uhc... uhcArr) {
        this.a = new ArrayList(uhcArr.length);
        for (uhc uhc : uhcArr) {
            if (uhc != null) {
                this.a.add(uhc);
            }
        }
    }
}
