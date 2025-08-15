package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: iz  reason: default package */
public final class iz extends ffe implements a66 {
    public final /* synthetic */ kz X;
    public final /* synthetic */ cu8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iz(kz kzVar, cu8 cu8, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = kzVar;
        this.Y = cu8;
        this.Z = l;
        this.s0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iz) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iz(this.X, this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        l20 l20;
        String str;
        String t;
        Object obj2;
        boolean z;
        od2.a0(obj);
        kz kzVar = this.X;
        kzVar.getClass();
        cu8 cu8 = this.Y;
        if (cu8.p()) {
            cu8 = cu8.C0;
        }
        k8g k8g = cu8.z0;
        String str2 = null;
        if (k8g == null || k8g.i() <= 0) {
            k8g = null;
        }
        boolean z2 = this.s0;
        if (k8g == null) {
            return new fz((String) null, z2 ? Integer.valueOf(bpc.d) : null, (String) null);
        }
        boolean z3 = false;
        Long l = this.Z;
        int i = -1;
        if (l != null) {
            Iterator it = ((List) k8g.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                l20 l202 = (l20) obj2;
                g20 g20 = l202.a;
                int i2 = g20 == null ? -1 : gz.$EnumSwitchMapping$0[g20.ordinal()];
                if (i2 == 1) {
                    x10 x10 = l202.b;
                    z = tpa.f(x10 != null ? Long.valueOf(x10.s0) : null, l);
                    continue;
                } else if (i2 == 2) {
                    k20 k20 = l202.d;
                    z = tpa.f(k20 != null ? Long.valueOf(k20.a) : null, l);
                    continue;
                } else if (i2 == 3) {
                    c20 c20 = l202.g;
                    z = tpa.f(c20 != null ? Long.valueOf(c20.a) : null, l);
                    continue;
                } else if (i2 == 4) {
                    s10 s10 = l202.j;
                    z = tpa.f(s10 != null ? Long.valueOf(s10.a) : null, l);
                    continue;
                } else if (i2 == 5) {
                    i10 i10 = l202.e;
                    z = tpa.f(i10 != null ? Long.valueOf(i10.a) : null, l);
                    continue;
                } else {
                    throw new IllegalStateException(("Attach with given id = " + l + " not found").toString());
                }
                if (z) {
                    break;
                }
            }
            if (obj2 != null) {
                l20 = (l20) obj2;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            l20 = k8g.h(0);
            if (l20 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        boolean f = l20.f();
        s10 s102 = l20.j;
        if (f) {
            x10 x102 = l20.b;
            if (x102.X) {
                str = x102.v0;
                if (str == null) {
                    str = x102.a();
                }
            } else {
                str = x102.a();
            }
        } else if (l20.i()) {
            str = l20.d.d;
        } else {
            if (l20.h()) {
                f20 f20 = l20.f;
                str = f20.h;
                if (oag.t(str)) {
                    t = f20.b;
                }
            } else {
                if (l20.g()) {
                    x10 x103 = l20.g.f;
                    if (x103 != null) {
                        z3 = true;
                    }
                    if (z3 && x103 != null) {
                        str = x103.a();
                    }
                } else if (l20.c()) {
                    l20 l203 = s102.d;
                    if (l203 != null) {
                        g20 g202 = l203.a;
                        if (g202 != null) {
                            i = gz.$EnumSwitchMapping$0[g202.ordinal()];
                        }
                        if (i == 1) {
                            x10 x104 = l203.b;
                            if (!x104.X) {
                                String str3 = x104.b;
                                if (str3 == null || str3.length() == 0) {
                                    String str4 = x104.a;
                                    if (!(str4 == null || str4.length() == 0)) {
                                        t = ju0.t(str4, kk0.b, jk0.a);
                                    }
                                } else {
                                    t = str3;
                                }
                            }
                        } else if (i == 2) {
                            t = l203.d.d;
                        }
                        t = null;
                    }
                } else if (l20.b()) {
                    je7 je7 = kzVar.g;
                    n10 n10 = l20.k;
                    str = ((ak3) je7.getValue()).a(((ak3) je7.getValue()).b(n10), n10);
                }
                str = null;
            }
            str = t;
        }
        Integer valueOf = l20.e() ? Integer.valueOf(bpc.b) : l20.c() ? Integer.valueOf(bpc.a) : l20.a() ? Integer.valueOf(bpc.c) : z2 ? Integer.valueOf(bpc.d) : null;
        if (l20.c()) {
            str2 = s102.c;
        }
        return new fz(str2, valueOf, str);
    }
}
