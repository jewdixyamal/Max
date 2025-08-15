package defpackage;

/* renamed from: fqa  reason: default package */
public final class fqa implements ig1, bo1 {
    public static final fqa c = new fqa(mqa.a(), new baf(0, "", "", true, (String) null));
    public final ig1 a;
    public final bo1 b;

    public fqa(ig1 ig1, bo1 bo1) {
        this.a = ig1;
        this.b = bo1;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.b.c();
    }

    public final long d() {
        return this.b.d();
    }

    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqa)) {
            return false;
        }
        fqa fqa = (fqa) obj;
        return tpa.f(this.a, fqa.a) && tpa.f(this.b, fqa.b);
    }

    public final boolean f() {
        return this.a.f();
    }

    public final boolean g() {
        return this.a.g();
    }

    public final gg1 getId() {
        return this.a.getId();
    }

    public final String getName() {
        return this.b.getName();
    }

    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final boolean i() {
        return this.a.i();
    }

    public final boolean isConnected() {
        return this.a.isConnected();
    }

    public final boolean isScreenCaptureEnabled() {
        return this.a.isScreenCaptureEnabled();
    }

    public final CharSequence j() {
        return this.b.j();
    }

    public final boolean k() {
        return this.a.k();
    }

    public final boolean l() {
        return this.a.l();
    }

    public final boolean m() {
        return this.a.m();
    }

    public final boolean n() {
        return this.a.n();
    }

    public final boolean o() {
        return this.a.o();
    }

    public final llf p() {
        return this.a.p();
    }

    public final String q() {
        return this.b.q();
    }

    public final int r() {
        return this.a.r();
    }

    public final llf s() {
        return this.a.s();
    }

    public final boolean t() {
        return this.a.t();
    }

    public final String toString() {
        return "ParticipantPair(member=" + this.a + ", user=" + this.b + ")";
    }
}
