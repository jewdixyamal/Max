package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dfc  reason: default package */
public final class dfc implements z4d, dh3 {
    public static final /* synthetic */ bc7[] z0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ snf a;
    public afc b;
    public final sx3 c;
    public final k56 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final w4d v0 = mqd.D();
    public final kld w0;
    public final v7c x0;
    public final w7c y0;

    static {
        oi9 oi9 = new oi9(dfc.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        z0 = new bc7[]{oi9};
    }

    public dfc(afc afc, sx3 sx3, rp9 rp9, khe khe, je7 je7, khe khe2, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = new snf(je7, new w8c(1));
        this.b = afc;
        this.c = sx3;
        this.o = rp9;
        this.X = je72;
        this.Y = khe2;
        this.Z = khe;
        this.s0 = je73;
        this.t0 = je74;
        this.u0 = je75;
        kld a2 = lld.a(1, 1, 2);
        this.w0 = a2;
        this.x0 = new v7c(a2);
        this.y0 = new w7c(r0e.a(i2b.a));
    }

    public final void a(h4d h4d) {
        this.w0.g(h4d);
    }

    public final void b(j4d j4d) {
        x77 a2 = this.a.a(this.c, ((w9a) ((kke) this.X.getValue())).b(), vx3.b, new cfc(j4d, this, (Continuation) null));
        this.v0.o1(this, z0[0], a2);
    }

    public final w7c c() {
        return this.y0;
    }

    public final void d(qo9 qo9) {
        this.w0.g(new h4d(qo9.a, qo9.b, qo9.c));
    }

    public final v7c e() {
        return this.x0;
    }

    public final v7c f() {
        return this.a.o;
    }

    public final dre g() {
        return new dre(v0c.oneme_login_neuro_avatars_title, v0c.oneme_login_neuro_avatars_description, v0c.oneme_login_neuro_avatars_continue_button);
    }
}
