package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: x4  reason: default package */
public final class x4 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ x4(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r2v45, types: [fc3, m6b] */
    public final Object b(v4 v4Var) {
        v4 v4Var2 = v4Var;
        switch (this.b) {
            case 0:
                return new f5a(v4Var2.d(m7b.class), v4Var2.d(b5.class), (z4) v4Var2.c(z4.class), v4Var2.d(s8g.class));
            case 1:
                v4Var2.d(o45.class);
                return new b5((Context) v4Var2.c(Context.class), (z4) v4Var2.c(z4.class));
            case 2:
                return new o80((Context) v4Var2.c(Context.class), (z4) v4Var2.c(z4.class), v4Var2.d(b5.class), v4Var2.d(f5a.class), v4Var2.d(s8g.class));
            case 3:
                return new e5a(v4Var2.d(ome.class), v4Var2.d(q33.class), v4Var2.d(y7d.class), v4Var2.d(ri4.class));
            case 4:
                return new w7a(v4Var2.d(ome.class), v4Var2.d(q33.class), v4Var2.d(f5a.class));
            case 5:
                return new b9a(v4Var2.d(ome.class));
            case 6:
                return new qea(v4Var2.d(ome.class));
            case 7:
                return new kda(v4Var2.d(ome.class));
            case 8:
                kke kke = (kke) v4Var2.c(kke.class);
                khe d = v4Var2.d(os0.class);
                khe d2 = v4Var2.d(fe7.class);
                return new k29(kke, (oe3) v4Var2.c(oe3.class), d, v4Var2.d(mqe.class), d2, (Context) v4Var2.c(Context.class));
            case 9:
                return new fwa((Context) v4Var2.c(Context.class), v4Var2.d(ti4.class));
            case 10:
                return new uva(v4Var2.d(q33.class), v4Var2.d(ge2.class), v4Var2.d(zi5.class), v4Var2.d(ti4.class), v4Var2.d(t00.class), (fwa) v4Var2.c(fwa.class));
            case 11:
                return new xcf((Context) v4Var2.c(Context.class), v4Var2.d(ti4.class), v4Var2.d(t00.class), (fwa) v4Var2.c(fwa.class));
            case Protos.Attaches.Attach.PRESENT:
                khe d3 = v4Var2.d(ak3.class);
                khe d4 = v4Var2.d(z3b.class);
                khe d5 = v4Var2.d(ikf.class);
                khe d6 = v4Var2.d(dz.class);
                khe d7 = v4Var2.d(i00.class);
                v4Var2.d(rff.class);
                return new vz(v4Var2.d(zi5.class), d4, v4Var2.d(rf5.class), v4Var2.d(rke.class), d3, d5, v4Var2.d(w80.class), d6, d7, v4Var2.d(nif.class), v4Var2.d(dt8.class), v4Var2.d(qe5.class), v4Var2.d(uva.class), v4Var2.d(xcf.class), (Context) v4Var2.c(Context.class));
            case 13:
                return new dt8(v4Var2.d(fe7.class), v4Var2.d(os0.class), v4Var2.d(ida.class), v4Var2.d(tpe.class), (Context) v4Var2.c(Context.class));
            case Protos.Attaches.Attach.LOCATION:
                Class<ida> cls = ida.class;
                khe d8 = v4Var2.d(cls);
                Class<zu8> cls2 = zu8.class;
                khe d9 = v4Var2.d(cls2);
                khe d10 = v4Var2.d(k29.class);
                khe d11 = v4Var2.d(ds3.class);
                Class<ak3> cls3 = ak3.class;
                khe d12 = v4Var2.d(cls3);
                khe d13 = v4Var2.d(t6b.class);
                Class<Context> cls4 = Context.class;
                khe d14 = v4Var2.d(hp.class);
                khe d15 = v4Var2.d(are.class);
                khe d16 = v4Var2.d(q33.class);
                khe d17 = v4Var2.d(kke.class);
                khe d18 = v4Var2.d(cls4);
                khe d19 = v4Var2.d(cls2);
                Class<iy2> cls5 = iy2.class;
                v4Var2.d(cls5);
                return new u9a(d8, d9, d10, d11, d12, d13, (Context) v4Var2.c(cls4), (vz) v4Var2.c(vz.class), (dt8) v4Var2.c(dt8.class), new kz(d14, d15, d16, d17, d18, d19, v4Var2.d(cls3), v4Var2.d(cls)), v4Var2.d(xb9.class), v4Var2.d(t00.class), v4Var2.d(cls5), v4Var2.d(pb6.class));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new jh0(v4Var2.d(eua.class), v4Var2.d(ds3.class), v4Var2.d(xc4.class), v4Var2.d(kke.class));
            case 16:
                return new ft1((jr1) v4Var2.c(jr1.class), v4Var2.d(q33.class), v4Var2.d(w7a.class), v4Var2.d(x6a.class));
            case LangUtils.HASH_SEED:
                Class<q33> cls6 = q33.class;
                Class<y7d> cls7 = y7d.class;
                p31 p31 = new p31(v4Var2.d(cls6), v4Var2.d(cls7), v4Var2.d(ct1.class), 0);
                khe d20 = v4Var2.d(Context.class);
                khe d21 = v4Var2.d(xs1.class);
                Class<x6a> cls8 = x6a.class;
                khe d22 = v4Var2.d(cls8);
                khe d23 = v4Var2.d(cls6);
                khe d24 = v4Var2.d(cls7);
                ? fc3 = new fc3(4);
                khe d25 = v4Var2.d(ri4.class);
                khe d26 = v4Var2.d(cls8);
                khe d27 = v4Var2.d(cls7);
                Object obj = new Object();
                fc3 fc32 = new fc3(4);
                fc32.X = p31;
                fc32.Z = p31;
                fc32.Y = p31;
                fc32.c = new m01(0, d25);
                ((x6a) d26.getValue()).getClass();
                qyc qyc = (qyc) ((y7d) d27.getValue());
                qyc.getClass();
                if (((int) qyc.q(PmsKey.f28debugmode, (long) 0)) == 3) {
                    fc32.o = obj;
                }
                fc3.w0 = fc32.g().a();
                return new s61(d20, d21, d22, new wc4(fc3), d23, d24, v4Var2.d(qe5.class));
            case 18:
                Class<ds1> cls9 = ds1.class;
                Class<os1> cls10 = os1.class;
                a41 a41 = new a41((ds1) v4Var2.c(cls9), v4Var2.d(cls10), v4Var2.d(so1.class));
                khe d28 = v4Var2.d(Application.class);
                khe d29 = v4Var2.d(hl1.class);
                khe d30 = v4Var2.d(cls10);
                khe d31 = v4Var2.d(fw3.class);
                v4Var2.d(r21.class);
                khe d32 = v4Var2.d(jt4.class);
                khe d33 = v4Var2.d(lkc.class);
                khe d34 = v4Var2.d(z01.class);
                khe d35 = v4Var2.d(vs1.class);
                khe d36 = v4Var2.d(lvc.class);
                khe d37 = v4Var2.d(oqa.class);
                khe d38 = v4Var2.d(era.class);
                khe d39 = v4Var2.d(qs1.class);
                khe d40 = v4Var2.d(yl4.class);
                khe d41 = v4Var2.d(b31.class);
                jr1 jr1 = (jr1) v4Var2.c(jr1.class);
                khe d42 = v4Var2.d(cs1.class);
                khe d43 = v4Var2.d(kke.class);
                khe d44 = v4Var2.d(x6a.class);
                khe d45 = v4Var2.d(ty3.class);
                v4Var2.d(q33.class);
                khe d46 = v4Var2.d(hp.class);
                khe d47 = v4Var2.d(y7d.class);
                khe d48 = v4Var2.d(bt1.class);
                khe d49 = v4Var2.d(eua.class);
                khe d50 = v4Var2.d(xb9.class);
                khe d51 = v4Var2.d(el3.class);
                return new wr1(d28, d29, d30, d31, d32, d34, d33, d40, d38, d41, d35, d37, d36, v4Var2.d(xuc.class), d39, d42, d43, d44, d45, d46, d47, v4Var2.d(qe5.class), d48, d49, v4Var2.d(ez0.class), jr1, a41, (ds1) v4Var2.c(cls9), d50, d51);
            case 19:
                return new yz0(v4Var2.d(fw3.class), v4Var2.d(r21.class), v4Var2.d(z01.class), v4Var2.d(xuc.class), (jr1) v4Var2.c(jr1.class), v4Var2.d(tm3.class), (so1) v4Var2.c(so1.class), v4Var2.d(bt1.class));
            case 20:
                so1 so1 = new so1(v4Var2.d(kke.class), v4Var2.d(ds3.class), v4Var2.d(q33.class), v4Var2.d(xb9.class), v4Var2.d(blb.class));
                khe d52 = v4Var2.d(fw3.class);
                Class<xuc> cls11 = xuc.class;
                ld1 ld1 = new ld1(v4Var2.d(cls11));
                khe d53 = v4Var2.d(os1.class);
                return new cra(d52, v4Var2.d(cls11), (jr1) v4Var2.c(jr1.class), so1, ld1, d53, v4Var2.d(tm3.class));
            case 21:
                return new os1();
            case 22:
                return new fw3();
            case 23:
                return new jt4((jr1) v4Var2.c(jr1.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new r21(v4Var2.d(fw3.class));
            case 25:
                return new a11(v4Var2.d(fw3.class), new uq1(v4Var2.d(Context.class), v4Var2.d(r21.class), new kpb(v4Var2.d(jpb.class)), v4Var2.d(x6a.class), v4Var2.d(y7d.class)));
            case 26:
                return CallServiceImpl.s0;
            case 27:
                return new fra(v4Var2.d(fw3.class), v4Var2.d(oqa.class), v4Var2.d(r21.class));
            case 28:
                return new yl4(v4Var2.d(era.class), (jr1) v4Var2.c(jr1.class));
            default:
                return new cs1(v4Var2.d(av0.class), v4Var2.d(kke.class));
        }
    }
}
