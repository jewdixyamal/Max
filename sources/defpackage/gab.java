package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* renamed from: gab  reason: default package */
public final class gab {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final ja6 d;
    public final lu6 e;
    public final ey1 f;
    public final bp4 g;
    public final boolean h;
    public final boolean i = false;
    public final o55 j;
    public final y7g k;
    public final ide l;
    public final lq8 m;
    public final lq8 n;
    public final o84 o;
    public final s2b p;
    public final wd6 q;
    public final int r;
    public final boolean s;

    public gab(Context context, ja6 ja6, lu6 lu6, ey1 ey1, bp4 bp4, boolean z, o55 o55, y7g y7g, y7g y7g2, y7g y7g3, ide ide, o84 o84, s2b s2b, int i2, wd6 wd6) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = ja6;
        this.e = lu6;
        this.f = ey1;
        this.g = bp4;
        this.h = z;
        this.j = o55;
        this.k = y7g;
        this.n = y7g2;
        this.m = y7g3;
        this.l = ide;
        this.o = o84;
        this.p = s2b;
        new lq9();
        new lq9();
        this.r = i2;
        this.q = wd6;
        this.s = false;
    }

    public final k54 a(dab dab) {
        return new k54(this.d, this.j.a(), this.e, this.f, this.g, this.h, this.i, dab, this.r, this.q);
    }

    public final iic b(dab dab, boolean z, zv6 zv6) {
        return new iic(this.j.d(), this.k, dab, z, zv6);
    }
}
