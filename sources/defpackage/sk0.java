package defpackage;

import android.net.Uri;

/* renamed from: sk0  reason: default package */
public final class sk0 implements yk {
    public final Uri a;
    public final kl b;
    public final el c;
    public final za7 o;

    public sk0(Uri uri, kl klVar, el elVar, za7 za7) {
        this.a = uri;
        this.b = klVar;
        this.c = elVar;
        this.o = za7;
    }

    public final za7 getOkParser() {
        return this.o;
    }

    public final int getPriority() {
        return 16;
    }

    public final kl getScope() {
        return this.b;
    }

    public final Uri getUri() {
        return this.a;
    }

    public final boolean shouldPost() {
        return this.c.c;
    }

    public final boolean willWriteParams() {
        return this.c.d;
    }

    public final boolean willWriteSupplyParams() {
        return this.c.e;
    }

    public final void writeParams(kb7 kb7) {
        this.c.c(kb7);
    }

    public final void writeSupplyParams(kb7 kb7) {
        this.c.d(kb7);
    }
}
