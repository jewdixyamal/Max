package defpackage;

/* renamed from: qwe  reason: default package */
public final class qwe extends yof {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public qwe(rwe rwe, int i) {
        this.d = rwe;
        this.c = i;
        this.b = false;
    }

    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                return;
            default:
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((rwe) this.d).a.setVisibility(0);
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    xof xof = ((wof) this.d).d;
                    if (xof != null) {
                        xof.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((rwe) this.d).a.setVisibility(this.c);
                    return;
                }
                return;
            default:
                int i = this.c + 1;
                this.c = i;
                wof wof = (wof) this.d;
                if (i == wof.a.size()) {
                    xof xof = wof.d;
                    if (xof != null) {
                        xof.c();
                    }
                    this.c = 0;
                    this.b = false;
                    wof.e = false;
                    return;
                }
                return;
        }
    }

    public qwe(wof wof) {
        this.d = wof;
        this.b = false;
        this.c = 0;
    }
}
