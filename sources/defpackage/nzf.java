package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: nzf  reason: default package */
public final class nzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nzf(zzf zzf, Continuation continuation) {
        super(2, continuation);
        this.Y = zzf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nzf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        q42 q42;
        Long l;
        tx3 tx3 = tx3.a;
        int i = this.X;
        Long l2 = null;
        if (i == 0) {
            od2.a0(obj);
            zzf zzf = this.Y;
            gc6 gc6 = zzf.t0;
            long j = zzf.b;
            Long l3 = zzf.o;
            if (l3 != null) {
                e52 e52 = (e52) ((jz2) ((iy2) zzf.v0.getValue())).m(l3.longValue()).a.getValue();
                Long valueOf = e52 != null ? Long.valueOf(e52.b.a) : null;
                if (valueOf != null && valueOf.longValue() == 0) {
                    valueOf = null;
                }
                l = valueOf;
            } else {
                l = null;
            }
            String str = this.Y.X;
            this.X = 1;
            obj = gc6.a(j, l, str, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        la9 la9 = (la9) obj;
        e5f e5f = e5f.a;
        if (la9 == null) {
            this.Y.s0.a((String) null, new Exception(ey8.i(this.Y.b, "Root url for ", " not found")));
            this.Y.E0.m((Object) null, cpa.o);
            return e5f;
        }
        this.Y.K0 = la9.c;
        zzf zzf2 = this.Y;
        String str2 = la9.b;
        zzf2.getClass();
        pnf.o(zzf2.M0, new azf(str2));
        this.Y.H0.setValue(la9.a);
        zzf zzf3 = this.Y;
        long j2 = zzf3.b;
        String str3 = la9.a;
        osf osf = zzf3.c;
        if (osf == osf.FOLDER) {
            q42 = new q42(5, 2L);
        } else {
            q42 q422 = tsf.c;
            Long l4 = zzf3.o;
            if (l4 != null) {
                e52 e522 = (e52) ((jz2) ((iy2) zzf3.v0.getValue())).m(l4.longValue()).a.getValue();
                if (e522 != null) {
                    if (e522.H()) {
                        uj3 l5 = e522.l();
                        if (l5 != null) {
                            l2 = Long.valueOf(l5.n());
                        }
                        if (l2 != null) {
                            q422 = new rsf(l2.longValue());
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else if (e522.M()) {
                        uj3 l6 = e522.l();
                        if (l6 != null) {
                            l2 = Long.valueOf(l6.n());
                        }
                        if (l2 != null) {
                            q422 = new ssf(l2.longValue());
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        boolean I = e522.I();
                        k92 k92 = e522.b;
                        q422 = I ? new psf(k92.a) : new qsf(k92.a);
                    }
                }
            }
            q42 = q422;
        }
        wsf wsf = new wsf(j2, str3, osf, q42);
        ((vsf) zzf3.w0.getValue()).a(1, j2, str3, osf, q42, (String) null);
        for (ia7 d : (List) zzf3.D0.c) {
            d.d(wsf);
        }
        zzf3.B0 = wsf;
        return e5f;
    }
}
